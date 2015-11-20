package com.roslin.mwicks.spring.variation.serviceinterface;

import java.util.List;

import com.roslin.mwicks.spring.variation.dto.DTOSearch;
import com.roslin.mwicks.spring.variation.dto.DTODownload;
import com.roslin.mwicks.spring.variation.dto.DTOSNPChromosome;

import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeNotFound;

import com.roslin.mwicks.spring.variation.model.SNPChromosomeW;
import com.roslin.mwicks.spring.variation.model.PageSNPChromosome;
import com.roslin.mwicks.spring.variation.model.SNPChromosome;

/**
 * Declares methods used to obtain and modify SNPChromosomeW information.
 * @author Mike Wicks
 */
public interface ServiceSNPChromosomeW {
	
    /**
     * Creates a new snpchromosome.
     * @param created   The information of the created snpchromosome.
     * @return  The created snpchromosome.
     */
    public SNPChromosomeW create(DTOSNPChromosome created);

    /**
     * Deletes a snpchromosome.
     * @param snpchromosomeId  The id of the deleted snpchromosome.
     * @return  The deleted snpchromosome.
     * @throws SNPChromosomeWNotFoundException  if no snpchromosome is found with the given id.
     */
    public SNPChromosomeW delete(Long snpchromosomeId) throws ExceptionSNPChromosomeNotFound;


    /**
     * Updates the information of a snpchromosome.
     * @param updated   The information of the updated snpchromosome.
     * @return  The updated snpchromosome.
     * @throws SNPChromosomeWNotFoundException  if no snpchromosome is found with given id.
     */
    public SNPChromosomeW update(DTOSNPChromosome updated) throws ExceptionSNPChromosomeNotFound;

    /**
     * Searches SNPChromosomeWs by using the search criteria given as a parameter.
     * @param searchCriteria
     * @param pageIndex
     * @return  A Page of SNPChromosomeWs matching with the search criteria. 
     *          If no SNPChromosomeWs is found, this method returns an empty list.
     */
    public PageSNPChromosome search(DTOSearch searchCriteria, Integer pageNumber) ;

    
    /**
     * Searches SNPChromosomeWs by using the search criteria given as a parameter.
     * @param searchCriteria
     * @return  A list of SNPChromosomeWs matching with the search criteria. 
     *          If no SNPChromosomeWs is found, this method returns an empty list.
     */
    public List<SNPChromosome> download(DTODownload dtoDownload);

    
    /**
     * Finds all snpchromosome.
     * @return  A list of snpchromosome.
     */
	public PageSNPChromosome findAll(Integer pageNumber);
}
