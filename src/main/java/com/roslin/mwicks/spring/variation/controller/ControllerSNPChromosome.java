package com.roslin.mwicks.spring.variation.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletResponse;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import java.io.File;
import java.io.InputStream;
import java.io.IOException;

import com.roslin.mwicks.spring.variation.dto.DTOSearch;
import com.roslin.mwicks.spring.variation.dto.DTODownload;
import com.roslin.mwicks.spring.variation.dto.SearchAlternative;
import com.roslin.mwicks.spring.variation.dto.SearchReference;
import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeAlternativeAlleleNotSupplied;
import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeHighCoordinateNotNumeric;
import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeLowCoordinateGreaterThanHighCoordinate;
import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeLowCoordinateNotNumeric;
import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeReferenceAlleleEqualsAlternativeAllele;
import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeReferenceAlleleNotSupplied;
import com.roslin.mwicks.spring.variation.model.SNPChromosome;
import com.roslin.mwicks.spring.variation.model.CSVResponse;

import com.roslin.mwicks.spring.variation.service.ServiceSNPChromosome;
import com.roslin.mwicks.utility.CsvUtil;
import com.roslin.mwicks.utility.FileUtil;

/**
 * @author Mike Wicks
 */
@Controller
@SessionAttributes("SNPChromosome")
public class ControllerSNPChromosome extends AbstractController {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(ControllerSNPChromosome.class);
    
    protected static final String FEEDBACK_MESSAGE_KEY_SEARCH_RESULTS = "feedback.message.search.results";

    protected static final String ERROR_MESSAGE_SEARCH_NOT_NUMERIC_LOW_POSITION = "error.message.search.notnumeric.lowPosition";
    protected static final String ERROR_MESSAGE_SEARCH_NOT_NUMERIC_HIGH_POSITION = "error.message.search.notnumeric.highPosition";
    protected static final String ERROR_MESSAGE_SEARCH_OUTSIDE_RANGE_LOW_POSITION_GE_HIGH_POSITION = "error.message.search.outsiderange.lowPositionGEHighPosition";
    protected static final String ERROR_MESSAGE_SEARCH_NOTCHOSEN_REFERENCE_NOT_SELECTED = "error.message.search.notchosen.referenceStrain";
    protected static final String ERROR_MESSAGE_SEARCH_NOTCHOSEN_ALTERNATIVE_NOT_SELECTED = "error.message.search.notchosen.alternativeStrain";
    protected static final String ERROR_MESSAGE_SEARCH_EQUALS_REFERENCE_EQUALS_ALTERNATIVE = "error.message.search.equals.referenceStrainEQalternativeStrain";
    
    protected static final String MODEL_ATTIRUTE_SNPCHROMOSOME = "SNPhromosome";
    protected static final String MODEL_ATTRIBUTE_SNPCHROMOSOMES = "SNPChromosomes";
    
    protected static final String MODEL_ATTRIBUTE_SEARCHCRITERIA = "searchCriteria";
    protected static final String MODEL_ATTRIBUTE_DOWNLOADCRITERIA = "downloadCriteria";
    
    protected static final String SNPChromosome_LIST_VIEW = "SNPChromosome/page_search";
    protected static final String SNPChromosome_SEARCH_RESULT_VIEW = "SNPChromosome/page_search_results";
    
    protected static final String REQUEST_MAPPING_LIST = "/";

    protected static final String MODEL_ATTRIBUTE_DOWNLOAD_FILENAME = "download.csv";
    
    
    @Resource
    private ServiceSNPChromosome servicesnpchromosome;
    
    
	@RequestMapping(value = "/download", method = RequestMethod.POST)
	public @ResponseBody CSVResponse download(DTODownload downloadCriteria) throws IOException {
    	
        LOGGER.debug("Downloading SNPChromosomes with search criteria: " + downloadCriteria);
        
        List<SNPChromosome> SNPChromosomes = servicesnpchromosome.download(downloadCriteria);

        CSVResponse csvresponse = new CSVResponse(
        		downloadCriteria.getDownloadFormat(),
        		downloadCriteria.getDownloadQuotes(),
        		SNPChromosomes);
        
        return csvresponse;
    }
    

