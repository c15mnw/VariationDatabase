package com.roslin.mwicks.spring.variation.service;

import com.roslin.mwicks.spring.variation.dto.DTOSearch;
import com.roslin.mwicks.spring.variation.dto.DTODownload;
import com.roslin.mwicks.spring.variation.dto.DTOSNPChromosome;

import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeNotFound;

import com.roslin.mwicks.spring.variation.model.PageSNPChromosome;
import com.roslin.mwicks.spring.variation.model.SNPChromosome;
import com.roslin.mwicks.spring.variation.model.SNPChromosome9;

import com.roslin.mwicks.spring.variation.repository.RepositorySNPChromosome9;

import com.roslin.mwicks.spring.variation.serviceinterface.ServiceSNPChromosome9;

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
public class ServiceRepositorySNPChromosome9 implements ServiceSNPChromosome9 {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceRepositorySNPChromosome9.class);
    
    private static final int NUMBER_OF_SNPCHROMOSOMES_PER_PAGE = 30;

    @Resource
    private RepositorySNPChromosome9 repositorysnpchromosome;

    
    @Transactional(readOnly = true)
    @Override
    public List<SNPChromosome> download(DTODownload dtoDownload) {
        
    	LOGGER.debug("Downloading snpchromosomes with download criteria: " + dtoDownload);
    	
    	List<SNPChromosome9> snpchromosome9s = null;
    	
        if (dtoDownload.isDownloadReference7() && dtoDownload.isDownloadAlternativeP()) {
            LOGGER.debug("Searching snpchromosome9s by using findByRangeANDStrain7NEStrainP");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrain7NEStrainP(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference7() && dtoDownload.isDownloadAlternativeW()) {
            LOGGER.debug("Searching snpchromosome9s by using findByRangeANDStrain7NEStrainW");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrain7NEStrainW(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference7() && dtoDownload.isDownloadAlternativeN()) {
            LOGGER.debug("Searching snpchromosome9s by using findByRangeANDStrain7NEStrainN");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrain7NEStrainN(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference7() && dtoDownload.isDownloadAlternative15I()) {
            LOGGER.debug("Searching snpchromosome9s by using findByRangeANDStrain7NEStrain15I");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrain7NEStrain15I(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference7() && dtoDownload.isDownloadAlternativeZero()) {
            LOGGER.debug("Searching snpchromosome9s by using findByRangeANDStrain7NEStrainZERO");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrain7NEStrainZERO(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference7() && dtoDownload.isDownloadAlternative6()) {
            LOGGER.debug("Searching snpchromosome9s by using findByRangeANDStrain7NEStrain6");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrain7NEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference7() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosome9s by using findByRangeANDStrain7NEStrainC");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrain7NEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }

        if (dtoDownload.isDownloadReferenceP() && dtoDownload.isDownloadAlternative7()) {
            LOGGER.debug("Searching snpchromosome9s by using findByRangeANDStrainPNEStrain&");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrain7NEStrainP(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceP() && dtoDownload.isDownloadAlternativeW()) {
            LOGGER.debug("Searching snpchromosome9s by using findByRangeANDStrainPNEStrainW");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrainPNEStrainW(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceP() && dtoDownload.isDownloadAlternativeN()) {
            LOGGER.debug("Searching snpchromosome9s by using findByRangeANDStrainPNEStrainN");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrainPNEStrainN(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceP() && dtoDownload.isDownloadAlternative15I()) {
            LOGGER.debug("Searching snpchromosome9s by using findByRangeANDStrainPNEStrain15I");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrainPNEStrain15I(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceP() && dtoDownload.isDownloadAlternativeZero()) {
            LOGGER.debug("Searching snpchromosome9s by using findByRangeANDStrainPNEStrainZERO");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrainPNEStrainZERO(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceP() && dtoDownload.isDownloadAlternative6()) {
            LOGGER.debug("Searching snpchromosome9s by using findByRangeANDStrainPNEStrain6");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrainPNEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceP() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosome9s by using findByRangeANDStrainPNEStrainC");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrainPNEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }

        if (dtoDownload.isDownloadReferenceW() && dtoDownload.isDownloadAlternative7()) {
            LOGGER.debug("Searching snpchromosome9s by using findByRangeANDStrainWNEStrainW");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrain7NEStrainW(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceW() && dtoDownload.isDownloadAlternativeP()) {
            LOGGER.debug("Searching snpchromosome9s by using findByRangeANDStrainWNEStrainW");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrainPNEStrainW(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceW() && dtoDownload.isDownloadAlternativeN()) {
            LOGGER.debug("Searching snpchromosome9s by using findByRangeANDStrainWNEStrainN");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrainWNEStrainN(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceW() && dtoDownload.isDownloadAlternative15I()) {
            LOGGER.debug("Searching snpchromosome9s by using findByRangeANDStrainWNEStrain15I");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrainWNEStrain15I(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceW() && dtoDownload.isDownloadAlternativeZero()) {
            LOGGER.debug("Searching snpchromosome9s by using findByRangeANDStrainWNEStrainZERO");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrainWNEStrainZERO(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceW() && dtoDownload.isDownloadAlternative6()) {
            LOGGER.debug("Searching snpchromosome9s by using findByRangeANDStrainWNEStrain6");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrainWNEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceW() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosome9s by using findByRangeANDStrainWNEStrainC");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrainWNEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }

        if (dtoDownload.isDownloadReferenceN() && dtoDownload.isDownloadAlternative7()) {
            LOGGER.debug("Searching snpchromosome9s by using listByRangeANDStrain7NEStrainN");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrain7NEStrainN(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceN() && dtoDownload.isDownloadAlternativeP()) {
            LOGGER.debug("Searching snpchromosome9s by using listByRangeANDStrainPNEStrainN");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrainPNEStrainN(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceN() && dtoDownload.isDownloadAlternativeW()) {
            LOGGER.debug("Searching snpchromosome9s by using listByRangeANDStrainWNEStrainN");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrainWNEStrainN(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceN() && dtoDownload.isDownloadAlternative15I()) {
            LOGGER.debug("Searching snpchromosome9s by using findByRangeANDStrainNNEStrain15I");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrainNNEStrain15I(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceN() && dtoDownload.isDownloadAlternativeZero()) {
            LOGGER.debug("Searching snpchromosome9s by using findByRangeANDStrainNNEStrainZERO");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrainNNEStrainZERO(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceN() && dtoDownload.isDownloadAlternative6()) {
            LOGGER.debug("Searching snpchromosome9s by using findByRangeANDStrainNNEStrain6");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrainNNEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceN() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosome9s by using findByRangeANDStrainNNEStrainC");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrainNNEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        
        if (dtoDownload.isDownloadReference15I() && dtoDownload.isDownloadAlternative7()) {
            LOGGER.debug("Searching snpchromosome9s by using listByRangeANDStrain7NEStrain15I");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrain7NEStrain15I(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference15I() && dtoDownload.isDownloadAlternativeP()) {
            LOGGER.debug("Searching snpchromosome9s by using listByRangeANDStrainPNEStrain15I");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrainPNEStrain15I(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference15I() && dtoDownload.isDownloadAlternativeN()) {
            LOGGER.debug("Searching snpchromosome9s by using listByRangeANDStrainNNEStrain15I");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrainNNEStrain15I(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference15I() && dtoDownload.isDownloadAlternativeW()) {
            LOGGER.debug("Searching snpchromosome9s by using listByRangeANDStrainWNEStrain15I");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrainWNEStrain15I(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference15I() && dtoDownload.isDownloadAlternativeZero()) {
            LOGGER.debug("Searching snpchromosome9s by using findByRangeANDStrain15INEStrainZERO");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrain15INEStrainZERO(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference15I() && dtoDownload.isDownloadAlternative6()) {
            LOGGER.debug("Searching snpchromosome9s by using findByRangeANDStrain15INEStrain6");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrain15INEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference15I() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosome9s by using findByRangeANDStrain15INEStrainC");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrain15INEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }

        if (dtoDownload.isDownloadReferenceZero() && dtoDownload.isDownloadAlternative7()) {
            LOGGER.debug("Searching snpchromosome9s by using listByRangeANDStrain7NEStrainZERO");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrain7NEStrainZERO(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceZero() && dtoDownload.isDownloadAlternativeP()) {
            LOGGER.debug("Searching snpchromosome9s by using listByRangeANDStrainPNEStrainZERO");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrainPNEStrainZERO(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceZero() && dtoDownload.isDownloadAlternativeN()) {
            LOGGER.debug("Searching snpchromosome9s by using listByRangeANDStrainNNEStrainZERO");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrainNNEStrainZERO(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceZero() && dtoDownload.isDownloadAlternativeW()) {
            LOGGER.debug("Searching snpchromosome9s by using listByRangeANDStrainWNEStrainZERO");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrainWNEStrainZERO(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceZero() && dtoDownload.isDownloadAlternative15I()) {
            LOGGER.debug("Searching snpchromosome9s by using listByRangeANDStrain15INEStrainZERO");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrain15INEStrainZERO(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceZero() && dtoDownload.isDownloadAlternative6()) {
            LOGGER.debug("Searching snpchromosome9s by using findByRangeANDStrainZERONEStrain6");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrainZERONEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceZero() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosome9s by using findByRangeANDStrainZERONEStrainC");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrainZERONEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }

        if (dtoDownload.isDownloadReference6() && dtoDownload.isDownloadAlternative7()) {
            LOGGER.debug("Searching snpchromosome9s by using listByRangeANDStrain7NEStrain6");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrain7NEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference6() && dtoDownload.isDownloadAlternativeP()) {
            LOGGER.debug("Searching snpchromosome9s by using listByRangeANDStrainPNEStrain6");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrainPNEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference6() && dtoDownload.isDownloadAlternativeN()) {
            LOGGER.debug("Searching snpchromosome9s by using listByRangeANDStrainNNEStrain6");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrainNNEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference6() && dtoDownload.isDownloadAlternativeW()) {
            LOGGER.debug("Searching snpchromosome9s by using listByRangeANDStrainWNEStrain6");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrainWNEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference6() && dtoDownload.isDownloadAlternative15I()) {
            LOGGER.debug("Searching snpchromosome9s by using listByRangeANDStrain15INEStrain6");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrain15INEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference6() && dtoDownload.isDownloadAlternativeZero()) {
            LOGGER.debug("Searching snpchromosome9s by using findByRangeANDStrainZERONEStrain6");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrainZERONEStrain6(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReference6() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosome9s by using findByRangeANDStrainZERONEStrainC");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrainZERONEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }

        if (dtoDownload.isDownloadReferenceC() && dtoDownload.isDownloadAlternative7()) {
            LOGGER.debug("Searching snpchromosome9s by using listByRangeANDStrain7NEStrainC");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrain7NEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceC() && dtoDownload.isDownloadAlternativeP()) {
            LOGGER.debug("Searching snpchromosome9s by using listByRangeANDStrainPNEStrainC");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrainPNEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceC() && dtoDownload.isDownloadAlternativeN()) {
            LOGGER.debug("Searching snpchromosome9s by using listByRangeANDStrainNNEStrainC");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrainNNEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceC() && dtoDownload.isDownloadAlternativeW()) {
            LOGGER.debug("Searching snpchromosome9s by using listByRangeANDStrainWNEStrainC");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrainWNEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceC() && dtoDownload.isDownloadAlternative15I()) {
            LOGGER.debug("Searching snpchromosome9s by using listByRangeANDStrain15INEStrainC");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrain15INEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceC() && dtoDownload.isDownloadAlternativeZero()) {
            LOGGER.debug("Searching snpchromosome9s by using findByRangeANDStrainZERONEStrainC");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrainZERONEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }
        if (dtoDownload.isDownloadReferenceC() && dtoDownload.isDownloadAlternativeC()) {
            LOGGER.debug("Searching snpchromosome9s by using listByRangeANDStrain6NEStrainC");
            snpchromosome9s = repositorysnpchromosome.listByRangeANDStrain6NEStrainC(dtoDownload.getDownloadLowRangeAsInt(), dtoDownload.getDownloadHighRangeAsInt());
        }

    	List<SNPChromosome> snpchromosomes = new ArrayList<SNPChromosome>();
    	
        Iterator<SNPChromosome9> iteratorSNPChromosome9 = snpchromosome9s.iterator();
        
     	while (iteratorSNPChromosome9.hasNext()) {
    		
     		SNPChromosome9 snpchromosome9 = iteratorSNPChromosome9.next();
     		
     		SNPChromosome snpchromosome = snpchromosome9.convert();
     		
     		snpchromosomes.add(snpchromosome);
     	}
     	
        return snpchromosomes;
    }

    
    @Transactional(readOnly = true)
    @Override
    public PageSNPChromosome search(DTOSearch dtoSearch, Integer pageNumber) {
        
    	LOGGER.debug("Searching snpchromosomes with search criteria: " + dtoSearch);

    	Page<SNPChromosome9> pagesnpchromosome9s = null;

    	PageRequest pageRequest = new PageRequest(pageNumber - 1, NUMBER_OF_SNPCHROMOSOMES_PER_PAGE, Sort.Direction.ASC, "snpId");

        if (dtoSearch.isSearchReference7() && dtoSearch.isSearchAlternativeP()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using findByRangeANDStrain7NEStrainP");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrain7NEStrainP(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference7() && dtoSearch.isSearchAlternativeW()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using findByRangeANDStrain7NEStrainW");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrain7NEStrainW(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference7() && dtoSearch.isSearchAlternativeN()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using findByRangeANDStrain7NEStrainN");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrain7NEStrainN(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference7() && dtoSearch.isSearchAlternative15I()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using findByRangeANDStrain7NEStrain15I");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrain7NEStrain15I(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference7() && dtoSearch.isSearchAlternativeZero()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using findByRangeANDStrain7NEStrainZERO");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrain7NEStrainZERO(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference7() && dtoSearch.isSearchAlternative6()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using findByRangeANDStrain7NEStrain6");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrain7NEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference7() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using findByRangeANDStrain7NEStrainC");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrain7NEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }

        if (dtoSearch.isSearchReferenceP() && dtoSearch.isSearchAlternative7()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using findByRangeANDStrainPNEStrain&");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrain7NEStrainP(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceP() && dtoSearch.isSearchAlternativeW()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using findByRangeANDStrainPNEStrainW");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrainPNEStrainW(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceP() && dtoSearch.isSearchAlternativeN()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using findByRangeANDStrainPNEStrainN");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrainPNEStrainN(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceP() && dtoSearch.isSearchAlternative15I()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using findByRangeANDStrainPNEStrain15I");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrainPNEStrain15I(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceP() && dtoSearch.isSearchAlternativeZero()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using findByRangeANDStrainPNEStrainZERO");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrainPNEStrainZERO(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceP() && dtoSearch.isSearchAlternative6()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using findByRangeANDStrainPNEStrain6");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrainPNEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceP() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using findByRangeANDStrainPNEStrainC");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrainPNEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }

        if (dtoSearch.isSearchReferenceW() && dtoSearch.isSearchAlternative7()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using findByRangeANDStrainWNEStrainW");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrain7NEStrainW(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceW() && dtoSearch.isSearchAlternativeP()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using findByRangeANDStrainWNEStrainW");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrainPNEStrainW(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceW() && dtoSearch.isSearchAlternativeN()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using findByRangeANDStrainWNEStrainN");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrainWNEStrainN(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceW() && dtoSearch.isSearchAlternative15I()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using findByRangeANDStrainWNEStrain15I");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrainWNEStrain15I(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceW() && dtoSearch.isSearchAlternativeZero()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using findByRangeANDStrainWNEStrainZERO");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrainWNEStrainZERO(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceW() && dtoSearch.isSearchAlternative6()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using findByRangeANDStrainWNEStrain6");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrainWNEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceW() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using findByRangeANDStrainWNEStrainC");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrainWNEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }

        if (dtoSearch.isSearchReferenceN() && dtoSearch.isSearchAlternative7()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using listByRangeANDStrain7NEStrainN");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrain7NEStrainN(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceN() && dtoSearch.isSearchAlternativeP()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using listByRangeANDStrainPNEStrainN");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrainPNEStrainN(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceN() && dtoSearch.isSearchAlternativeW()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using listByRangeANDStrainWNEStrainN");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrainWNEStrainN(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceN() && dtoSearch.isSearchAlternative15I()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using findByRangeANDStrainNNEStrain15I");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrainNNEStrain15I(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceN() && dtoSearch.isSearchAlternativeZero()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using findByRangeANDStrainNNEStrainZERO");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrainNNEStrainZERO(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceN() && dtoSearch.isSearchAlternative6()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using findByRangeANDStrainNNEStrain6");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrainNNEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceN() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using findByRangeANDStrainNNEStrainC");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrainNNEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        
        if (dtoSearch.isSearchReference15I() && dtoSearch.isSearchAlternative7()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using listByRangeANDStrain7NEStrain15I");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrain7NEStrain15I(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference15I() && dtoSearch.isSearchAlternativeP()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using listByRangeANDStrainPNEStrain15I");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrainPNEStrain15I(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference15I() && dtoSearch.isSearchAlternativeN()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using listByRangeANDStrainNNEStrain15I");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrainNNEStrain15I(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference15I() && dtoSearch.isSearchAlternativeW()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using listByRangeANDStrainWNEStrain15I");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrainWNEStrain15I(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference15I() && dtoSearch.isSearchAlternativeZero()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using findByRangeANDStrain15INEStrainZERO");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrain15INEStrainZERO(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference15I() && dtoSearch.isSearchAlternative6()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using findByRangeANDStrain15INEStrain6");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrain15INEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference15I() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using findByRangeANDStrain15INEStrainC");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrain15INEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }

        if (dtoSearch.isSearchReferenceZero() && dtoSearch.isSearchAlternative7()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using listByRangeANDStrain7NEStrainZERO");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrain7NEStrainZERO(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceZero() && dtoSearch.isSearchAlternativeP()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using listByRangeANDStrainPNEStrainZERO");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrainPNEStrainZERO(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceZero() && dtoSearch.isSearchAlternativeN()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using listByRangeANDStrainNNEStrainZERO");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrainNNEStrainZERO(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceZero() && dtoSearch.isSearchAlternativeW()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using listByRangeANDStrainWNEStrainZERO");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrainWNEStrainZERO(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceZero() && dtoSearch.isSearchAlternative15I()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using listByRangeANDStrain15INEStrainZERO");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrain15INEStrainZERO(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceZero() && dtoSearch.isSearchAlternative6()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using findByRangeANDStrainZERONEStrain6");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrainZERONEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceZero() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using findByRangeANDStrainZERONEStrainC");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrainZERONEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }

        if (dtoSearch.isSearchReference6() && dtoSearch.isSearchAlternative7()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using listByRangeANDStrain7NEStrain6");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrain7NEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference6() && dtoSearch.isSearchAlternativeP()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using listByRangeANDStrainPNEStrain6");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrainPNEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference6() && dtoSearch.isSearchAlternativeN()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using listByRangeANDStrainNNEStrain6");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrainNNEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference6() && dtoSearch.isSearchAlternativeW()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using listByRangeANDStrainWNEStrain6");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrainWNEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference6() && dtoSearch.isSearchAlternative15I()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using listByRangeANDStrain15INEStrain6");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrain15INEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference6() && dtoSearch.isSearchAlternativeZero()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using findByRangeANDStrainZERONEStrain6");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrainZERONEStrain6(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReference6() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using findByRangeANDStrainZERONEStrainC");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrainZERONEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }

        if (dtoSearch.isSearchReferenceC() && dtoSearch.isSearchAlternative7()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using listByRangeANDStrain7NEStrainC");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrain7NEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceC() && dtoSearch.isSearchAlternativeP()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using listByRangeANDStrainPNEStrainC");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrainPNEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceC() && dtoSearch.isSearchAlternativeN()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using listByRangeANDStrainNNEStrainC");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrainNNEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceC() && dtoSearch.isSearchAlternativeW()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using listByRangeANDStrainWNEStrainC");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrainWNEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceC() && dtoSearch.isSearchAlternative15I()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using listByRangeANDStrain15INEStrainC");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrain15INEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceC() && dtoSearch.isSearchAlternativeZero()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using findByRangeANDStrainZERONEStrainC");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrainZERONEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        if (dtoSearch.isSearchReferenceC() && dtoSearch.isSearchAlternativeC()) {
            LOGGER.debug("Searching pagesnpchromosome9s by using listByRangeANDStrain6NEStrainC");
            pagesnpchromosome9s = repositorysnpchromosome.findByRangeANDStrain6NEStrainC(dtoSearch.getSearchLowRangeAsInt(), dtoSearch.getSearchHighRangeAsInt(), pageRequest);
        }
        
    	List<SNPChromosome9> snpchromosome9s = pagesnpchromosome9s.getContent();
    	List<SNPChromosome> snpchromosomes = new ArrayList<SNPChromosome>();
    	
        Iterator<SNPChromosome9> iteratorSNPChromosome9 = snpchromosome9s.iterator();
        
     	while (iteratorSNPChromosome9.hasNext()) {
    		
     		SNPChromosome9 snpchromosome9 = iteratorSNPChromosome9.next();
     		
     		SNPChromosome snpchromosome = snpchromosome9.convert();
     		
     		snpchromosomes.add(snpchromosome);
     	}
     	
    	PageSNPChromosome pagesnpchromosome = new PageSNPChromosome(pagesnpchromosome9s.getNumber(), pagesnpchromosome9s.getTotalPages(), pagesnpchromosome9s.getTotalElements(), snpchromosomes);

        return pagesnpchromosome;
    }
    
    
    @Transactional(readOnly = true)
    @Override
    public PageSNPChromosome findAll(Integer pageNumber) {
    	
        LOGGER.debug("Finding all snpchromosomes");

        PageRequest pageRequest = new PageRequest(pageNumber - 1, NUMBER_OF_SNPCHROMOSOMES_PER_PAGE, Sort.Direction.ASC, "snpId");
        
        Page<SNPChromosome9> pagesnpchromosome9s = repositorysnpchromosome.findAll(pageRequest);
        
    	List<SNPChromosome9> snpchromosome9s = pagesnpchromosome9s.getContent();
    	
    	List<SNPChromosome> snpchromosomes = new ArrayList<SNPChromosome>();
    	
        Iterator<SNPChromosome9> iteratorSNPChromosome9 = snpchromosome9s.iterator();
        
     	while (iteratorSNPChromosome9.hasNext()) {
    		
     		SNPChromosome9 snpchromosome9 = iteratorSNPChromosome9.next();
     		
     		SNPChromosome snpchromosome = snpchromosome9.convert();
     		
     		snpchromosomes.add(snpchromosome);
     	}
     	
    	PageSNPChromosome pagesnpchromosome = new PageSNPChromosome(pagesnpchromosome9s.getNumber(), pagesnpchromosome9s.getTotalPages(), pagesnpchromosome9s.getTotalElements(), snpchromosomes);

        return pagesnpchromosome;
    }
    

    @Transactional
    @Override
    public SNPChromosome9 create(DTOSNPChromosome created) {
    	
        LOGGER.debug("Creating a new snpchromosome with information: " + created);
        
        SNPChromosome9 snpchromosome = SNPChromosome9.getBuilder(
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
    public SNPChromosome9 delete(Long snpchromosomeId) throws ExceptionSNPChromosomeNotFound {
    	
        LOGGER.debug("Deleting snpchromosome with id: " + snpchromosomeId);
        
        SNPChromosome9 deleted = repositorysnpchromosome.findOne(snpchromosomeId);
        
        if (deleted == null) {
        	
            LOGGER.debug("No snpchromosome found with id: " + snpchromosomeId);
            
            throw new ExceptionSNPChromosomeNotFound("No snpchromosome found with id: " + snpchromosomeId);
        }
        
        repositorysnpchromosome.delete(deleted);
        return deleted;
    }

    
    @Transactional(rollbackFor = ExceptionSNPChromosomeNotFound.class)
    @Override
    public SNPChromosome9 update(DTOSNPChromosome updated) throws ExceptionSNPChromosomeNotFound {
    	
        LOGGER.debug("Updating snpchromosome with information: " + updated);
        
        SNPChromosome9 snpchromosome = repositorysnpchromosome.findOne(updated.getOid());
        
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
    protected void setRepositorySNPChromosome(RepositorySNPChromosome9 repositorysnpchromosome) {
    	
        this.repositorysnpchromosome = repositorysnpchromosome;
    }

}
