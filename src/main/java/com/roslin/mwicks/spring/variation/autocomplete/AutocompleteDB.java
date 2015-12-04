package com.roslin.mwicks.spring.variation.autocomplete;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.roslin.mwicks.spring.variation.config.MyAutocompleteApplicationContext;

import com.roslin.mwicks.spring.variation.model.ensemblgene.EnsemblGene;

import com.roslin.mwicks.spring.variation.serviceinterface.ensemblgene.ServiceEnsemblGene;


@Service
public class AutocompleteDB {
	
    public static final Logger LOG = LoggerFactory.getLogger(AutocompleteDB.class);

    
    public AutocompleteDB() {
    }
    
    
    public List<String> getEnsemblIds(String query) {
    	
    	LOG.trace("AutocompleteDB - getEnsemblIds");

        final AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();

        // setup configuration
        applicationContext.register(MyAutocompleteApplicationContext.class);

        applicationContext.refresh();
        applicationContext.start();
        
        ServiceEnsemblGene serviceensemblgene = (ServiceEnsemblGene) applicationContext.getBean(ServiceEnsemblGene.class);

        int queryLimit = 10;
        
       	PageRequest pageRequest = new PageRequest(0, queryLimit, Sort.Direction.ASC, "ensemblId");
       	
       	Page<EnsemblGene> pageensemblgenes = serviceensemblgene.findByEnsemblIdLike(query, pageRequest);

        List<EnsemblGene> ensemblgenes = pageensemblgenes.getContent();
       	
       	List<String> matched = new ArrayList<String>();

        Iterator<EnsemblGene> iteratorEnsemblGene = ensemblgenes.iterator();
        
     	while (iteratorEnsemblGene.hasNext()) {
    		
     		EnsemblGene ensemblgene = iteratorEnsemblGene.next();

            matched.add(ensemblgene.getEnsemblId());
     	}

        applicationContext.close();

        return matched;

    }

}