    @SuppressWarnings("unused")
	@RequestMapping(value = "/search", method = RequestMethod.POST)
    public String search(@ModelAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA) DTOSearch searchCriteria, Model model, RedirectAttributes attributes) {
    	
        LOGGER.debug("Searching SNPChromosomes with search criteria: " + searchCriteria);
        
    	Integer firstPage = 1;
        
        Page<SNPChromosome> page = null;
        
        try {

            page = servicesnpchromosome.search(searchCriteria, firstPage);
        } 
        catch (ExceptionSNPChromosomeLowCoordinateNotNumeric e) {
            
        	LOGGER.debug("ERROR: Search Low Co-ordinate is NOT Numeric !!!");
            
            addErrorMessage(attributes, ERROR_MESSAGE_SEARCH_NOT_NUMERIC_LOW_POSITION);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, page);

            return createRedirectViewPath(REQUEST_MAPPING_LIST);
        }
        catch (ExceptionSNPChromosomeHighCoordinateNotNumeric e) {
            
        	LOGGER.debug("ERROR: Search High Co-ordinate is NOT Numeric !!!");
            
        	addErrorMessage(attributes, ERROR_MESSAGE_SEARCH_NOT_NUMERIC_HIGH_POSITION);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, page);

            return createRedirectViewPath(REQUEST_MAPPING_LIST);
        }
        catch (ExceptionSNPChromosomeLowCoordinateGreaterThanHighCoordinate e) {
            
        	LOGGER.debug("ERROR: Search Low Co-ordinate is GREATER THAN Search High Co-ordinate !!!");

        	addErrorMessage(attributes, ERROR_MESSAGE_SEARCH_OUTSIDE_RANGE_LOW_POSITION_GE_HIGH_POSITION);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, page);

            return createRedirectViewPath(REQUEST_MAPPING_LIST);
        }
        catch (ExceptionSNPChromosomeReferenceAlleleNotSupplied e) {
            
        	LOGGER.debug("ERROR: Reference Allele Not Supplied !!!");

        	addErrorMessage(attributes, ERROR_MESSAGE_SEARCH_NOTCHOSEN_REFERENCE_NOT_SELECTED);
        	model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, page);

            return createRedirectViewPath(REQUEST_MAPPING_LIST);
        }
        catch (ExceptionSNPChromosomeAlternativeAlleleNotSupplied e) {
            
        	LOGGER.debug("ERROR: Alternative Allele Not Supplied !!!");
            
        	addErrorMessage(attributes, ERROR_MESSAGE_SEARCH_NOTCHOSEN_ALTERNATIVE_NOT_SELECTED);
        	model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, page);

            return createRedirectViewPath(REQUEST_MAPPING_LIST);
        }
        catch (ExceptionSNPChromosomeReferenceAlleleEqualsAlternativeAllele e) {
            
        	LOGGER.debug("ERROR: Reference Allele EQUALS Alternative Allele !!!");
            
        	addErrorMessage(attributes, ERROR_MESSAGE_SEARCH_EQUALS_REFERENCE_EQUALS_ALTERNATIVE);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, page);

            return createRedirectViewPath(REQUEST_MAPPING_LIST);
        }
        
        int current = page.getNumber() + 1;
        int begin = Math.max(1, current - 5);
        int end = Math.min(begin + 10, page.getTotalPages());

        model.addAttribute("SNPChromosome", page);
        model.addAttribute("beginIndex", begin);
        model.addAttribute("endIndex", end);
        model.addAttribute("currentIndex", current);
        
        model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, searchCriteria);
        
        DTODownload dtodownload = new DTODownload();
        
        dtodownload.setDownloadFormat("CSV");
        dtodownload.setDownloadQuotes("NO");
        
        model.addAttribute(MODEL_ATTRIBUTE_DOWNLOADCRITERIA, dtodownload);

        if ( page == null ) {
        	
            LOGGER.debug("EMPTY SNPChromosomes !!! ");
            
            model.addAttribute("feedbackMessage", addFeedbackMessageAsString(FEEDBACK_MESSAGE_KEY_SEARCH_RESULTS, 0));
        }
        else {

            model.addAttribute("feedbackMessage", addFeedbackMessageAsString(FEEDBACK_MESSAGE_KEY_SEARCH_RESULTS, page.getTotalElements()));
        }

        return SNPChromosome_SEARCH_RESULT_VIEW;
    }
    

    @RequestMapping(value = "/results/{pageNumber}/{searchLowRange}/{searchHighRange}/{searchReference}/{searchAlternative}", method = RequestMethod.GET)
    public String getSearchedSNPChromosomePage(@PathVariable Integer pageNumber, @PathVariable String searchLowRange, @PathVariable String searchHighRange, @PathVariable String searchReference, @PathVariable String searchAlternative, Model model, RedirectAttributes attributes) {
    	
        Page<SNPChromosome> page = null;
        
        DTOSearch searchCriteria = new DTOSearch();
        
        searchCriteria.setPageIndex(pageNumber);
        
        searchCriteria.setSearchLowRange(searchLowRange);
        searchCriteria.setSearchHighRange(searchHighRange);
        
        if ( searchReference.equals("STRAIN_7") ) {
            searchCriteria.setSearchReference(SearchReference.STRAIN_7);
        }
        if ( searchReference.equals("STRAIN_P") ) {
            searchCriteria.setSearchReference(SearchReference.STRAIN_P);
        }
        if ( searchReference.equals("STRAIN_W") ) {
            searchCriteria.setSearchReference(SearchReference.STRAIN_W);
        }
        if ( searchReference.equals("STRAIN_N") ) {
            searchCriteria.setSearchReference(SearchReference.STRAIN_N);
        }
        if ( searchReference.equals("STRAIN_15I") ) {
            searchCriteria.setSearchReference(SearchReference.STRAIN_15I);
        }
        if ( searchReference.equals("STRAIN_ZERO") ) {
            searchCriteria.setSearchReference(SearchReference.STRAIN_ZERO);
        }
        if ( searchReference.equals("STRAIN_6") ) {
            searchCriteria.setSearchReference(SearchReference.STRAIN_6);
        }
        if ( searchReference.equals("STRAIN_C") ) {
            searchCriteria.setSearchReference(SearchReference.STRAIN_C);
        }

        if ( searchAlternative.equals("STRAIN_7") ) {
            searchCriteria.setSearchAlternative(SearchAlternative.STRAIN_7);
        }
        if ( searchAlternative.equals("STRAIN_P") ) {
            searchCriteria.setSearchAlternative(SearchAlternative.STRAIN_P);
        }
        if ( searchAlternative.equals("STRAIN_W") ) {
            searchCriteria.setSearchAlternative(SearchAlternative.STRAIN_W);
        }
        if ( searchAlternative.equals("STRAIN_N") ) {
            searchCriteria.setSearchAlternative(SearchAlternative.STRAIN_N);
        }
        if ( searchAlternative.equals("STRAIN_15I") ) {
            searchCriteria.setSearchAlternative(SearchAlternative.STRAIN_15I);
        }
        if ( searchAlternative.equals("STRAIN_ZERO") ) {
            searchCriteria.setSearchAlternative(SearchAlternative.STRAIN_ZERO);
        }
        if ( searchAlternative.equals("STRAIN_6") ) {
            searchCriteria.setSearchAlternative(SearchAlternative.STRAIN_6);
        }
        if ( searchAlternative.equals("STRAIN_C") ) {
            searchCriteria.setSearchAlternative(SearchAlternative.STRAIN_C);
        }
        
        try {

            page = servicesnpchromosome.search(searchCriteria, pageNumber);
        } 
        catch (ExceptionSNPChromosomeLowCoordinateNotNumeric e) {
            
        	LOGGER.debug("ERROR: Search Low Co-ordinate is NOT Numeric !!!");
            
            addErrorMessage(attributes, ERROR_MESSAGE_SEARCH_NOT_NUMERIC_LOW_POSITION);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, page);

            return createRedirectViewPath(REQUEST_MAPPING_LIST);
        }
        catch (ExceptionSNPChromosomeHighCoordinateNotNumeric e) {
            
        	LOGGER.debug("ERROR: Search High Co-ordinate is NOT Numeric !!!");
            
        	addErrorMessage(attributes, ERROR_MESSAGE_SEARCH_NOT_NUMERIC_HIGH_POSITION);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, page);

            return createRedirectViewPath(REQUEST_MAPPING_LIST);
        }
        catch (ExceptionSNPChromosomeLowCoordinateGreaterThanHighCoordinate e) {
            
        	LOGGER.debug("ERROR: Search Low Co-ordinate is GREATER THAN Search High Co-ordinate !!!");

        	addErrorMessage(attributes, ERROR_MESSAGE_SEARCH_OUTSIDE_RANGE_LOW_POSITION_GE_HIGH_POSITION);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, page);

            return createRedirectViewPath(REQUEST_MAPPING_LIST);
        }
        catch (ExceptionSNPChromosomeReferenceAlleleNotSupplied e) {
            
        	LOGGER.debug("ERROR: Reference Allele Not Supplied !!!");

        	addErrorMessage(attributes, ERROR_MESSAGE_SEARCH_NOTCHOSEN_REFERENCE_NOT_SELECTED);
        	model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, page);

            return createRedirectViewPath(REQUEST_MAPPING_LIST);
        }
        catch (ExceptionSNPChromosomeAlternativeAlleleNotSupplied e) {
            
        	LOGGER.debug("ERROR: Alternative Allele Not Supplied !!!");
            
        	addErrorMessage(attributes, ERROR_MESSAGE_SEARCH_NOTCHOSEN_ALTERNATIVE_NOT_SELECTED);
        	model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, page);

            return createRedirectViewPath(REQUEST_MAPPING_LIST);
        }
        catch (ExceptionSNPChromosomeReferenceAlleleEqualsAlternativeAllele e) {
            
        	LOGGER.debug("ERROR: Reference Allele EQUALS Alternative Allele !!!");
            
        	addErrorMessage(attributes, ERROR_MESSAGE_SEARCH_EQUALS_REFERENCE_EQUALS_ALTERNATIVE);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, page);

            return createRedirectViewPath(REQUEST_MAPPING_LIST);
        }
        
        if ( page == null ) {
        	
            LOGGER.debug("EMPTY SNPChromosomes !!! ");
        }

        int current = page.getNumber() + 1;
        int begin = Math.max(1, current - 5);
        int end = Math.min(begin + 10, page.getTotalPages());

        model.addAttribute("SNPChromosome", page);
        model.addAttribute("beginIndex", begin);
        model.addAttribute("endIndex", end);
        model.addAttribute("currentIndex", current);
        model.addAttribute("searchLowRange", searchLowRange);
        model.addAttribute("searchHighRange", searchHighRange);
        model.addAttribute("searchReference", searchReference);
        model.addAttribute("searchAlternative", searchAlternative);

        model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, searchCriteria);

        return SNPChromosome_SEARCH_RESULT_VIEW;
    }


    /**
     * Processes requests to home page which lists all available SNPChromosomes.
     * @param model
     * @return  The name of the SNPChromosome list view.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showList(Model model) {
    	
        LOGGER.debug("Rendering SNPChromosome list page");

        /*
        Integer firstPage = 1;
        
        Page<SNPChromosome> page = servicesnpchromosome.findAll(firstPage);
        
        int current = page.getNumber() + 1;
        int begin = Math.max(1, current - 5);
        int end = Math.min(begin + 10, page.getTotalPages());

        model.addAttribute("SNPChromosome", page);
        model.addAttribute("beginIndex", begin);
        model.addAttribute("endIndex", end);
        model.addAttribute("currentIndex", current);
         */

        model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, new DTOSearch());
        model.addAttribute(MODEL_ATTRIBUTE_DOWNLOADCRITERIA, new DTODownload());

        return SNPChromosome_LIST_VIEW;
    }

    
    @RequestMapping(value = "/pages/{pageNumber}", method = RequestMethod.GET)
    public String getSNPChromosomePage(@PathVariable Integer pageNumber, Model model) {
    	
        Page<SNPChromosome> page = servicesnpchromosome.findAll(pageNumber);

        int current = page.getNumber() + 1;
        int begin = Math.max(1, current - 5);
        int end = Math.min(begin + 10, page.getTotalPages());

        model.addAttribute("SNPChromosome", page);
        model.addAttribute("beginIndex", begin);
        model.addAttribute("endIndex", end);
        model.addAttribute("currentIndex", current);
        model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, new DTOSearch());

    	return SNPChromosome_LIST_VIEW;
    }
    

    /**
     * This setter method should only be used by unit tests
     * @param serviceSNPChromosome
     */
    protected void setServiceSNPChromosome(ServiceSNPChromosome servicesnpchromosome) {
    	
        this.servicesnpchromosome = servicesnpchromosome;
    }
}
