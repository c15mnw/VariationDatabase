package com.roslin.mwicks.spring.variation.serviceinterface;

import java.util.List;

import com.roslin.mwicks.spring.variation.dto.DTOSearch;
import com.roslin.mwicks.spring.variation.dto.DTODownload;
import com.roslin.mwicks.spring.variation.dto.DTOSNPChromosome;

import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeNotFound;

import com.roslin.mwicks.spring.variation.model.SNPChromosome32;
import com.roslin.mwicks.spring.variation.model.PageSNPChromosome;
import com.roslin.mwicks.spring.variation.model.SNPChromosome;

/**
 * Declares methods used to obtain and modify SNPChromosome32 information.
 * @author Mike Wicks
 */
public interface ServiceSNPChromosome32 {
	
    /**
     * Creates a new snpchromosome.
     * @param created   The information of the created snpchromosome.
     * @return  The created snpchromosome.
     */
    public SNPChromosome32 create(DTOSNPChromosome created);

    /**
     * Deletes a snpchromosome.
     * @param snpchromosomeId  The id of the deleted snpchromosome.
     * @return  The deleted snpchromosome.
     * @throws SNPChromosome32NotFoundException  if no snpchromosome is found with the given id.
     */
    public SNPChromosome32 delete(Long snpchromosomeId) throws ExceptionSNPChromosomeNotFound;


    /**
     * Updates the information of a snpchromosome.
     * @param updated   The information of the updated snpchromosome.
     * @return  The updated snpchromosome.
     * @throws SNPChromosome32NotFoundException  if no snpchromosome is found with given id.
     */
    public SNPChromosome32 update(DTOSNPChromosome updated) throws ExceptionSNPChromosomeNotFound;

    /**
     * Searches SNPChromosome32s by using the search criteria given as a parameter.
     * @param searchCriteria
     * @param pageIndex
     * @return  A Page of SNPChromosome32s matching with the search criteria. 
     *          If no SNPChromosome32s is found, this method returns an empty list.
     */
    public PageSNPChromosome search(DTOSearch searchCriteria, Integer pageNumber) ;

    
    /**
     * Searches SNPChromosome32s by using the search criteria given as a parameter.
     * @param searchCriteria
     * @return  A list of SNPChromosome32s matching with the search criteria. 
     *          If no SNPChromosome32s is found, this method returns an empty list.
     */
    public List<SNPChromosome> download(DTODownload dtoDownload);

    
    /**
     * Finds all snpchromosome.
     * @return  A list of snpchromosome.
     */
	public PageSNPChromosome findAll(Integer pageNumber);
}
