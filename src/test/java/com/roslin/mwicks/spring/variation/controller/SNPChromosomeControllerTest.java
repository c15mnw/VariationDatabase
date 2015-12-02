package com.roslin.mwicks.spring.variation.controller;

import com.roslin.mwicks.spring.variation.dto.DTODownload;
import com.roslin.mwicks.spring.variation.dto.DTOSearch;
import com.roslin.mwicks.spring.variation.dto.DownloadFormat;
import com.roslin.mwicks.spring.variation.dto.DownloadHeaders;
import com.roslin.mwicks.spring.variation.dto.DownloadQuotes;
import com.roslin.mwicks.spring.variation.dto.SearchChromosome;
import com.roslin.mwicks.spring.variation.dto.SearchReference;
import com.roslin.mwicks.spring.variation.dto.SearchAlternative;

import com.roslin.mwicks.spring.variation.model.other.CSVResponse;
import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosome;

import com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome.ServiceSNPChromosome;

import org.junit.Test;

import org.springframework.data.domain.Page;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import java.io.IOException;
import java.util.*;

import static junit.framework.Assert.*;

import static org.mockito.Mockito.*;

/**
 * @author Petri Kainulainen
 */
public class SNPChromosomeControllerTest extends AbstractTestController {

	protected static final int SEARCH_1_PAGE_INDEX = 1;
	protected static final String SEARCH_1_GENE_NAME = "ENSGALT00000012809";
	protected static final SearchChromosome SEARCH_1_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_3;
	protected static final String SEARCH_1_START = "854515";
	protected static final String SEARCH_1_END = "902472";
	protected static final String SEARCH_1_UPSTREAM = "855515";
	protected static final String SEARCH_1_DOWNSTREAM = "901472";
	protected static final SearchReference SEARCH_1_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative SEARCH_1_ALTERNATIVE = SearchAlternative.STRAIN_6;
	
	protected static final SearchChromosome SEARCH_2_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_3;
	protected static final String SEARCH_2_START = "855515";
	protected static final String SEARCH_2_END = "901472";
	protected static final String SEARCH_2_UPSTREAM = "0";
	protected static final String SEARCH_2_DOWNSTREAM = "0";
	protected static final SearchReference SEARCH_2_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative SEARCH_2_ALTERNATIVE = SearchAlternative.STRAIN_6;
	protected static final DownloadFormat SEARCH_2_FORMAT = DownloadFormat.FORMAT_TSV;
	protected static final DownloadQuotes SEARCH_2_QUOTES = DownloadQuotes.QUOTES_NO;
	protected static final DownloadHeaders SEARCH_2_HEADERS = DownloadHeaders.HEADERS_YES;
    
    
    private ControllerSNPChromosome controller;
    
