package com.roslin.mwicks.spring.variation.service;

import org.springframework.data.domain.Page;

import java.util.List;

import com.roslin.mwicks.spring.variation.dto.DTOSearch;
import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeAlternativeAlleleNotSupplied;
import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeHighCoordinateNotNumeric;
import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeLowCoordinateGreaterThanHighCoordinate;
import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeLowCoordinateNotNumeric;
import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeNotFound;
import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeReferenceAlleleEqualsAlternativeAllele;
import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeReferenceAlleleNotSupplied;
import com.roslin.mwicks.spring.variation.dto.DTODownload;
import com.roslin.mwicks.spring.variation.dto.DTOSNPChromosome;

import com.roslin.mwicks.spring.variation.model.SNPChromosome;

/**
 * Declares methods used to obtain and modify SNPChromosome information.
 * @author Mike Wicks
 */
public interface ServiceSNPChromosome {
	
    /**
     * Creates a new snpchromosome.
     * @param created   The information of the created snpchromosome.
     * @return  The created snpchromosome.
     */
    public SNPChromosome create(DTOSNPChromosome created);

    /**
     * Deletes a snpchromosome.
     * @param snpchromosomeId  The id of the deleted snpchromosome.
     * @return  The deleted snpchromosome.
     * @throws SNPChromosomeNotFoundException  if no snpchromosome is found with the given id.
     */
    public SNPChromosome delete(Long snpchromosomeId) throws ExceptionSNPChromosomeNotFound;


    /**
     * Updates the information of a snpchromosome.
     * @param updated   The information of the updated snpchromosome.
     * @return  The updated snpchromosome.
     * @throws SNPChromosomeNotFoundException  if no snpchromosome is found with given id.
     */
    public SNPChromosome update(DTOSNPChromosome updated) throws ExceptionSNPChromosomeNotFound;

    /**
     * Searches SNPChromosomes by using the search criteria given as a parameter.
     * @param searchCriteria
     * @param pageIndex
     * @return  A Page of SNPChromosomes matching with the search criteria. 
     *          If no SNPChromosomes is found, this method returns an empty list.
     * @throws ExceptionSNPChromosomeLowCoordinateNotNumeric 
     *          if the Low Coordinate is not a number.
     * @throws ExceptionSNPChromosomeHighCoordinateNotNumeric 
     * if search type is not given.
     *          if the High Coordinate is not a number.
     * @throws ExceptionSNPChromosomeLowCoordinateGreaterThanHighCoordinate 
     *          if the Low Coordinate is higher than the High Coordinate
     * @throws ExceptionSNPChromosomeReferenceAlleleNotSupplied 
     *          if the Reference Allele has not been chosen
     * @throws ExceptionSNPChromosomeAlternativeAlleleNotSupplied 
     *          if the Alternative Allele has not been chosen
     * @throws ExceptionSNPChromosomeReferenceAlleleEqualsAlternativeAllele 
     *          if the Reference Allele is the same as the Alternative Allele
     */
    public Page<SNPChromosome> search(DTOSearch searchCriteria, Integer pageNumber) throws
        ExceptionSNPChromosomeLowCoordinateNotNumeric,
        ExceptionSNPChromosomeHighCoordinateNotNumeric,
        ExceptionSNPChromosomeLowCoordinateGreaterThanHighCoordinate,
        ExceptionSNPChromosomeReferenceAlleleNotSupplied,
        ExceptionSNPChromosomeAlternativeAlleleNotSupplied,
        ExceptionSNPChromosomeReferenceAlleleEqualsAlternativeAllele;

    
    /**
     * Searches SNPChromosomes by using the search criteria given as a parameter.
     * @param searchCriteria
     * @return  A list of SNPChromosomes matching with the search criteria. 
     *          If no SNPChromosomes is found, this method returns an empty list.
     * @throws ExceptionSNPChromosomeLowCoordinateNotNumeric 
     *          if the Low Coordinate is not a number.
     * @throws ExceptionSNPChromosomeHighCoordinateNotNumeric 
     * if search type is not given.
     *          if the High Coordinate is not a number.
     * @throws ExceptionSNPChromosomeLowCoordinateGreaterThanHighCoordinate 
     *          if the Low Coordinate is higher than the High Coordinate
     * @throws ExceptionSNPChromosomeReferenceAlleleNotSupplied 
     *          if the Reference Allele has not been chosen
     * @throws ExceptionSNPChromosomeAlternativeAlleleNotSupplied 
     *          if the Alternative Allele has not been chosen
     * @throws ExceptionSNPChromosomeReferenceAlleleEqualsAlternativeAllele 
     *          if the Reference Allele is the same as the Alternative Allele
     */
    public List<SNPChromosome> download(DTODownload downloadCriteria);

    
    /**
     * Finds all snpchromosome.
     * @return  A list of snpchromosome.
     */
	public Page<SNPChromosome> findAll(Integer pageNumber);
}
