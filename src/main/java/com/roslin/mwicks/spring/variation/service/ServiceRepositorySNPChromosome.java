package com.roslin.mwicks.spring.variation.service;

import com.roslin.mwicks.spring.variation.dto.DTOSearch;
import com.roslin.mwicks.spring.variation.dto.DTODownload;
import com.roslin.mwicks.spring.variation.dto.DTOSNPChromosome;
import com.roslin.mwicks.spring.variation.dto.SearchReference;
import com.roslin.mwicks.spring.variation.dto.SearchAlternative;

import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeNotFound;
import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeAlternativeAlleleNotSupplied;
import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeHighCoordinateNotNumeric;
import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeLowCoordinateGreaterThanHighCoordinate;
import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeLowCoordinateNotNumeric;
import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeReferenceAlleleEqualsAlternativeAllele;
import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeReferenceAlleleNotSupplied;

import com.roslin.mwicks.spring.variation.model.SNPChromosome;

import com.roslin.mwicks.spring.variation.repository.RepositorySNPChromosome;
import com.roslin.mwicks.utility.StringUtility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

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
public class ServiceRepositorySNPChromosome implements ServiceSNPChromosome {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceRepositorySNPChromosome.class);
    
    private static final int NUMBER_OF_SNPCHROMOSOMES_PER_PAGE = 6;

    @Resource
    private RepositorySNPChromosome repositorysnpchromosome;

    
    @Transactional(readOnly = true)
    @Override
    public List<SNPChromosome> download(DTODownload downloadCriteria) {
        
    	LOGGER.debug("Downloading SNPChromosomes with download criteria: " + downloadCriteria);
    	
        return listSNPChromosomesBySearchType(
        		Integer.parseInt(downloadCriteria.getDownloadLowRange()), 
        		Integer.parseInt(downloadCriteria.getDownloadHighRange()), 
        		downloadCriteria.getDownloadReference(), 
        		downloadCriteria.getDownloadAlternative());
    }
    
    
    private List<SNPChromosome> listSNPChromosomesBySearchType(int intSearchLow,
    		int intSearchHigh, 
    		String searchReference, 
    		String searchAlternative) {
    	
    	List<SNPChromosome> SNPChromosomes = null;
    	
        if (searchReference.equals("STRAIN_7") && searchAlternative.equals("STRAIN_P")) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrain7NEStrainP");
            SNPChromosomes = repositorysnpchromosome.listByRangeANDStrain7NEStrainP(intSearchLow, intSearchHigh);
        }

        if (searchReference.equals("STRAIN_7") && searchAlternative.equals("STRAIN_W")) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrain7NEStrainW");
            SNPChromosomes = repositorysnpchromosome.listByRangeANDStrain7NEStrainW(intSearchLow, intSearchHigh);
        }
            
        if (searchReference.equals("STRAIN_7") && searchAlternative.equals("STRAIN_N")) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrain7NEStrainN");
            SNPChromosomes = repositorysnpchromosome.listByRangeANDStrain7NEStrainN(intSearchLow, intSearchHigh);
        }
            
        if (searchReference.equals("STRAIN_7") && searchAlternative.equals("STRAIN_15I")) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrain7NEStrain15I");
            SNPChromosomes = repositorysnpchromosome.listByRangeANDStrain7NEStrain15I(intSearchLow, intSearchHigh);
        }
            
        if (searchReference.equals("STRAIN_7") && searchAlternative.equals("STRAIN_ZERO")) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrain7NEStrainZERO");
            SNPChromosomes = repositorysnpchromosome.listByRangeANDStrain7NEStrainZERO(intSearchLow, intSearchHigh);
        }

        if (searchReference.equals("STRAIN_7") && searchAlternative.equals("STRAIN_6")) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrain7NEStrain6");
            SNPChromosomes = repositorysnpchromosome.listByRangeANDStrain7NEStrain6(intSearchLow, intSearchHigh);
        }

        if (searchReference.equals("STRAIN_7") && searchAlternative.equals("STRAIN_C")) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrain7NEStrainC");
            SNPChromosomes = repositorysnpchromosome.listByRangeANDStrain7NEStrainC(intSearchLow, intSearchHigh);
        }

        if (searchReference.equals("STRAIN_P") && searchAlternative.equals("STRAIN_W")) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrainPNEStrainW");
            SNPChromosomes = repositorysnpchromosome.listByRangeANDStrainPNEStrainW(intSearchLow, intSearchHigh);
        }

        if (searchReference.equals("STRAIN_P") && searchAlternative.equals("STRAIN_N")) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrainPNEStrainN");
            SNPChromosomes = repositorysnpchromosome.listByRangeANDStrainPNEStrainN(intSearchLow, intSearchHigh);
        }

        if (searchReference.equals("STRAIN_P") && searchAlternative.equals("STRAIN_15I")) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrainPNEStrain15I");
            SNPChromosomes = repositorysnpchromosome.listByRangeANDStrainPNEStrain15I(intSearchLow, intSearchHigh);
        }

        if (searchReference.equals("STRAIN_P") && searchAlternative.equals("STRAIN_ZERO")) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrainPNEStrainZERO");
            SNPChromosomes = repositorysnpchromosome.listByRangeANDStrainPNEStrainZERO(intSearchLow, intSearchHigh);
        }

        if (searchReference.equals("STRAIN_P") && searchAlternative.equals("STRAIN_6")) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrainPNEStrain6");
            SNPChromosomes = repositorysnpchromosome.listByRangeANDStrainPNEStrain6(intSearchLow, intSearchHigh);
        }

        if (searchReference.equals("STRAIN_P") && searchAlternative.equals("STRAIN_C")) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrainPNEStrainC");
            SNPChromosomes = repositorysnpchromosome.listByRangeANDStrainPNEStrainC(intSearchLow, intSearchHigh);
        }

        if (searchReference.equals("STRAIN_W") && searchAlternative.equals("STRAIN_N")) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrainWNEStrainN");
            SNPChromosomes = repositorysnpchromosome.listByRangeANDStrainWNEStrainN(intSearchLow, intSearchHigh);
        }

        if (searchReference.equals("STRAIN_W") && searchAlternative.equals("STRAIN_15I")) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrainWNEStrain15I");
            SNPChromosomes = repositorysnpchromosome.listByRangeANDStrainWNEStrain15I(intSearchLow, intSearchHigh);
        }

        if (searchReference.equals("STRAIN_W") && searchAlternative.equals("STRAIN_ZERO")) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrainWNEStrainZERO");
            SNPChromosomes = repositorysnpchromosome.listByRangeANDStrainWNEStrainZERO(intSearchLow, intSearchHigh);
        }

        if (searchReference.equals("STRAIN_W") && searchAlternative.equals("STRAIN_6")) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrainWNEStrain6");
            SNPChromosomes = repositorysnpchromosome.listByRangeANDStrainWNEStrain6(intSearchLow, intSearchHigh);
        }

        if (searchReference.equals("STRAIN_W") && searchAlternative.equals("STRAIN_C")) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrainWNEStrainC");
            SNPChromosomes = repositorysnpchromosome.listByRangeANDStrainWNEStrainC(intSearchLow, intSearchHigh);
        }

        if (searchReference.equals("STRAIN_N") && searchAlternative.equals("STRAIN_15I")) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrainNNEStrain15I");
            SNPChromosomes = repositorysnpchromosome.listByRangeANDStrainNNEStrain15I(intSearchLow, intSearchHigh);
        }

        if (searchReference.equals("STRAIN_N") && searchAlternative.equals("STRAIN_ZERO")) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrainNNEStrainZERO");
            SNPChromosomes = repositorysnpchromosome.listByRangeANDStrainNNEStrainZERO(intSearchLow, intSearchHigh);
        }

        if (searchReference.equals("STRAIN_N") && searchAlternative.equals("STRAIN_6")) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrainNNEStrain6");
            SNPChromosomes = repositorysnpchromosome.listByRangeANDStrainNNEStrain6(intSearchLow, intSearchHigh);
        }

        if (searchReference.equals("STRAIN_N") && searchAlternative.equals("STRAIN_C")) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrainNNEStrainC");
            SNPChromosomes = repositorysnpchromosome.listByRangeANDStrainNNEStrainC(intSearchLow, intSearchHigh);
        }

        if (searchReference.equals("STRAIN_15I") && searchAlternative.equals("STRAIN_ZERO")) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrain15INEStrainZERO");
            SNPChromosomes = repositorysnpchromosome.listByRangeANDStrain15INEStrainZERO(intSearchLow, intSearchHigh);
        }

        if (searchReference.equals("STRAIN_15I") && searchAlternative.equals("STRAIN_6")) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrain15INEStrain6");
            SNPChromosomes = repositorysnpchromosome.listByRangeANDStrain15INEStrain6(intSearchLow, intSearchHigh);
        }

        if (searchReference.equals("STRAIN_15I") && searchAlternative.equals("STRAIN_C")) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrain15INEStrainC");
            SNPChromosomes = repositorysnpchromosome.listByRangeANDStrain15INEStrainC(intSearchLow, intSearchHigh);
        }

        if (searchReference.equals("STRAIN_ZERO") && searchAlternative.equals("STRAIN_6")) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrainZERONEStrain6");
            SNPChromosomes = repositorysnpchromosome.listByRangeANDStrainZERONEStrain6(intSearchLow, intSearchHigh);
        }

        if (searchReference.equals("STRAIN_ZERO") && searchAlternative.equals("STRAIN_C")) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrainZERONEStrainC");
            SNPChromosomes = repositorysnpchromosome.listByRangeANDStrainZERONEStrainC(intSearchLow, intSearchHigh);
        }

        if (searchReference.equals("STRAIN_6") && searchAlternative.equals("STRAIN_C")) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrain6NEStrainC");
            SNPChromosomes = repositorysnpchromosome.listByRangeANDStrain6NEStrainC(intSearchLow, intSearchHigh);
        }

        return SNPChromosomes;
    }

    
    @Transactional(readOnly = true)
    @Override
    public Page<SNPChromosome> search(DTOSearch searchCriteria, Integer pageNumber) throws 
        ExceptionSNPChromosomeLowCoordinateNotNumeric,
        ExceptionSNPChromosomeHighCoordinateNotNumeric,
        ExceptionSNPChromosomeLowCoordinateGreaterThanHighCoordinate,
        ExceptionSNPChromosomeReferenceAlleleNotSupplied,
        ExceptionSNPChromosomeAlternativeAlleleNotSupplied,
        ExceptionSNPChromosomeReferenceAlleleEqualsAlternativeAllele {
        
    	LOGGER.debug("Searching SNPChromosomes with search criteria: " + searchCriteria);
    	
        int intSearchLow = 0;
        int intSearchHigh = 0;
        
        String strSearchLow = searchCriteria.getSearchLowRange();
        String strSearchHigh = searchCriteria.getSearchHighRange();
        SearchReference searchReference = searchCriteria.getSearchReference();
        SearchAlternative searchAlternative = searchCriteria.getSearchAlternative();
        
        if ( StringUtility.isItNumeric(strSearchLow) ) {
        	intSearchLow = Integer.parseInt(strSearchLow);
        }
        else {
            throw new ExceptionSNPChromosomeLowCoordinateNotNumeric("ERROR: Search Low Co-ordinate is NOT Numeric : " + strSearchLow + " !!!");
        }
        if ( StringUtility.isItNumeric(strSearchHigh) ) {
        	intSearchHigh = Integer.parseInt(strSearchHigh);
        }
        else {
            throw new ExceptionSNPChromosomeHighCoordinateNotNumeric("ERROR: Search High Co-ordinate is NOT Numeric : " + strSearchHigh + " !!!");
        }
        if ( intSearchLow > intSearchHigh) {
            throw new ExceptionSNPChromosomeLowCoordinateGreaterThanHighCoordinate("ERROR: Search Low Co-ordinate (" + strSearchLow + ") is GREATER THAN Search High Co-ordinate (" + strSearchHigh + ") !!!");
        }
        if ( searchReference == searchReference.NONE ) {
            throw new ExceptionSNPChromosomeReferenceAlleleNotSupplied("ERROR: Reference Allele Not Supplied !!!");
        }
        if ( searchAlternative == searchAlternative.NONE  ) {
            throw new ExceptionSNPChromosomeAlternativeAlleleNotSupplied("ERROR: Alternative Allele Not Supplied !!!");
        }
        if ( searchReference.toString().equals(searchAlternative.toString()) ) {
            throw new ExceptionSNPChromosomeReferenceAlleleEqualsAlternativeAllele("ERROR: Reference Allele EQUALS Alternative Allele !!!");
        }
        
        return findSNPChromosomesBySearchType(pageNumber, intSearchLow, intSearchHigh, searchReference, searchAlternative);
    }
    
    
    private Page<SNPChromosome> findSNPChromosomesBySearchType(Integer pageNumber, 
    		int intSearchLow,
    		int intSearchHigh, 
    		SearchReference searchReference, 
    		SearchAlternative searchAlternative) {
    	
    	Page<SNPChromosome> SNPChromosomes = null;
    	
    	PageRequest pageRequest = new PageRequest(pageNumber - 1, NUMBER_OF_SNPCHROMOSOMES_PER_PAGE, Sort.Direction.ASC, "snpId");

        if (searchReference == searchReference.STRAIN_7 && searchAlternative == searchAlternative.STRAIN_P) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrain7NEStrainP");
            SNPChromosomes = repositorysnpchromosome.findByRangeANDStrain7NEStrainP(intSearchLow, intSearchHigh, pageRequest);
        }

        if (searchReference == searchReference.STRAIN_7 && searchAlternative == searchAlternative.STRAIN_W) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrain7NEStrainW");
            SNPChromosomes = repositorysnpchromosome.findByRangeANDStrain7NEStrainW(intSearchLow, intSearchHigh, pageRequest);
        }
            
        if (searchReference == searchReference.STRAIN_7 && searchAlternative == searchAlternative.STRAIN_N) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrain7NEStrainN");
            SNPChromosomes = repositorysnpchromosome.findByRangeANDStrain7NEStrainN(intSearchLow, intSearchHigh, pageRequest);
        }
            
        if (searchReference == searchReference.STRAIN_7 && searchAlternative == searchAlternative.STRAIN_15I) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrain7NEStrain15I");
            SNPChromosomes = repositorysnpchromosome.findByRangeANDStrain7NEStrain15I(intSearchLow, intSearchHigh, pageRequest);
        }
            
        if (searchReference == searchReference.STRAIN_7 && searchAlternative == searchAlternative.STRAIN_ZERO) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrain7NEStrainZERO");
            SNPChromosomes = repositorysnpchromosome.findByRangeANDStrain7NEStrainZERO(intSearchLow, intSearchHigh, pageRequest);
        }

        if (searchReference == searchReference.STRAIN_7 && searchAlternative == searchAlternative.STRAIN_6) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrain7NEStrain6");
            SNPChromosomes = repositorysnpchromosome.findByRangeANDStrain7NEStrain6(intSearchLow, intSearchHigh, pageRequest);
        }

        if (searchReference == searchReference.STRAIN_7 && searchAlternative == searchAlternative.STRAIN_C) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrain7NEStrainC");
            SNPChromosomes = repositorysnpchromosome.findByRangeANDStrain7NEStrainC(intSearchLow, intSearchHigh, pageRequest);
        }

        if (searchReference == searchReference.STRAIN_P && searchAlternative == searchAlternative.STRAIN_W) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrainPNEStrainW");
            SNPChromosomes = repositorysnpchromosome.findByRangeANDStrainPNEStrainW(intSearchLow, intSearchHigh, pageRequest);
        }

        if (searchReference == searchReference.STRAIN_P && searchAlternative == searchAlternative.STRAIN_N) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrainPNEStrainN");
            SNPChromosomes = repositorysnpchromosome.findByRangeANDStrainPNEStrainN(intSearchLow, intSearchHigh, pageRequest);
        }

        if (searchReference == searchReference.STRAIN_P && searchAlternative == searchAlternative.STRAIN_15I) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrainPNEStrain15I");
            SNPChromosomes = repositorysnpchromosome.findByRangeANDStrainPNEStrain15I(intSearchLow, intSearchHigh, pageRequest);
        }

        if (searchReference == searchReference.STRAIN_P && searchAlternative == searchAlternative.STRAIN_ZERO) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrainPNEStrainZERO");
            SNPChromosomes = repositorysnpchromosome.findByRangeANDStrainPNEStrainZERO(intSearchLow, intSearchHigh, pageRequest);
        }

        if (searchReference == searchReference.STRAIN_P && searchAlternative == searchAlternative.STRAIN_6) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrainPNEStrain6");
            SNPChromosomes = repositorysnpchromosome.findByRangeANDStrainPNEStrain6(intSearchLow, intSearchHigh, pageRequest);
        }

        if (searchReference == searchReference.STRAIN_P && searchAlternative == searchAlternative.STRAIN_C) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrainPNEStrainC");
            SNPChromosomes = repositorysnpchromosome.findByRangeANDStrainPNEStrainC(intSearchLow, intSearchHigh, pageRequest);
        }

        if (searchReference == searchReference.STRAIN_W && searchAlternative == searchAlternative.STRAIN_N) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrainWNEStrainN");
            SNPChromosomes = repositorysnpchromosome.findByRangeANDStrainWNEStrainN(intSearchLow, intSearchHigh, pageRequest);
        }

        if (searchReference == searchReference.STRAIN_W && searchAlternative == searchAlternative.STRAIN_15I) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrainWNEStrain15I");
            SNPChromosomes = repositorysnpchromosome.findByRangeANDStrainWNEStrain15I(intSearchLow, intSearchHigh, pageRequest);
        }

        if (searchReference == searchReference.STRAIN_W && searchAlternative == searchAlternative.STRAIN_ZERO) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrainWNEStrainZERO");
            SNPChromosomes = repositorysnpchromosome.findByRangeANDStrainWNEStrainZERO(intSearchLow, intSearchHigh, pageRequest);
        }

        if (searchReference == searchReference.STRAIN_W && searchAlternative == searchAlternative.STRAIN_6) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrainWNEStrain6");
            SNPChromosomes = repositorysnpchromosome.findByRangeANDStrainWNEStrain6(intSearchLow, intSearchHigh, pageRequest);
        }

        if (searchReference == searchReference.STRAIN_W && searchAlternative == searchAlternative.STRAIN_C) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrainWNEStrainC");
            SNPChromosomes = repositorysnpchromosome.findByRangeANDStrainWNEStrainC(intSearchLow, intSearchHigh, pageRequest);
        }

        if (searchReference == searchReference.STRAIN_N && searchAlternative == searchAlternative.STRAIN_15I) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrainNNEStrain15I");
            SNPChromosomes = repositorysnpchromosome.findByRangeANDStrainNNEStrain15I(intSearchLow, intSearchHigh, pageRequest);
        }

        if (searchReference == searchReference.STRAIN_N && searchAlternative == searchAlternative.STRAIN_ZERO) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrainNNEStrainZERO");
            SNPChromosomes = repositorysnpchromosome.findByRangeANDStrainNNEStrainZERO(intSearchLow, intSearchHigh, pageRequest);
        }

        if (searchReference == searchReference.STRAIN_N && searchAlternative == searchAlternative.STRAIN_6) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrainNNEStrain6");
            SNPChromosomes = repositorysnpchromosome.findByRangeANDStrainNNEStrain6(intSearchLow, intSearchHigh, pageRequest);
        }

        if (searchReference == searchReference.STRAIN_N && searchAlternative == searchAlternative.STRAIN_C) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrainNNEStrainC");
            SNPChromosomes = repositorysnpchromosome.findByRangeANDStrainNNEStrainC(intSearchLow, intSearchHigh, pageRequest);
        }

        if (searchReference == searchReference.STRAIN_15I && searchAlternative == searchAlternative.STRAIN_ZERO) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrain15INEStrainZERO");
            SNPChromosomes = repositorysnpchromosome.findByRangeANDStrain15INEStrainZERO(intSearchLow, intSearchHigh, pageRequest);
        }

        if (searchReference == searchReference.STRAIN_15I && searchAlternative == searchAlternative.STRAIN_6) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrain15INEStrain6");
            SNPChromosomes = repositorysnpchromosome.findByRangeANDStrain15INEStrain6(intSearchLow, intSearchHigh, pageRequest);
        }

        if (searchReference == searchReference.STRAIN_15I && searchAlternative == searchAlternative.STRAIN_C) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrain15INEStrainC");
            SNPChromosomes = repositorysnpchromosome.findByRangeANDStrain15INEStrainC(intSearchLow, intSearchHigh, pageRequest);
        }

        if (searchReference == searchReference.STRAIN_ZERO && searchAlternative == searchAlternative.STRAIN_6) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrainZERONEStrain6");
            SNPChromosomes = repositorysnpchromosome.findByRangeANDStrainZERONEStrain6(intSearchLow, intSearchHigh, pageRequest);
        }

        if (searchReference == searchReference.STRAIN_ZERO && searchAlternative == searchAlternative.STRAIN_C) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrainZERONEStrainC");
            SNPChromosomes = repositorysnpchromosome.findByRangeANDStrainZERONEStrainC(intSearchLow, intSearchHigh, pageRequest);
        }

        if (searchReference == searchReference.STRAIN_6 && searchAlternative == searchAlternative.STRAIN_C) {

            LOGGER.debug("Searching SNPChromosomes by using findByRangeANDStrain6NEStrainC");
            SNPChromosomes = repositorysnpchromosome.findByRangeANDStrain6NEStrainC(intSearchLow, intSearchHigh, pageRequest);
        }

        return SNPChromosomes;
    }
    
    
    @Transactional(readOnly = true)
    @Override
    public Page<SNPChromosome> findAll(Integer pageNumber) {
    	
        LOGGER.debug("Finding all SNPChromosomes");

        PageRequest pageRequest = new PageRequest(pageNumber - 1, NUMBER_OF_SNPCHROMOSOMES_PER_PAGE, Sort.Direction.ASC, "snpId");

        return repositorysnpchromosome.findAll(pageRequest);
    }

    

    @Transactional
    @Override
    public SNPChromosome create(DTOSNPChromosome created) {
    	
        LOGGER.debug("Creating a new snpchromosome with information: " + created);
        
        SNPChromosome snpchromosome = SNPChromosome.getBuilder(
        		created.getSnpId(),
        		created.getChromosomeId(),
        		created.getPositionAsInteger(),
        		created.getReference(),    
        		created.getAlternative(),
        		created.getRegion(),
        		created.getEnsemblGene(),
        		created.getEnsemblTranscript(),
        		created.getEnsemblAnnotation(),
        		created.getStrain7Allele(),
        		created.getStrain7AlleleFixedAsBoolean(),
        		created.getStrain7AlleleRatioAsLong(),
        		created.getStrainPAllele(),
        		created.getStrainPAlleleFixedAsBoolean(),
        		created.getStrainPAlleleRatioAsLong(),
        		created.getStrainWAllele(),
        		created.getStrainWAlleleFixedAsBoolean(),
        		created.getStrainWAlleleRatioAsLong(),
        		created.getStrainNAllele(),
        		created.getStrainNAlleleFixedAsBoolean(),
        		created.getStrainNAlleleRatioAsLong(),
        		created.getStrain15IAllele(),
        		created.getStrain15IAlleleFixedAsBoolean(),
        		created.getStrain15IAlleleRatioAsLong(),
        		created.getStrainZEROAllele(),
        		created.getStrainZEROAlleleFixedAsBoolean(),
        		created.getStrainZEROAlleleRatioAsLong(),
        		created.getStrain6Allele(),
        		created.getStrain6AlleleFixedAsBoolean(),
        		created.getStrain6AlleleRatioAsLong(),
        		created.getStrainCAllele(),
        		created.getStrainCAlleleFixedAsBoolean(),
        		created.getStrainCAlleleRatioAsLong()
        		).build();
        
        return repositorysnpchromosome.save(snpchromosome);
    }

    @Transactional(rollbackFor = ExceptionSNPChromosomeNotFound.class)
    @Override
    public SNPChromosome delete(Long snpchromosomeId) throws ExceptionSNPChromosomeNotFound {
    	
        LOGGER.debug("Deleting snpchromosome with id: " + snpchromosomeId);
        
        SNPChromosome deleted = repositorysnpchromosome.findOne(snpchromosomeId);
        
        if (deleted == null) {
        	
            LOGGER.debug("No snpchromosome found with id: " + snpchromosomeId);
            
            throw new ExceptionSNPChromosomeNotFound("No snpchromosome found with id: " + snpchromosomeId);
        }
        
        repositorysnpchromosome.delete(deleted);
        return deleted;
    }

    @Transactional(rollbackFor = ExceptionSNPChromosomeNotFound.class)
    @Override
    public SNPChromosome update(DTOSNPChromosome updated) throws ExceptionSNPChromosomeNotFound {
    	
        LOGGER.debug("Updating snpchromosome with information: " + updated);
        
        SNPChromosome snpchromosome = repositorysnpchromosome.findOne(updated.getOid());
        
        if (snpchromosome == null) {
        	
            LOGGER.debug("No snpchromosome found with id: " + updated.getOid());
            
            throw new ExceptionSNPChromosomeNotFound("No snpchromosome found with id: " + updated.getOid());
        }
        
        snpchromosome.update(
        		updated.getSnpId(),
        		updated.getChromosomeId(),
        		updated.getPositionAsInteger(),
        		updated.getReference(),    
        		updated.getAlternative(),
        		updated.getRegion(),
        		updated.getEnsemblGene(),
        		updated.getEnsemblTranscript(),
        		updated.getEnsemblAnnotation(),
        		updated.getStrain7Allele(),
        		updated.getStrain7AlleleFixedAsBoolean(),
        		updated.getStrain7AlleleRatioAsLong(),
        		updated.getStrainPAllele(),
        		updated.getStrainPAlleleFixedAsBoolean(),
        		updated.getStrainPAlleleRatioAsLong(),
        		updated.getStrainWAllele(),
        		updated.getStrainWAlleleFixedAsBoolean(),
        		updated.getStrainWAlleleRatioAsLong(),
        		updated.getStrainNAllele(),
        		updated.getStrainNAlleleFixedAsBoolean(),
        		updated.getStrainNAlleleRatioAsLong(),
        		updated.getStrain15IAllele(),
        		updated.getStrain15IAlleleFixedAsBoolean(),
        		updated.getStrain15IAlleleRatioAsLong(),
        		updated.getStrainZEROAllele(),
        		updated.getStrainZEROAlleleFixedAsBoolean(),
        		updated.getStrainZEROAlleleRatioAsLong(),
        		updated.getStrain6Allele(),
        		updated.getStrain6AlleleFixedAsBoolean(),
        		updated.getStrain6AlleleRatioAsLong(),
        		updated.getStrainCAllele(),
        		updated.getStrainCAlleleFixedAsBoolean(),
        		updated.getStrainCAlleleRatioAsLong()
        		);

        return snpchromosome;
    }

    
    /**
     * This setter method should be used only by unit tests.
     * @param repositorySNPChromosome
     */
    protected void setRepositorySNPChromosome(RepositorySNPChromosome repositorysnpchromosome) {
    	
        this.repositorysnpchromosome = repositorysnpchromosome;
    }

}
