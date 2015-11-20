package com.roslin.mwicks.spring.variation.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import java.util.List;

import com.roslin.mwicks.spring.variation.serviceinterface.ServiceEnsemblGene;

import com.roslin.mwicks.spring.variation.model.EnsemblGene;

/**
 * @author Mike Wicks
 */
@Controller
@SessionAttributes("EnsemblGene")
public class ControllerEnsemblGene extends AbstractController {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(ControllerEnsemblGene.class);
    
    
    @Resource
    private ServiceEnsemblGene serviceensemblgene;
    
    
    /*
    @SuppressWarnings("unused")
    @RequestMapping(value = "/get_ensembl_genes", 
    method = RequestMethod.GET)
    public List<EnsemblGene> search(@RequestParam("term") String query) {

        List<EnsemblGene> ensemblgenes = serviceensemblgene.findByGeneName(query);
        
        return ensemblgenes;
    }
    */
    


    /**
     * This setter method should only be used by unit tests
     * @param serviceSNPChromosome
     */
    protected void setServiceEnsemblGene(ServiceEnsemblGene serviceensemblgene) {
    	
        this.serviceensemblgene = serviceensemblgene;
    }
}
