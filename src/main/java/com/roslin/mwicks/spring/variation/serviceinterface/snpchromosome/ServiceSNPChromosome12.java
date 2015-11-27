package com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome;

import java.util.Collection;
import java.util.List;

import com.roslin.mwicks.spring.variation.dto.DTOSearch;
import com.roslin.mwicks.spring.variation.dto.DTODownload;
import com.roslin.mwicks.spring.variation.dto.DTOSNPChromosome;

import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeNotFound;

import com.roslin.mwicks.spring.variation.model.other.PageSNPChromosome;

import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosome;
import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosome12;

/**
 * Declares methods used to obtain and modify SNPChromosome12 information.
 * @author Mike Wicks
 */
public interface ServiceSNPChromosome12 {
	
    /**
     * Saves a List of SNPChromosome1
     * @param created   The information of the created snpchromosome.
     * @return  The created snpchromosome.
     */
	public <T extends SNPChromosome12> Collection<T> bulkSave(int intBatchSize, Collection<T> entities);
	
    /**
     * Creates a new snpchromosome.
     * @param created   The information of the created snpchromosome.
     * @return  The created snpchromosome.
     */
    public SNPChromosome12 create(DTOSNPChromosome created);

    /**
     * Deletes a snpchromosome.
     * @param snpchromosomeId  The id of the deleted snpchromosome.
     * @return  The deleted snpchromosome.
     * @throws SNPChromosome12NotFoundException  if no snpchromosome is found with the given id.
     */
    public SNPChromosome12 delete(Long snpchromosomeId) throws ExceptionSNPChromosomeNotFound;


    /**
     * Updates the information of a snpchromosome.
     * @param updated   The information of the updated snpchromosome.
     * @return  The updated snpchromosome.
     * @throws SNPChromosome12NotFoundException  if no snpchromosome is found with given id.
     */
    public SNPChromosome12 update(DTOSNPChromosome updated) throws ExceptionSNPChromosomeNotFound;

    /**
     * Searches SNPChromosome12s by using the search criteria given as a parameter.
     * @param searchCriteria
     * @param pageIndex
     * @return  A Page of SNPChromosome12s matching with the search criteria. 
     *          If no SNPChromosome12s is found, this method returns an empty list.
     */
    public PageSNPChromosome search(DTOSearch searchCriteria, Integer pageNumber) ;

    
    /**
     * Searches SNPChromosome12s by using the search criteria given as a parameter.
     * @param searchCriteria
     * @return  A list of SNPChromosome12s matching with the search criteria. 
     *          If no SNPChromosome12s is found, this method returns an empty list.
     */
    public List<SNPChromosome> download(DTODownload dtoDownload);

    
    /**
     * Finds all snpchromosome.
     * @return  A list of snpchromosome.
     */
	public PageSNPChromosome findAll(Integer pageNumber);
}