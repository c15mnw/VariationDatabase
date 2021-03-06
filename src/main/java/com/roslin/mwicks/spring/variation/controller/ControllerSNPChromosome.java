package com.roslin.mwicks.spring.variation.controller;

import com.jcg.examples.viewBean.LoginBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;

import java.io.IOException;

import com.roslin.mwicks.spring.variation.dto.web.objects.DTODownload;
import com.roslin.mwicks.spring.variation.dto.web.objects.DTOSearch;

import com.roslin.mwicks.spring.variation.exception.ExceptionEnsemblGeneDownStreamNotNumeric;
import com.roslin.mwicks.spring.variation.exception.ExceptionEnsemblGeneMultiplesFound;
import com.roslin.mwicks.spring.variation.exception.ExceptionEnsemblGeneNotFound;
import com.roslin.mwicks.spring.variation.exception.ExceptionEnsemblGeneUpStreamSearchRangeGreaterThanTenThousand;
import com.roslin.mwicks.spring.variation.exception.ExceptionEnsemblGeneDownStreamSearchRangeGreaterThanTenThousand;
import com.roslin.mwicks.spring.variation.exception.ExceptionEnsemblGeneUpStreamNotNumeric;
import com.roslin.mwicks.spring.variation.exception.ExceptionEnsemblGeneSearchRangeLessThanZero;

import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeNotSelected;
import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeAlternativeAlleleNotSupplied;
import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeHighCoordinateNotNumeric;
import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeLowCoordinateGreaterThanHighCoordinate;
import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeLowCoordinateNotNumeric;
import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeReferenceAlleleEqualsAlternativeAllele;
import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeReferenceAlleleNotSupplied;
import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeSearchFilterProteinAlignNumberValueNotNumeric;
import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeSearchFilterProveanScoreValueNotNumeric;
import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeSearchFilterSiftConservationScoreValueNotNumeric;
import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeSearchFilterSiftScoreValueNotNumeric;
import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeSearchFilterTotalNumberSeqAlignedValueNotNumeric;
import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeSelectedWithGeneName;
import com.roslin.mwicks.spring.variation.exception.ExceptionSNPChromosomeSearchRangeGreaterThanOneMillion;

import com.roslin.mwicks.spring.variation.model.ensemblgene.EnsemblGene;

import com.roslin.mwicks.spring.variation.model.other.CSVResponse;
import com.roslin.mwicks.spring.variation.model.other.PageSNPChromosome;
import com.roslin.mwicks.spring.variation.model.other.FilteredSNPChromosome;

import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosome;
import com.roslin.mwicks.spring.variation.serviceinterface.archive.snpchromosome.ServiceSNPChromosome01;
import com.roslin.mwicks.spring.variation.serviceinterface.archive.snpchromosome.ServiceSNPChromosome02;
import com.roslin.mwicks.spring.variation.serviceinterface.archive.snpchromosome.ServiceSNPChromosome03;
import com.roslin.mwicks.spring.variation.serviceinterface.archive.snpchromosome.ServiceSNPChromosome04;
import com.roslin.mwicks.spring.variation.serviceinterface.archive.snpchromosome.ServiceSNPChromosome05;
import com.roslin.mwicks.spring.variation.serviceinterface.archive.snpchromosome.ServiceSNPChromosome06;
import com.roslin.mwicks.spring.variation.serviceinterface.archive.snpchromosome.ServiceSNPChromosome07;
import com.roslin.mwicks.spring.variation.serviceinterface.archive.snpchromosome.ServiceSNPChromosome08;
import com.roslin.mwicks.spring.variation.serviceinterface.archive.snpchromosome.ServiceSNPChromosome09;
import com.roslin.mwicks.spring.variation.serviceinterface.archive.snpchromosome.ServiceSNPChromosome10;
import com.roslin.mwicks.spring.variation.serviceinterface.archive.snpchromosome.ServiceSNPChromosome11;
import com.roslin.mwicks.spring.variation.serviceinterface.archive.snpchromosome.ServiceSNPChromosome12;
import com.roslin.mwicks.spring.variation.serviceinterface.archive.snpchromosome.ServiceSNPChromosome13;
import com.roslin.mwicks.spring.variation.serviceinterface.archive.snpchromosome.ServiceSNPChromosome14;
import com.roslin.mwicks.spring.variation.serviceinterface.archive.snpchromosome.ServiceSNPChromosome15;
import com.roslin.mwicks.spring.variation.serviceinterface.archive.snpchromosome.ServiceSNPChromosome16;
import com.roslin.mwicks.spring.variation.serviceinterface.archive.snpchromosome.ServiceSNPChromosome17;
import com.roslin.mwicks.spring.variation.serviceinterface.archive.snpchromosome.ServiceSNPChromosome18;
import com.roslin.mwicks.spring.variation.serviceinterface.archive.snpchromosome.ServiceSNPChromosome19;
import com.roslin.mwicks.spring.variation.serviceinterface.archive.snpchromosome.ServiceSNPChromosome20;
import com.roslin.mwicks.spring.variation.serviceinterface.archive.snpchromosome.ServiceSNPChromosome21;
import com.roslin.mwicks.spring.variation.serviceinterface.archive.snpchromosome.ServiceSNPChromosome22;
import com.roslin.mwicks.spring.variation.serviceinterface.archive.snpchromosome.ServiceSNPChromosome23;
import com.roslin.mwicks.spring.variation.serviceinterface.archive.snpchromosome.ServiceSNPChromosome24;
import com.roslin.mwicks.spring.variation.serviceinterface.archive.snpchromosome.ServiceSNPChromosome25;
import com.roslin.mwicks.spring.variation.serviceinterface.archive.snpchromosome.ServiceSNPChromosome26;
import com.roslin.mwicks.spring.variation.serviceinterface.archive.snpchromosome.ServiceSNPChromosome27;
import com.roslin.mwicks.spring.variation.serviceinterface.archive.snpchromosome.ServiceSNPChromosome28;
import com.roslin.mwicks.spring.variation.serviceinterface.archive.snpchromosome.ServiceSNPChromosome32;
import com.roslin.mwicks.spring.variation.serviceinterface.archive.snpchromosome.ServiceSNPChromosomeLGE22C19W28_E50C23;
import com.roslin.mwicks.spring.variation.serviceinterface.archive.snpchromosome.ServiceSNPChromosomeLGE64;
import com.roslin.mwicks.spring.variation.serviceinterface.archive.snpchromosome.ServiceSNPChromosomeW;
import com.roslin.mwicks.spring.variation.serviceinterface.archive.snpchromosome.ServiceSNPChromosomeZ;
import com.roslin.mwicks.spring.variation.serviceinterface.ensemblgene.ServiceEnsemblGene;
import com.roslin.mwicks.utility.ObjectConverter;


/**
 * @author Mike Wicks
 */
@Controller
@SessionAttributes("SNPChromosome")
public class ControllerSNPChromosome extends AbstractController {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(ControllerSNPChromosome.class);
    
    private static final int NUMBER_OF_SNPCHROMOSOMES_PER_PAGE = 30;
    private static final int NUMBER_OF_SNPCHROMOSOMES_ALL = 300000;
    
    protected static final String FEEDBACK_MESSAGE_KEY_SEARCH_RESULTS_SINGLE = "feedback.message.search.results.single";
    protected static final String FEEDBACK_MESSAGE_KEY_SEARCH_RESULTS_MULTIPLE = "feedback.message.search.results.multiple";

    protected static final String ERROR_MESSAGE_SEARCH_GENE_NAME_MULTIPLE = "error.message.search.gene.multiple";
    protected static final String ERROR_MESSAGE_SEARCH_GENE_NAME_UNKNOWN = "error.message.search.gene.unknown";
    
    protected static final String ERROR_MESSAGE_SEARCH_NOT_NUMERIC_UP_STREAM = "error.message.search.notnumeric.upstream";
    protected static final String ERROR_MESSAGE_SEARCH_NOT_NUMERIC_DOWN_STREAM = "error.message.search.notnumeric.downstream";

    protected static final String ERROR_MESSAGE_SEARCH_RANGE_NEGATIVE = "error.message.search.range.negative";
    protected static final String ERROR_MESSAGE_SEARCH_UPSTREAM_TEN_THOUSAND_BASE_PAIRS = "error.message.search.upstream.outsiderange.tenthousand";
    protected static final String ERROR_MESSAGE_SEARCH_DOWNSTREAM_TEN_THOUSAND_BASE_PAIRS = "error.message.search.downstream.outsiderange.tenthousand";
    protected static final String ERROR_MESSAGE_SEARCH_ONE_MILLION_BASE_PAIRS = "error.message.search.outsiderange.onemillion";
    
