package com.roslin.mwicks.spring.variation.service;

import com.roslin.mwicks.spring.variation.dto.DTOSearch;
import com.roslin.mwicks.spring.variation.dto.DTODownload;
import com.roslin.mwicks.spring.variation.dto.DTOSNPChromosome;

import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeNotFound;

import com.roslin.mwicks.spring.variation.model.PageSNPChromosome;
import com.roslin.mwicks.spring.variation.model.SNPChromosome;
import com.roslin.mwicks.spring.variation.model.SNPChromosome15;

import com.roslin.mwicks.spring.variation.repository.RepositorySNPChromosome15;

import com.roslin.mwicks.spring.variation.serviceinterface.ServiceSNPChromosome15;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * This implementation of the SNPChromosomeService interface communicates with
 * the database by using a Spring Data JPA repository.
 * @author Mike Wicks
 */
@Service
public class ServiceRepositorySNPChromosome15 implements ServiceSNPChromosome15 {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceRepositorySNPChromosome15.class);
    
    private static final int NUMBER_OF_SNPCHROMOSOMES_PER_PAGE = 30;

    @Resource
    private RepositorySNPChromosome15 repositorysnpchromosome;

    
    @Transactional(readOnly = true)
    @Override
    public List<SNPChromosome> download(DTODownload dtoDownload) {
        
    	LOGGER.debug("Downloading snpchromosomes with download criteria: " + dtoDownload);
    	
    	List<SNPChromosome15> snpchromosome15s = null;
    	
        if (dtoDownload.isDownloadReference7() && dtoDownload.isDownloadAlternativeP()) {
            LOGGER.debug("Searching snpchromosome15s by using findByRangeANDStrain7NEStrainP");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrain7NEStrainP(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference7() && dtoDownload.isDownloadAlternativeW()) {
            LOGGER.debug("Searching snpchromosome15s by using findByRangeANDStrain7NEStrainW");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrain7NEStrainW(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference7() && dtoDownload.isDownloadAlternativeN()) {
            LOGGER.debug("Searching snpchromosome15s by using findByRangeANDStrain7NEStrainN");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrain7NEStrainN(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference7() && dtoDownload.isDownloadAlternative15I()) {
            LOGGER.debug("Searching snpchromosome15s by using findByRangeANDStrain7NEStrain15I");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrain7NEStrain15I(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference7() && dtoDownload.isDownloadAlternativeZero()) {
            LOGGER.debug("Searching snpchromosome15s by using findByRangeANDStrain7NEStrainZERO");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrain7NEStrainZERO(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference7() && dtoDownload.isDownloadAlternative6()) {
            LOGGER.debug("Searching snpchromosome15s by using findByRangeANDStrain7NEStrain6");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrain7NEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference7() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosome15s by using findByRangeANDStrain7NEStrainC");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrain7NEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }

        if (dtoDownload.isDownloadReferenceP() && dtoDownload.isDownloadAlternative7()) {
            LOGGER.debug("Searching snpchromosome15s by using findByRangeANDStrainPNEStrain&");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrain7NEStrainP(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceP() && dtoDownload.isDownloadAlternativeW()) {
            LOGGER.debug("Searching snpchromosome15s by using findByRangeANDStrainPNEStrainW");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrainPNEStrainW(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceP() && dtoDownload.isDownloadAlternativeN()) {
            LOGGER.debug("Searching snpchromosome15s by using findByRangeANDStrainPNEStrainN");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrainPNEStrainN(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceP() && dtoDownload.isDownloadAlternative15I()) {
            LOGGER.debug("Searching snpchromosome15s by using findByRangeANDStrainPNEStrain15I");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrainPNEStrain15I(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceP() && dtoDownload.isDownloadAlternativeZero()) {
            LOGGER.debug("Searching snpchromosome15s by using findByRangeANDStrainPNEStrainZERO");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrainPNEStrainZERO(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceP() && dtoDownload.isDownloadAlternative6()) {
            LOGGER.debug("Searching snpchromosome15s by using findByRangeANDStrainPNEStrain6");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrainPNEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceP() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosome15s by using findByRangeANDStrainPNEStrainC");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrainPNEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }

        if (dtoDownload.isDownloadReferenceW() && dtoDownload.isDownloadAlternative7()) {
            LOGGER.debug("Searching snpchromosome15s by using findByRangeANDStrainWNEStrainW");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrain7NEStrainW(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceW() && dtoDownload.isDownloadAlternativeP()) {
            LOGGER.debug("Searching snpchromosome15s by using findByRangeANDStrainWNEStrainW");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrainPNEStrainW(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceW() && dtoDownload.isDownloadAlternativeN()) {
            LOGGER.debug("Searching snpchromosome15s by using findByRangeANDStrainWNEStrainN");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrainWNEStrainN(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceW() && dtoDownload.isDownloadAlternative15I()) {
            LOGGER.debug("Searching snpchromosome15s by using findByRangeANDStrainWNEStrain15I");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrainWNEStrain15I(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceW() && dtoDownload.isDownloadAlternativeZero()) {
            LOGGER.debug("Searching snpchromosome15s by using findByRangeANDStrainWNEStrainZERO");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrainWNEStrainZERO(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceW() && dtoDownload.isDownloadAlternative6()) {
            LOGGER.debug("Searching snpchromosome15s by using findByRangeANDStrainWNEStrain6");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrainWNEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceW() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosome15s by using findByRangeANDStrainWNEStrainC");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrainWNEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }

        if (dtoDownload.isDownloadReferenceN() && dtoDownload.isDownloadAlternative7()) {
            LOGGER.debug("Searching snpchromosome15s by using listByRangeANDStrain7NEStrainN");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrain7NEStrainN(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceN() && dtoDownload.isDownloadAlternativeP()) {
            LOGGER.debug("Searching snpchromosome15s by using listByRangeANDStrainPNEStrainN");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrainPNEStrainN(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceN() && dtoDownload.isDownloadAlternativeW()) {
            LOGGER.debug("Searching snpchromosome15s by using listByRangeANDStrainWNEStrainN");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrainWNEStrainN(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceN() && dtoDownload.isDownloadAlternative15I()) {
            LOGGER.debug("Searching snpchromosome15s by using findByRangeANDStrainNNEStrain15I");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrainNNEStrain15I(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceN() && dtoDownload.isDownloadAlternativeZero()) {
            LOGGER.debug("Searching snpchromosome15s by using findByRangeANDStrainNNEStrainZERO");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrainNNEStrainZERO(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceN() && dtoDownload.isDownloadAlternative6()) {
            LOGGER.debug("Searching snpchromosome15s by using findByRangeANDStrainNNEStrain6");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrainNNEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceN() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosome15s by using findByRangeANDStrainNNEStrainC");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrainNNEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        
        if (dtoDownload.isDownloadReference15I() && dtoDownload.isDownloadAlternative7()) {
            LOGGER.debug("Searching snpchromosome15s by using listByRangeANDStrain7NEStrain15I");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrain7NEStrain15I(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference15I() && dtoDownload.isDownloadAlternativeP()) {
            LOGGER.debug("Searching snpchromosome15s by using listByRangeANDStrainPNEStrain15I");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrainPNEStrain15I(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference15I() && dtoDownload.isDownloadAlternativeN()) {
            LOGGER.debug("Searching snpchromosome15s by using listByRangeANDStrainNNEStrain15I");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrainNNEStrain15I(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference15I() && dtoDownload.isDownloadAlternativeW()) {
            LOGGER.debug("Searching snpchromosome15s by using listByRangeANDStrainWNEStrain15I");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrainWNEStrain15I(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference15I() && dtoDownload.isDownloadAlternativeZero()) {
            LOGGER.debug("Searching snpchromosome15s by using findByRangeANDStrain15INEStrainZERO");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrain15INEStrainZERO(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference15I() && dtoDownload.isDownloadAlternative6()) {
            LOGGER.debug("Searching snpchromosome15s by using findByRangeANDStrain15INEStrain6");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrain15INEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference15I() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosome15s by using findByRangeANDStrain15INEStrainC");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrain15INEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }

        if (dtoDownload.isDownloadReferenceZero() && dtoDownload.isDownloadAlternative7()) {
            LOGGER.debug("Searching snpchromosome15s by using listByRangeANDStrain7NEStrainZERO");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrain7NEStrainZERO(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceZero() && dtoDownload.isDownloadAlternativeP()) {
            LOGGER.debug("Searching snpchromosome15s by using listByRangeANDStrainPNEStrainZERO");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrainPNEStrainZERO(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceZero() && dtoDownload.isDownloadAlternativeN()) {
            LOGGER.debug("Searching snpchromosome15s by using listByRangeANDStrainNNEStrainZERO");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrainNNEStrainZERO(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceZero() && dtoDownload.isDownloadAlternativeW()) {
            LOGGER.debug("Searching snpchromosome15s by using listByRangeANDStrainWNEStrainZERO");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrainWNEStrainZERO(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceZero() && dtoDownload.isDownloadAlternative15I()) {
            LOGGER.debug("Searching snpchromosome15s by using listByRangeANDStrain15INEStrainZERO");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrain15INEStrainZERO(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceZero() && dtoDownload.isDownloadAlternative6()) {
            LOGGER.debug("Searching snpchromosome15s by using findByRangeANDStrainZERONEStrain6");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrainZERONEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceZero() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosome15s by using findByRangeANDStrainZERONEStrainC");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrainZERONEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }

        if (dtoDownload.isDownloadReference6() && dtoDownload.isDownloadAlternative7()) {
            LOGGER.debug("Searching snpchromosome15s by using listByRangeANDStrain7NEStrain6");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrain7NEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference6() && dtoDownload.isDownloadAlternativeP()) {
            LOGGER.debug("Searching snpchromosome15s by using listByRangeANDStrainPNEStrain6");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrainPNEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference6() && dtoDownload.isDownloadAlternativeN()) {
            LOGGER.debug("Searching snpchromosome15s by using listByRangeANDStrainNNEStrain6");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrainNNEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference6() && dtoDownload.isDownloadAlternativeW()) {
            LOGGER.debug("Searching snpchromosome15s by using listByRangeANDStrainWNEStrain6");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrainWNEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference6() && dtoDownload.isDownloadAlternative15I()) {
            LOGGER.debug("Searching snpchromosome15s by using listByRangeANDStrain15INEStrain6");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrain15INEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference6() && dtoDownload.isDownloadAlternativeZero()) {
            LOGGER.debug("Searching snpchromosome15s by using findByRangeANDStrainZERONEStrain6");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrainZERONEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference6() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosome15s by using findByRangeANDStrainZERONEStrainC");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrainZERONEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }

        if (dtoDownload.isDownloadReferenceC() && dtoDownload.isDownloadAlternative7()) {
            LOGGER.debug("Searching snpchromosome15s by using listByRangeANDStrain7NEStrainC");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrain7NEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceC() && dtoDownload.isDownloadAlternativeP()) {
            LOGGER.debug("Searching snpchromosome15s by using listByRangeANDStrainPNEStrainC");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrainPNEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceC() && dtoDownload.isDownloadAlternativeN()) {
            LOGGER.debug("Searching snpchromosome15s by using listByRangeANDStrainNNEStrainC");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrainNNEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceC() && dtoDownload.isDownloadAlternativeW()) {
            LOGGER.debug("Searching snpchromosome15s by using listByRangeANDStrainWNEStrainC");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrainWNEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceC() && dtoDownload.isDownloadAlternative15I()) {
            LOGGER.debug("Searching snpchromosome15s by using listByRangeANDStrain15INEStrainC");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrain15INEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceC() && dtoDownload.isDownloadAlternativeZero()) {
            LOGGER.debug("Searching snpchromosome15s by using findByRangeANDStrainZERONEStrainC");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrainZERONEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceC() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosome15s by using listByRangeANDStrain6NEStrainC");
            snpchromosome15s = repositorysnpchromosome.listByRangeANDStrain6NEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }

    	List<SNPChromosome> snpchromosomes = new ArrayList<SNPChromosome>();
    	
        Iterator<SNPChromosome15> iteratorSNPChromosome15 = snpchromosome15s.iterator();
        
     	while (iteratorSNPChromosome15.hasNext()) {
    		
     		SNPChromosome15 snpchromosome15 = iteratorSNPChromosome15.next();
     		
     		SNPChromosome snpchromosome = snpchromosome15.convert();
     		
     		snpchromosomes.add(snpchromosome);
     	}
     	
        return snpchromosomes;
    }

    
    @Transactional(readOnly = true)
    @Override
    public PageSNPChromosome search(DTOSearch dtoSearch, Integer pageNumber) {
        
    	LOGGER.debug("Searching snpchromosomes with search criteria: " + dtoSearch);

    	Page<SNPChromosome15> pagesnpchromosome15s = null;

    	PageRequest pageRequest = new PageRequest(pageNumber - 1, NUMBER_OF_SNPCHROMOSOMES_PER_PAGE, Sort.Direction.ASC, "snpId");

        if (dtoSearch.isSearchReference7() && dtoSearch.isSearchAlternativeP()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using findByRangeANDStrain7NEStrainP");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrain7NEStrainP(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference7() && dtoSearch.isSearchAlternativeW()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using findByRangeANDStrain7NEStrainW");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrain7NEStrainW(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference7() && dtoSearch.isSearchAlternativeN()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using findByRangeANDStrain7NEStrainN");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrain7NEStrainN(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference7() && dtoSearch.isSearchAlternative15I()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using findByRangeANDStrain7NEStrain15I");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrain7NEStrain15I(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference7() && dtoSearch.isSearchAlternativeZero()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using findByRangeANDStrain7NEStrainZERO");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrain7NEStrainZERO(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference7() && dtoSearch.isSearchAlternative6()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using findByRangeANDStrain7NEStrain6");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrain7NEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference7() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using findByRangeANDStrain7NEStrainC");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrain7NEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }

        if (dtoSearch.isSearchReferenceP() && dtoSearch.isSearchAlternative7()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using findByRangeANDStrainPNEStrain&");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrain7NEStrainP(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceP() && dtoSearch.isSearchAlternativeW()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using findByRangeANDStrainPNEStrainW");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrainPNEStrainW(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceP() && dtoSearch.isSearchAlternativeN()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using findByRangeANDStrainPNEStrainN");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrainPNEStrainN(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceP() && dtoSearch.isSearchAlternative15I()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using findByRangeANDStrainPNEStrain15I");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrainPNEStrain15I(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceP() && dtoSearch.isSearchAlternativeZero()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using findByRangeANDStrainPNEStrainZERO");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrainPNEStrainZERO(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceP() && dtoSearch.isSearchAlternative6()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using findByRangeANDStrainPNEStrain6");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrainPNEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceP() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using findByRangeANDStrainPNEStrainC");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrainPNEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }

        if (dtoSearch.isSearchReferenceW() && dtoSearch.isSearchAlternative7()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using findByRangeANDStrainWNEStrainW");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrain7NEStrainW(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceW() && dtoSearch.isSearchAlternativeP()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using findByRangeANDStrainWNEStrainW");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrainPNEStrainW(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceW() && dtoSearch.isSearchAlternativeN()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using findByRangeANDStrainWNEStrainN");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrainWNEStrainN(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceW() && dtoSearch.isSearchAlternative15I()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using findByRangeANDStrainWNEStrain15I");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrainWNEStrain15I(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceW() && dtoSearch.isSearchAlternativeZero()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using findByRangeANDStrainWNEStrainZERO");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrainWNEStrainZERO(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceW() && dtoSearch.isSearchAlternative6()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using findByRangeANDStrainWNEStrain6");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrainWNEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceW() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using findByRangeANDStrainWNEStrainC");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrainWNEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }

        if (dtoSearch.isSearchReferenceN() && dtoSearch.isSearchAlternative7()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using listByRangeANDStrain7NEStrainN");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrain7NEStrainN(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceN() && dtoSearch.isSearchAlternativeP()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using listByRangeANDStrainPNEStrainN");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrainPNEStrainN(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceN() && dtoSearch.isSearchAlternativeW()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using listByRangeANDStrainWNEStrainN");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrainWNEStrainN(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceN() && dtoSearch.isSearchAlternative15I()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using findByRangeANDStrainNNEStrain15I");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrainNNEStrain15I(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceN() && dtoSearch.isSearchAlternativeZero()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using findByRangeANDStrainNNEStrainZERO");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrainNNEStrainZERO(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceN() && dtoSearch.isSearchAlternative6()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using findByRangeANDStrainNNEStrain6");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrainNNEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceN() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using findByRangeANDStrainNNEStrainC");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrainNNEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        
        if (dtoSearch.isSearchReference15I() && dtoSearch.isSearchAlternative7()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using listByRangeANDStrain7NEStrain15I");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrain7NEStrain15I(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference15I() && dtoSearch.isSearchAlternativeP()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using listByRangeANDStrainPNEStrain15I");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrainPNEStrain15I(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference15I() && dtoSearch.isSearchAlternativeN()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using listByRangeANDStrainNNEStrain15I");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrainNNEStrain15I(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference15I() && dtoSearch.isSearchAlternativeW()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using listByRangeANDStrainWNEStrain15I");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrainWNEStrain15I(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference15I() && dtoSearch.isSearchAlternativeZero()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using findByRangeANDStrain15INEStrainZERO");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrain15INEStrainZERO(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference15I() && dtoSearch.isSearchAlternative6()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using findByRangeANDStrain15INEStrain6");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrain15INEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference15I() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using findByRangeANDStrain15INEStrainC");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrain15INEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }

        if (dtoSearch.isSearchReferenceZero() && dtoSearch.isSearchAlternative7()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using listByRangeANDStrain7NEStrainZERO");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrain7NEStrainZERO(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceZero() && dtoSearch.isSearchAlternativeP()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using listByRangeANDStrainPNEStrainZERO");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrainPNEStrainZERO(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceZero() && dtoSearch.isSearchAlternativeN()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using listByRangeANDStrainNNEStrainZERO");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrainNNEStrainZERO(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceZero() && dtoSearch.isSearchAlternativeW()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using listByRangeANDStrainWNEStrainZERO");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrainWNEStrainZERO(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceZero() && dtoSearch.isSearchAlternative15I()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using listByRangeANDStrain15INEStrainZERO");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrain15INEStrainZERO(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceZero() && dtoSearch.isSearchAlternative6()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using findByRangeANDStrainZERONEStrain6");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrainZERONEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceZero() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using findByRangeANDStrainZERONEStrainC");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrainZERONEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }

        if (dtoSearch.isSearchReference6() && dtoSearch.isSearchAlternative7()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using listByRangeANDStrain7NEStrain6");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrain7NEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference6() && dtoSearch.isSearchAlternativeP()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using listByRangeANDStrainPNEStrain6");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrainPNEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference6() && dtoSearch.isSearchAlternativeN()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using listByRangeANDStrainNNEStrain6");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrainNNEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference6() && dtoSearch.isSearchAlternativeW()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using listByRangeANDStrainWNEStrain6");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrainWNEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference6() && dtoSearch.isSearchAlternative15I()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using listByRangeANDStrain15INEStrain6");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrain15INEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference6() && dtoSearch.isSearchAlternativeZero()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using findByRangeANDStrainZERONEStrain6");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrainZERONEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference6() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using findByRangeANDStrainZERONEStrainC");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrainZERONEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }

        if (dtoSearch.isSearchReferenceC() && dtoSearch.isSearchAlternative7()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using listByRangeANDStrain7NEStrainC");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrain7NEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceC() && dtoSearch.isSearchAlternativeP()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using listByRangeANDStrainPNEStrainC");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrainPNEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceC() && dtoSearch.isSearchAlternativeN()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using listByRangeANDStrainNNEStrainC");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrainNNEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceC() && dtoSearch.isSearchAlternativeW()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using listByRangeANDStrainWNEStrainC");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrainWNEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceC() && dtoSearch.isSearchAlternative15I()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using listByRangeANDStrain15INEStrainC");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrain15INEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceC() && dtoSearch.isSearchAlternativeZero()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using findByRangeANDStrainZERONEStrainC");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrainZERONEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceC() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching pagesnpchromosome15s by using listByRangeANDStrain6NEStrainC");
            pagesnpchromosome15s = repositorysnpchromosome.findByRangeANDStrain6NEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        
    	List<SNPChromosome15> snpchromosome15s = pagesnpchromosome15s.getContent();
    	List<SNPChromosome> snpchromosomes = new ArrayList<SNPChromosome>();
    	
        Iterator<SNPChromosome15> iteratorSNPChromosome15 = snpchromosome15s.iterator();
        
     	while (iteratorSNPChromosome15.hasNext()) {
    		
     		SNPChromosome15 snpchromosome15 = iteratorSNPChromosome15.next();
     		
     		SNPChromosome snpchromosome = snpchromosome15.convert();
     		
     		snpchromosomes.add(snpchromosome);
     	}
     	
    	PageSNPChromosome pagesnpchromosome = new PageSNPChromosome(pagesnpchromosome15s.getNumber(), pagesnpchromosome15s.getTotalPages(), pagesnpchromosome15s.getTotalElements(), snpchromosomes);

        return pagesnpchromosome;
    }
    
    
    @Transactional(readOnly = true)
    @Override
    public PageSNPChromosome findAll(Integer pageNumber) {
    	
        LOGGER.debug("Finding all snpchromosomes");

        PageRequest pageRequest = new PageRequest(pageNumber - 1, NUMBER_OF_SNPCHROMOSOMES_PER_PAGE, Sort.Direction.ASC, "snpId");
        
        Page<SNPChromosome15> pagesnpchromosome15s = repositorysnpchromosome.findAll(pageRequest);
        
    	List<SNPChromosome15> snpchromosome15s = pagesnpchromosome15s.getContent();
    	
    	List<SNPChromosome> snpchromosomes = new ArrayList<SNPChromosome>();
    	
        Iterator<SNPChromosome15> iteratorSNPChromosome15 = snpchromosome15s.iterator();
        
     	while (iteratorSNPChromosome15.hasNext()) {
    		
     		SNPChromosome15 snpchromosome15 = iteratorSNPChromosome15.next();
     		
     		SNPChromosome snpchromosome = snpchromosome15.convert();
     		
     		snpchromosomes.add(snpchromosome);
     	}
     	
    	PageSNPChromosome pagesnpchromosome = new PageSNPChromosome(pagesnpchromosome15s.getNumber(), pagesnpchromosome15s.getTotalPages(), pagesnpchromosome15s.getTotalElements(), snpchromosomes);

        return pagesnpchromosome;
    }
    

    @Transactional
    @Override
    public SNPChromosome15 create(DTOSNPChromosome created) {
    	
        LOGGER.debug("Creating a new snpchromosome with information: " + created);
        
        SNPChromosome15 snpchromosome = SNPChromosome15.getBuilder(
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
        		created.getStrain7AlleleFixed(),
        		created.getStrain7AlleleRatioAsLong(),
        		created.getStrainPAllele(),
        		created.getStrainPAlleleFixed(),
        		created.getStrainPAlleleRatioAsLong(),
        		created.getStrainWAllele(),
        		created.getStrainWAlleleFixed(),
        		created.getStrainWAlleleRatioAsLong(),
        		created.getStrainNAllele(),
        		created.getStrainNAlleleFixed(),
        		created.getStrainNAlleleRatioAsLong(),
        		created.getStrain15IAllele(),
        		created.getStrain15IAlleleFixed(),
        		created.getStrain15IAlleleRatioAsLong(),
        		created.getStrainZEROAllele(),
        		created.getStrainZEROAlleleFixed(),
        		created.getStrainZEROAlleleRatioAsLong(),
        		created.getStrain6Allele(),
        		created.getStrain6AlleleFixed(),
        		created.getStrain6AlleleRatioAsLong(),
        		created.getStrainCAllele(),
        		created.getStrainCAlleleFixed(),
        		created.getStrainCAlleleRatioAsLong()
        		).build();
        
        return repositorysnpchromosome.save(snpchromosome);
    }
    

    @Transactional(rollbackFor = ExceptionSNPChromosomeNotFound.class)
    @Override
    public SNPChromosome15 delete(Long snpchromosomeId) throws ExceptionSNPChromosomeNotFound {
    	
        LOGGER.debug("Deleting snpchromosome with id: " + snpchromosomeId);
        
        SNPChromosome15 deleted = repositorysnpchromosome.findOne(snpchromosomeId);
        
        if (deleted == null) {
        	
            LOGGER.debug("No snpchromosome found with id: " + snpchromosomeId);
            
            throw new ExceptionSNPChromosomeNotFound("No snpchromosome found with id: " + snpchromosomeId);
        }
        
        repositorysnpchromosome.delete(deleted);
        return deleted;
    }

    
    @Transactional(rollbackFor = ExceptionSNPChromosomeNotFound.class)
    @Override
    public SNPChromosome15 update(DTOSNPChromosome updated) throws ExceptionSNPChromosomeNotFound {
    	
        LOGGER.debug("Updating snpchromosome with information: " + updated);
        
        SNPChromosome15 snpchromosome = repositorysnpchromosome.findOne(updated.getOid());
        
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
        		updated.getStrain7AlleleFixed(),
        		updated.getStrain7AlleleRatioAsLong(),
        		updated.getStrainPAllele(),
        		updated.getStrainPAlleleFixed(),
        		updated.getStrainPAlleleRatioAsLong(),
        		updated.getStrainWAllele(),
        		updated.getStrainWAlleleFixed(),
        		updated.getStrainWAlleleRatioAsLong(),
        		updated.getStrainNAllele(),
        		updated.getStrainNAlleleFixed(),
        		updated.getStrainNAlleleRatioAsLong(),
        		updated.getStrain15IAllele(),
        		updated.getStrain15IAlleleFixed(),
        		updated.getStrain15IAlleleRatioAsLong(),
        		updated.getStrainZEROAllele(),
        		updated.getStrainZEROAlleleFixed(),
        		updated.getStrainZEROAlleleRatioAsLong(),
        		updated.getStrain6Allele(),
        		updated.getStrain6AlleleFixed(),
        		updated.getStrain6AlleleRatioAsLong(),
        		updated.getStrainCAllele(),
        		updated.getStrainCAlleleFixed(),
        		updated.getStrainCAlleleRatioAsLong()
        		);

        return snpchromosome;
    }

    
    /**
     * This setter method should be used only by unit tests.
     * @param repositorySNPChromosome
     */
    protected void setRepositorySNPChromosome(RepositorySNPChromosome15 repositorysnpchromosome) {
    	
        this.repositorysnpchromosome = repositorysnpchromosome;
    }

}