    private ServiceSNPChromosome serviceSNPChromosomeMock;

    
    @Override
    public void setUpTest() {
    
    	controller = new ControllerSNPChromosome();

        controller.setMessageSource(getMessageSourceMock());

        serviceSNPChromosomeMock = mock(ServiceSNPChromosome.class);
        
        controller.setServiceSNPChromosome(serviceSNPChromosomeMock);
    }
    
    
    @Test
    public void search() {
    	
        DTOSearch dtoSearch = createSearchCriteria(
        		SEARCH_1_PAGE_INDEX,
        		SEARCH_1_GENE_NAME,
        		SEARCH_1_DOWNSTREAM,
        		SEARCH_1_UPSTREAM,
        		SEARCH_1_START,
        		SEARCH_1_END,
        		SEARCH_1_REFERENCE,
        		SEARCH_1_ALTERNATIVE,
        		SEARCH_1_CHROMOSOME_ID
        		);
        
        Page<SNPChromosome> expected = null;
        
        when(serviceSNPChromosomeMock.search(dtoSearch, SEARCH_1_PAGE_INDEX)).thenReturn(expected);
        
        BindingAwareModelMap model = new BindingAwareModelMap();
        RedirectAttributes attributes = new RedirectAttributesModelMap();

        String view = controller.search(dtoSearch, model, attributes);
        
        verify(serviceSNPChromosomeMock, times(1)).search(dtoSearch, SEARCH_1_PAGE_INDEX);
        
        verifyNoMoreInteractions(serviceSNPChromosomeMock);
        
        assertEquals(ControllerSNPChromosome.SNPCHROMOSOME_SEARCH_RESULT_VIEW, view);
        
        Page<SNPChromosome> actual = (Page<SNPChromosome>) model.asMap().get(ControllerSNPChromosome.MODEL_ATTRIBUTE_SNPCHROMOSOMES);
        
        assertEquals(expected, actual);
    }
    
    
	@Test
    public void download() throws IOException {
    	
        DTODownload downloadCriteria = createDownloadCriteria(
        		SEARCH_2_DOWNSTREAM,
        		SEARCH_2_UPSTREAM,
        		SEARCH_2_START,
        		SEARCH_2_END,
        		SEARCH_2_REFERENCE,
        		SEARCH_2_ALTERNATIVE,
        		SEARCH_2_FORMAT,
        		SEARCH_2_QUOTES,
        		SEARCH_2_HEADERS,
        		SEARCH_2_CHROMOSOME_ID
        		);
        
        List<SNPChromosome> expected = null;
        
        when(serviceSNPChromosomeMock.download(downloadCriteria)).thenReturn(expected);
        
        CSVResponse csvResponse = controller.download(downloadCriteria);
        
        verify(serviceSNPChromosomeMock, times(1)).download(downloadCriteria);
        
        verifyNoMoreInteractions(serviceSNPChromosomeMock);
        
        List<SNPChromosome> actual = csvResponse;
        
        assertEquals(expected, actual);
    }

    
    private DTOSearch createSearchCriteria(
    		int pageIndex,
    		String searchGeneName, 
    		String searchDownStream, 
    		String searchUpStream, 
    		String searchLowRange, 
    		String searchHighRange, 
            SearchReference searchReference,
            SearchAlternative searchAlternative,
            SearchChromosome searchChromosome
            ) {
    	
        DTOSearch dtoSearch = new DTOSearch();
        
        dtoSearch.setPageIndex(pageIndex);
        dtoSearch.setSearchGeneName(searchGeneName);
        dtoSearch.setSearchDownStream(searchDownStream);
        dtoSearch.setSearchUpStream(searchUpStream);
        dtoSearch.setSearchLowRange(searchLowRange);
        dtoSearch.setSearchHighRange(searchHighRange);
        dtoSearch.setSearchReference(searchReference);
        dtoSearch.setSearchAlternative(searchAlternative);
        dtoSearch.setSearchChromosome(searchChromosome);  
        
        return dtoSearch;
    }

    
    private DTODownload createDownloadCriteria(
    		String searchDownStream, 
    		String searchUpStream, 
    		String searchLowRange, 
    		String searchHighRange, 
            SearchReference searchReference,
            SearchAlternative searchAlternative,
            DownloadFormat downloadFormat,
            DownloadQuotes downloadQuotes,
            DownloadHeaders downloadHeaders, 
            SearchChromosome searchChromosome
            ) {
    	
        DTODownload dtoDownload = new DTODownload();
        
        dtoDownload.setDownloadDownStream(searchDownStream);
        dtoDownload.setDownloadUpStream(searchUpStream);
        dtoDownload.setDownloadLowRange(searchLowRange);
        dtoDownload.setDownloadHighRange(searchHighRange);
        dtoDownload.setDownloadReference(searchReference);
        dtoDownload.setDownloadAlternative(searchAlternative);
        dtoDownload.setDownloadFormat(downloadFormat);
        dtoDownload.setDownloadQuotes(downloadQuotes);
        dtoDownload.setDownloadHeaders(downloadHeaders);
        dtoDownload.setDownloadChromosome(searchChromosome);  
        
        return dtoDownload;
    }

}
