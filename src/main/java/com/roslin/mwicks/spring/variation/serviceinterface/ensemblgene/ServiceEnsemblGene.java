package com.roslin.mwicks.spring.variation.serviceinterface.ensemblgene;

import java.util.Collection;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.roslin.mwicks.spring.variation.exception.ExceptionEnsemblGeneNotFound;

import com.roslin.mwicks.spring.variation.model.ensemblgene.EnsemblGene;

/**
 * Declares methods used to obtain and modify SNPChromosome information.
 * @author Mike Wicks
 */
public interface ServiceEnsemblGene {

	
    /**
     * Saves a List of EnsemblGene
     * @param created   The information of the created snpchromosome.
     * @return  The created snpchromosome.
     */
	public <T extends EnsemblGene> Collection<T> bulkSave(int intBatchSize, Collection<T> entities);
	
	
    /**
     * Creates a new snpchromosome.
     * @param created   The information of the created snpchromosome.
     * @return  The created snpchromosome.
     */
    public EnsemblGene create(EnsemblGene created);

    
    /**
     * Deletes a snpchromosome.
     * @param snpchromosomeId  The id of the deleted snpchromosome.
     * @return  The deleted snpchromosome.
     * @throws SNPChromosomeNotFoundException  if no snpchromosome is found with the given id.
     */
    public EnsemblGene delete(Long snpchromosomeId) throws ExceptionEnsemblGeneNotFound;


    /**
     * Updates the information of a snpchromosome.
     * @param updated   The information of the updated snpchromosome.
     * @return  The updated snpchromosome.
     */
    public EnsemblGene update(EnsemblGene updated) throws ExceptionEnsemblGeneNotFound;

    
    /**
     * Finds all snpchromosome.
     * @return  A list of snpchromosome.
     */
	public List<EnsemblGene> findByGeneName(String strGeneName);

	
	/**
     * Finds all snpchromosome.
     * @return  A list of snpchromosome.
     */
	public Page<EnsemblGene> findByEnsemblIdLike(String strGeneName, Pageable pageable);
}
