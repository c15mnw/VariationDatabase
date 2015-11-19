package com.roslin.mwicks.spring.variation.offline;

import java.util.Properties;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.hibernate.ejb.HibernatePersistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

import org.springframework.core.env.Environment;
import org.springframework.core.env.SimpleCommandLinePropertySource;

import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.jolbox.bonecp.BoneCPDataSource;

@Configuration
@ComponentScan(basePackages = {"com.roslin.mwicks.spring.variation.service"})
@EnableTransactionManagement
@ImportResource("classpath:applicationContext.xml")
@PropertySource("classpath:application.properties")

public final class InsertData {
	
    private static final String PROPERTY_NAME_DATABASE_DRIVER = "db.driver";
    private static final String PROPERTY_NAME_DATABASE_PASSWORD = "db.password";
    private static final String PROPERTY_NAME_DATABASE_URL = "db.url";
    private static final String PROPERTY_NAME_DATABASE_USERNAME = "db.username";

    private static final String PROPERTY_NAME_HIBERNATE_DIALECT = "hibernate.dialect";
    private static final String PROPERTY_NAME_HIBERNATE_FORMAT_SQL = "hibernate.format_sql";
    private static final String PROPERTY_NAME_HIBERNATE_HBM2DDL_AUTO = "hibernate.hbm2ddl.auto";
    private static final String PROPERTY_NAME_HIBERNATE_NAMING_STRATEGY = "hibernate.ejb.naming_strategy";
    private static final String PROPERTY_NAME_HIBERNATE_SHOW_SQL = "hibernate.show_sql";
    private static final String PROPERTY_NAME_ENTITYMANAGER_PACKAGES_TO_SCAN = "entitymanager.packages.to.scan";


    @Resource
    private Environment environment;
	
    public static final Logger LOG = LoggerFactory.getLogger(InsertData.class);

    public static final String URL_PARAM_KEY = "url";


    public static void main(String[] args) {
    	
        LOG.trace("CLI demo app");

        // should use parameterless constructor as the other one invoke refresh which we certainly don't want
        // as it automatically trigger property injection and our CLI property is not ready yet
        final AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();

        // setup configuration
        applicationContext.register(Config.class);

        // add CLI property source
        applicationContext.getEnvironment().getPropertySources().addLast(new SimpleCommandLinePropertySource(args));

        // setup all the dependencies (refresh) and make them run (start)
        applicationContext.refresh();
        applicationContext.start();

        try {
        	
            applicationContext.getBean(Runnable.class).run();
        } 
        finally {
        
        	applicationContext.close();
        }
    }
    
    @Bean
    public DataSource dataSource() {
    	
        BoneCPDataSource dataSource = new BoneCPDataSource();

        dataSource.setDriverClass(environment.getRequiredProperty(PROPERTY_NAME_DATABASE_DRIVER));
        dataSource.setJdbcUrl(environment.getRequiredProperty(PROPERTY_NAME_DATABASE_URL));
        dataSource.setUsername(environment.getRequiredProperty(PROPERTY_NAME_DATABASE_USERNAME));
        dataSource.setPassword(environment.getRequiredProperty(PROPERTY_NAME_DATABASE_PASSWORD));

        return dataSource;
    }
    

    @Bean
    public JpaTransactionManager transactionManager() throws ClassNotFoundException {
    	
        JpaTransactionManager transactionManager = new JpaTransactionManager();

        transactionManager.setEntityManagerFactory(entityManagerFactoryBean().getObject());

        return transactionManager;
    }

    
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean() throws ClassNotFoundException {
    	
        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();

        entityManagerFactoryBean.setDataSource(dataSource());
        entityManagerFactoryBean.setPackagesToScan(environment.getRequiredProperty(PROPERTY_NAME_ENTITYMANAGER_PACKAGES_TO_SCAN));
        entityManagerFactoryBean.setPersistenceProviderClass(HibernatePersistence.class);

        Properties jpaProterties = new Properties();
        jpaProterties.put(PROPERTY_NAME_HIBERNATE_DIALECT, environment.getRequiredProperty(PROPERTY_NAME_HIBERNATE_DIALECT));
        jpaProterties.put(PROPERTY_NAME_HIBERNATE_FORMAT_SQL, environment.getRequiredProperty(PROPERTY_NAME_HIBERNATE_FORMAT_SQL));
        jpaProterties.put(PROPERTY_NAME_HIBERNATE_HBM2DDL_AUTO, environment.getRequiredProperty(PROPERTY_NAME_HIBERNATE_HBM2DDL_AUTO));
        jpaProterties.put(PROPERTY_NAME_HIBERNATE_NAMING_STRATEGY, environment.getRequiredProperty(PROPERTY_NAME_HIBERNATE_NAMING_STRATEGY));
        jpaProterties.put(PROPERTY_NAME_HIBERNATE_SHOW_SQL, environment.getRequiredProperty(PROPERTY_NAME_HIBERNATE_SHOW_SQL));

        entityManagerFactoryBean.setJpaProperties(jpaProterties);

        return entityManagerFactoryBean;
    }

    
    @Configuration
    public static class Config {

        @Autowired
        private Environment environment;

        @Bean
        public Runnable myBean() {
        	
            return new MyBean(environment.getProperty(URL_PARAM_KEY, "http://127.0.0.1:8080"));
        }
    }
    

    public static final class MyBean implements Runnable {
    	
        private final String url;

        public MyBean(String url) {
        
        	this.url = url;
        }

        @Override
        public void run() {
            
        	LOG.info("MyBean run with url = {}", url);
        }
    }
}
