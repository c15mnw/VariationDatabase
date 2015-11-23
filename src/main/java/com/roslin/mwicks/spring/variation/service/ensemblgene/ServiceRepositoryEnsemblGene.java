package com.roslin.mwicks.spring.variation.service.ensemblgene;

import com.roslin.mwicks.spring.variation.exception.ExceptionEnsemblGeneNotFound;
import com.roslin.mwicks.spring.variation.model.ensemblegene.EnsemblGene;
import com.roslin.mwicks.spring.variation.repository.ensemblgene.RepositoryEnsemblGene;
import com.roslin.mwicks.spring.variation.serviceinterface.ensemblgene.ServiceEnsemblGene;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * This implementation of the SNPChromosomeService interface communicates with
 * the database by using a Spring Data JPA repository.
 * @author Mike Wicks
 */
@Service
public class ServiceRepositoryEnsemblGene implements ServiceEnsemblGene {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceRepositoryEnsemblGene.class);
    
    @Resource
    private RepositoryEnsemblGene repositoryensemblgene;

    
    @Transactional(readOnly = true)
    @Override
    public List<EnsemblGene> findByGeneName(String strGeneName) {
        
    	LOGGER.debug("Searching SNPChromosomes with search criteria: " + strGeneName);

    	List<EnsemblGene> ensemblgenes = repositoryensemblgene.findByGeneName(strGeneName);
        
    	return ensemblgenes;
    }
    

    @Transactional
    @Override
    public EnsemblGene create(EnsemblGene created) {
    	
        LOGGER.debug("Creating a new snpchromosome with information: " + created);
        
        EnsemblGene ensemblgene = EnsemblGene.getBuilder(
        	    created.getEnsemblId(),
        	    created.getRegion(),
        	    created.getChromosomeId(),
        	    created.getStart(),
        	    created.getEnd(),
        	    created.getStrand()
        		).build();
        
        return repositoryensemblgene.save(ensemblgene);
    }
    

    @Transactional(rollbackFor = ExceptionEnsemblGeneNotFound.class)
    @Override
    public EnsemblGene delete(Long oid) throws ExceptionEnsemblGeneNotFound {
    	
        LOGGER.debug("Deleting snpchromosome with id: " + oid);
        
        EnsemblGene deleted = repositoryensemblgene.findOne(oid);
        
        if (deleted == null) {
        	
            LOGGER.debug("No snpchromosome found with id: " + oid);
            
            throw new ExceptionEnsemblGeneNotFound("No EnsemblGene found with id: " + oid);
        }
        
        repositoryensemblgene.delete(deleted);
        
        return deleted;
    }

    
    @Transactional(rollbackFor = ExceptionEnsemblGeneNotFound.class)
    @Override
    public EnsemblGene update(EnsemblGene updated) throws ExceptionEnsemblGeneNotFound {
    	
        LOGGER.debug("Updating snpchromosome with information: " + updated);
        
        EnsemblGene ensemblgene = repositoryensemblgene.findOne(updated.getOid());
        
        if (ensemblgene == null) {
        	
            LOGGER.debug("No snpchromosome found with id: " + updated.getOid());
            
            throw new ExceptionEnsemblGeneNotFound("No EnsemblGene found with id: " + updated.getOid());
        }
        
        ensemblgene.update(
        		ensemblgene.getEnsemblId(),
        		ensemblgene.getRegion(),
        		ensemblgene.getChromosomeId(),
        		ensemblgene.getStart(),
        		ensemblgene.getEnd(),
        		ensemblgene.getStrand()
        		);

        return ensemblgene;
    }

    
    /**
     * This setter method should be used only by unit tests.
     * @param repositorySNPChromosome
     */
    protected void setRepositorySNPChromosome(RepositoryEnsemblGene repositoryensemblgene) {
    	
        this.repositoryensemblgene = repositoryensemblgene;
    }

}