    protected static final String ERROR_MESSAGE_SEARCH_OUTSIDE_RANGE_LOW_POSITION_GE_HIGH_POSITION = "error.message.search.outsiderange.lowPositionGEHighPosition";
    
    protected static final String ERROR_MESSAGE_SEARCH_NOT_NUMERIC_LOW_POSITION = "error.message.search.notnumeric.lowPosition";
    protected static final String ERROR_MESSAGE_SEARCH_NOT_NUMERIC_HIGH_POSITION = "error.message.search.notnumeric.highPosition";
    
    protected static final String ERROR_MESSAGE_SEARCH_NOTCHOSEN_CHROMOSOME_NOT_SELECTED = "error.message.search.notchosen.chromosome";
    protected static final String ERROR_MESSAGE_SEARCH_NOTCHOSEN_REFERENCE_NOT_SELECTED = "error.message.search.notchosen.referenceStrain";
    protected static final String ERROR_MESSAGE_SEARCH_NOTCHOSEN_ALTERNATIVE_NOT_SELECTED = "error.message.search.notchosen.alternativeStrain";
    protected static final String ERROR_MESSAGE_SEARCH_EQUALS_REFERENCE_EQUALS_ALTERNATIVE = "error.message.search.equals.referenceStrainEQalternativeStrain";
    protected static final String ERROR_MESSAGE_SEARCH_CHOSEN_CHROMOSOME_AND_GENENAME = "error.message.search.notchosen.chromosomeANDgenename";
    
    protected static final String ERROR_MESSAGE_SEARCH_FILTER_NOT_NUMERIC_SIFT_SCORE = "error.message.search.filter.notnumeric.searchFilterSiftScore";
    protected static final String ERROR_MESSAGE_SEARCH_FILTER_NOT_NUMERIC_SIFT_CONSERVATION_SCORE = "error.message.search.filter.notnumeric.searchFilterSiftConservationScore";
    protected static final String ERROR_MESSAGE_SEARCH_FILTER_NOT_NUMERIC_PROTEIN_ALIGN_NUMBER = "error.message.search.filter.notnumeric.searchFilterProteinAlignNumber";
    protected static final String ERROR_MESSAGE_SEARCH_FILTER_NOT_NUMERIC_TOTAL_NUMBER_SEQ_ALIGNED = "error.message.search.filter.notnumeric.searchFilterTotalNumberSeqAligned";
    protected static final String ERROR_MESSAGE_SEARCH_FILTER_NOT_NUMERIC_PROVEAN_SCORE = "error.message.search.filter.notnumeric.searchFilterProveanScore";

    protected static final String MODEL_ATTIRUTE_SNPCHROMOSOME = "SNPChromosome";
    protected static final String MODEL_ATTRIBUTE_SNPCHROMOSOMES = "SNPChromosomes";
    
    protected static final String MODEL_ATTRIBUTE_SEARCHCRITERIA = "dtoSearch";
    protected static final String MODEL_ATTRIBUTE_DOWNLOADCRITERIA = "dtoDownload";

    protected static final String MODEL_ATTRIBUTE_LOGINCRITERIA = "loginBean";
    
    protected static final String SNPCHROMOSOME_SEARCH_VIEW = "SNPChromosome/page_search";
    protected static final String SNPCHROMOSOME_SEARCH_VIEW_HELP = "SNPChromosome/page_search_help";
    protected static final String SNPCHROMOSOME_SEARCH_RESULT_VIEW = "SNPChromosome/page_search_results";
    protected static final String SNPCHROMOSOME_SEARCH_RESULT_VIEW_HELP = "SNPChromosome/page_search_results_help";
    
    protected static final String REQUEST_MAPPING_LIST = "/";

    protected static final int ONE_MILLION = 1000000;
    protected static final int TEN_THOUSAND = 10000;

    
    @Resource
    private ServiceSNPChromosome01 servicesnpchromosome1;
    @Resource
    private ServiceSNPChromosome02 servicesnpchromosome2;
    @Resource
    private ServiceSNPChromosome03 servicesnpchromosome3;
    @Resource
    private ServiceSNPChromosome04 servicesnpchromosome4;
    @Resource
    private ServiceSNPChromosome05 servicesnpchromosome5;
    @Resource
    private ServiceSNPChromosome06 servicesnpchromosome6;
    @Resource
    private ServiceSNPChromosome07 servicesnpchromosome7;
    @Resource
    private ServiceSNPChromosome08 servicesnpchromosome8;
    @Resource
    private ServiceSNPChromosome09 servicesnpchromosome9;
    @Resource
    private ServiceSNPChromosome10 servicesnpchromosome10;
    @Resource
    private ServiceSNPChromosome11 servicesnpchromosome11;
    @Resource
    private ServiceSNPChromosome12 servicesnpchromosome12;
    @Resource
    private ServiceSNPChromosome13 servicesnpchromosome13;
    @Resource
    private ServiceSNPChromosome14 servicesnpchromosome14;
    @Resource
    private ServiceSNPChromosome15 servicesnpchromosome15;
    @Resource
    private ServiceSNPChromosome16 servicesnpchromosome16;
    @Resource
    private ServiceSNPChromosome17 servicesnpchromosome17;
    @Resource
    private ServiceSNPChromosome18 servicesnpchromosome18;
    @Resource
    private ServiceSNPChromosome19 servicesnpchromosome19;
    @Resource
    private ServiceSNPChromosome20 servicesnpchromosome20;
    @Resource
    private ServiceSNPChromosome21 servicesnpchromosome21;
    @Resource
    private ServiceSNPChromosome22 servicesnpchromosome22;
    @Resource
    private ServiceSNPChromosome23 servicesnpchromosome23;
    @Resource
    private ServiceSNPChromosome24 servicesnpchromosome24;
    @Resource
    private ServiceSNPChromosome25 servicesnpchromosome25;
    @Resource
    private ServiceSNPChromosome26 servicesnpchromosome26;
    @Resource
    private ServiceSNPChromosome27 servicesnpchromosome27;
    @Resource
    private ServiceSNPChromosome28 servicesnpchromosome28;
    @Resource
    private ServiceSNPChromosome32 servicesnpchromosome32;
    @Resource
    private ServiceSNPChromosomeW servicesnpchromosomeW;
    @Resource
    private ServiceSNPChromosomeZ servicesnpchromosomeZ;
    @Resource
    private ServiceSNPChromosomeLGE22C19W28_E50C23 servicesnpchromosomeLGE22C19W28_E50C23;
    @Resource
    private ServiceSNPChromosomeLGE64 servicesnpchromosomeLGE64;
    

