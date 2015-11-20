package com.roslin.mwicks.spring.variation.serviceinterface;

import java.util.List;

import com.roslin.mwicks.spring.variation.exception.ExceptionEnsemblGeneNotFound;

import com.roslin.mwicks.spring.variation.model.EnsemblGene;

/**
 * Declares methods used to obtain and modify SNPChromosome information.
 * @author Mike Wicks
 */
public interface ServiceEnsemblGene {
	
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
}