    @Resource
    private ServiceEnsemblGene serviceensemblgene;
    
    
	@RequestMapping(value = "/welcome**", method = RequestMethod.GET)
	public ModelAndView welcomePage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Custom Login Form");
		model.addObject("message", "This is welcome page!");
		model.setViewName("hello");
		return model;

	}

	@RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public ModelAndView adminPage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Custom Login Form");
		model.addObject("message", "This is protected page!");
		model.setViewName("admin");

		return model;

	}

	@RequestMapping(value = "/login", method = RequestMethod.POST )
	public ModelAndView loginP(
	    	@ModelAttribute(MODEL_ATTRIBUTE_LOGINCRITERIA) LoginBean loginBean 
			) {

		ModelAndView model = new ModelAndView();

		model.setViewName("login");

		return model;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET )
	public ModelAndView loginG(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout) {

		ModelAndView model = new ModelAndView();
		
		if (error != null) {
			model.addObject("error", "Invalid username and password!");
		}

		if (logout != null) {
			model.addObject("msg", "You've been logged out successfully.");
		}
		
		model.setViewName("login");

		return model;
	}

	
    /**
     * Processes requests to home page which lists all available SNPChromosomes.
     * @param model
     * @return  The name of the SNPChromosome list view.
     */
	/*
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showList(
    	Model model
    	) {
    	
        LOGGER.debug("Rendering SNPChromosome list page");

        model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, new DTOSearch());
        model.addAttribute(MODEL_ATTRIBUTE_DOWNLOADCRITERIA, new DTODownload());

        return SNPCHROMOSOME_SEARCH_VIEW;
    }
	 */

    
    /**
     * Processes requests to home page which lists all available SNPChromosomes.
     * @param model
     * @return  The name of the SNPChromosome list view.
     */
    @RequestMapping(value = "/search_help", method = RequestMethod.GET)
    public String showSearchHelp(
    	Model model
    	) {
    	
        LOGGER.debug("Rendering SNPChromosome Search Help page");

        return SNPCHROMOSOME_SEARCH_VIEW_HELP;
    }

    
    /**
     * Processes requests to home page which lists all available SNPChromosomes.
     * @param model
     * @return  The name of the SNPChromosome list view.
     */
    @RequestMapping(value = "/search_results_help", method = RequestMethod.GET)
    public String showSearchResultsHelp(
    	Model model
    	) {
    	
        LOGGER.debug("Rendering SNPChromosome Search Help page");

        return SNPCHROMOSOME_SEARCH_RESULT_VIEW_HELP;
    }

    
    /**
     * Processes requests to home page which lists all available SNPChromosomes.
     * @param model
     * @return  The name of the SNPChromosome list view.
     */
    @RequestMapping(value = { "/", "/search" }, method = RequestMethod.GET)
    public String searchG(
    	Model model
    	) {
    	
        LOGGER.debug("Rendering SNPChromosome Search page");

        model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, new DTOSearch());

        return SNPCHROMOSOME_SEARCH_VIEW;
    }

    
	@RequestMapping(value = "/search", method = RequestMethod.POST)
    public String searchP(
    	@ModelAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA) DTOSearch dtoSearch, 
    	Model model, 
    	RedirectAttributes attributes
    	) {
    	
        LOGGER.debug("Searching SNPChromosomes with search criteria: " + dtoSearch);
        
    	//System.out.println("search");

    	Integer firstPage = 1;
        
        PageSNPChromosome pagesnpchromosome = null;
        
        int intSearchLow = 0;
        int intSearchHigh = 0;
        int intSearchLowHighDiff = 0;

        int intSearchUp = 0;
        int intSearchDown = 0;
        
        try {

        	if ( !dtoSearch.isSearchFilterProteinAlignNumberValueEmpty() ) {
        		if ( !dtoSearch.isSearchFilterProteinAlignNumberValueANumber() ) {
        			throw new ExceptionSNPChromosomeSearchFilterProteinAlignNumberValueNotNumeric("ERROR: Search Filter Protein Alignment Number is NOT Numeric : " + dtoSearch.getSearchFilterProteinAlignNumberValue() + " !!!");
        		}
        	}
        	if ( !dtoSearch.isSearchFilterProveanScoreValueEmpty() ) {
        		if ( !dtoSearch.isSearchFilterProveanScoreValueANumber() ) {
        			throw new ExceptionSNPChromosomeSearchFilterProveanScoreValueNotNumeric("ERROR: Search Filter PROVEAN Score is NOT Numeric : " + dtoSearch.getSearchFilterProveanScoreValue() + " !!!");        		}
        	}
        	if ( !dtoSearch.isSearchFilterSiftConservationScoreValueEmpty() ) {
        		if ( !dtoSearch.isSearchFilterSiftConservationScoreValueANumber() ) {
        			throw new ExceptionSNPChromosomeSearchFilterSiftConservationScoreValueNotNumeric("ERROR: Search Filter SIFT Conservation Score is NOT Numeric : " + dtoSearch.getSearchFilterSiftConservationScoreValue() + " !!!");
        		}
        	}
        	if ( !dtoSearch.isSearchFilterSiftScoreValueEmpty() ) {
        		if ( !dtoSearch.isSearchFilterSiftScoreValueANumber() ) {
        			throw new ExceptionSNPChromosomeSearchFilterSiftScoreValueNotNumeric("ERROR: Search Filter SIFT Score is NOT Numeric : " + dtoSearch.getSearchFilterSiftScoreValue() + " !!!");
        		}
        	}
        	if ( !dtoSearch.isSearchFilterTotalNumberSeqAlignedValueEmpty() ) {
        		if ( !dtoSearch.isSearchFilterTotalNumberSeqAlignedValueANumber() ) {
        			throw new ExceptionSNPChromosomeSearchFilterTotalNumberSeqAlignedValueNotNumeric("ERROR: Search Filter Total Number of Sequences Aligned is NOT Numeric : " + dtoSearch.getSearchFilterTotalNumberSeqAlignedValue() + " !!!");
        		}
        	}
        	
        	if ( dtoSearch.isSearchGeneNameEmpty() ) {
        		
        		if ( dtoSearch.isSearchLowRangeEmpty() ) {
        			intSearchLow = 0;
        		}
        		else {
            		if ( dtoSearch.isSearchLowRangeNumeric() ) {
                    	intSearchLow = dtoSearch.getSearchLowRangeAsInt();
                    }
                    else {
                    	throw new ExceptionSNPChromosomeLowCoordinateNotNumeric("ERROR: Search Low Co-ordinate is NOT Numeric : " + dtoSearch.getSearchLowRange() + " !!!");
                    }
        		}
        		if ( dtoSearch.isSearchHighRangeEmpty() ) {
        			intSearchHigh = 0;
        		}
        		else {
                    if ( dtoSearch.isSearchHighRangeNumeric() ) {
                    	intSearchHigh = dtoSearch.getSearchHighRangeAsInt();
                    }
                    else {
                        throw new ExceptionSNPChromosomeHighCoordinateNotNumeric("ERROR: Search High Co-ordinate is NOT Numeric : " + dtoSearch.getSearchHighRange() + " !!!");
                    }
        		}
                if ( intSearchLow > intSearchHigh) {
                    throw new ExceptionSNPChromosomeLowCoordinateGreaterThanHighCoordinate("ERROR: Search Low Co-ordinate (" + intSearchLow + ") is GREATER THAN Search High Co-ordinate (" + intSearchHigh + ") !!!");
                }
                intSearchLowHighDiff = intSearchHigh - intSearchLow;
                if ( intSearchLowHighDiff > ONE_MILLION) {
                    throw new ExceptionSNPChromosomeSearchRangeGreaterThanOneMillion("ERROR: Search Range (" + intSearchLowHighDiff + ") is GREATER THAN One Million Base Pairs !!!");
                }
        	}
        	else {
        		
        		if ( !dtoSearch.isSearchChromosomeNone() ) {
        			
                    throw new ExceptionSNPChromosomeSelectedWithGeneName("ERROR: Search Chromosome Supplied AND Ensembl Gene Name Supplied !!!");
        		}
        		if ( dtoSearch.isSearchDownStreamEmpty() ) {
        			dtoSearch.setSearchDownStream("0");
        		}
        		else {
            		if ( dtoSearch.isSearchDownStreamNumeric()) {
            			intSearchDown = dtoSearch.getSearchDownStreamAsInt();
            		}
            		else {
                        throw new ExceptionEnsemblGeneDownStreamNotNumeric("ERROR: Search Downstream Range is NOT Numeric : " + dtoSearch.getSearchDownStream() + " !!!");
            		}
        		}
        		if ( dtoSearch.isSearchUpStreamEmpty() ) {
        			dtoSearch.setSearchUpStream("0");
        		}
        		else {
            		if ( dtoSearch.isSearchUpStreamNumeric()) {
            			intSearchUp = dtoSearch.getSearchUpStreamAsInt();
            		}
            		else {
                        throw new ExceptionEnsemblGeneUpStreamNotNumeric("ERROR: Search Upstream Range is NOT Numeric : " + dtoSearch.getSearchUpStream() + " !!!");
            		}
        		}
                if ( intSearchUp > TEN_THOUSAND) {
                    throw new ExceptionEnsemblGeneUpStreamSearchRangeGreaterThanTenThousand("ERROR: Up Stream Search Range (" + intSearchUp + ") is GREATER THAN Ten Thousand Base Pairs !!!");
                }
                if ( intSearchDown > TEN_THOUSAND) {
                    throw new ExceptionEnsemblGeneDownStreamSearchRangeGreaterThanTenThousand("ERROR: Down Stream Search Range (" + intSearchDown + ") is GREATER THAN Ten Thousand Base Pairs !!!");
                }

                List<EnsemblGene> ensemblgenes = serviceensemblgene.findByGeneName(dtoSearch.getSearchGeneName());
                if ( ensemblgenes.isEmpty() ) {
                    throw new ExceptionEnsemblGeneNotFound("ERROR: Requested Gene does NOT Exist !!!");
                }
                if ( ensemblgenes.size() > 1 ) {
                    throw new ExceptionEnsemblGeneMultiplesFound("ERROR: Multiple Genes Exist !!!");
                }
                
                EnsemblGene ensemblgene = ensemblgenes.get(0);
                
                dtoSearch.setSearchChromosome(ensemblgene.getChromosomeId());
                
            	long searchLowRange = 0;
            	long searchHighRange = 0;
            	
                if ( ensemblgene.isStrandPositive() ) {
                	searchLowRange = ensemblgene.getStart() - dtoSearch.getSearchUpStreamAsInt();
                	searchHighRange = ensemblgene.getEnd() + dtoSearch.getSearchDownStreamAsInt();
                	dtoSearch.setSearchHighRange(ObjectConverter.convert(searchHighRange, String.class));
                	dtoSearch.setSearchLowRange(ObjectConverter.convert(searchLowRange, String.class));
                }
                if ( ensemblgene.isStrandNegative() ) {
                	searchHighRange = ensemblgene.getStart() - dtoSearch.getSearchUpStreamAsInt();
                	searchLowRange = ensemblgene.getEnd() + dtoSearch.getSearchDownStreamAsInt();
                	dtoSearch.setSearchLowRange(ObjectConverter.convert(searchHighRange, String.class));
                	dtoSearch.setSearchHighRange(ObjectConverter.convert(searchLowRange, String.class));
                }
                if ( searchHighRange < 0 ) {
                    throw new ExceptionEnsemblGeneSearchRangeLessThanZero("ERROR: Search Range (" + searchHighRange + ") is LESS THAN Zero !!!");
                }
                if ( searchLowRange < 0 ) {
                    throw new ExceptionEnsemblGeneSearchRangeLessThanZero("ERROR: Search Range (" + searchLowRange + ") is LESS THAN Zero !!!");
                }

        	}

            if ( dtoSearch.isSearchReferenceNone() ) {
                throw new ExceptionSNPChromosomeReferenceAlleleNotSupplied("ERROR: Reference Allele Not Supplied !!!");
            }
            if ( dtoSearch.isSearchAlternativeNone()  ) {
                throw new ExceptionSNPChromosomeAlternativeAlleleNotSupplied("ERROR: Alternative Allele Not Supplied !!!");
            }
            if ( dtoSearch.getSearchReference().name().equals(dtoSearch.getSearchAlternative().name()) ) {
                throw new ExceptionSNPChromosomeReferenceAlleleEqualsAlternativeAllele("ERROR: Reference Allele EQUALS Alternative Allele !!!");
            }

            if ( dtoSearch.isSearchChromosomeNone() ) {
                throw new ExceptionSNPChromosomeNotSelected("ERROR: Search Chromosome Not Supplied !!!");
            }
            else {
            	
                if ( dtoSearch.isSearchChromosome1() ) {
                	pagesnpchromosome = servicesnpchromosome1.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
                }
                if ( dtoSearch.isSearchChromosome2() ) {
                	pagesnpchromosome = servicesnpchromosome2.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
                }
                if ( dtoSearch.isSearchChromosome3() ) {
                	pagesnpchromosome = servicesnpchromosome3.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
                }
                if ( dtoSearch.isSearchChromosome4() ) {
                	pagesnpchromosome = servicesnpchromosome4.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
                }
                if ( dtoSearch.isSearchChromosome5() ) {
                	pagesnpchromosome = servicesnpchromosome5.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
                }
                if ( dtoSearch.isSearchChromosome6() ) {
                	pagesnpchromosome = servicesnpchromosome6.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
                }
                if ( dtoSearch.isSearchChromosome7() ) {
                	pagesnpchromosome = servicesnpchromosome7.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
                }
                if ( dtoSearch.isSearchChromosome8() ) {
                	pagesnpchromosome = servicesnpchromosome8.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
                }
                if ( dtoSearch.isSearchChromosome9() ) {
                	pagesnpchromosome = servicesnpchromosome9.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
                }
                if ( dtoSearch.isSearchChromosome10() ) {
                	pagesnpchromosome = servicesnpchromosome10.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
                }
                if ( dtoSearch.isSearchChromosome11() ) {
                	pagesnpchromosome = servicesnpchromosome11.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
                }
                if ( dtoSearch.isSearchChromosome12() ) {
                	pagesnpchromosome = servicesnpchromosome12.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
                }
                if ( dtoSearch.isSearchChromosome13() ) {
                	pagesnpchromosome = servicesnpchromosome13.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
                }
                if ( dtoSearch.isSearchChromosome14() ) {
                	pagesnpchromosome = servicesnpchromosome14.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
                }
                if ( dtoSearch.isSearchChromosome15() ) {
                	pagesnpchromosome = servicesnpchromosome15.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
                }
                if ( dtoSearch.isSearchChromosome16() ) {
                	pagesnpchromosome = servicesnpchromosome16.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
                }
                if ( dtoSearch.isSearchChromosome17() ) {
                	pagesnpchromosome = servicesnpchromosome17.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
                }
                if ( dtoSearch.isSearchChromosome18() ) {
                	pagesnpchromosome = servicesnpchromosome18.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
                }
                if ( dtoSearch.isSearchChromosome19() ) {
                	pagesnpchromosome = servicesnpchromosome19.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
                }
                if ( dtoSearch.isSearchChromosome20() ) {
                	pagesnpchromosome = servicesnpchromosome20.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
                }
                if ( dtoSearch.isSearchChromosome21() ) {
                	pagesnpchromosome = servicesnpchromosome21.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
                }
                if ( dtoSearch.isSearchChromosome22() ) {
                	pagesnpchromosome = servicesnpchromosome22.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
                }
                if ( dtoSearch.isSearchChromosome23() ) {
                	pagesnpchromosome = servicesnpchromosome23.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
                }
                if ( dtoSearch.isSearchChromosome24() ) {
                	pagesnpchromosome = servicesnpchromosome24.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
                }
                if ( dtoSearch.isSearchChromosome25() ) {
                	pagesnpchromosome = servicesnpchromosome25.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
                }
                if ( dtoSearch.isSearchChromosome26() ) {
                	pagesnpchromosome = servicesnpchromosome26.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
                }
                if ( dtoSearch.isSearchChromosome27() ) {
                	pagesnpchromosome = servicesnpchromosome27.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
                }
                if ( dtoSearch.isSearchChromosome28() ) {
                	pagesnpchromosome = servicesnpchromosome28.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
                }
                if ( dtoSearch.isSearchChromosome32() ) {
                	pagesnpchromosome = servicesnpchromosome32.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
                }
                if ( dtoSearch.isSearchChromosomeW() ) {
                	pagesnpchromosome = servicesnpchromosomeW.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
                }
                if ( dtoSearch.isSearchChromosomeZ() ) {
                	pagesnpchromosome = servicesnpchromosomeZ.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
                }
                if ( dtoSearch.isSearchChromosomeLGE22C19W28_E50C23() ) {
                	pagesnpchromosome = servicesnpchromosomeLGE22C19W28_E50C23.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
                }
                if ( dtoSearch.isSearchChromosomeLGE64() ) {
                	pagesnpchromosome = servicesnpchromosomeLGE64.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
                }
            }
            
        } 
        catch (ExceptionSNPChromosomeSelectedWithGeneName e) {
        	LOGGER.debug("ERROR: Search Chromosome Supplied AND Ensembl Gene Name Supplied !!!");
            addErrorMessage(attributes, ERROR_MESSAGE_SEARCH_CHOSEN_CHROMOSOME_AND_GENENAME);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, pagesnpchromosome);
            return createRedirectViewPath(REQUEST_MAPPING_LIST);
        }
        catch (ExceptionSNPChromosomeNotSelected e) {
        	LOGGER.debug("ERROR: The Search Chromosome has NOT been chosen !!!");
            addErrorMessage(attributes, ERROR_MESSAGE_SEARCH_NOTCHOSEN_CHROMOSOME_NOT_SELECTED);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, pagesnpchromosome);
            return createRedirectViewPath(REQUEST_MAPPING_LIST);
        }
        catch (ExceptionSNPChromosomeSearchFilterProteinAlignNumberValueNotNumeric e) {
        	LOGGER.debug("ERROR: The Search Filter Protein Alignment Number is NOT Numeric !!!");
            addErrorMessage(attributes, ERROR_MESSAGE_SEARCH_FILTER_NOT_NUMERIC_PROTEIN_ALIGN_NUMBER);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, pagesnpchromosome);
            return createRedirectViewPath(REQUEST_MAPPING_LIST);
        }
        catch (ExceptionSNPChromosomeSearchFilterProveanScoreValueNotNumeric e) {
        	LOGGER.debug("ERROR: The Search Filter PROVEAN Score is NOT Numeric !!!");
            addErrorMessage(attributes, ERROR_MESSAGE_SEARCH_FILTER_NOT_NUMERIC_PROVEAN_SCORE);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, pagesnpchromosome);
            return createRedirectViewPath(REQUEST_MAPPING_LIST);
        }
        catch (ExceptionSNPChromosomeSearchFilterSiftConservationScoreValueNotNumeric e) {
        	LOGGER.debug("ERROR: The Search Filter SIFT Conservation Score is NOT Numeric !!!");
            addErrorMessage(attributes, ERROR_MESSAGE_SEARCH_FILTER_NOT_NUMERIC_SIFT_CONSERVATION_SCORE);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, pagesnpchromosome);
            return createRedirectViewPath(REQUEST_MAPPING_LIST);
        }
        catch (ExceptionSNPChromosomeSearchFilterSiftScoreValueNotNumeric e) {
        	LOGGER.debug("ERROR: The Search Filter SIFT Score is NOT Numeric !!!");
            addErrorMessage(attributes, ERROR_MESSAGE_SEARCH_FILTER_NOT_NUMERIC_SIFT_SCORE);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, pagesnpchromosome);
            return createRedirectViewPath(REQUEST_MAPPING_LIST);
        }
        catch (ExceptionSNPChromosomeSearchFilterTotalNumberSeqAlignedValueNotNumeric e) {
        	LOGGER.debug("ERROR: The Search Filter Total Number of Sequence Aligned is NOT Numeric !!!");
            addErrorMessage(attributes, ERROR_MESSAGE_SEARCH_FILTER_NOT_NUMERIC_TOTAL_NUMBER_SEQ_ALIGNED);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, pagesnpchromosome);
            return createRedirectViewPath(REQUEST_MAPPING_LIST);
        }
        catch (ExceptionEnsemblGeneSearchRangeLessThanZero e) {
        	LOGGER.debug("ERROR: Search Range is LESS THAN Zero !!!");
            addErrorMessage(attributes, ERROR_MESSAGE_SEARCH_RANGE_NEGATIVE);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, pagesnpchromosome);
            return createRedirectViewPath(REQUEST_MAPPING_LIST);
        }
        catch (ExceptionEnsemblGeneUpStreamSearchRangeGreaterThanTenThousand e) {
        	LOGGER.debug("ERROR: Up Stream Search Range is GREATER THAN Ten Thousand Base Pairs !!!");
            addErrorMessage(attributes, ERROR_MESSAGE_SEARCH_UPSTREAM_TEN_THOUSAND_BASE_PAIRS);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, pagesnpchromosome);
            return createRedirectViewPath(REQUEST_MAPPING_LIST);
        }
        catch (ExceptionEnsemblGeneDownStreamSearchRangeGreaterThanTenThousand e) {
        	LOGGER.debug("ERROR: Down Stream Search Range is GREATER THAN Ten Thousand Base Pairs !!!");
            addErrorMessage(attributes, ERROR_MESSAGE_SEARCH_DOWNSTREAM_TEN_THOUSAND_BASE_PAIRS);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, pagesnpchromosome);
            return createRedirectViewPath(REQUEST_MAPPING_LIST);
        }
        catch (ExceptionEnsemblGeneUpStreamNotNumeric e) {
        	LOGGER.debug("ERROR: Search Upstream Range is NOT Numeric !!!");
            addErrorMessage(attributes, ERROR_MESSAGE_SEARCH_NOT_NUMERIC_UP_STREAM);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, pagesnpchromosome);
            return createRedirectViewPath(REQUEST_MAPPING_LIST);
        }
        catch (ExceptionEnsemblGeneDownStreamNotNumeric e) {
        	LOGGER.debug("ERROR: Search Downstream Range is NOT Numeric !!!");
            addErrorMessage(attributes, ERROR_MESSAGE_SEARCH_NOT_NUMERIC_DOWN_STREAM);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, pagesnpchromosome);
            return createRedirectViewPath(REQUEST_MAPPING_LIST);
        }
        catch (ExceptionEnsemblGeneMultiplesFound e) {
        	LOGGER.debug("ERROR: Multiple Genes Found !!!");
            addErrorMessage(attributes, ERROR_MESSAGE_SEARCH_GENE_NAME_MULTIPLE);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, pagesnpchromosome);
            return createRedirectViewPath(REQUEST_MAPPING_LIST);
        }
        catch (ExceptionEnsemblGeneNotFound e) {
        	LOGGER.debug("ERROR: Requested Gene does NOT Exist !!!");
            addErrorMessage(attributes, ERROR_MESSAGE_SEARCH_GENE_NAME_UNKNOWN);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, pagesnpchromosome);
            return createRedirectViewPath(REQUEST_MAPPING_LIST);
        }
        catch (ExceptionSNPChromosomeSearchRangeGreaterThanOneMillion e) {
        	LOGGER.debug("ERROR: Search Range is GREATER THAN One Million Base Pairs !!!");
            addErrorMessage(attributes, ERROR_MESSAGE_SEARCH_ONE_MILLION_BASE_PAIRS);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, pagesnpchromosome);
            return createRedirectViewPath(REQUEST_MAPPING_LIST);
        }
        catch (ExceptionSNPChromosomeLowCoordinateNotNumeric e) {
        	LOGGER.debug("ERROR: Search Low Co-ordinate is NOT Numeric !!!");
            addErrorMessage(attributes, ERROR_MESSAGE_SEARCH_NOT_NUMERIC_LOW_POSITION);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, pagesnpchromosome);
            return createRedirectViewPath(REQUEST_MAPPING_LIST);
        }
        catch (ExceptionSNPChromosomeHighCoordinateNotNumeric e) {
        	LOGGER.debug("ERROR: Search High Co-ordinate is NOT Numeric !!!");
        	addErrorMessage(attributes, ERROR_MESSAGE_SEARCH_NOT_NUMERIC_HIGH_POSITION);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, pagesnpchromosome);
            return createRedirectViewPath(REQUEST_MAPPING_LIST);
        }
        catch (ExceptionSNPChromosomeLowCoordinateGreaterThanHighCoordinate e) {
        	LOGGER.debug("ERROR: Search Low Co-ordinate is GREATER THAN Search High Co-ordinate !!!");
        	addErrorMessage(attributes, ERROR_MESSAGE_SEARCH_OUTSIDE_RANGE_LOW_POSITION_GE_HIGH_POSITION);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, pagesnpchromosome);
            return createRedirectViewPath(REQUEST_MAPPING_LIST);
        }
        catch (ExceptionSNPChromosomeReferenceAlleleNotSupplied e) {
        	LOGGER.debug("ERROR: Reference Allele Not Supplied !!!");
        	addErrorMessage(attributes, ERROR_MESSAGE_SEARCH_NOTCHOSEN_REFERENCE_NOT_SELECTED);
        	model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, pagesnpchromosome);
            return createRedirectViewPath(REQUEST_MAPPING_LIST);
        }
        catch (ExceptionSNPChromosomeAlternativeAlleleNotSupplied e) {
        	LOGGER.debug("ERROR: Alternative Allele Not Supplied !!!");
        	addErrorMessage(attributes, ERROR_MESSAGE_SEARCH_NOTCHOSEN_ALTERNATIVE_NOT_SELECTED);
        	model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, pagesnpchromosome);
            return createRedirectViewPath(REQUEST_MAPPING_LIST);
        }
        catch (ExceptionSNPChromosomeReferenceAlleleEqualsAlternativeAllele e) {
        	LOGGER.debug("ERROR: Reference Allele EQUALS Alternative Allele !!!");
        	addErrorMessage(attributes, ERROR_MESSAGE_SEARCH_EQUALS_REFERENCE_EQUALS_ALTERNATIVE);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, pagesnpchromosome);
            return createRedirectViewPath(REQUEST_MAPPING_LIST);
        }
        
        if ( pagesnpchromosome == null ) {
            LOGGER.debug("EMPTY SNPChromosomes !!! ");
            
            model.addAttribute("feedbackMessage", addFeedbackMessageAsString(FEEDBACK_MESSAGE_KEY_SEARCH_RESULTS_MULTIPLE, 0));
        }
        else {
        	
        	FilteredSNPChromosome filteredsnpchromosome = new FilteredSNPChromosome(
        			firstPage, 
        			NUMBER_OF_SNPCHROMOSOMES_PER_PAGE, 
            		0, 
            		0, 
            		dtoSearch.getSearchFilterSiftScoreValueAsDouble(), 
            		dtoSearch.getSearchFilterSiftConservationScoreValueAsDouble(), 
            		dtoSearch.getSearchFilterProteinAlignNumberValueAsLong(), 
            		dtoSearch.getSearchFilterTotalNumberSeqAlignedValueAsLong(), 
            		dtoSearch.getSearchFilterProveanScoreValueAsDouble(),
            		dtoSearch.getSearchFilterSiftScore(),
            		dtoSearch.getSearchFilterSiftConservationScore(),
            		dtoSearch.getSearchFilterProteinAlignNumber(),
            	    dtoSearch.getSearchFilterTotalNumberSeqAligned(),
            	    dtoSearch.getSearchFilterProveanScore(),
            	    pagesnpchromosome);

            int current = filteredsnpchromosome.getPageNumber();
            int begin = Math.max(1, current - 5);
            int end = Math.min(begin + 10, filteredsnpchromosome.getTotalPages());
            int totalPages = filteredsnpchromosome.getTotalPages();

            model.addAttribute("SNPChromosome", filteredsnpchromosome.getPagedSNPChromosomes());
            model.addAttribute("beginIndex", begin);
            model.addAttribute("endIndex", end);
            model.addAttribute("currentIndex", current);
            model.addAttribute("totalPages", totalPages);
            
        	DTODownload dtoDownload = new DTODownload();
            
            dtoDownload.setDownloadChromosome(dtoSearch.getSearchChromosome());
            
            dtoDownload.setDownloadLowRange(dtoSearch.getSearchLowRange());
            dtoDownload.setDownloadHighRange(dtoSearch.getSearchHighRange());
            
            dtoDownload.setDownloadReference(dtoSearch.getSearchReference());
            dtoDownload.setDownloadAlternative(dtoSearch.getSearchAlternative());
            
            dtoDownload.setDownloadFilterSiftScoreValue(dtoSearch.getSearchFilterSiftScoreValue());
            dtoDownload.setDownloadFilterSiftConservationScoreValue(dtoSearch.getSearchFilterSiftConservationScoreValue());
            dtoDownload.setDownloadFilterProteinAlignNumberValue(dtoSearch.getSearchFilterProteinAlignNumberValue());
            dtoDownload.setDownloadFilterTotalNumberSeqAlignedValue(dtoSearch.getSearchFilterTotalNumberSeqAlignedValue());
            dtoDownload.setDownloadFilterProveanScoreValue(dtoSearch.getSearchFilterProveanScoreValue());

            dtoDownload.setDownloadFilterSiftScore(dtoSearch.getSearchFilterSiftScore());
            dtoDownload.setDownloadFilterSiftConservationScore(dtoSearch.getSearchFilterSiftConservationScore());
            dtoDownload.setDownloadFilterProteinAlignNumber(dtoSearch.getSearchFilterProteinAlignNumber());
            dtoDownload.setDownloadFilterTotalNumberSeqAligned(dtoSearch.getSearchFilterTotalNumberSeqAligned());
            dtoDownload.setDownloadFilterProveanScore(dtoSearch.getSearchFilterProveanScore());

            dtoDownload.setDownloadSortDirection(dtoSearch.getSearchSortDirection());
            dtoDownload.setDownloadSortField(dtoSearch.getSearchSortField());

            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            model.addAttribute(MODEL_ATTRIBUTE_DOWNLOADCRITERIA, dtoDownload);

            if ( filteredsnpchromosome.getTotalElements() == 1 ) {
                model.addAttribute("feedbackMessage", addFeedbackMessageAsString(FEEDBACK_MESSAGE_KEY_SEARCH_RESULTS_SINGLE, filteredsnpchromosome.getTotalElements()));
            }
            else {
                model.addAttribute("feedbackMessage", addFeedbackMessageAsString(FEEDBACK_MESSAGE_KEY_SEARCH_RESULTS_MULTIPLE, filteredsnpchromosome.getTotalElements()));
            }
        }

        return SNPCHROMOSOME_SEARCH_RESULT_VIEW;
    }
    

	@RequestMapping(value = "/results/{pageNumber}", method = RequestMethod.GET)
	public String getSearchedSNPChromosomePage(
    	@PathVariable Integer pageNumber, 
    	@RequestParam(value = "chr", required = true) String chr,
    	@RequestParam(value = "low", required = true) String low,
    	@RequestParam(value = "high", required = true) String high,
    	@RequestParam(value = "ref", required = true) String ref,
    	@RequestParam(value = "alt", required = true) String alt,
    	@RequestParam(value = "sortfield", required = false) String sortfield,
    	@RequestParam(value = "sortdir", required = false) String sortdir,
    	@ModelAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA) DTOSearch dtoSearch,
    	@ModelAttribute(MODEL_ATTRIBUTE_DOWNLOADCRITERIA) DTODownload dtoDownload,
    	Model model, 
    	RedirectAttributes attributes
    	) {
    	
    	//System.out.println("getSearchedSNPChromosomePage");

    	Integer firstPage = 1;

        PageSNPChromosome pagesnpchromosome = null;
        
        dtoSearch = new DTOSearch();
        
        dtoSearch.setPageIndex(pageNumber);
        
        dtoSearch.setSearchChromosome(chr);
        
        dtoSearch.setSearchLowRange(low);
        dtoSearch.setSearchHighRange(high);
        
        dtoSearch.setSearchReference(ref);
        dtoSearch.setSearchAlternative(alt);
        
        dtoSearch.setSearchSortDirection(sortdir);
        dtoSearch.setSearchSortField(sortfield);

    	if ( dtoSearch.isSearchChromosome1() ) {
        	pagesnpchromosome = servicesnpchromosome1.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
        }
    	if ( dtoSearch.isSearchChromosome2() ) {
        	pagesnpchromosome = servicesnpchromosome2.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
        }
        if ( dtoSearch.isSearchChromosome3() ) {
        	pagesnpchromosome = servicesnpchromosome3.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
        }
        if ( dtoSearch.isSearchChromosome4() ) {
        	pagesnpchromosome = servicesnpchromosome4.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
        }
        if ( dtoSearch.isSearchChromosome5() ) {
        	pagesnpchromosome = servicesnpchromosome5.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
        }
        if ( dtoSearch.isSearchChromosome6() ) {
        	pagesnpchromosome = servicesnpchromosome6.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
        }
        if ( dtoSearch.isSearchChromosome7() ) {
        	pagesnpchromosome = servicesnpchromosome7.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
        }
        if ( dtoSearch.isSearchChromosome8() ) {
        	pagesnpchromosome = servicesnpchromosome8.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
        }
        if ( dtoSearch.isSearchChromosome9() ) {
        	pagesnpchromosome = servicesnpchromosome9.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
        }
        if ( dtoSearch.isSearchChromosome10() ) {
        	pagesnpchromosome = servicesnpchromosome10.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
        }
        if ( dtoSearch.isSearchChromosome11() ) {
        	pagesnpchromosome = servicesnpchromosome11.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
        }
        if ( dtoSearch.isSearchChromosome12() ) {
        	pagesnpchromosome = servicesnpchromosome12.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
        }
        if ( dtoSearch.isSearchChromosome13() ) {
        	pagesnpchromosome = servicesnpchromosome13.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
        }
        if ( dtoSearch.isSearchChromosome14() ) {
        	pagesnpchromosome = servicesnpchromosome14.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
        }
        if ( dtoSearch.isSearchChromosome15() ) {
        	pagesnpchromosome = servicesnpchromosome15.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
        }
        if ( dtoSearch.isSearchChromosome16() ) {
        	pagesnpchromosome = servicesnpchromosome16.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
        }
        if ( dtoSearch.isSearchChromosome17() ) {
        	pagesnpchromosome = servicesnpchromosome17.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
        }
        if ( dtoSearch.isSearchChromosome18() ) {
        	pagesnpchromosome = servicesnpchromosome18.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
        }
        if ( dtoSearch.isSearchChromosome19() ) {
        	pagesnpchromosome = servicesnpchromosome19.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
        }
        if ( dtoSearch.isSearchChromosome20() ) {
        	pagesnpchromosome = servicesnpchromosome20.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
        }
        if ( dtoSearch.isSearchChromosome21() ) {
        	pagesnpchromosome = servicesnpchromosome21.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
        }
        if ( dtoSearch.isSearchChromosome22() ) {
        	pagesnpchromosome = servicesnpchromosome22.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
        }
        if ( dtoSearch.isSearchChromosome23() ) {
        	pagesnpchromosome = servicesnpchromosome23.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
        }
        if ( dtoSearch.isSearchChromosome24() ) {
        	pagesnpchromosome = servicesnpchromosome24.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
        }
        if ( dtoSearch.isSearchChromosome25() ) {
        	pagesnpchromosome = servicesnpchromosome25.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
        }
        if ( dtoSearch.isSearchChromosome26() ) {
        	pagesnpchromosome = servicesnpchromosome26.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
        }
        if ( dtoSearch.isSearchChromosome27() ) {
        	pagesnpchromosome = servicesnpchromosome27.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
        }
        if ( dtoSearch.isSearchChromosome28() ) {
        	pagesnpchromosome = servicesnpchromosome28.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
        }
        if ( dtoSearch.isSearchChromosome32() ) {
        	pagesnpchromosome = servicesnpchromosome32.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
        }
        if ( dtoSearch.isSearchChromosomeW() ) {
        	pagesnpchromosome = servicesnpchromosomeW.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
        }
        if ( dtoSearch.isSearchChromosomeZ() ) {
        	pagesnpchromosome = servicesnpchromosomeZ.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
        }
        if ( dtoSearch.isSearchChromosomeLGE22C19W28_E50C23() ) {
        	pagesnpchromosome = servicesnpchromosomeLGE22C19W28_E50C23.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
        }
        if ( dtoSearch.isSearchChromosomeLGE64() ) {
        	pagesnpchromosome = servicesnpchromosomeLGE64.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsSortDirection());
        }

        if ( pagesnpchromosome == null ) {
        	
            LOGGER.debug("EMPTY SNPChromosomes !!! ");
            model.addAttribute("feedbackMessage", addFeedbackMessageAsString(FEEDBACK_MESSAGE_KEY_SEARCH_RESULTS_MULTIPLE, 0));
        }
        else {
        	
        	FilteredSNPChromosome filteredsnpchromosome = new FilteredSNPChromosome(
        			pageNumber, 
        			NUMBER_OF_SNPCHROMOSOMES_PER_PAGE, 
            		0, 
            		0, 
            		dtoSearch.getSearchFilterSiftScoreValueAsDouble(), 
            		dtoSearch.getSearchFilterSiftConservationScoreValueAsDouble(), 
            		dtoSearch.getSearchFilterProteinAlignNumberValueAsLong(), 
            		dtoSearch.getSearchFilterTotalNumberSeqAlignedValueAsLong(), 
            		dtoSearch.getSearchFilterProveanScoreValueAsDouble(),
            		dtoSearch.getSearchFilterSiftScore(),
            		dtoSearch.getSearchFilterSiftConservationScore(),
            		dtoSearch.getSearchFilterProteinAlignNumber(),
            	    dtoSearch.getSearchFilterTotalNumberSeqAligned(),
            	    dtoSearch.getSearchFilterProveanScore(),
            	    pagesnpchromosome);

            if ( pagesnpchromosome.getTotalElements() == 1 ) {
                model.addAttribute("feedbackMessage", addFeedbackMessageAsString(FEEDBACK_MESSAGE_KEY_SEARCH_RESULTS_SINGLE, pagesnpchromosome.getTotalElements()));
            }
            else {
                model.addAttribute("feedbackMessage", addFeedbackMessageAsString(FEEDBACK_MESSAGE_KEY_SEARCH_RESULTS_MULTIPLE, pagesnpchromosome.getTotalElements()));
            }
            
            int current = filteredsnpchromosome.getPageNumber();
            int begin = Math.max(1, current - 5);
            int end = Math.min(begin + 10, filteredsnpchromosome.getTotalPages());
            int totalPages = filteredsnpchromosome.getTotalPages();

            model.addAttribute("SNPChromosome", filteredsnpchromosome.getPagedSNPChromosomes());
            model.addAttribute("beginIndex", begin);
            model.addAttribute("endIndex", end);
            model.addAttribute("currentIndex", current);
            model.addAttribute("totalPages", totalPages);

            dtoDownload = new DTODownload();
            
            dtoDownload.setDownloadChromosome(dtoSearch.getSearchChromosome());
            
            dtoDownload.setDownloadLowRange(dtoSearch.getSearchLowRange());
            dtoDownload.setDownloadHighRange(dtoSearch.getSearchHighRange());
            
            dtoDownload.setDownloadReference(dtoSearch.getSearchReference());
            dtoDownload.setDownloadAlternative(dtoSearch.getSearchAlternative());
            
            dtoDownload.setDownloadFilterSiftScoreValue(dtoSearch.getSearchFilterSiftScoreValue());
            dtoDownload.setDownloadFilterSiftConservationScoreValue(dtoSearch.getSearchFilterSiftConservationScoreValue());
            dtoDownload.setDownloadFilterProteinAlignNumberValue(dtoSearch.getSearchFilterProteinAlignNumberValue());
            dtoDownload.setDownloadFilterTotalNumberSeqAlignedValue(dtoSearch.getSearchFilterTotalNumberSeqAlignedValue());
            dtoDownload.setDownloadFilterProveanScoreValue(dtoSearch.getSearchFilterProveanScoreValue());

            dtoDownload.setDownloadFilterSiftScore(dtoSearch.getSearchFilterSiftScore());
            dtoDownload.setDownloadFilterSiftConservationScore(dtoSearch.getSearchFilterSiftConservationScore());
            dtoDownload.setDownloadFilterProteinAlignNumber(dtoSearch.getSearchFilterProteinAlignNumber());
            dtoDownload.setDownloadFilterTotalNumberSeqAligned(dtoSearch.getSearchFilterTotalNumberSeqAligned());
            dtoDownload.setDownloadFilterProveanScore(dtoSearch.getSearchFilterProveanScore());

            dtoDownload.setDownloadSortDirection(dtoSearch.getSearchSortDirection());
            dtoDownload.setDownloadSortField(dtoSearch.getSearchSortField());

            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            model.addAttribute(MODEL_ATTRIBUTE_DOWNLOADCRITERIA, dtoDownload);
        }

        return SNPCHROMOSOME_SEARCH_RESULT_VIEW;
    }


	@RequestMapping(value = "/download", method = RequestMethod.POST)
	public @ResponseBody CSVResponse download(
		DTODownload dtoDownload
		) throws IOException {
    	
        LOGGER.debug("Downloading SNPChromosomes with search criteria: " + dtoDownload);
        
        CSVResponse csvresponse = new CSVResponse();

        List<SNPChromosome> snpchromosomes = new ArrayList<SNPChromosome>();

        if ( dtoDownload.isDownloadChromosome1() ) {
        	snpchromosomes = servicesnpchromosome1.download(dtoDownload);
        }
        if ( dtoDownload.isDownloadChromosome2() ) {
        	snpchromosomes = servicesnpchromosome2.download(dtoDownload);
        }
        if ( dtoDownload.isDownloadChromosome3() ) {
        	snpchromosomes = servicesnpchromosome3.download(dtoDownload);
        }
        if ( dtoDownload.isDownloadChromosome4() ) {
        	snpchromosomes = servicesnpchromosome4.download(dtoDownload);
        }
        if ( dtoDownload.isDownloadChromosome5() ) {
        	snpchromosomes = servicesnpchromosome5.download(dtoDownload);
        }
        if ( dtoDownload.isDownloadChromosome6() ) {
        	snpchromosomes = servicesnpchromosome6.download(dtoDownload);
        }
        if ( dtoDownload.isDownloadChromosome7() ) {
        	snpchromosomes = servicesnpchromosome7.download(dtoDownload);
        }
        if ( dtoDownload.isDownloadChromosome8() ) {
        	snpchromosomes = servicesnpchromosome8.download(dtoDownload);
        }
        if ( dtoDownload.isDownloadChromosome9() ) {
        	snpchromosomes = servicesnpchromosome9.download(dtoDownload);
        }
        if ( dtoDownload.isDownloadChromosome10() ) {
        	snpchromosomes = servicesnpchromosome10.download(dtoDownload);
        }
        if ( dtoDownload.isDownloadChromosome11() ) {
        	snpchromosomes = servicesnpchromosome11.download(dtoDownload);
        }
        if ( dtoDownload.isDownloadChromosome12() ) {
        	snpchromosomes = servicesnpchromosome12.download(dtoDownload);
        }
        if ( dtoDownload.isDownloadChromosome13() ) {
        	snpchromosomes = servicesnpchromosome13.download(dtoDownload);
        }
        if ( dtoDownload.isDownloadChromosome14() ) {
        	snpchromosomes = servicesnpchromosome14.download(dtoDownload);
        }
        if ( dtoDownload.isDownloadChromosome15() ) {
        	snpchromosomes = servicesnpchromosome15.download(dtoDownload);
        }
        if ( dtoDownload.isDownloadChromosome16() ) {
        	snpchromosomes = servicesnpchromosome16.download(dtoDownload);
        }
        if ( dtoDownload.isDownloadChromosome17() ) {
        	snpchromosomes = servicesnpchromosome17.download(dtoDownload);
        }
        if ( dtoDownload.isDownloadChromosome18() ) {
        	snpchromosomes = servicesnpchromosome18.download(dtoDownload);
        }
        if ( dtoDownload.isDownloadChromosome19() ) {
        	snpchromosomes = servicesnpchromosome19.download(dtoDownload);
        }
        if ( dtoDownload.isDownloadChromosome20() ) {
        	snpchromosomes = servicesnpchromosome20.download(dtoDownload);
        }
        if ( dtoDownload.isDownloadChromosome21() ) {
        	snpchromosomes = servicesnpchromosome21.download(dtoDownload);
        }
        if ( dtoDownload.isDownloadChromosome22() ) {
        	snpchromosomes = servicesnpchromosome22.download(dtoDownload);
        }
        if ( dtoDownload.isDownloadChromosome23() ) {
        	snpchromosomes = servicesnpchromosome23.download(dtoDownload);
        }
        if ( dtoDownload.isDownloadChromosome24() ) {
        	snpchromosomes = servicesnpchromosome24.download(dtoDownload);
        }
        if ( dtoDownload.isDownloadChromosome25() ) {
        	snpchromosomes = servicesnpchromosome25.download(dtoDownload);
        }
        if ( dtoDownload.isDownloadChromosome26() ) {
        	snpchromosomes = servicesnpchromosome26.download(dtoDownload);
        }
        if ( dtoDownload.isDownloadChromosome27() ) {
        	snpchromosomes = servicesnpchromosome27.download(dtoDownload);
        }
        if ( dtoDownload.isDownloadChromosome28() ) {
        	snpchromosomes = servicesnpchromosome28.download(dtoDownload);
        }
        if ( dtoDownload.isDownloadChromosome32() ) {
        	snpchromosomes = servicesnpchromosome32.download(dtoDownload);
        }
        if ( dtoDownload.isDownloadChromosomeW() ) {
        	snpchromosomes = servicesnpchromosomeW.download(dtoDownload);
        }
        if ( dtoDownload.isDownloadChromosomeZ() ) {
        	snpchromosomes = servicesnpchromosomeZ.download(dtoDownload);
        }
        if ( dtoDownload.isDownloadChromosomeLGE22C19W28_E50C23() ) {
        	snpchromosomes = servicesnpchromosomeLGE22C19W28_E50C23.download(dtoDownload);
        }
        if ( dtoDownload.isDownloadChromosomeLGE64() ) {
        	snpchromosomes = servicesnpchromosomeLGE64.download(dtoDownload);
        }
        
    	Integer firstPage = 1;

    	FilteredSNPChromosome filteredsnpchromosome = new FilteredSNPChromosome(
    			firstPage, 
    			NUMBER_OF_SNPCHROMOSOMES_ALL, 
        		0, 
        		0, 
        		dtoDownload.getDownloadFilterSiftScoreValueAsDouble(), 
        		dtoDownload.getDownloadFilterSiftConservationScoreValueAsDouble(), 
        		dtoDownload.getDownloadFilterProteinAlignNumberValueAsLong(), 
        		dtoDownload.getDownloadFilterTotalNumberSeqAlignedValueAsLong(), 
        		dtoDownload.getDownloadFilterProveanScoreValueAsDouble(),
        		dtoDownload.getDownloadFilterSiftScore(),
        		dtoDownload.getDownloadFilterSiftConservationScore(),
        		dtoDownload.getDownloadFilterProteinAlignNumber(),
        	    dtoDownload.getDownloadFilterTotalNumberSeqAligned(),
        	    dtoDownload.getDownloadFilterProveanScore(),
        	    snpchromosomes);
        
        csvresponse.setDTODownload(dtoDownload);
        
        if ( snpchromosomes == null ) {
        	
            LOGGER.debug("EMPTY SNPChromosomes !!! ");
        }
        else {

        	csvresponse.addAll(filteredsnpchromosome.getFilteredSNPChromosomes());
        }
        
        return csvresponse;
    }

	
	/**
     * This setter method should only be used by unit tests
     * @param serviceSNPChromosome
     */
    protected void setServiceSNPChromosome1(ServiceSNPChromosome01 servicesnpchromosome1) {
        this.servicesnpchromosome1 = servicesnpchromosome1;
    }
    protected void setServiceSNPChromosome2(ServiceSNPChromosome02 servicesnpchromosome2) {
        this.servicesnpchromosome2 = servicesnpchromosome2;
    }
    protected void setServiceSNPChromosome3(ServiceSNPChromosome03 servicesnpchromosome3) {
        this.servicesnpchromosome3 = servicesnpchromosome3;
    }
    protected void setServiceSNPChromosome4(ServiceSNPChromosome04 servicesnpchromosome4) {
        this.servicesnpchromosome4 = servicesnpchromosome4;
    }
    protected void setServiceSNPChromosome5(ServiceSNPChromosome05 servicesnpchromosome5) {
        this.servicesnpchromosome5 = servicesnpchromosome5;
    }
    protected void setServiceSNPChromosome6(ServiceSNPChromosome06 servicesnpchromosome6) {
        this.servicesnpchromosome6 = servicesnpchromosome6;
    }
    protected void setServiceSNPChromosome7(ServiceSNPChromosome07 servicesnpchromosome7) {
        this.servicesnpchromosome7 = servicesnpchromosome7;
    }
    protected void setServiceSNPChromosome8(ServiceSNPChromosome08 servicesnpchromosome8) {
        this.servicesnpchromosome8 = servicesnpchromosome8;
    }
    protected void setServiceSNPChromosome9(ServiceSNPChromosome09 servicesnpchromosome9) {
        this.servicesnpchromosome9 = servicesnpchromosome9;
    }
    protected void setServiceSNPChromosome10(ServiceSNPChromosome10 servicesnpchromosome10) {
        this.servicesnpchromosome10 = servicesnpchromosome10;
    }
    protected void setServiceSNPChromosome11(ServiceSNPChromosome11 servicesnpchromosome11) {
        this.servicesnpchromosome11 = servicesnpchromosome11;
    }
    protected void setServiceSNPChromosome12(ServiceSNPChromosome12 servicesnpchromosome12) {
        this.servicesnpchromosome12 = servicesnpchromosome12;
    }
    protected void setServiceSNPChromosome13(ServiceSNPChromosome13 servicesnpchromosome13) {
        this.servicesnpchromosome13 = servicesnpchromosome13;
    }
    protected void setServiceSNPChromosome14(ServiceSNPChromosome14 servicesnpchromosome14) {
        this.servicesnpchromosome14 = servicesnpchromosome14;
    }
    protected void setServiceSNPChromosome15(ServiceSNPChromosome15 servicesnpchromosome15) {
        this.servicesnpchromosome15 = servicesnpchromosome15;
    }
    protected void setServiceSNPChromosome16(ServiceSNPChromosome16 servicesnpchromosome16) {
        this.servicesnpchromosome16 = servicesnpchromosome16;
    }
    protected void setServiceSNPChromosome17(ServiceSNPChromosome17 servicesnpchromosome17) {
        this.servicesnpchromosome17 = servicesnpchromosome17;
    }
    protected void setServiceSNPChromosome18(ServiceSNPChromosome18 servicesnpchromosome18) {
        this.servicesnpchromosome18 = servicesnpchromosome18;
    }
    protected void setServiceSNPChromosome19(ServiceSNPChromosome19 servicesnpchromosome19) {
        this.servicesnpchromosome19 = servicesnpchromosome19;
    }
    protected void setServiceSNPChromosome20(ServiceSNPChromosome20 servicesnpchromosome20) {
        this.servicesnpchromosome20 = servicesnpchromosome20;
    }
    protected void setServiceSNPChromosome21(ServiceSNPChromosome21 servicesnpchromosome21) {
        this.servicesnpchromosome21 = servicesnpchromosome21;
    }
    protected void setServiceSNPChromosome22(ServiceSNPChromosome22 servicesnpchromosome22) {
        this.servicesnpchromosome22 = servicesnpchromosome22;
    }
    protected void setServiceSNPChromosome23(ServiceSNPChromosome23 servicesnpchromosome23) {
        this.servicesnpchromosome23 = servicesnpchromosome23;
    }
    protected void setServiceSNPChromosome24(ServiceSNPChromosome24 servicesnpchromosome24) {
        this.servicesnpchromosome24 = servicesnpchromosome24;
    }
    protected void setServiceSNPChromosome25(ServiceSNPChromosome25 servicesnpchromosome25) {
        this.servicesnpchromosome25 = servicesnpchromosome25;
    }
    protected void setServiceSNPChromosome26(ServiceSNPChromosome26 servicesnpchromosome26) {
        this.servicesnpchromosome26 = servicesnpchromosome26;
    }
    protected void setServiceSNPChromosome27(ServiceSNPChromosome27 servicesnpchromosome27) {
        this.servicesnpchromosome27 = servicesnpchromosome27;
    }
    protected void setServiceSNPChromosome28(ServiceSNPChromosome28 servicesnpchromosome28) {
        this.servicesnpchromosome28 = servicesnpchromosome28;
    }
    protected void setServiceSNPChromosome32(ServiceSNPChromosome32 servicesnpchromosome32) {
        this.servicesnpchromosome32 = servicesnpchromosome32;
    }
    protected void setServiceSNPChromosomeW(ServiceSNPChromosomeW servicesnpchromosomeW) {
        this.servicesnpchromosomeW = servicesnpchromosomeW;
    }
    protected void setServiceSNPChromosomeZ(ServiceSNPChromosomeZ servicesnpchromosomeZ) {
        this.servicesnpchromosomeZ = servicesnpchromosomeZ;
    }
    protected void setServiceSNPChromosomeLGE64(ServiceSNPChromosomeLGE64 servicesnpchromosomeLGE64) {
        this.servicesnpchromosomeLGE64 = servicesnpchromosomeLGE64;
    }
    protected void setServiceSNPChromosomeLGE22C19W28_E50C23(ServiceSNPChromosomeLGE22C19W28_E50C23 servicesnpchromosomeLGE22C19W28_E50C23) {
        this.servicesnpchromosomeLGE22C19W28_E50C23 = servicesnpchromosomeLGE22C19W28_E50C23;
    }

}
