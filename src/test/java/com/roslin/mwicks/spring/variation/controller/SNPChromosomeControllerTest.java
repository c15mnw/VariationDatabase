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
import com.roslin.mwicks.spring.variation.model.other.PageSNPChromosome;
import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosome;

import com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome.ServiceSNPChromosome01;
import com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome.ServiceSNPChromosome03;
import com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome.ServiceSNPChromosome04;
import com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome.ServiceSNPChromosome05;
import com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome.ServiceSNPChromosome06;
import com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome.ServiceSNPChromosome07;
import com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome.ServiceSNPChromosome08;
import com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome.ServiceSNPChromosome09;
import com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome.ServiceSNPChromosome10;
import com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome.ServiceSNPChromosome11;
import com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome.ServiceSNPChromosome12;
import com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome.ServiceSNPChromosome13;
import com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome.ServiceSNPChromosome14;
import com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome.ServiceSNPChromosome15;
import com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome.ServiceSNPChromosome16;
import com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome.ServiceSNPChromosome17;
import com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome.ServiceSNPChromosome18;
import com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome.ServiceSNPChromosome19;
import com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome.ServiceSNPChromosome20;
import com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome.ServiceSNPChromosome21;
import com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome.ServiceSNPChromosome22;
import com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome.ServiceSNPChromosome23;
import com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome.ServiceSNPChromosome24;
import com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome.ServiceSNPChromosome25;
import com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome.ServiceSNPChromosome26;
import com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome.ServiceSNPChromosome27;
import com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome.ServiceSNPChromosome28;
import com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome.ServiceSNPChromosome32;
import com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome.ServiceSNPChromosomeW;
import com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome.ServiceSNPChromosomeZ;
import com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome.ServiceSNPChromosomeLGE64;
import com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome.ServiceSNPChromosomeLGE22C19W28_E50C23;

import org.junit.Test;

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
	protected static final String SEARCH_1_GENE_NAME = "";
	protected static final SearchChromosome SEARCH_1_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_1;
	protected static final String SEARCH_1_START = "854515";
	protected static final String SEARCH_1_END = "902472";
	protected static final String SEARCH_1_UPSTREAM = "0";
	protected static final String SEARCH_1_DOWNSTREAM = "0";
	protected static final SearchReference SEARCH_1_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative SEARCH_1_ALTERNATIVE = SearchAlternative.STRAIN_6;
	
	protected static final SearchChromosome DOWNLOAD_1_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_1;
	protected static final String DOWNLOAD_1_START = "855515";
	protected static final String DOWNLOAD_1_END = "901472";
	protected static final String DOWNLOAD_1_UPSTREAM = "0";
	protected static final String DOWNLOAD_1_DOWNSTREAM = "0";
	protected static final SearchReference DOWNLOAD_1_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative DOWNLOAD_1_ALTERNATIVE = SearchAlternative.STRAIN_6;
	protected static final DownloadFormat DOWNLOAD_1_FORMAT = DownloadFormat.FORMAT_TSV;
	protected static final DownloadQuotes DOWNLOAD_1_QUOTES = DownloadQuotes.QUOTES_NO;
	protected static final DownloadHeaders DOWNLOAD_1_HEADERS = DownloadHeaders.HEADERS_YES;

	protected static final int SEARCH_3_PAGE_INDEX = 1;
	protected static final String SEARCH_3_GENE_NAME = "";
	protected static final SearchChromosome SEARCH_3_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_3;
	protected static final String SEARCH_3_START = "854515";
	protected static final String SEARCH_3_END = "902472";
	protected static final String SEARCH_3_UPSTREAM = "0";
	protected static final String SEARCH_3_DOWNSTREAM = "0";
	protected static final SearchReference SEARCH_3_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative SEARCH_3_ALTERNATIVE = SearchAlternative.STRAIN_6;
	
	protected static final SearchChromosome DOWNLOAD_3_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_3;
	protected static final String DOWNLOAD_3_START = "855515";
	protected static final String DOWNLOAD_3_END = "901472";
	protected static final String DOWNLOAD_3_UPSTREAM = "0";
	protected static final String DOWNLOAD_3_DOWNSTREAM = "0";
	protected static final SearchReference DOWNLOAD_3_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative DOWNLOAD_3_ALTERNATIVE = SearchAlternative.STRAIN_6;
	protected static final DownloadFormat DOWNLOAD_3_FORMAT = DownloadFormat.FORMAT_TSV;
	protected static final DownloadQuotes DOWNLOAD_3_QUOTES = DownloadQuotes.QUOTES_NO;
	protected static final DownloadHeaders DOWNLOAD_3_HEADERS = DownloadHeaders.HEADERS_YES;
    
	protected static final int SEARCH_4_PAGE_INDEX = 1;
	protected static final String SEARCH_4_GENE_NAME = "";
	protected static final SearchChromosome SEARCH_4_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_4;
	protected static final String SEARCH_4_START = "854515";
	protected static final String SEARCH_4_END = "902472";
	protected static final String SEARCH_4_UPSTREAM = "0";
	protected static final String SEARCH_4_DOWNSTREAM = "0";
	protected static final SearchReference SEARCH_4_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative SEARCH_4_ALTERNATIVE = SearchAlternative.STRAIN_6;
	
	protected static final SearchChromosome DOWNLOAD_4_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_4;
	protected static final String DOWNLOAD_4_START = "855515";
	protected static final String DOWNLOAD_4_END = "901472";
	protected static final String DOWNLOAD_4_UPSTREAM = "0";
	protected static final String DOWNLOAD_4_DOWNSTREAM = "0";
	protected static final SearchReference DOWNLOAD_4_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative DOWNLOAD_4_ALTERNATIVE = SearchAlternative.STRAIN_6;
	protected static final DownloadFormat DOWNLOAD_4_FORMAT = DownloadFormat.FORMAT_TSV;
	protected static final DownloadQuotes DOWNLOAD_4_QUOTES = DownloadQuotes.QUOTES_NO;
	protected static final DownloadHeaders DOWNLOAD_4_HEADERS = DownloadHeaders.HEADERS_YES;

	protected static final int SEARCH_5_PAGE_INDEX = 1;
	protected static final String SEARCH_5_GENE_NAME = "";
	protected static final SearchChromosome SEARCH_5_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_5;
	protected static final String SEARCH_5_START = "854515";
	protected static final String SEARCH_5_END = "902472";
	protected static final String SEARCH_5_UPSTREAM = "0";
	protected static final String SEARCH_5_DOWNSTREAM = "0";
	protected static final SearchReference SEARCH_5_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative SEARCH_5_ALTERNATIVE = SearchAlternative.STRAIN_6;
	
	protected static final SearchChromosome DOWNLOAD_5_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_5;
	protected static final String DOWNLOAD_5_START = "855515";
	protected static final String DOWNLOAD_5_END = "901472";
	protected static final String DOWNLOAD_5_UPSTREAM = "0";
	protected static final String DOWNLOAD_5_DOWNSTREAM = "0";
	protected static final SearchReference DOWNLOAD_5_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative DOWNLOAD_5_ALTERNATIVE = SearchAlternative.STRAIN_6;
	protected static final DownloadFormat DOWNLOAD_5_FORMAT = DownloadFormat.FORMAT_TSV;
	protected static final DownloadQuotes DOWNLOAD_5_QUOTES = DownloadQuotes.QUOTES_NO;
	protected static final DownloadHeaders DOWNLOAD_5_HEADERS = DownloadHeaders.HEADERS_YES;

	protected static final int SEARCH_6_PAGE_INDEX = 1;
	protected static final String SEARCH_6_GENE_NAME = "";
	protected static final SearchChromosome SEARCH_6_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_6;
	protected static final String SEARCH_6_START = "854515";
	protected static final String SEARCH_6_END = "902472";
	protected static final String SEARCH_6_UPSTREAM = "0";
	protected static final String SEARCH_6_DOWNSTREAM = "0";
	protected static final SearchReference SEARCH_6_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative SEARCH_6_ALTERNATIVE = SearchAlternative.STRAIN_6;
	
	protected static final SearchChromosome DOWNLOAD_6_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_6;
	protected static final String DOWNLOAD_6_START = "855515";
	protected static final String DOWNLOAD_6_END = "901472";
	protected static final String DOWNLOAD_6_UPSTREAM = "0";
	protected static final String DOWNLOAD_6_DOWNSTREAM = "0";
	protected static final SearchReference DOWNLOAD_6_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative DOWNLOAD_6_ALTERNATIVE = SearchAlternative.STRAIN_6;
	protected static final DownloadFormat DOWNLOAD_6_FORMAT = DownloadFormat.FORMAT_TSV;
	protected static final DownloadQuotes DOWNLOAD_6_QUOTES = DownloadQuotes.QUOTES_NO;
	protected static final DownloadHeaders DOWNLOAD_6_HEADERS = DownloadHeaders.HEADERS_YES;

	protected static final int SEARCH_7_PAGE_INDEX = 1;
	protected static final String SEARCH_7_GENE_NAME = "";
	protected static final SearchChromosome SEARCH_7_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_7;
	protected static final String SEARCH_7_START = "854515";
	protected static final String SEARCH_7_END = "902472";
	protected static final String SEARCH_7_UPSTREAM = "0";
	protected static final String SEARCH_7_DOWNSTREAM = "0";
	protected static final SearchReference SEARCH_7_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative SEARCH_7_ALTERNATIVE = SearchAlternative.STRAIN_6;
	
	protected static final SearchChromosome DOWNLOAD_7_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_7;
	protected static final String DOWNLOAD_7_START = "855515";
	protected static final String DOWNLOAD_7_END = "901472";
	protected static final String DOWNLOAD_7_UPSTREAM = "0";
	protected static final String DOWNLOAD_7_DOWNSTREAM = "0";
	protected static final SearchReference DOWNLOAD_7_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative DOWNLOAD_7_ALTERNATIVE = SearchAlternative.STRAIN_6;
	protected static final DownloadFormat DOWNLOAD_7_FORMAT = DownloadFormat.FORMAT_TSV;
	protected static final DownloadQuotes DOWNLOAD_7_QUOTES = DownloadQuotes.QUOTES_NO;
	protected static final DownloadHeaders DOWNLOAD_7_HEADERS = DownloadHeaders.HEADERS_YES;

	protected static final int SEARCH_8_PAGE_INDEX = 1;
	protected static final String SEARCH_8_GENE_NAME = "";
	protected static final SearchChromosome SEARCH_8_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_8;
	protected static final String SEARCH_8_START = "854515";
	protected static final String SEARCH_8_END = "902472";
	protected static final String SEARCH_8_UPSTREAM = "0";
	protected static final String SEARCH_8_DOWNSTREAM = "0";
	protected static final SearchReference SEARCH_8_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative SEARCH_8_ALTERNATIVE = SearchAlternative.STRAIN_6;
	
	protected static final SearchChromosome DOWNLOAD_8_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_8;
	protected static final String DOWNLOAD_8_START = "855515";
	protected static final String DOWNLOAD_8_END = "901472";
	protected static final String DOWNLOAD_8_UPSTREAM = "0";
	protected static final String DOWNLOAD_8_DOWNSTREAM = "0";
	protected static final SearchReference DOWNLOAD_8_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative DOWNLOAD_8_ALTERNATIVE = SearchAlternative.STRAIN_6;
	protected static final DownloadFormat DOWNLOAD_8_FORMAT = DownloadFormat.FORMAT_TSV;
	protected static final DownloadQuotes DOWNLOAD_8_QUOTES = DownloadQuotes.QUOTES_NO;
	protected static final DownloadHeaders DOWNLOAD_8_HEADERS = DownloadHeaders.HEADERS_YES;

	protected static final int SEARCH_9_PAGE_INDEX = 1;
	protected static final String SEARCH_9_GENE_NAME = "";
	protected static final SearchChromosome SEARCH_9_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_9;
	protected static final String SEARCH_9_START = "854515";
	protected static final String SEARCH_9_END = "902472";
	protected static final String SEARCH_9_UPSTREAM = "0";
	protected static final String SEARCH_9_DOWNSTREAM = "0";
	protected static final SearchReference SEARCH_9_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative SEARCH_9_ALTERNATIVE = SearchAlternative.STRAIN_6;
	
	protected static final SearchChromosome DOWNLOAD_9_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_9;
	protected static final String DOWNLOAD_9_START = "855515";
	protected static final String DOWNLOAD_9_END = "901472";
	protected static final String DOWNLOAD_9_UPSTREAM = "0";
	protected static final String DOWNLOAD_9_DOWNSTREAM = "0";
	protected static final SearchReference DOWNLOAD_9_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative DOWNLOAD_9_ALTERNATIVE = SearchAlternative.STRAIN_6;
	protected static final DownloadFormat DOWNLOAD_9_FORMAT = DownloadFormat.FORMAT_TSV;
	protected static final DownloadQuotes DOWNLOAD_9_QUOTES = DownloadQuotes.QUOTES_NO;
	protected static final DownloadHeaders DOWNLOAD_9_HEADERS = DownloadHeaders.HEADERS_YES;

	protected static final int SEARCH_10_PAGE_INDEX = 1;
	protected static final String SEARCH_10_GENE_NAME = "";
	protected static final SearchChromosome SEARCH_10_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_10;
	protected static final String SEARCH_10_START = "854515";
	protected static final String SEARCH_10_END = "902472";
	protected static final String SEARCH_10_UPSTREAM = "0";
	protected static final String SEARCH_10_DOWNSTREAM = "0";
	protected static final SearchReference SEARCH_10_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative SEARCH_10_ALTERNATIVE = SearchAlternative.STRAIN_6;
	
	protected static final SearchChromosome DOWNLOAD_10_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_10;
	protected static final String DOWNLOAD_10_START = "855515";
	protected static final String DOWNLOAD_10_END = "901472";
	protected static final String DOWNLOAD_10_UPSTREAM = "0";
	protected static final String DOWNLOAD_10_DOWNSTREAM = "0";
	protected static final SearchReference DOWNLOAD_10_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative DOWNLOAD_10_ALTERNATIVE = SearchAlternative.STRAIN_6;
	protected static final DownloadFormat DOWNLOAD_10_FORMAT = DownloadFormat.FORMAT_TSV;
	protected static final DownloadQuotes DOWNLOAD_10_QUOTES = DownloadQuotes.QUOTES_NO;
	protected static final DownloadHeaders DOWNLOAD_10_HEADERS = DownloadHeaders.HEADERS_YES;

	protected static final int SEARCH_11_PAGE_INDEX = 1;
	protected static final String SEARCH_11_GENE_NAME = "";
	protected static final SearchChromosome SEARCH_11_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_11;
	protected static final String SEARCH_11_START = "854515";
	protected static final String SEARCH_11_END = "902472";
	protected static final String SEARCH_11_UPSTREAM = "0";
	protected static final String SEARCH_11_DOWNSTREAM = "0";
	protected static final SearchReference SEARCH_11_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative SEARCH_11_ALTERNATIVE = SearchAlternative.STRAIN_6;
	
	protected static final SearchChromosome DOWNLOAD_11_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_11;
	protected static final String DOWNLOAD_11_START = "855515";
	protected static final String DOWNLOAD_11_END = "901472";
	protected static final String DOWNLOAD_11_UPSTREAM = "0";
	protected static final String DOWNLOAD_11_DOWNSTREAM = "0";
	protected static final SearchReference DOWNLOAD_11_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative DOWNLOAD_11_ALTERNATIVE = SearchAlternative.STRAIN_6;
	protected static final DownloadFormat DOWNLOAD_11_FORMAT = DownloadFormat.FORMAT_TSV;
	protected static final DownloadQuotes DOWNLOAD_11_QUOTES = DownloadQuotes.QUOTES_NO;
	protected static final DownloadHeaders DOWNLOAD_11_HEADERS = DownloadHeaders.HEADERS_YES;

	protected static final int SEARCH_12_PAGE_INDEX = 1;
	protected static final String SEARCH_12_GENE_NAME = "";
	protected static final SearchChromosome SEARCH_12_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_12;
	protected static final String SEARCH_12_START = "854515";
	protected static final String SEARCH_12_END = "902472";
	protected static final String SEARCH_12_UPSTREAM = "0";
	protected static final String SEARCH_12_DOWNSTREAM = "0";
	protected static final SearchReference SEARCH_12_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative SEARCH_12_ALTERNATIVE = SearchAlternative.STRAIN_6;
	
	protected static final SearchChromosome DOWNLOAD_12_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_12;
	protected static final String DOWNLOAD_12_START = "855515";
	protected static final String DOWNLOAD_12_END = "901472";
	protected static final String DOWNLOAD_12_UPSTREAM = "0";
	protected static final String DOWNLOAD_12_DOWNSTREAM = "0";
	protected static final SearchReference DOWNLOAD_12_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative DOWNLOAD_12_ALTERNATIVE = SearchAlternative.STRAIN_6;
	protected static final DownloadFormat DOWNLOAD_12_FORMAT = DownloadFormat.FORMAT_TSV;
	protected static final DownloadQuotes DOWNLOAD_12_QUOTES = DownloadQuotes.QUOTES_NO;
	protected static final DownloadHeaders DOWNLOAD_12_HEADERS = DownloadHeaders.HEADERS_YES;

	protected static final int SEARCH_13_PAGE_INDEX = 1;
	protected static final String SEARCH_13_GENE_NAME = "";
	protected static final SearchChromosome SEARCH_13_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_13;
	protected static final String SEARCH_13_START = "854515";
	protected static final String SEARCH_13_END = "902472";
	protected static final String SEARCH_13_UPSTREAM = "0";
	protected static final String SEARCH_13_DOWNSTREAM = "0";
	protected static final SearchReference SEARCH_13_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative SEARCH_13_ALTERNATIVE = SearchAlternative.STRAIN_6;
	
	protected static final SearchChromosome DOWNLOAD_13_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_13;
	protected static final String DOWNLOAD_13_START = "855515";
	protected static final String DOWNLOAD_13_END = "901472";
	protected static final String DOWNLOAD_13_UPSTREAM = "0";
	protected static final String DOWNLOAD_13_DOWNSTREAM = "0";
	protected static final SearchReference DOWNLOAD_13_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative DOWNLOAD_13_ALTERNATIVE = SearchAlternative.STRAIN_6;
	protected static final DownloadFormat DOWNLOAD_13_FORMAT = DownloadFormat.FORMAT_TSV;
	protected static final DownloadQuotes DOWNLOAD_13_QUOTES = DownloadQuotes.QUOTES_NO;
	protected static final DownloadHeaders DOWNLOAD_13_HEADERS = DownloadHeaders.HEADERS_YES;
    
	protected static final int SEARCH_14_PAGE_INDEX = 1;
	protected static final String SEARCH_14_GENE_NAME = "";
	protected static final SearchChromosome SEARCH_14_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_14;
	protected static final String SEARCH_14_START = "854515";
	protected static final String SEARCH_14_END = "902472";
	protected static final String SEARCH_14_UPSTREAM = "0";
	protected static final String SEARCH_14_DOWNSTREAM = "0";
	protected static final SearchReference SEARCH_14_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative SEARCH_14_ALTERNATIVE = SearchAlternative.STRAIN_6;
	
	protected static final SearchChromosome DOWNLOAD_14_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_14;
	protected static final String DOWNLOAD_14_START = "855515";
	protected static final String DOWNLOAD_14_END = "901472";
	protected static final String DOWNLOAD_14_UPSTREAM = "0";
	protected static final String DOWNLOAD_14_DOWNSTREAM = "0";
	protected static final SearchReference DOWNLOAD_14_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative DOWNLOAD_14_ALTERNATIVE = SearchAlternative.STRAIN_6;
	protected static final DownloadFormat DOWNLOAD_14_FORMAT = DownloadFormat.FORMAT_TSV;
	protected static final DownloadQuotes DOWNLOAD_14_QUOTES = DownloadQuotes.QUOTES_NO;
	protected static final DownloadHeaders DOWNLOAD_14_HEADERS = DownloadHeaders.HEADERS_YES;

	protected static final int SEARCH_15_PAGE_INDEX = 1;
	protected static final String SEARCH_15_GENE_NAME = "";
	protected static final SearchChromosome SEARCH_15_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_15;
	protected static final String SEARCH_15_START = "854515";
	protected static final String SEARCH_15_END = "902472";
	protected static final String SEARCH_15_UPSTREAM = "0";
	protected static final String SEARCH_15_DOWNSTREAM = "0";
	protected static final SearchReference SEARCH_15_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative SEARCH_15_ALTERNATIVE = SearchAlternative.STRAIN_6;
	
	protected static final SearchChromosome DOWNLOAD_15_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_15;
	protected static final String DOWNLOAD_15_START = "855515";
	protected static final String DOWNLOAD_15_END = "901472";
	protected static final String DOWNLOAD_15_UPSTREAM = "0";
	protected static final String DOWNLOAD_15_DOWNSTREAM = "0";
	protected static final SearchReference DOWNLOAD_15_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative DOWNLOAD_15_ALTERNATIVE = SearchAlternative.STRAIN_6;
	protected static final DownloadFormat DOWNLOAD_15_FORMAT = DownloadFormat.FORMAT_TSV;
	protected static final DownloadQuotes DOWNLOAD_15_QUOTES = DownloadQuotes.QUOTES_NO;
	protected static final DownloadHeaders DOWNLOAD_15_HEADERS = DownloadHeaders.HEADERS_YES;

	protected static final int SEARCH_16_PAGE_INDEX = 1;
	protected static final String SEARCH_16_GENE_NAME = "";
	protected static final SearchChromosome SEARCH_16_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_16;
	protected static final String SEARCH_16_START = "854515";
	protected static final String SEARCH_16_END = "902472";
	protected static final String SEARCH_16_UPSTREAM = "0";
	protected static final String SEARCH_16_DOWNSTREAM = "0";
	protected static final SearchReference SEARCH_16_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative SEARCH_16_ALTERNATIVE = SearchAlternative.STRAIN_6;
	
	protected static final SearchChromosome DOWNLOAD_16_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_16;
	protected static final String DOWNLOAD_16_START = "855515";
	protected static final String DOWNLOAD_16_END = "901472";
	protected static final String DOWNLOAD_16_UPSTREAM = "0";
	protected static final String DOWNLOAD_16_DOWNSTREAM = "0";
	protected static final SearchReference DOWNLOAD_16_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative DOWNLOAD_16_ALTERNATIVE = SearchAlternative.STRAIN_6;
	protected static final DownloadFormat DOWNLOAD_16_FORMAT = DownloadFormat.FORMAT_TSV;
	protected static final DownloadQuotes DOWNLOAD_16_QUOTES = DownloadQuotes.QUOTES_NO;
	protected static final DownloadHeaders DOWNLOAD_16_HEADERS = DownloadHeaders.HEADERS_YES;

	protected static final int SEARCH_17_PAGE_INDEX = 1;
	protected static final String SEARCH_17_GENE_NAME = "";
	protected static final SearchChromosome SEARCH_17_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_17;
	protected static final String SEARCH_17_START = "854515";
	protected static final String SEARCH_17_END = "902472";
	protected static final String SEARCH_17_UPSTREAM = "0";
	protected static final String SEARCH_17_DOWNSTREAM = "0";
	protected static final SearchReference SEARCH_17_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative SEARCH_17_ALTERNATIVE = SearchAlternative.STRAIN_6;
	
	protected static final SearchChromosome DOWNLOAD_17_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_17;
	protected static final String DOWNLOAD_17_START = "855515";
	protected static final String DOWNLOAD_17_END = "901472";
	protected static final String DOWNLOAD_17_UPSTREAM = "0";
	protected static final String DOWNLOAD_17_DOWNSTREAM = "0";
	protected static final SearchReference DOWNLOAD_17_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative DOWNLOAD_17_ALTERNATIVE = SearchAlternative.STRAIN_6;
	protected static final DownloadFormat DOWNLOAD_17_FORMAT = DownloadFormat.FORMAT_TSV;
	protected static final DownloadQuotes DOWNLOAD_17_QUOTES = DownloadQuotes.QUOTES_NO;
	protected static final DownloadHeaders DOWNLOAD_17_HEADERS = DownloadHeaders.HEADERS_YES;

	protected static final int SEARCH_18_PAGE_INDEX = 1;
	protected static final String SEARCH_18_GENE_NAME = "";
	protected static final SearchChromosome SEARCH_18_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_18;
	protected static final String SEARCH_18_START = "854515";
	protected static final String SEARCH_18_END = "902472";
	protected static final String SEARCH_18_UPSTREAM = "0";
	protected static final String SEARCH_18_DOWNSTREAM = "0";
	protected static final SearchReference SEARCH_18_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative SEARCH_18_ALTERNATIVE = SearchAlternative.STRAIN_6;
	
	protected static final SearchChromosome DOWNLOAD_18_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_18;
	protected static final String DOWNLOAD_18_START = "855515";
	protected static final String DOWNLOAD_18_END = "901472";
	protected static final String DOWNLOAD_18_UPSTREAM = "0";
	protected static final String DOWNLOAD_18_DOWNSTREAM = "0";
	protected static final SearchReference DOWNLOAD_18_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative DOWNLOAD_18_ALTERNATIVE = SearchAlternative.STRAIN_6;
	protected static final DownloadFormat DOWNLOAD_18_FORMAT = DownloadFormat.FORMAT_TSV;
	protected static final DownloadQuotes DOWNLOAD_18_QUOTES = DownloadQuotes.QUOTES_NO;
	protected static final DownloadHeaders DOWNLOAD_18_HEADERS = DownloadHeaders.HEADERS_YES;

	protected static final int SEARCH_19_PAGE_INDEX = 1;
	protected static final String SEARCH_19_GENE_NAME = "";
	protected static final SearchChromosome SEARCH_19_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_19;
	protected static final String SEARCH_19_START = "854515";
	protected static final String SEARCH_19_END = "902472";
	protected static final String SEARCH_19_UPSTREAM = "0";
	protected static final String SEARCH_19_DOWNSTREAM = "0";
	protected static final SearchReference SEARCH_19_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative SEARCH_19_ALTERNATIVE = SearchAlternative.STRAIN_6;
	
	protected static final SearchChromosome DOWNLOAD_19_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_19;
	protected static final String DOWNLOAD_19_START = "855515";
	protected static final String DOWNLOAD_19_END = "901472";
	protected static final String DOWNLOAD_19_UPSTREAM = "0";
	protected static final String DOWNLOAD_19_DOWNSTREAM = "0";
	protected static final SearchReference DOWNLOAD_19_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative DOWNLOAD_19_ALTERNATIVE = SearchAlternative.STRAIN_6;
	protected static final DownloadFormat DOWNLOAD_19_FORMAT = DownloadFormat.FORMAT_TSV;
	protected static final DownloadQuotes DOWNLOAD_19_QUOTES = DownloadQuotes.QUOTES_NO;
	protected static final DownloadHeaders DOWNLOAD_19_HEADERS = DownloadHeaders.HEADERS_YES;

	protected static final int SEARCH_20_PAGE_INDEX = 1;
	protected static final String SEARCH_20_GENE_NAME = "";
	protected static final SearchChromosome SEARCH_20_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_20;
	protected static final String SEARCH_20_START = "854515";
	protected static final String SEARCH_20_END = "902472";
	protected static final String SEARCH_20_UPSTREAM = "0";
	protected static final String SEARCH_20_DOWNSTREAM = "0";
	protected static final SearchReference SEARCH_20_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative SEARCH_20_ALTERNATIVE = SearchAlternative.STRAIN_6;
	
	protected static final SearchChromosome DOWNLOAD_20_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_20;
	protected static final String DOWNLOAD_20_START = "855515";
	protected static final String DOWNLOAD_20_END = "901472";
	protected static final String DOWNLOAD_20_UPSTREAM = "0";
	protected static final String DOWNLOAD_20_DOWNSTREAM = "0";
	protected static final SearchReference DOWNLOAD_20_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative DOWNLOAD_20_ALTERNATIVE = SearchAlternative.STRAIN_6;
	protected static final DownloadFormat DOWNLOAD_20_FORMAT = DownloadFormat.FORMAT_TSV;
	protected static final DownloadQuotes DOWNLOAD_20_QUOTES = DownloadQuotes.QUOTES_NO;
	protected static final DownloadHeaders DOWNLOAD_20_HEADERS = DownloadHeaders.HEADERS_YES;

	protected static final int SEARCH_21_PAGE_INDEX = 1;
	protected static final String SEARCH_21_GENE_NAME = "";
	protected static final SearchChromosome SEARCH_21_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_21;
	protected static final String SEARCH_21_START = "854515";
	protected static final String SEARCH_21_END = "902472";
	protected static final String SEARCH_21_UPSTREAM = "0";
	protected static final String SEARCH_21_DOWNSTREAM = "0";
	protected static final SearchReference SEARCH_21_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative SEARCH_21_ALTERNATIVE = SearchAlternative.STRAIN_6;
	
	protected static final SearchChromosome DOWNLOAD_21_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_21;
	protected static final String DOWNLOAD_21_START = "855515";
	protected static final String DOWNLOAD_21_END = "901472";
	protected static final String DOWNLOAD_21_UPSTREAM = "0";
	protected static final String DOWNLOAD_21_DOWNSTREAM = "0";
	protected static final SearchReference DOWNLOAD_21_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative DOWNLOAD_21_ALTERNATIVE = SearchAlternative.STRAIN_6;
	protected static final DownloadFormat DOWNLOAD_21_FORMAT = DownloadFormat.FORMAT_TSV;
	protected static final DownloadQuotes DOWNLOAD_21_QUOTES = DownloadQuotes.QUOTES_NO;
	protected static final DownloadHeaders DOWNLOAD_21_HEADERS = DownloadHeaders.HEADERS_YES;

	protected static final int SEARCH_22_PAGE_INDEX = 1;
	protected static final String SEARCH_22_GENE_NAME = "";
	protected static final SearchChromosome SEARCH_22_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_22;
	protected static final String SEARCH_22_START = "854515";
	protected static final String SEARCH_22_END = "902472";
	protected static final String SEARCH_22_UPSTREAM = "0";
	protected static final String SEARCH_22_DOWNSTREAM = "0";
	protected static final SearchReference SEARCH_22_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative SEARCH_22_ALTERNATIVE = SearchAlternative.STRAIN_6;
	
	protected static final SearchChromosome DOWNLOAD_22_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_22;
	protected static final String DOWNLOAD_22_START = "855515";
	protected static final String DOWNLOAD_22_END = "901472";
	protected static final String DOWNLOAD_22_UPSTREAM = "0";
	protected static final String DOWNLOAD_22_DOWNSTREAM = "0";
	protected static final SearchReference DOWNLOAD_22_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative DOWNLOAD_22_ALTERNATIVE = SearchAlternative.STRAIN_6;
	protected static final DownloadFormat DOWNLOAD_22_FORMAT = DownloadFormat.FORMAT_TSV;
	protected static final DownloadQuotes DOWNLOAD_22_QUOTES = DownloadQuotes.QUOTES_NO;
	protected static final DownloadHeaders DOWNLOAD_22_HEADERS = DownloadHeaders.HEADERS_YES;

	protected static final int SEARCH_23_PAGE_INDEX = 1;
	protected static final String SEARCH_23_GENE_NAME = "";
	protected static final SearchChromosome SEARCH_23_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_23;
	protected static final String SEARCH_23_START = "854515";
	protected static final String SEARCH_23_END = "902472";
	protected static final String SEARCH_23_UPSTREAM = "0";
	protected static final String SEARCH_23_DOWNSTREAM = "0";
	protected static final SearchReference SEARCH_23_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative SEARCH_23_ALTERNATIVE = SearchAlternative.STRAIN_6;
	
	protected static final SearchChromosome DOWNLOAD_23_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_23;
	protected static final String DOWNLOAD_23_START = "855515";
	protected static final String DOWNLOAD_23_END = "901472";
	protected static final String DOWNLOAD_23_UPSTREAM = "0";
	protected static final String DOWNLOAD_23_DOWNSTREAM = "0";
	protected static final SearchReference DOWNLOAD_23_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative DOWNLOAD_23_ALTERNATIVE = SearchAlternative.STRAIN_6;
	protected static final DownloadFormat DOWNLOAD_23_FORMAT = DownloadFormat.FORMAT_TSV;
	protected static final DownloadQuotes DOWNLOAD_23_QUOTES = DownloadQuotes.QUOTES_NO;
	protected static final DownloadHeaders DOWNLOAD_23_HEADERS = DownloadHeaders.HEADERS_YES;
    
	protected static final int SEARCH_24_PAGE_INDEX = 1;
	protected static final String SEARCH_24_GENE_NAME = "";
	protected static final SearchChromosome SEARCH_24_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_24;
	protected static final String SEARCH_24_START = "854515";
	protected static final String SEARCH_24_END = "902472";
	protected static final String SEARCH_24_UPSTREAM = "0";
	protected static final String SEARCH_24_DOWNSTREAM = "0";
	protected static final SearchReference SEARCH_24_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative SEARCH_24_ALTERNATIVE = SearchAlternative.STRAIN_6;
	
	protected static final SearchChromosome DOWNLOAD_24_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_24;
	protected static final String DOWNLOAD_24_START = "855515";
	protected static final String DOWNLOAD_24_END = "901472";
	protected static final String DOWNLOAD_24_UPSTREAM = "0";
	protected static final String DOWNLOAD_24_DOWNSTREAM = "0";
	protected static final SearchReference DOWNLOAD_24_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative DOWNLOAD_24_ALTERNATIVE = SearchAlternative.STRAIN_6;
	protected static final DownloadFormat DOWNLOAD_24_FORMAT = DownloadFormat.FORMAT_TSV;
	protected static final DownloadQuotes DOWNLOAD_24_QUOTES = DownloadQuotes.QUOTES_NO;
	protected static final DownloadHeaders DOWNLOAD_24_HEADERS = DownloadHeaders.HEADERS_YES;

	protected static final int SEARCH_25_PAGE_INDEX = 1;
	protected static final String SEARCH_25_GENE_NAME = "";
	protected static final SearchChromosome SEARCH_25_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_25;
	protected static final String SEARCH_25_START = "854515";
	protected static final String SEARCH_25_END = "902472";
	protected static final String SEARCH_25_UPSTREAM = "0";
	protected static final String SEARCH_25_DOWNSTREAM = "0";
	protected static final SearchReference SEARCH_25_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative SEARCH_25_ALTERNATIVE = SearchAlternative.STRAIN_6;
	
	protected static final SearchChromosome DOWNLOAD_25_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_25;
	protected static final String DOWNLOAD_25_START = "855515";
	protected static final String DOWNLOAD_25_END = "901472";
	protected static final String DOWNLOAD_25_UPSTREAM = "0";
	protected static final String DOWNLOAD_25_DOWNSTREAM = "0";
	protected static final SearchReference DOWNLOAD_25_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative DOWNLOAD_25_ALTERNATIVE = SearchAlternative.STRAIN_6;
	protected static final DownloadFormat DOWNLOAD_25_FORMAT = DownloadFormat.FORMAT_TSV;
	protected static final DownloadQuotes DOWNLOAD_25_QUOTES = DownloadQuotes.QUOTES_NO;
	protected static final DownloadHeaders DOWNLOAD_25_HEADERS = DownloadHeaders.HEADERS_YES;

	protected static final int SEARCH_26_PAGE_INDEX = 1;
	protected static final String SEARCH_26_GENE_NAME = "";
	protected static final SearchChromosome SEARCH_26_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_26;
	protected static final String SEARCH_26_START = "854515";
	protected static final String SEARCH_26_END = "902472";
	protected static final String SEARCH_26_UPSTREAM = "0";
	protected static final String SEARCH_26_DOWNSTREAM = "0";
	protected static final SearchReference SEARCH_26_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative SEARCH_26_ALTERNATIVE = SearchAlternative.STRAIN_6;
	
	protected static final SearchChromosome DOWNLOAD_26_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_26;
	protected static final String DOWNLOAD_26_START = "855515";
	protected static final String DOWNLOAD_26_END = "901472";
	protected static final String DOWNLOAD_26_UPSTREAM = "0";
	protected static final String DOWNLOAD_26_DOWNSTREAM = "0";
	protected static final SearchReference DOWNLOAD_26_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative DOWNLOAD_26_ALTERNATIVE = SearchAlternative.STRAIN_6;
	protected static final DownloadFormat DOWNLOAD_26_FORMAT = DownloadFormat.FORMAT_TSV;
	protected static final DownloadQuotes DOWNLOAD_26_QUOTES = DownloadQuotes.QUOTES_NO;
	protected static final DownloadHeaders DOWNLOAD_26_HEADERS = DownloadHeaders.HEADERS_YES;

	protected static final int SEARCH_27_PAGE_INDEX = 1;
	protected static final String SEARCH_27_GENE_NAME = "";
	protected static final SearchChromosome SEARCH_27_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_27;
	protected static final String SEARCH_27_START = "854515";
	protected static final String SEARCH_27_END = "902472";
	protected static final String SEARCH_27_UPSTREAM = "0";
	protected static final String SEARCH_27_DOWNSTREAM = "0";
	protected static final SearchReference SEARCH_27_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative SEARCH_27_ALTERNATIVE = SearchAlternative.STRAIN_6;
	
	protected static final SearchChromosome DOWNLOAD_27_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_27;
	protected static final String DOWNLOAD_27_START = "855515";
	protected static final String DOWNLOAD_27_END = "901472";
	protected static final String DOWNLOAD_27_UPSTREAM = "0";
	protected static final String DOWNLOAD_27_DOWNSTREAM = "0";
	protected static final SearchReference DOWNLOAD_27_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative DOWNLOAD_27_ALTERNATIVE = SearchAlternative.STRAIN_6;
	protected static final DownloadFormat DOWNLOAD_27_FORMAT = DownloadFormat.FORMAT_TSV;
	protected static final DownloadQuotes DOWNLOAD_27_QUOTES = DownloadQuotes.QUOTES_NO;
	protected static final DownloadHeaders DOWNLOAD_27_HEADERS = DownloadHeaders.HEADERS_YES;

	protected static final int SEARCH_28_PAGE_INDEX = 1;
	protected static final String SEARCH_28_GENE_NAME = "";
	protected static final SearchChromosome SEARCH_28_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_28;
	protected static final String SEARCH_28_START = "854515";
	protected static final String SEARCH_28_END = "902472";
	protected static final String SEARCH_28_UPSTREAM = "0";
	protected static final String SEARCH_28_DOWNSTREAM = "0";
	protected static final SearchReference SEARCH_28_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative SEARCH_28_ALTERNATIVE = SearchAlternative.STRAIN_6;
	
	protected static final SearchChromosome DOWNLOAD_28_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_28;
	protected static final String DOWNLOAD_28_START = "855515";
	protected static final String DOWNLOAD_28_END = "901472";
	protected static final String DOWNLOAD_28_UPSTREAM = "0";
	protected static final String DOWNLOAD_28_DOWNSTREAM = "0";
	protected static final SearchReference DOWNLOAD_28_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative DOWNLOAD_28_ALTERNATIVE = SearchAlternative.STRAIN_6;
	protected static final DownloadFormat DOWNLOAD_28_FORMAT = DownloadFormat.FORMAT_TSV;
	protected static final DownloadQuotes DOWNLOAD_28_QUOTES = DownloadQuotes.QUOTES_NO;
	protected static final DownloadHeaders DOWNLOAD_28_HEADERS = DownloadHeaders.HEADERS_YES;

	protected static final int SEARCH_32_PAGE_INDEX = 1;
	protected static final String SEARCH_32_GENE_NAME = "";
	protected static final SearchChromosome SEARCH_32_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_32;
	protected static final String SEARCH_32_START = "854515";
	protected static final String SEARCH_32_END = "902472";
	protected static final String SEARCH_32_UPSTREAM = "0";
	protected static final String SEARCH_32_DOWNSTREAM = "0";
	protected static final SearchReference SEARCH_32_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative SEARCH_32_ALTERNATIVE = SearchAlternative.STRAIN_6;
	
	protected static final SearchChromosome DOWNLOAD_32_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_32;
	protected static final String DOWNLOAD_32_START = "855515";
	protected static final String DOWNLOAD_32_END = "901472";
	protected static final String DOWNLOAD_32_UPSTREAM = "0";
	protected static final String DOWNLOAD_32_DOWNSTREAM = "0";
	protected static final SearchReference DOWNLOAD_32_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative DOWNLOAD_32_ALTERNATIVE = SearchAlternative.STRAIN_6;
	protected static final DownloadFormat DOWNLOAD_32_FORMAT = DownloadFormat.FORMAT_TSV;
	protected static final DownloadQuotes DOWNLOAD_32_QUOTES = DownloadQuotes.QUOTES_NO;
	protected static final DownloadHeaders DOWNLOAD_32_HEADERS = DownloadHeaders.HEADERS_YES;

	protected static final int SEARCH_W_PAGE_INDEX = 1;
	protected static final String SEARCH_W_GENE_NAME = "";
	protected static final SearchChromosome SEARCH_W_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_W;
	protected static final String SEARCH_W_START = "854515";
	protected static final String SEARCH_W_END = "902472";
	protected static final String SEARCH_W_UPSTREAM = "0";
	protected static final String SEARCH_W_DOWNSTREAM = "0";
	protected static final SearchReference SEARCH_W_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative SEARCH_W_ALTERNATIVE = SearchAlternative.STRAIN_6;
	
	protected static final SearchChromosome DOWNLOAD_W_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_W;
	protected static final String DOWNLOAD_W_START = "855515";
	protected static final String DOWNLOAD_W_END = "901472";
	protected static final String DOWNLOAD_W_UPSTREAM = "0";
	protected static final String DOWNLOAD_W_DOWNSTREAM = "0";
	protected static final SearchReference DOWNLOAD_W_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative DOWNLOAD_W_ALTERNATIVE = SearchAlternative.STRAIN_6;
	protected static final DownloadFormat DOWNLOAD_W_FORMAT = DownloadFormat.FORMAT_TSV;
	protected static final DownloadQuotes DOWNLOAD_W_QUOTES = DownloadQuotes.QUOTES_NO;
	protected static final DownloadHeaders DOWNLOAD_W_HEADERS = DownloadHeaders.HEADERS_YES;

	protected static final int SEARCH_Z_PAGE_INDEX = 1;
	protected static final String SEARCH_Z_GENE_NAME = "";
	protected static final SearchChromosome SEARCH_Z_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_Z;
	protected static final String SEARCH_Z_START = "854515";
	protected static final String SEARCH_Z_END = "902472";
	protected static final String SEARCH_Z_UPSTREAM = "0";
	protected static final String SEARCH_Z_DOWNSTREAM = "0";
	protected static final SearchReference SEARCH_Z_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative SEARCH_Z_ALTERNATIVE = SearchAlternative.STRAIN_6;
	
	protected static final SearchChromosome DOWNLOAD_Z_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_Z;
	protected static final String DOWNLOAD_Z_START = "855515";
	protected static final String DOWNLOAD_Z_END = "901472";
	protected static final String DOWNLOAD_Z_UPSTREAM = "0";
	protected static final String DOWNLOAD_Z_DOWNSTREAM = "0";
	protected static final SearchReference DOWNLOAD_Z_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative DOWNLOAD_Z_ALTERNATIVE = SearchAlternative.STRAIN_6;
	protected static final DownloadFormat DOWNLOAD_Z_FORMAT = DownloadFormat.FORMAT_TSV;
	protected static final DownloadQuotes DOWNLOAD_Z_QUOTES = DownloadQuotes.QUOTES_NO;
	protected static final DownloadHeaders DOWNLOAD_Z_HEADERS = DownloadHeaders.HEADERS_YES;

	protected static final int SEARCH_LGE64_PAGE_INDEX = 1;
	protected static final String SEARCH_LGE64_GENE_NAME = "";
	protected static final SearchChromosome SEARCH_LGE64_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_LGE64;
	protected static final String SEARCH_LGE64_START = "854515";
	protected static final String SEARCH_LGE64_END = "902472";
	protected static final String SEARCH_LGE64_UPSTREAM = "0";
	protected static final String SEARCH_LGE64_DOWNSTREAM = "0";
	protected static final SearchReference SEARCH_LGE64_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative SEARCH_LGE64_ALTERNATIVE = SearchAlternative.STRAIN_6;
	
	protected static final SearchChromosome DOWNLOAD_LGE64_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_LGE64;
	protected static final String DOWNLOAD_LGE64_START = "855515";
	protected static final String DOWNLOAD_LGE64_END = "901472";
	protected static final String DOWNLOAD_LGE64_UPSTREAM = "0";
	protected static final String DOWNLOAD_LGE64_DOWNSTREAM = "0";
	protected static final SearchReference DOWNLOAD_LGE64_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative DOWNLOAD_LGE64_ALTERNATIVE = SearchAlternative.STRAIN_6;
	protected static final DownloadFormat DOWNLOAD_LGE64_FORMAT = DownloadFormat.FORMAT_TSV;
	protected static final DownloadQuotes DOWNLOAD_LGE64_QUOTES = DownloadQuotes.QUOTES_NO;
	protected static final DownloadHeaders DOWNLOAD_LGE64_HEADERS = DownloadHeaders.HEADERS_YES;

	protected static final int SEARCH_LGE22C19W28_E50C23_PAGE_INDEX = 1;
	protected static final String SEARCH_LGE22C19W28_E50C23_GENE_NAME = "";
	protected static final SearchChromosome SEARCH_LGE22C19W28_E50C23_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_LGE22C19W28_E50C23;
	protected static final String SEARCH_LGE22C19W28_E50C23_START = "854515";
	protected static final String SEARCH_LGE22C19W28_E50C23_END = "902472";
	protected static final String SEARCH_LGE22C19W28_E50C23_UPSTREAM = "0";
	protected static final String SEARCH_LGE22C19W28_E50C23_DOWNSTREAM = "0";
	protected static final SearchReference SEARCH_LGE22C19W28_E50C23_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative SEARCH_LGE22C19W28_E50C23_ALTERNATIVE = SearchAlternative.STRAIN_6;
	
	protected static final SearchChromosome DOWNLOAD_LGE22C19W28_E50C23_CHROMOSOME_ID = SearchChromosome.CHROMOSOME_LGE22C19W28_E50C23;
	protected static final String DOWNLOAD_LGE22C19W28_E50C23_START = "855515";
	protected static final String DOWNLOAD_LGE22C19W28_E50C23_END = "901472";
	protected static final String DOWNLOAD_LGE22C19W28_E50C23_UPSTREAM = "0";
	protected static final String DOWNLOAD_LGE22C19W28_E50C23_DOWNSTREAM = "0";
	protected static final SearchReference DOWNLOAD_LGE22C19W28_E50C23_REFERENCE = SearchReference.STRAIN_7;
	protected static final SearchAlternative DOWNLOAD_LGE22C19W28_E50C23_ALTERNATIVE = SearchAlternative.STRAIN_6;
	protected static final DownloadFormat DOWNLOAD_LGE22C19W28_E50C23_FORMAT = DownloadFormat.FORMAT_TSV;
	protected static final DownloadQuotes DOWNLOAD_LGE22C19W28_E50C23_QUOTES = DownloadQuotes.QUOTES_NO;
	protected static final DownloadHeaders DOWNLOAD_LGE22C19W28_E50C23_HEADERS = DownloadHeaders.HEADERS_YES;
    
	private ControllerSNPChromosome controller;
    
    private ServiceSNPChromosome01 serviceSNPChromosome1Mock;
    private ServiceSNPChromosome03 serviceSNPChromosome3Mock;
    private ServiceSNPChromosome04 serviceSNPChromosome4Mock;
    private ServiceSNPChromosome05 serviceSNPChromosome5Mock;
    private ServiceSNPChromosome06 serviceSNPChromosome6Mock;
    private ServiceSNPChromosome07 serviceSNPChromosome7Mock;
    private ServiceSNPChromosome08 serviceSNPChromosome8Mock;
    private ServiceSNPChromosome09 serviceSNPChromosome9Mock;
    private ServiceSNPChromosome10 serviceSNPChromosome10Mock;
    private ServiceSNPChromosome11 serviceSNPChromosome11Mock;
    private ServiceSNPChromosome12 serviceSNPChromosome12Mock;
    private ServiceSNPChromosome13 serviceSNPChromosome13Mock;
    private ServiceSNPChromosome14 serviceSNPChromosome14Mock;
    private ServiceSNPChromosome15 serviceSNPChromosome15Mock;
    private ServiceSNPChromosome16 serviceSNPChromosome16Mock;
    private ServiceSNPChromosome17 serviceSNPChromosome17Mock;
    private ServiceSNPChromosome18 serviceSNPChromosome18Mock;
    private ServiceSNPChromosome19 serviceSNPChromosome19Mock;
    private ServiceSNPChromosome20 serviceSNPChromosome20Mock;
    private ServiceSNPChromosome21 serviceSNPChromosome21Mock;
    private ServiceSNPChromosome22 serviceSNPChromosome22Mock;
    private ServiceSNPChromosome23 serviceSNPChromosome23Mock;
    private ServiceSNPChromosome24 serviceSNPChromosome24Mock;
    private ServiceSNPChromosome25 serviceSNPChromosome25Mock;
    private ServiceSNPChromosome26 serviceSNPChromosome26Mock;
    private ServiceSNPChromosome27 serviceSNPChromosome27Mock;
    private ServiceSNPChromosome28 serviceSNPChromosome28Mock;
    private ServiceSNPChromosome32 serviceSNPChromosome32Mock;
    private ServiceSNPChromosomeW serviceSNPChromosomeWMock;
    private ServiceSNPChromosomeZ serviceSNPChromosomeZMock;
    private ServiceSNPChromosomeLGE64 serviceSNPChromosomeLGE64Mock;
    private ServiceSNPChromosomeLGE22C19W28_E50C23 serviceSNPChromosomeLGE22C19W28_E50C23Mock;

    
    public void setUpTest() {
    
    	controller = new ControllerSNPChromosome();
        controller.setMessageSource(getMessageSourceMock());

        serviceSNPChromosome1Mock = mock(ServiceSNPChromosome01.class);
        controller.setServiceSNPChromosome1(serviceSNPChromosome1Mock);
        serviceSNPChromosome3Mock = mock(ServiceSNPChromosome03.class);
        controller.setServiceSNPChromosome3(serviceSNPChromosome3Mock);
        serviceSNPChromosome4Mock = mock(ServiceSNPChromosome04.class);
        controller.setServiceSNPChromosome4(serviceSNPChromosome4Mock);
        serviceSNPChromosome5Mock = mock(ServiceSNPChromosome05.class);
        controller.setServiceSNPChromosome5(serviceSNPChromosome5Mock);
        serviceSNPChromosome6Mock = mock(ServiceSNPChromosome06.class);
        controller.setServiceSNPChromosome6(serviceSNPChromosome6Mock);
        serviceSNPChromosome7Mock = mock(ServiceSNPChromosome07.class);
        controller.setServiceSNPChromosome7(serviceSNPChromosome7Mock);
        serviceSNPChromosome8Mock = mock(ServiceSNPChromosome08.class);
        controller.setServiceSNPChromosome8(serviceSNPChromosome8Mock);
        serviceSNPChromosome9Mock = mock(ServiceSNPChromosome09.class);
        controller.setServiceSNPChromosome9(serviceSNPChromosome9Mock);
        serviceSNPChromosome10Mock = mock(ServiceSNPChromosome10.class);
        controller.setServiceSNPChromosome10(serviceSNPChromosome10Mock);
        serviceSNPChromosome11Mock = mock(ServiceSNPChromosome11.class);
        controller.setServiceSNPChromosome11(serviceSNPChromosome11Mock);
        serviceSNPChromosome12Mock = mock(ServiceSNPChromosome12.class);
        controller.setServiceSNPChromosome12(serviceSNPChromosome12Mock);
        serviceSNPChromosome13Mock = mock(ServiceSNPChromosome13.class);
        controller.setServiceSNPChromosome13(serviceSNPChromosome13Mock);
        serviceSNPChromosome14Mock = mock(ServiceSNPChromosome14.class);
        controller.setServiceSNPChromosome14(serviceSNPChromosome14Mock);
        serviceSNPChromosome15Mock = mock(ServiceSNPChromosome15.class);
        controller.setServiceSNPChromosome15(serviceSNPChromosome15Mock);
        serviceSNPChromosome16Mock = mock(ServiceSNPChromosome16.class);
        controller.setServiceSNPChromosome16(serviceSNPChromosome16Mock);
        serviceSNPChromosome17Mock = mock(ServiceSNPChromosome17.class);
        controller.setServiceSNPChromosome17(serviceSNPChromosome17Mock);
        serviceSNPChromosome18Mock = mock(ServiceSNPChromosome18.class);
        controller.setServiceSNPChromosome18(serviceSNPChromosome18Mock);
        serviceSNPChromosome19Mock = mock(ServiceSNPChromosome19.class);
        controller.setServiceSNPChromosome19(serviceSNPChromosome19Mock);
        serviceSNPChromosome20Mock = mock(ServiceSNPChromosome20.class);
        controller.setServiceSNPChromosome20(serviceSNPChromosome20Mock);
        serviceSNPChromosome21Mock = mock(ServiceSNPChromosome21.class);
        controller.setServiceSNPChromosome21(serviceSNPChromosome21Mock);
        serviceSNPChromosome22Mock = mock(ServiceSNPChromosome22.class);
        controller.setServiceSNPChromosome22(serviceSNPChromosome22Mock);
        serviceSNPChromosome23Mock = mock(ServiceSNPChromosome23.class);
        controller.setServiceSNPChromosome23(serviceSNPChromosome23Mock);
        serviceSNPChromosome24Mock = mock(ServiceSNPChromosome24.class);
        controller.setServiceSNPChromosome24(serviceSNPChromosome24Mock);
        serviceSNPChromosome25Mock = mock(ServiceSNPChromosome25.class);
        controller.setServiceSNPChromosome25(serviceSNPChromosome25Mock);
        serviceSNPChromosome26Mock = mock(ServiceSNPChromosome26.class);
        controller.setServiceSNPChromosome26(serviceSNPChromosome26Mock);
        serviceSNPChromosome27Mock = mock(ServiceSNPChromosome27.class);
        controller.setServiceSNPChromosome27(serviceSNPChromosome27Mock);
        serviceSNPChromosome28Mock = mock(ServiceSNPChromosome28.class);
        controller.setServiceSNPChromosome28(serviceSNPChromosome28Mock);
        serviceSNPChromosome32Mock = mock(ServiceSNPChromosome32.class);
        controller.setServiceSNPChromosome32(serviceSNPChromosome32Mock);
        serviceSNPChromosomeWMock = mock(ServiceSNPChromosomeW.class);
        controller.setServiceSNPChromosomeW(serviceSNPChromosomeWMock);
        serviceSNPChromosomeZMock = mock(ServiceSNPChromosomeZ.class);
        controller.setServiceSNPChromosomeZ(serviceSNPChromosomeZMock);
        serviceSNPChromosomeLGE64Mock = mock(ServiceSNPChromosomeLGE64.class);
        controller.setServiceSNPChromosomeLGE64(serviceSNPChromosomeLGE64Mock);
        serviceSNPChromosomeLGE22C19W28_E50C23Mock = mock(ServiceSNPChromosomeLGE22C19W28_E50C23.class);
        controller.setServiceSNPChromosomeLGE22C19W28_E50C23(serviceSNPChromosomeLGE22C19W28_E50C23Mock);
    }
    
    
    @Test
    public void search1() {
    	
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
        
        PageSNPChromosome expected = null;
        
        when(serviceSNPChromosome1Mock.search(dtoSearch, SEARCH_1_PAGE_INDEX)).thenReturn((PageSNPChromosome) expected);
        
        BindingAwareModelMap model = new BindingAwareModelMap();
        RedirectAttributes attributes = new RedirectAttributesModelMap();

        String view = controller.search(dtoSearch, model, attributes);
        
        verify(serviceSNPChromosome1Mock, times(1)).search(dtoSearch, SEARCH_1_PAGE_INDEX);
        verifyNoMoreInteractions(serviceSNPChromosome1Mock);
        
        assertEquals(ControllerSNPChromosome.SNPCHROMOSOME_SEARCH_RESULT_VIEW, view);
        
        PageSNPChromosome actual = (PageSNPChromosome) model.asMap().get(ControllerSNPChromosome.MODEL_ATTRIBUTE_SNPCHROMOSOMES);
        
        assertEquals(expected, actual);
    }


	@Test
    public void download1() throws IOException {
    	
        DTODownload downloadCriteria = createDownloadCriteria(
        		DOWNLOAD_1_DOWNSTREAM,
        		DOWNLOAD_1_UPSTREAM,
        		DOWNLOAD_1_START,
        		DOWNLOAD_1_END,
        		DOWNLOAD_1_REFERENCE,
        		DOWNLOAD_1_ALTERNATIVE,
        		DOWNLOAD_1_FORMAT,
        		DOWNLOAD_1_QUOTES,
        		DOWNLOAD_1_HEADERS,
        		DOWNLOAD_1_CHROMOSOME_ID
        		);
        
        List<SNPChromosome> expected = new ArrayList<SNPChromosome>();
        
        when(serviceSNPChromosome1Mock.download(downloadCriteria)).thenReturn(expected);
        
        CSVResponse csvResponse = controller.download(downloadCriteria);
        
        verify(serviceSNPChromosome1Mock, times(1)).download(downloadCriteria);
        
        verifyNoMoreInteractions(serviceSNPChromosome1Mock);
        
        List<SNPChromosome> actual = csvResponse;
        
        assertEquals(expected, actual);
    }

	
    @Test
    public void search3() {
    	
        DTOSearch dtoSearch = createSearchCriteria(
        		SEARCH_3_PAGE_INDEX,
        		SEARCH_3_GENE_NAME,
        		SEARCH_3_DOWNSTREAM,
        		SEARCH_3_UPSTREAM,
        		SEARCH_3_START,
        		SEARCH_3_END,
        		SEARCH_3_REFERENCE,
        		SEARCH_3_ALTERNATIVE,
        		SEARCH_3_CHROMOSOME_ID
        		);
        
        PageSNPChromosome expected = null;
        
        when(serviceSNPChromosome3Mock.search(dtoSearch, SEARCH_3_PAGE_INDEX)).thenReturn((PageSNPChromosome) expected);
        
        BindingAwareModelMap model = new BindingAwareModelMap();
        RedirectAttributes attributes = new RedirectAttributesModelMap();

        String view = controller.search(dtoSearch, model, attributes);
        
        verify(serviceSNPChromosome3Mock, times(1)).search(dtoSearch, SEARCH_3_PAGE_INDEX);
        verifyNoMoreInteractions(serviceSNPChromosome3Mock);
        
        assertEquals(ControllerSNPChromosome.SNPCHROMOSOME_SEARCH_RESULT_VIEW, view);
        
        PageSNPChromosome actual = (PageSNPChromosome) model.asMap().get(ControllerSNPChromosome.MODEL_ATTRIBUTE_SNPCHROMOSOMES);
        
        assertEquals(expected, actual);
    }


	@Test
    public void download3() throws IOException {
    	
        DTODownload downloadCriteria = createDownloadCriteria(
        		DOWNLOAD_3_DOWNSTREAM,
        		DOWNLOAD_3_UPSTREAM,
        		DOWNLOAD_3_START,
        		DOWNLOAD_3_END,
        		DOWNLOAD_3_REFERENCE,
        		DOWNLOAD_3_ALTERNATIVE,
        		DOWNLOAD_3_FORMAT,
        		DOWNLOAD_3_QUOTES,
        		DOWNLOAD_3_HEADERS,
        		DOWNLOAD_3_CHROMOSOME_ID
        		);
        
        List<SNPChromosome> expected = new ArrayList<SNPChromosome>();
        
        when(serviceSNPChromosome3Mock.download(downloadCriteria)).thenReturn(expected);
        
        CSVResponse csvResponse = controller.download(downloadCriteria);
        
        verify(serviceSNPChromosome3Mock, times(1)).download(downloadCriteria);
        
        verifyNoMoreInteractions(serviceSNPChromosome3Mock);
        
        List<SNPChromosome> actual = csvResponse;
        
        assertEquals(expected, actual);
    }

	
    @Test
    public void search4() {
    	
        DTOSearch dtoSearch = createSearchCriteria(
        		SEARCH_4_PAGE_INDEX,
        		SEARCH_4_GENE_NAME,
        		SEARCH_4_DOWNSTREAM,
        		SEARCH_4_UPSTREAM,
        		SEARCH_4_START,
        		SEARCH_4_END,
        		SEARCH_4_REFERENCE,
        		SEARCH_4_ALTERNATIVE,
        		SEARCH_4_CHROMOSOME_ID
        		);
        
        PageSNPChromosome expected = null;
        
        when(serviceSNPChromosome4Mock.search(dtoSearch, SEARCH_4_PAGE_INDEX)).thenReturn((PageSNPChromosome) expected);
        
        BindingAwareModelMap model = new BindingAwareModelMap();
        RedirectAttributes attributes = new RedirectAttributesModelMap();

        String view = controller.search(dtoSearch, model, attributes);
        
        verify(serviceSNPChromosome4Mock, times(1)).search(dtoSearch, SEARCH_4_PAGE_INDEX);
        verifyNoMoreInteractions(serviceSNPChromosome4Mock);
        
        assertEquals(ControllerSNPChromosome.SNPCHROMOSOME_SEARCH_RESULT_VIEW, view);
        
        PageSNPChromosome actual = (PageSNPChromosome) model.asMap().get(ControllerSNPChromosome.MODEL_ATTRIBUTE_SNPCHROMOSOMES);
        
        assertEquals(expected, actual);
    }


	@Test
    public void download4() throws IOException {
    	
        DTODownload downloadCriteria = createDownloadCriteria(
        		DOWNLOAD_4_DOWNSTREAM,
        		DOWNLOAD_4_UPSTREAM,
        		DOWNLOAD_4_START,
        		DOWNLOAD_4_END,
        		DOWNLOAD_4_REFERENCE,
        		DOWNLOAD_4_ALTERNATIVE,
        		DOWNLOAD_4_FORMAT,
        		DOWNLOAD_4_QUOTES,
        		DOWNLOAD_4_HEADERS,
        		DOWNLOAD_4_CHROMOSOME_ID
        		);
        
        List<SNPChromosome> expected = new ArrayList<SNPChromosome>();
        
        when(serviceSNPChromosome4Mock.download(downloadCriteria)).thenReturn(expected);
        
        CSVResponse csvResponse = controller.download(downloadCriteria);
        
        verify(serviceSNPChromosome4Mock, times(1)).download(downloadCriteria);
        
        verifyNoMoreInteractions(serviceSNPChromosome4Mock);
        
        List<SNPChromosome> actual = csvResponse;
        
        assertEquals(expected, actual);
    }

	
    @Test
    public void search5() {
    	
        DTOSearch dtoSearch = createSearchCriteria(
        		SEARCH_5_PAGE_INDEX,
        		SEARCH_5_GENE_NAME,
        		SEARCH_5_DOWNSTREAM,
        		SEARCH_5_UPSTREAM,
        		SEARCH_5_START,
        		SEARCH_5_END,
        		SEARCH_5_REFERENCE,
        		SEARCH_5_ALTERNATIVE,
        		SEARCH_5_CHROMOSOME_ID
        		);
        
        PageSNPChromosome expected = null;
        
        when(serviceSNPChromosome5Mock.search(dtoSearch, SEARCH_5_PAGE_INDEX)).thenReturn((PageSNPChromosome) expected);
        
        BindingAwareModelMap model = new BindingAwareModelMap();
        RedirectAttributes attributes = new RedirectAttributesModelMap();

        String view = controller.search(dtoSearch, model, attributes);
        
        verify(serviceSNPChromosome5Mock, times(1)).search(dtoSearch, SEARCH_5_PAGE_INDEX);
        verifyNoMoreInteractions(serviceSNPChromosome5Mock);
        
        assertEquals(ControllerSNPChromosome.SNPCHROMOSOME_SEARCH_RESULT_VIEW, view);
        
        PageSNPChromosome actual = (PageSNPChromosome) model.asMap().get(ControllerSNPChromosome.MODEL_ATTRIBUTE_SNPCHROMOSOMES);
        
        assertEquals(expected, actual);
    }


	@Test
    public void download5() throws IOException {
    	
        DTODownload downloadCriteria = createDownloadCriteria(
        		DOWNLOAD_5_DOWNSTREAM,
        		DOWNLOAD_5_UPSTREAM,
        		DOWNLOAD_5_START,
        		DOWNLOAD_5_END,
        		DOWNLOAD_5_REFERENCE,
        		DOWNLOAD_5_ALTERNATIVE,
        		DOWNLOAD_5_FORMAT,
        		DOWNLOAD_5_QUOTES,
        		DOWNLOAD_5_HEADERS,
        		DOWNLOAD_5_CHROMOSOME_ID
        		);
        
        List<SNPChromosome> expected = new ArrayList<SNPChromosome>();
        
        when(serviceSNPChromosome5Mock.download(downloadCriteria)).thenReturn(expected);
        
        CSVResponse csvResponse = controller.download(downloadCriteria);
        
        verify(serviceSNPChromosome5Mock, times(1)).download(downloadCriteria);
        
        verifyNoMoreInteractions(serviceSNPChromosome5Mock);
        
        List<SNPChromosome> actual = csvResponse;
        
        assertEquals(expected, actual);
    }

	
    @Test
    public void search6() {
    	
        DTOSearch dtoSearch = createSearchCriteria(
        		SEARCH_6_PAGE_INDEX,
        		SEARCH_6_GENE_NAME,
        		SEARCH_6_DOWNSTREAM,
        		SEARCH_6_UPSTREAM,
        		SEARCH_6_START,
        		SEARCH_6_END,
        		SEARCH_6_REFERENCE,
        		SEARCH_6_ALTERNATIVE,
        		SEARCH_6_CHROMOSOME_ID
        		);
        
        PageSNPChromosome expected = null;
        
        when(serviceSNPChromosome6Mock.search(dtoSearch, SEARCH_6_PAGE_INDEX)).thenReturn((PageSNPChromosome) expected);
        
        BindingAwareModelMap model = new BindingAwareModelMap();
        RedirectAttributes attributes = new RedirectAttributesModelMap();

        String view = controller.search(dtoSearch, model, attributes);
        
        verify(serviceSNPChromosome6Mock, times(1)).search(dtoSearch, SEARCH_6_PAGE_INDEX);
        verifyNoMoreInteractions(serviceSNPChromosome6Mock);
        
        assertEquals(ControllerSNPChromosome.SNPCHROMOSOME_SEARCH_RESULT_VIEW, view);
        
        PageSNPChromosome actual = (PageSNPChromosome) model.asMap().get(ControllerSNPChromosome.MODEL_ATTRIBUTE_SNPCHROMOSOMES);
        
        assertEquals(expected, actual);
    }


	@Test
    public void download6() throws IOException {
    	
        DTODownload downloadCriteria = createDownloadCriteria(
        		DOWNLOAD_6_DOWNSTREAM,
        		DOWNLOAD_6_UPSTREAM,
        		DOWNLOAD_6_START,
        		DOWNLOAD_6_END,
        		DOWNLOAD_6_REFERENCE,
        		DOWNLOAD_6_ALTERNATIVE,
        		DOWNLOAD_6_FORMAT,
        		DOWNLOAD_6_QUOTES,
        		DOWNLOAD_6_HEADERS,
        		DOWNLOAD_6_CHROMOSOME_ID
        		);
        
        List<SNPChromosome> expected = new ArrayList<SNPChromosome>();
        
        when(serviceSNPChromosome6Mock.download(downloadCriteria)).thenReturn(expected);
        
        CSVResponse csvResponse = controller.download(downloadCriteria);
        
        verify(serviceSNPChromosome6Mock, times(1)).download(downloadCriteria);
        
        verifyNoMoreInteractions(serviceSNPChromosome6Mock);
        
        List<SNPChromosome> actual = csvResponse;
        
        assertEquals(expected, actual);
    }

	
    @Test
    public void search7() {
    	
        DTOSearch dtoSearch = createSearchCriteria(
        		SEARCH_7_PAGE_INDEX,
        		SEARCH_7_GENE_NAME,
        		SEARCH_7_DOWNSTREAM,
        		SEARCH_7_UPSTREAM,
        		SEARCH_7_START,
        		SEARCH_7_END,
        		SEARCH_7_REFERENCE,
        		SEARCH_7_ALTERNATIVE,
        		SEARCH_7_CHROMOSOME_ID
        		);
        
        PageSNPChromosome expected = null;
        
        when(serviceSNPChromosome7Mock.search(dtoSearch, SEARCH_7_PAGE_INDEX)).thenReturn((PageSNPChromosome) expected);
        
        BindingAwareModelMap model = new BindingAwareModelMap();
        RedirectAttributes attributes = new RedirectAttributesModelMap();

        String view = controller.search(dtoSearch, model, attributes);
        
        verify(serviceSNPChromosome7Mock, times(1)).search(dtoSearch, SEARCH_7_PAGE_INDEX);
        verifyNoMoreInteractions(serviceSNPChromosome7Mock);
        
        assertEquals(ControllerSNPChromosome.SNPCHROMOSOME_SEARCH_RESULT_VIEW, view);
        
        PageSNPChromosome actual = (PageSNPChromosome) model.asMap().get(ControllerSNPChromosome.MODEL_ATTRIBUTE_SNPCHROMOSOMES);
        
        assertEquals(expected, actual);
    }


	@Test
    public void download7() throws IOException {
    	
        DTODownload downloadCriteria = createDownloadCriteria(
        		DOWNLOAD_7_DOWNSTREAM,
        		DOWNLOAD_7_UPSTREAM,
        		DOWNLOAD_7_START,
        		DOWNLOAD_7_END,
        		DOWNLOAD_7_REFERENCE,
        		DOWNLOAD_7_ALTERNATIVE,
        		DOWNLOAD_7_FORMAT,
        		DOWNLOAD_7_QUOTES,
        		DOWNLOAD_7_HEADERS,
        		DOWNLOAD_7_CHROMOSOME_ID
        		);
        
        List<SNPChromosome> expected = new ArrayList<SNPChromosome>();
        
        when(serviceSNPChromosome7Mock.download(downloadCriteria)).thenReturn(expected);
        
        CSVResponse csvResponse = controller.download(downloadCriteria);
        
        verify(serviceSNPChromosome7Mock, times(1)).download(downloadCriteria);
        
        verifyNoMoreInteractions(serviceSNPChromosome7Mock);
        
        List<SNPChromosome> actual = csvResponse;
        
        assertEquals(expected, actual);
    }

	
    @Test
    public void search8() {
    	
        DTOSearch dtoSearch = createSearchCriteria(
        		SEARCH_8_PAGE_INDEX,
        		SEARCH_8_GENE_NAME,
        		SEARCH_8_DOWNSTREAM,
        		SEARCH_8_UPSTREAM,
        		SEARCH_8_START,
        		SEARCH_8_END,
        		SEARCH_8_REFERENCE,
        		SEARCH_8_ALTERNATIVE,
        		SEARCH_8_CHROMOSOME_ID
        		);
        
        PageSNPChromosome expected = null;
        
        when(serviceSNPChromosome8Mock.search(dtoSearch, SEARCH_8_PAGE_INDEX)).thenReturn((PageSNPChromosome) expected);
        
        BindingAwareModelMap model = new BindingAwareModelMap();
        RedirectAttributes attributes = new RedirectAttributesModelMap();

        String view = controller.search(dtoSearch, model, attributes);
        
        verify(serviceSNPChromosome8Mock, times(1)).search(dtoSearch, SEARCH_8_PAGE_INDEX);
        verifyNoMoreInteractions(serviceSNPChromosome8Mock);
        
        assertEquals(ControllerSNPChromosome.SNPCHROMOSOME_SEARCH_RESULT_VIEW, view);
        
        PageSNPChromosome actual = (PageSNPChromosome) model.asMap().get(ControllerSNPChromosome.MODEL_ATTRIBUTE_SNPCHROMOSOMES);
        
        assertEquals(expected, actual);
    }


	@Test
    public void download8() throws IOException {
    	
        DTODownload downloadCriteria = createDownloadCriteria(
        		DOWNLOAD_8_DOWNSTREAM,
        		DOWNLOAD_8_UPSTREAM,
        		DOWNLOAD_8_START,
        		DOWNLOAD_8_END,
        		DOWNLOAD_8_REFERENCE,
        		DOWNLOAD_8_ALTERNATIVE,
        		DOWNLOAD_8_FORMAT,
        		DOWNLOAD_8_QUOTES,
        		DOWNLOAD_8_HEADERS,
        		DOWNLOAD_8_CHROMOSOME_ID
        		);
        
        List<SNPChromosome> expected = new ArrayList<SNPChromosome>();
        
        when(serviceSNPChromosome8Mock.download(downloadCriteria)).thenReturn(expected);
        
        CSVResponse csvResponse = controller.download(downloadCriteria);
        
        verify(serviceSNPChromosome8Mock, times(1)).download(downloadCriteria);
        
        verifyNoMoreInteractions(serviceSNPChromosome8Mock);
        
        List<SNPChromosome> actual = csvResponse;
        
        assertEquals(expected, actual);
    }

	
    @Test
    public void search9() {
    	
        DTOSearch dtoSearch = createSearchCriteria(
        		SEARCH_9_PAGE_INDEX,
        		SEARCH_9_GENE_NAME,
        		SEARCH_9_DOWNSTREAM,
        		SEARCH_9_UPSTREAM,
        		SEARCH_9_START,
        		SEARCH_9_END,
        		SEARCH_9_REFERENCE,
        		SEARCH_9_ALTERNATIVE,
        		SEARCH_9_CHROMOSOME_ID
        		);
        
        PageSNPChromosome expected = null;
        
        when(serviceSNPChromosome9Mock.search(dtoSearch, SEARCH_9_PAGE_INDEX)).thenReturn((PageSNPChromosome) expected);
        
        BindingAwareModelMap model = new BindingAwareModelMap();
        RedirectAttributes attributes = new RedirectAttributesModelMap();

        String view = controller.search(dtoSearch, model, attributes);
        
        verify(serviceSNPChromosome9Mock, times(1)).search(dtoSearch, SEARCH_9_PAGE_INDEX);
        verifyNoMoreInteractions(serviceSNPChromosome9Mock);
        
        assertEquals(ControllerSNPChromosome.SNPCHROMOSOME_SEARCH_RESULT_VIEW, view);
        
        PageSNPChromosome actual = (PageSNPChromosome) model.asMap().get(ControllerSNPChromosome.MODEL_ATTRIBUTE_SNPCHROMOSOMES);
        
        assertEquals(expected, actual);
    }


	@Test
    public void download9() throws IOException {
    	
        DTODownload downloadCriteria = createDownloadCriteria(
        		DOWNLOAD_9_DOWNSTREAM,
        		DOWNLOAD_9_UPSTREAM,
        		DOWNLOAD_9_START,
        		DOWNLOAD_9_END,
        		DOWNLOAD_9_REFERENCE,
        		DOWNLOAD_9_ALTERNATIVE,
        		DOWNLOAD_9_FORMAT,
        		DOWNLOAD_9_QUOTES,
        		DOWNLOAD_9_HEADERS,
        		DOWNLOAD_9_CHROMOSOME_ID
        		);
        
        List<SNPChromosome> expected = new ArrayList<SNPChromosome>();
        
        when(serviceSNPChromosome9Mock.download(downloadCriteria)).thenReturn(expected);
        
        CSVResponse csvResponse = controller.download(downloadCriteria);
        
        verify(serviceSNPChromosome9Mock, times(1)).download(downloadCriteria);
        
        verifyNoMoreInteractions(serviceSNPChromosome9Mock);
        
        List<SNPChromosome> actual = csvResponse;
        
        assertEquals(expected, actual);
    }

	
    @Test
    public void search10() {
    	
        DTOSearch dtoSearch = createSearchCriteria(
        		SEARCH_10_PAGE_INDEX,
        		SEARCH_10_GENE_NAME,
        		SEARCH_10_DOWNSTREAM,
        		SEARCH_10_UPSTREAM,
        		SEARCH_10_START,
        		SEARCH_10_END,
        		SEARCH_10_REFERENCE,
        		SEARCH_10_ALTERNATIVE,
        		SEARCH_10_CHROMOSOME_ID
        		);
        
        PageSNPChromosome expected = null;
        
        when(serviceSNPChromosome10Mock.search(dtoSearch, SEARCH_10_PAGE_INDEX)).thenReturn((PageSNPChromosome) expected);
        
        BindingAwareModelMap model = new BindingAwareModelMap();
        RedirectAttributes attributes = new RedirectAttributesModelMap();

        String view = controller.search(dtoSearch, model, attributes);
        
        verify(serviceSNPChromosome10Mock, times(1)).search(dtoSearch, SEARCH_10_PAGE_INDEX);
        verifyNoMoreInteractions(serviceSNPChromosome10Mock);
        
        assertEquals(ControllerSNPChromosome.SNPCHROMOSOME_SEARCH_RESULT_VIEW, view);
        
        PageSNPChromosome actual = (PageSNPChromosome) model.asMap().get(ControllerSNPChromosome.MODEL_ATTRIBUTE_SNPCHROMOSOMES);
        
        assertEquals(expected, actual);
    }


	@Test
    public void download10() throws IOException {
    	
        DTODownload downloadCriteria = createDownloadCriteria(
        		DOWNLOAD_10_DOWNSTREAM,
        		DOWNLOAD_10_UPSTREAM,
        		DOWNLOAD_10_START,
        		DOWNLOAD_10_END,
        		DOWNLOAD_10_REFERENCE,
        		DOWNLOAD_10_ALTERNATIVE,
        		DOWNLOAD_10_FORMAT,
        		DOWNLOAD_10_QUOTES,
        		DOWNLOAD_10_HEADERS,
        		DOWNLOAD_10_CHROMOSOME_ID
        		);
        
        List<SNPChromosome> expected = new ArrayList<SNPChromosome>();
        
        when(serviceSNPChromosome10Mock.download(downloadCriteria)).thenReturn(expected);
        
        CSVResponse csvResponse = controller.download(downloadCriteria);
        
        verify(serviceSNPChromosome10Mock, times(1)).download(downloadCriteria);
        
        verifyNoMoreInteractions(serviceSNPChromosome10Mock);
        
        List<SNPChromosome> actual = csvResponse;
        
        assertEquals(expected, actual);
    }

	
    @Test
    public void search11() {
    	
        DTOSearch dtoSearch = createSearchCriteria(
        		SEARCH_11_PAGE_INDEX,
        		SEARCH_11_GENE_NAME,
        		SEARCH_11_DOWNSTREAM,
        		SEARCH_11_UPSTREAM,
        		SEARCH_11_START,
        		SEARCH_11_END,
        		SEARCH_11_REFERENCE,
        		SEARCH_11_ALTERNATIVE,
        		SEARCH_11_CHROMOSOME_ID
        		);
        
        PageSNPChromosome expected = null;
        
        when(serviceSNPChromosome11Mock.search(dtoSearch, SEARCH_11_PAGE_INDEX)).thenReturn((PageSNPChromosome) expected);
        
        BindingAwareModelMap model = new BindingAwareModelMap();
        RedirectAttributes attributes = new RedirectAttributesModelMap();

        String view = controller.search(dtoSearch, model, attributes);
        
        verify(serviceSNPChromosome11Mock, times(1)).search(dtoSearch, SEARCH_11_PAGE_INDEX);
        verifyNoMoreInteractions(serviceSNPChromosome11Mock);
        
        assertEquals(ControllerSNPChromosome.SNPCHROMOSOME_SEARCH_RESULT_VIEW, view);
        
        PageSNPChromosome actual = (PageSNPChromosome) model.asMap().get(ControllerSNPChromosome.MODEL_ATTRIBUTE_SNPCHROMOSOMES);
        
        assertEquals(expected, actual);
    }


	@Test
    public void download11() throws IOException {
    	
        DTODownload downloadCriteria = createDownloadCriteria(
        		DOWNLOAD_11_DOWNSTREAM,
        		DOWNLOAD_11_UPSTREAM,
        		DOWNLOAD_11_START,
        		DOWNLOAD_11_END,
        		DOWNLOAD_11_REFERENCE,
        		DOWNLOAD_11_ALTERNATIVE,
        		DOWNLOAD_11_FORMAT,
        		DOWNLOAD_11_QUOTES,
        		DOWNLOAD_11_HEADERS,
        		DOWNLOAD_11_CHROMOSOME_ID
        		);
        
        List<SNPChromosome> expected = new ArrayList<SNPChromosome>();
        
        when(serviceSNPChromosome11Mock.download(downloadCriteria)).thenReturn(expected);
        
        CSVResponse csvResponse = controller.download(downloadCriteria);
        
        verify(serviceSNPChromosome11Mock, times(1)).download(downloadCriteria);
        
        verifyNoMoreInteractions(serviceSNPChromosome11Mock);
        
        List<SNPChromosome> actual = csvResponse;
        
        assertEquals(expected, actual);
    }

	
    @Test
    public void search12() {
    	
        DTOSearch dtoSearch = createSearchCriteria(
        		SEARCH_12_PAGE_INDEX,
        		SEARCH_12_GENE_NAME,
        		SEARCH_12_DOWNSTREAM,
        		SEARCH_12_UPSTREAM,
        		SEARCH_12_START,
        		SEARCH_12_END,
        		SEARCH_12_REFERENCE,
        		SEARCH_12_ALTERNATIVE,
        		SEARCH_12_CHROMOSOME_ID
        		);
        
        PageSNPChromosome expected = null;
        
        when(serviceSNPChromosome12Mock.search(dtoSearch, SEARCH_12_PAGE_INDEX)).thenReturn((PageSNPChromosome) expected);
        
        BindingAwareModelMap model = new BindingAwareModelMap();
        RedirectAttributes attributes = new RedirectAttributesModelMap();

        String view = controller.search(dtoSearch, model, attributes);
        
        verify(serviceSNPChromosome12Mock, times(1)).search(dtoSearch, SEARCH_12_PAGE_INDEX);
        verifyNoMoreInteractions(serviceSNPChromosome12Mock);
        
        assertEquals(ControllerSNPChromosome.SNPCHROMOSOME_SEARCH_RESULT_VIEW, view);
        
        PageSNPChromosome actual = (PageSNPChromosome) model.asMap().get(ControllerSNPChromosome.MODEL_ATTRIBUTE_SNPCHROMOSOMES);
        
        assertEquals(expected, actual);
    }


	@Test
    public void download12() throws IOException {
    	
        DTODownload downloadCriteria = createDownloadCriteria(
        		DOWNLOAD_12_DOWNSTREAM,
        		DOWNLOAD_12_UPSTREAM,
        		DOWNLOAD_12_START,
        		DOWNLOAD_12_END,
        		DOWNLOAD_12_REFERENCE,
        		DOWNLOAD_12_ALTERNATIVE,
        		DOWNLOAD_12_FORMAT,
        		DOWNLOAD_12_QUOTES,
        		DOWNLOAD_12_HEADERS,
        		DOWNLOAD_12_CHROMOSOME_ID
        		);
        
        List<SNPChromosome> expected = new ArrayList<SNPChromosome>();
        
        when(serviceSNPChromosome12Mock.download(downloadCriteria)).thenReturn(expected);
        
        CSVResponse csvResponse = controller.download(downloadCriteria);
        
        verify(serviceSNPChromosome12Mock, times(1)).download(downloadCriteria);
        
        verifyNoMoreInteractions(serviceSNPChromosome12Mock);
        
        List<SNPChromosome> actual = csvResponse;
        
        assertEquals(expected, actual);
    }

	
    @Test
    public void search13() {
    	
        DTOSearch dtoSearch = createSearchCriteria(
        		SEARCH_13_PAGE_INDEX,
        		SEARCH_13_GENE_NAME,
        		SEARCH_13_DOWNSTREAM,
        		SEARCH_13_UPSTREAM,
        		SEARCH_13_START,
        		SEARCH_13_END,
        		SEARCH_13_REFERENCE,
        		SEARCH_13_ALTERNATIVE,
        		SEARCH_13_CHROMOSOME_ID
        		);
        
        PageSNPChromosome expected = null;
        
        when(serviceSNPChromosome13Mock.search(dtoSearch, SEARCH_13_PAGE_INDEX)).thenReturn((PageSNPChromosome) expected);
        
        BindingAwareModelMap model = new BindingAwareModelMap();
        RedirectAttributes attributes = new RedirectAttributesModelMap();

        String view = controller.search(dtoSearch, model, attributes);
        
        verify(serviceSNPChromosome13Mock, times(1)).search(dtoSearch, SEARCH_13_PAGE_INDEX);
        verifyNoMoreInteractions(serviceSNPChromosome13Mock);
        
        assertEquals(ControllerSNPChromosome.SNPCHROMOSOME_SEARCH_RESULT_VIEW, view);
        
        PageSNPChromosome actual = (PageSNPChromosome) model.asMap().get(ControllerSNPChromosome.MODEL_ATTRIBUTE_SNPCHROMOSOMES);
        
        assertEquals(expected, actual);
    }


	@Test
    public void download13() throws IOException {
    	
        DTODownload downloadCriteria = createDownloadCriteria(
        		DOWNLOAD_13_DOWNSTREAM,
        		DOWNLOAD_13_UPSTREAM,
        		DOWNLOAD_13_START,
        		DOWNLOAD_13_END,
        		DOWNLOAD_13_REFERENCE,
        		DOWNLOAD_13_ALTERNATIVE,
        		DOWNLOAD_13_FORMAT,
        		DOWNLOAD_13_QUOTES,
        		DOWNLOAD_13_HEADERS,
        		DOWNLOAD_13_CHROMOSOME_ID
        		);
        
        List<SNPChromosome> expected = new ArrayList<SNPChromosome>();
        
        when(serviceSNPChromosome13Mock.download(downloadCriteria)).thenReturn(expected);
        
        CSVResponse csvResponse = controller.download(downloadCriteria);
        
        verify(serviceSNPChromosome13Mock, times(1)).download(downloadCriteria);
        
        verifyNoMoreInteractions(serviceSNPChromosome13Mock);
        
        List<SNPChromosome> actual = csvResponse;
        
        assertEquals(expected, actual);
    }

	
    @Test
    public void search14() {
    	
        DTOSearch dtoSearch = createSearchCriteria(
        		SEARCH_14_PAGE_INDEX,
        		SEARCH_14_GENE_NAME,
        		SEARCH_14_DOWNSTREAM,
        		SEARCH_14_UPSTREAM,
        		SEARCH_14_START,
        		SEARCH_14_END,
        		SEARCH_14_REFERENCE,
        		SEARCH_14_ALTERNATIVE,
        		SEARCH_14_CHROMOSOME_ID
        		);
        
        PageSNPChromosome expected = null;
        
        when(serviceSNPChromosome14Mock.search(dtoSearch, SEARCH_14_PAGE_INDEX)).thenReturn((PageSNPChromosome) expected);
        
        BindingAwareModelMap model = new BindingAwareModelMap();
        RedirectAttributes attributes = new RedirectAttributesModelMap();

        String view = controller.search(dtoSearch, model, attributes);
        
        verify(serviceSNPChromosome14Mock, times(1)).search(dtoSearch, SEARCH_14_PAGE_INDEX);
        verifyNoMoreInteractions(serviceSNPChromosome14Mock);
        
        assertEquals(ControllerSNPChromosome.SNPCHROMOSOME_SEARCH_RESULT_VIEW, view);
        
        PageSNPChromosome actual = (PageSNPChromosome) model.asMap().get(ControllerSNPChromosome.MODEL_ATTRIBUTE_SNPCHROMOSOMES);
        
        assertEquals(expected, actual);
    }


	@Test
    public void download14() throws IOException {
    	
        DTODownload downloadCriteria = createDownloadCriteria(
        		DOWNLOAD_14_DOWNSTREAM,
        		DOWNLOAD_14_UPSTREAM,
        		DOWNLOAD_14_START,
        		DOWNLOAD_14_END,
        		DOWNLOAD_14_REFERENCE,
        		DOWNLOAD_14_ALTERNATIVE,
        		DOWNLOAD_14_FORMAT,
        		DOWNLOAD_14_QUOTES,
        		DOWNLOAD_14_HEADERS,
        		DOWNLOAD_14_CHROMOSOME_ID
        		);
        
        List<SNPChromosome> expected = new ArrayList<SNPChromosome>();
        
        when(serviceSNPChromosome14Mock.download(downloadCriteria)).thenReturn(expected);
        
        CSVResponse csvResponse = controller.download(downloadCriteria);
        
        verify(serviceSNPChromosome14Mock, times(1)).download(downloadCriteria);
        
        verifyNoMoreInteractions(serviceSNPChromosome14Mock);
        
        List<SNPChromosome> actual = csvResponse;
        
        assertEquals(expected, actual);
    }

	
    @Test
    public void search15() {
    	
        DTOSearch dtoSearch = createSearchCriteria(
        		SEARCH_15_PAGE_INDEX,
        		SEARCH_15_GENE_NAME,
        		SEARCH_15_DOWNSTREAM,
        		SEARCH_15_UPSTREAM,
        		SEARCH_15_START,
        		SEARCH_15_END,
        		SEARCH_15_REFERENCE,
        		SEARCH_15_ALTERNATIVE,
        		SEARCH_15_CHROMOSOME_ID
        		);
        
        PageSNPChromosome expected = null;
        
        when(serviceSNPChromosome15Mock.search(dtoSearch, SEARCH_15_PAGE_INDEX)).thenReturn((PageSNPChromosome) expected);
        
        BindingAwareModelMap model = new BindingAwareModelMap();
        RedirectAttributes attributes = new RedirectAttributesModelMap();

        String view = controller.search(dtoSearch, model, attributes);
        
        verify(serviceSNPChromosome15Mock, times(1)).search(dtoSearch, SEARCH_15_PAGE_INDEX);
        verifyNoMoreInteractions(serviceSNPChromosome15Mock);
        
        assertEquals(ControllerSNPChromosome.SNPCHROMOSOME_SEARCH_RESULT_VIEW, view);
        
        PageSNPChromosome actual = (PageSNPChromosome) model.asMap().get(ControllerSNPChromosome.MODEL_ATTRIBUTE_SNPCHROMOSOMES);
        
        assertEquals(expected, actual);
    }


	@Test
    public void download15() throws IOException {
    	
        DTODownload downloadCriteria = createDownloadCriteria(
        		DOWNLOAD_15_DOWNSTREAM,
        		DOWNLOAD_15_UPSTREAM,
        		DOWNLOAD_15_START,
        		DOWNLOAD_15_END,
        		DOWNLOAD_15_REFERENCE,
        		DOWNLOAD_15_ALTERNATIVE,
        		DOWNLOAD_15_FORMAT,
        		DOWNLOAD_15_QUOTES,
        		DOWNLOAD_15_HEADERS,
        		DOWNLOAD_15_CHROMOSOME_ID
        		);
        
        List<SNPChromosome> expected = new ArrayList<SNPChromosome>();
        
        when(serviceSNPChromosome15Mock.download(downloadCriteria)).thenReturn(expected);
        
        CSVResponse csvResponse = controller.download(downloadCriteria);
        
        verify(serviceSNPChromosome15Mock, times(1)).download(downloadCriteria);
        
        verifyNoMoreInteractions(serviceSNPChromosome15Mock);
        
        List<SNPChromosome> actual = csvResponse;
        
        assertEquals(expected, actual);
    }

	
    @Test
    public void search16() {
    	
        DTOSearch dtoSearch = createSearchCriteria(
        		SEARCH_16_PAGE_INDEX,
        		SEARCH_16_GENE_NAME,
        		SEARCH_16_DOWNSTREAM,
        		SEARCH_16_UPSTREAM,
        		SEARCH_16_START,
        		SEARCH_16_END,
        		SEARCH_16_REFERENCE,
        		SEARCH_16_ALTERNATIVE,
        		SEARCH_16_CHROMOSOME_ID
        		);
        
        PageSNPChromosome expected = null;
        
        when(serviceSNPChromosome16Mock.search(dtoSearch, SEARCH_16_PAGE_INDEX)).thenReturn((PageSNPChromosome) expected);
        
        BindingAwareModelMap model = new BindingAwareModelMap();
        RedirectAttributes attributes = new RedirectAttributesModelMap();

        String view = controller.search(dtoSearch, model, attributes);
        
        verify(serviceSNPChromosome16Mock, times(1)).search(dtoSearch, SEARCH_16_PAGE_INDEX);
        verifyNoMoreInteractions(serviceSNPChromosome16Mock);
        
        assertEquals(ControllerSNPChromosome.SNPCHROMOSOME_SEARCH_RESULT_VIEW, view);
        
        PageSNPChromosome actual = (PageSNPChromosome) model.asMap().get(ControllerSNPChromosome.MODEL_ATTRIBUTE_SNPCHROMOSOMES);
        
        assertEquals(expected, actual);
    }


	@Test
    public void download16() throws IOException {
    	
        DTODownload downloadCriteria = createDownloadCriteria(
        		DOWNLOAD_16_DOWNSTREAM,
        		DOWNLOAD_16_UPSTREAM,
        		DOWNLOAD_16_START,
        		DOWNLOAD_16_END,
        		DOWNLOAD_16_REFERENCE,
        		DOWNLOAD_16_ALTERNATIVE,
        		DOWNLOAD_16_FORMAT,
        		DOWNLOAD_16_QUOTES,
        		DOWNLOAD_16_HEADERS,
        		DOWNLOAD_16_CHROMOSOME_ID
        		);
        
        List<SNPChromosome> expected = new ArrayList<SNPChromosome>();
        
        when(serviceSNPChromosome16Mock.download(downloadCriteria)).thenReturn(expected);
        
        CSVResponse csvResponse = controller.download(downloadCriteria);
        
        verify(serviceSNPChromosome16Mock, times(1)).download(downloadCriteria);
        
        verifyNoMoreInteractions(serviceSNPChromosome16Mock);
        
        List<SNPChromosome> actual = csvResponse;
        
        assertEquals(expected, actual);
    }

	
    @Test
    public void search17() {
    	
        DTOSearch dtoSearch = createSearchCriteria(
        		SEARCH_17_PAGE_INDEX,
        		SEARCH_17_GENE_NAME,
        		SEARCH_17_DOWNSTREAM,
        		SEARCH_17_UPSTREAM,
        		SEARCH_17_START,
        		SEARCH_17_END,
        		SEARCH_17_REFERENCE,
        		SEARCH_17_ALTERNATIVE,
        		SEARCH_17_CHROMOSOME_ID
        		);
        
        PageSNPChromosome expected = null;
        
        when(serviceSNPChromosome17Mock.search(dtoSearch, SEARCH_17_PAGE_INDEX)).thenReturn((PageSNPChromosome) expected);
        
        BindingAwareModelMap model = new BindingAwareModelMap();
        RedirectAttributes attributes = new RedirectAttributesModelMap();

        String view = controller.search(dtoSearch, model, attributes);
        
        verify(serviceSNPChromosome17Mock, times(1)).search(dtoSearch, SEARCH_17_PAGE_INDEX);
        verifyNoMoreInteractions(serviceSNPChromosome17Mock);
        
        assertEquals(ControllerSNPChromosome.SNPCHROMOSOME_SEARCH_RESULT_VIEW, view);
        
        PageSNPChromosome actual = (PageSNPChromosome) model.asMap().get(ControllerSNPChromosome.MODEL_ATTRIBUTE_SNPCHROMOSOMES);
        
        assertEquals(expected, actual);
    }


	@Test
    public void download17() throws IOException {
    	
        DTODownload downloadCriteria = createDownloadCriteria(
        		DOWNLOAD_17_DOWNSTREAM,
        		DOWNLOAD_17_UPSTREAM,
        		DOWNLOAD_17_START,
        		DOWNLOAD_17_END,
        		DOWNLOAD_17_REFERENCE,
        		DOWNLOAD_17_ALTERNATIVE,
        		DOWNLOAD_17_FORMAT,
        		DOWNLOAD_17_QUOTES,
        		DOWNLOAD_17_HEADERS,
        		DOWNLOAD_17_CHROMOSOME_ID
        		);
        
        List<SNPChromosome> expected = new ArrayList<SNPChromosome>();
        
        when(serviceSNPChromosome17Mock.download(downloadCriteria)).thenReturn(expected);
        
        CSVResponse csvResponse = controller.download(downloadCriteria);
        
        verify(serviceSNPChromosome17Mock, times(1)).download(downloadCriteria);
        
        verifyNoMoreInteractions(serviceSNPChromosome17Mock);
        
        List<SNPChromosome> actual = csvResponse;
        
        assertEquals(expected, actual);
    }

	
    @Test
    public void search18() {
    	
        DTOSearch dtoSearch = createSearchCriteria(
        		SEARCH_18_PAGE_INDEX,
        		SEARCH_18_GENE_NAME,
        		SEARCH_18_DOWNSTREAM,
        		SEARCH_18_UPSTREAM,
        		SEARCH_18_START,
        		SEARCH_18_END,
        		SEARCH_18_REFERENCE,
        		SEARCH_18_ALTERNATIVE,
        		SEARCH_18_CHROMOSOME_ID
        		);
        
        PageSNPChromosome expected = null;
        
        when(serviceSNPChromosome18Mock.search(dtoSearch, SEARCH_18_PAGE_INDEX)).thenReturn((PageSNPChromosome) expected);
        
        BindingAwareModelMap model = new BindingAwareModelMap();
        RedirectAttributes attributes = new RedirectAttributesModelMap();

        String view = controller.search(dtoSearch, model, attributes);
        
        verify(serviceSNPChromosome18Mock, times(1)).search(dtoSearch, SEARCH_18_PAGE_INDEX);
        verifyNoMoreInteractions(serviceSNPChromosome18Mock);
        
        assertEquals(ControllerSNPChromosome.SNPCHROMOSOME_SEARCH_RESULT_VIEW, view);
        
        PageSNPChromosome actual = (PageSNPChromosome) model.asMap().get(ControllerSNPChromosome.MODEL_ATTRIBUTE_SNPCHROMOSOMES);
        
        assertEquals(expected, actual);
    }


	@Test
    public void download18() throws IOException {
    	
        DTODownload downloadCriteria = createDownloadCriteria(
        		DOWNLOAD_18_DOWNSTREAM,
        		DOWNLOAD_18_UPSTREAM,
        		DOWNLOAD_18_START,
        		DOWNLOAD_18_END,
        		DOWNLOAD_18_REFERENCE,
        		DOWNLOAD_18_ALTERNATIVE,
        		DOWNLOAD_18_FORMAT,
        		DOWNLOAD_18_QUOTES,
        		DOWNLOAD_18_HEADERS,
        		DOWNLOAD_18_CHROMOSOME_ID
        		);
        
        List<SNPChromosome> expected = new ArrayList<SNPChromosome>();
        
        when(serviceSNPChromosome18Mock.download(downloadCriteria)).thenReturn(expected);
        
        CSVResponse csvResponse = controller.download(downloadCriteria);
        
        verify(serviceSNPChromosome18Mock, times(1)).download(downloadCriteria);
        
        verifyNoMoreInteractions(serviceSNPChromosome18Mock);
        
        List<SNPChromosome> actual = csvResponse;
        
        assertEquals(expected, actual);
    }

	
    @Test
    public void search19() {
    	
        DTOSearch dtoSearch = createSearchCriteria(
        		SEARCH_19_PAGE_INDEX,
        		SEARCH_19_GENE_NAME,
        		SEARCH_19_DOWNSTREAM,
        		SEARCH_19_UPSTREAM,
        		SEARCH_19_START,
        		SEARCH_19_END,
        		SEARCH_19_REFERENCE,
        		SEARCH_19_ALTERNATIVE,
        		SEARCH_19_CHROMOSOME_ID
        		);
        
        PageSNPChromosome expected = null;
        
        when(serviceSNPChromosome19Mock.search(dtoSearch, SEARCH_19_PAGE_INDEX)).thenReturn((PageSNPChromosome) expected);
        
        BindingAwareModelMap model = new BindingAwareModelMap();
        RedirectAttributes attributes = new RedirectAttributesModelMap();

        String view = controller.search(dtoSearch, model, attributes);
        
        verify(serviceSNPChromosome19Mock, times(1)).search(dtoSearch, SEARCH_19_PAGE_INDEX);
        verifyNoMoreInteractions(serviceSNPChromosome19Mock);
        
        assertEquals(ControllerSNPChromosome.SNPCHROMOSOME_SEARCH_RESULT_VIEW, view);
        
        PageSNPChromosome actual = (PageSNPChromosome) model.asMap().get(ControllerSNPChromosome.MODEL_ATTRIBUTE_SNPCHROMOSOMES);
        
        assertEquals(expected, actual);
    }


	@Test
    public void download19() throws IOException {
    	
        DTODownload downloadCriteria = createDownloadCriteria(
        		DOWNLOAD_19_DOWNSTREAM,
        		DOWNLOAD_19_UPSTREAM,
        		DOWNLOAD_19_START,
        		DOWNLOAD_19_END,
        		DOWNLOAD_19_REFERENCE,
        		DOWNLOAD_19_ALTERNATIVE,
        		DOWNLOAD_19_FORMAT,
        		DOWNLOAD_19_QUOTES,
        		DOWNLOAD_19_HEADERS,
        		DOWNLOAD_19_CHROMOSOME_ID
        		);
        
        List<SNPChromosome> expected = new ArrayList<SNPChromosome>();
        
        when(serviceSNPChromosome19Mock.download(downloadCriteria)).thenReturn(expected);
        
        CSVResponse csvResponse = controller.download(downloadCriteria);
        
        verify(serviceSNPChromosome19Mock, times(1)).download(downloadCriteria);
        
        verifyNoMoreInteractions(serviceSNPChromosome19Mock);
        
        List<SNPChromosome> actual = csvResponse;
        
        assertEquals(expected, actual);
    }

	
    @Test
    public void search20() {
    	
        DTOSearch dtoSearch = createSearchCriteria(
        		SEARCH_20_PAGE_INDEX,
        		SEARCH_20_GENE_NAME,
        		SEARCH_20_DOWNSTREAM,
        		SEARCH_20_UPSTREAM,
        		SEARCH_20_START,
        		SEARCH_20_END,
        		SEARCH_20_REFERENCE,
        		SEARCH_20_ALTERNATIVE,
        		SEARCH_20_CHROMOSOME_ID
        		);
        
        PageSNPChromosome expected = null;
        
        when(serviceSNPChromosome20Mock.search(dtoSearch, SEARCH_20_PAGE_INDEX)).thenReturn((PageSNPChromosome) expected);
        
        BindingAwareModelMap model = new BindingAwareModelMap();
        RedirectAttributes attributes = new RedirectAttributesModelMap();

        String view = controller.search(dtoSearch, model, attributes);
        
        verify(serviceSNPChromosome20Mock, times(1)).search(dtoSearch, SEARCH_20_PAGE_INDEX);
        verifyNoMoreInteractions(serviceSNPChromosome20Mock);
        
        assertEquals(ControllerSNPChromosome.SNPCHROMOSOME_SEARCH_RESULT_VIEW, view);
        
        PageSNPChromosome actual = (PageSNPChromosome) model.asMap().get(ControllerSNPChromosome.MODEL_ATTRIBUTE_SNPCHROMOSOMES);
        
        assertEquals(expected, actual);
    }


	@Test
    public void download20() throws IOException {
    	
        DTODownload downloadCriteria = createDownloadCriteria(
        		DOWNLOAD_20_DOWNSTREAM,
        		DOWNLOAD_20_UPSTREAM,
        		DOWNLOAD_20_START,
        		DOWNLOAD_20_END,
        		DOWNLOAD_20_REFERENCE,
        		DOWNLOAD_20_ALTERNATIVE,
        		DOWNLOAD_20_FORMAT,
        		DOWNLOAD_20_QUOTES,
        		DOWNLOAD_20_HEADERS,
        		DOWNLOAD_20_CHROMOSOME_ID
        		);
        
        List<SNPChromosome> expected = new ArrayList<SNPChromosome>();
        
        when(serviceSNPChromosome20Mock.download(downloadCriteria)).thenReturn(expected);
        
        CSVResponse csvResponse = controller.download(downloadCriteria);
        
        verify(serviceSNPChromosome20Mock, times(1)).download(downloadCriteria);
        
        verifyNoMoreInteractions(serviceSNPChromosome20Mock);
        
        List<SNPChromosome> actual = csvResponse;
        
        assertEquals(expected, actual);
    }

	
    @Test
    public void search21() {
    	
        DTOSearch dtoSearch = createSearchCriteria(
        		SEARCH_21_PAGE_INDEX,
        		SEARCH_21_GENE_NAME,
        		SEARCH_21_DOWNSTREAM,
        		SEARCH_21_UPSTREAM,
        		SEARCH_21_START,
        		SEARCH_21_END,
        		SEARCH_21_REFERENCE,
        		SEARCH_21_ALTERNATIVE,
        		SEARCH_21_CHROMOSOME_ID
        		);
        
        PageSNPChromosome expected = null;
        
        when(serviceSNPChromosome21Mock.search(dtoSearch, SEARCH_21_PAGE_INDEX)).thenReturn((PageSNPChromosome) expected);
        
        BindingAwareModelMap model = new BindingAwareModelMap();
        RedirectAttributes attributes = new RedirectAttributesModelMap();

        String view = controller.search(dtoSearch, model, attributes);
        
        verify(serviceSNPChromosome21Mock, times(1)).search(dtoSearch, SEARCH_21_PAGE_INDEX);
        verifyNoMoreInteractions(serviceSNPChromosome21Mock);
        
        assertEquals(ControllerSNPChromosome.SNPCHROMOSOME_SEARCH_RESULT_VIEW, view);
        
        PageSNPChromosome actual = (PageSNPChromosome) model.asMap().get(ControllerSNPChromosome.MODEL_ATTRIBUTE_SNPCHROMOSOMES);
        
        assertEquals(expected, actual);
    }


	@Test
    public void download21() throws IOException {
    	
        DTODownload downloadCriteria = createDownloadCriteria(
        		DOWNLOAD_21_DOWNSTREAM,
        		DOWNLOAD_21_UPSTREAM,
        		DOWNLOAD_21_START,
        		DOWNLOAD_21_END,
        		DOWNLOAD_21_REFERENCE,
        		DOWNLOAD_21_ALTERNATIVE,
        		DOWNLOAD_21_FORMAT,
        		DOWNLOAD_21_QUOTES,
        		DOWNLOAD_21_HEADERS,
        		DOWNLOAD_21_CHROMOSOME_ID
        		);
        
        List<SNPChromosome> expected = new ArrayList<SNPChromosome>();
        
        when(serviceSNPChromosome21Mock.download(downloadCriteria)).thenReturn(expected);
        
        CSVResponse csvResponse = controller.download(downloadCriteria);
        
        verify(serviceSNPChromosome21Mock, times(1)).download(downloadCriteria);
        
        verifyNoMoreInteractions(serviceSNPChromosome21Mock);
        
        List<SNPChromosome> actual = csvResponse;
        
        assertEquals(expected, actual);
    }

	
    @Test
    public void search22() {
    	
        DTOSearch dtoSearch = createSearchCriteria(
        		SEARCH_22_PAGE_INDEX,
        		SEARCH_22_GENE_NAME,
        		SEARCH_22_DOWNSTREAM,
        		SEARCH_22_UPSTREAM,
        		SEARCH_22_START,
        		SEARCH_22_END,
        		SEARCH_22_REFERENCE,
        		SEARCH_22_ALTERNATIVE,
        		SEARCH_22_CHROMOSOME_ID
        		);
        
        PageSNPChromosome expected = null;
        
        when(serviceSNPChromosome22Mock.search(dtoSearch, SEARCH_22_PAGE_INDEX)).thenReturn((PageSNPChromosome) expected);
        
        BindingAwareModelMap model = new BindingAwareModelMap();
        RedirectAttributes attributes = new RedirectAttributesModelMap();

        String view = controller.search(dtoSearch, model, attributes);
        
        verify(serviceSNPChromosome22Mock, times(1)).search(dtoSearch, SEARCH_22_PAGE_INDEX);
        verifyNoMoreInteractions(serviceSNPChromosome22Mock);
        
        assertEquals(ControllerSNPChromosome.SNPCHROMOSOME_SEARCH_RESULT_VIEW, view);
        
        PageSNPChromosome actual = (PageSNPChromosome) model.asMap().get(ControllerSNPChromosome.MODEL_ATTRIBUTE_SNPCHROMOSOMES);
        
        assertEquals(expected, actual);
    }


	@Test
    public void download22() throws IOException {
    	
        DTODownload downloadCriteria = createDownloadCriteria(
        		DOWNLOAD_22_DOWNSTREAM,
        		DOWNLOAD_22_UPSTREAM,
        		DOWNLOAD_22_START,
        		DOWNLOAD_22_END,
        		DOWNLOAD_22_REFERENCE,
        		DOWNLOAD_22_ALTERNATIVE,
        		DOWNLOAD_22_FORMAT,
        		DOWNLOAD_22_QUOTES,
        		DOWNLOAD_22_HEADERS,
        		DOWNLOAD_22_CHROMOSOME_ID
        		);
        
        List<SNPChromosome> expected = new ArrayList<SNPChromosome>();
        
        when(serviceSNPChromosome22Mock.download(downloadCriteria)).thenReturn(expected);
        
        CSVResponse csvResponse = controller.download(downloadCriteria);
        
        verify(serviceSNPChromosome22Mock, times(1)).download(downloadCriteria);
        
        verifyNoMoreInteractions(serviceSNPChromosome22Mock);
        
        List<SNPChromosome> actual = csvResponse;
        
        assertEquals(expected, actual);
    }

	
    @Test
    public void search23() {
    	
        DTOSearch dtoSearch = createSearchCriteria(
        		SEARCH_23_PAGE_INDEX,
        		SEARCH_23_GENE_NAME,
        		SEARCH_23_DOWNSTREAM,
        		SEARCH_23_UPSTREAM,
        		SEARCH_23_START,
        		SEARCH_23_END,
        		SEARCH_23_REFERENCE,
        		SEARCH_23_ALTERNATIVE,
        		SEARCH_23_CHROMOSOME_ID
        		);
        
        PageSNPChromosome expected = null;
        
        when(serviceSNPChromosome23Mock.search(dtoSearch, SEARCH_23_PAGE_INDEX)).thenReturn((PageSNPChromosome) expected);
        
        BindingAwareModelMap model = new BindingAwareModelMap();
        RedirectAttributes attributes = new RedirectAttributesModelMap();

        String view = controller.search(dtoSearch, model, attributes);
        
        verify(serviceSNPChromosome23Mock, times(1)).search(dtoSearch, SEARCH_23_PAGE_INDEX);
        verifyNoMoreInteractions(serviceSNPChromosome23Mock);
        
        assertEquals(ControllerSNPChromosome.SNPCHROMOSOME_SEARCH_RESULT_VIEW, view);
        
        PageSNPChromosome actual = (PageSNPChromosome) model.asMap().get(ControllerSNPChromosome.MODEL_ATTRIBUTE_SNPCHROMOSOMES);
        
        assertEquals(expected, actual);
    }


	@Test
    public void download23() throws IOException {
    	
        DTODownload downloadCriteria = createDownloadCriteria(
        		DOWNLOAD_23_DOWNSTREAM,
        		DOWNLOAD_23_UPSTREAM,
        		DOWNLOAD_23_START,
        		DOWNLOAD_23_END,
        		DOWNLOAD_23_REFERENCE,
        		DOWNLOAD_23_ALTERNATIVE,
        		DOWNLOAD_23_FORMAT,
        		DOWNLOAD_23_QUOTES,
        		DOWNLOAD_23_HEADERS,
        		DOWNLOAD_23_CHROMOSOME_ID
        		);
        
        List<SNPChromosome> expected = new ArrayList<SNPChromosome>();
        
        when(serviceSNPChromosome23Mock.download(downloadCriteria)).thenReturn(expected);
        
        CSVResponse csvResponse = controller.download(downloadCriteria);
        
        verify(serviceSNPChromosome23Mock, times(1)).download(downloadCriteria);
        
        verifyNoMoreInteractions(serviceSNPChromosome23Mock);
        
        List<SNPChromosome> actual = csvResponse;
        
        assertEquals(expected, actual);
    }

	
    @Test
    public void search24() {
    	
        DTOSearch dtoSearch = createSearchCriteria(
        		SEARCH_24_PAGE_INDEX,
        		SEARCH_24_GENE_NAME,
        		SEARCH_24_DOWNSTREAM,
        		SEARCH_24_UPSTREAM,
        		SEARCH_24_START,
        		SEARCH_24_END,
        		SEARCH_24_REFERENCE,
        		SEARCH_24_ALTERNATIVE,
        		SEARCH_24_CHROMOSOME_ID
        		);
        
        PageSNPChromosome expected = null;
        
        when(serviceSNPChromosome24Mock.search(dtoSearch, SEARCH_24_PAGE_INDEX)).thenReturn((PageSNPChromosome) expected);
        
        BindingAwareModelMap model = new BindingAwareModelMap();
        RedirectAttributes attributes = new RedirectAttributesModelMap();

        String view = controller.search(dtoSearch, model, attributes);
        
        verify(serviceSNPChromosome24Mock, times(1)).search(dtoSearch, SEARCH_24_PAGE_INDEX);
        verifyNoMoreInteractions(serviceSNPChromosome24Mock);
        
        assertEquals(ControllerSNPChromosome.SNPCHROMOSOME_SEARCH_RESULT_VIEW, view);
        
        PageSNPChromosome actual = (PageSNPChromosome) model.asMap().get(ControllerSNPChromosome.MODEL_ATTRIBUTE_SNPCHROMOSOMES);
        
        assertEquals(expected, actual);
    }


	@Test
    public void download24() throws IOException {
    	
        DTODownload downloadCriteria = createDownloadCriteria(
        		DOWNLOAD_24_DOWNSTREAM,
        		DOWNLOAD_24_UPSTREAM,
        		DOWNLOAD_24_START,
        		DOWNLOAD_24_END,
        		DOWNLOAD_24_REFERENCE,
        		DOWNLOAD_24_ALTERNATIVE,
        		DOWNLOAD_24_FORMAT,
        		DOWNLOAD_24_QUOTES,
        		DOWNLOAD_24_HEADERS,
        		DOWNLOAD_24_CHROMOSOME_ID
        		);
        
        List<SNPChromosome> expected = new ArrayList<SNPChromosome>();
        
        when(serviceSNPChromosome24Mock.download(downloadCriteria)).thenReturn(expected);
        
        CSVResponse csvResponse = controller.download(downloadCriteria);
        
        verify(serviceSNPChromosome24Mock, times(1)).download(downloadCriteria);
        
        verifyNoMoreInteractions(serviceSNPChromosome24Mock);
        
        List<SNPChromosome> actual = csvResponse;
        
        assertEquals(expected, actual);
    }

	
    @Test
    public void search25() {
    	
        DTOSearch dtoSearch = createSearchCriteria(
        		SEARCH_25_PAGE_INDEX,
        		SEARCH_25_GENE_NAME,
        		SEARCH_25_DOWNSTREAM,
        		SEARCH_25_UPSTREAM,
        		SEARCH_25_START,
        		SEARCH_25_END,
        		SEARCH_25_REFERENCE,
        		SEARCH_25_ALTERNATIVE,
        		SEARCH_25_CHROMOSOME_ID
        		);
        
        PageSNPChromosome expected = null;
        
        when(serviceSNPChromosome25Mock.search(dtoSearch, SEARCH_25_PAGE_INDEX)).thenReturn((PageSNPChromosome) expected);
        
        BindingAwareModelMap model = new BindingAwareModelMap();
        RedirectAttributes attributes = new RedirectAttributesModelMap();

        String view = controller.search(dtoSearch, model, attributes);
        
        verify(serviceSNPChromosome25Mock, times(1)).search(dtoSearch, SEARCH_25_PAGE_INDEX);
        verifyNoMoreInteractions(serviceSNPChromosome25Mock);
        
        assertEquals(ControllerSNPChromosome.SNPCHROMOSOME_SEARCH_RESULT_VIEW, view);
        
        PageSNPChromosome actual = (PageSNPChromosome) model.asMap().get(ControllerSNPChromosome.MODEL_ATTRIBUTE_SNPCHROMOSOMES);
        
        assertEquals(expected, actual);
    }


	@Test
    public void download25() throws IOException {
    	
        DTODownload downloadCriteria = createDownloadCriteria(
        		DOWNLOAD_25_DOWNSTREAM,
        		DOWNLOAD_25_UPSTREAM,
        		DOWNLOAD_25_START,
        		DOWNLOAD_25_END,
        		DOWNLOAD_25_REFERENCE,
        		DOWNLOAD_25_ALTERNATIVE,
        		DOWNLOAD_25_FORMAT,
        		DOWNLOAD_25_QUOTES,
        		DOWNLOAD_25_HEADERS,
        		DOWNLOAD_25_CHROMOSOME_ID
        		);
        
        List<SNPChromosome> expected = new ArrayList<SNPChromosome>();
        
        when(serviceSNPChromosome25Mock.download(downloadCriteria)).thenReturn(expected);
        
        CSVResponse csvResponse = controller.download(downloadCriteria);
        
        verify(serviceSNPChromosome25Mock, times(1)).download(downloadCriteria);
        
        verifyNoMoreInteractions(serviceSNPChromosome25Mock);
        
        List<SNPChromosome> actual = csvResponse;
        
        assertEquals(expected, actual);
    }

	
    @Test
    public void search26() {
    	
        DTOSearch dtoSearch = createSearchCriteria(
        		SEARCH_26_PAGE_INDEX,
        		SEARCH_26_GENE_NAME,
        		SEARCH_26_DOWNSTREAM,
        		SEARCH_26_UPSTREAM,
        		SEARCH_26_START,
        		SEARCH_26_END,
        		SEARCH_26_REFERENCE,
        		SEARCH_26_ALTERNATIVE,
        		SEARCH_26_CHROMOSOME_ID
        		);
        
        PageSNPChromosome expected = null;
        
        when(serviceSNPChromosome26Mock.search(dtoSearch, SEARCH_26_PAGE_INDEX)).thenReturn((PageSNPChromosome) expected);
        
        BindingAwareModelMap model = new BindingAwareModelMap();
        RedirectAttributes attributes = new RedirectAttributesModelMap();

        String view = controller.search(dtoSearch, model, attributes);
        
        verify(serviceSNPChromosome26Mock, times(1)).search(dtoSearch, SEARCH_26_PAGE_INDEX);
        verifyNoMoreInteractions(serviceSNPChromosome26Mock);
        
        assertEquals(ControllerSNPChromosome.SNPCHROMOSOME_SEARCH_RESULT_VIEW, view);
        
        PageSNPChromosome actual = (PageSNPChromosome) model.asMap().get(ControllerSNPChromosome.MODEL_ATTRIBUTE_SNPCHROMOSOMES);
        
        assertEquals(expected, actual);
    }


	@Test
    public void download26() throws IOException {
    	
        DTODownload downloadCriteria = createDownloadCriteria(
        		DOWNLOAD_26_DOWNSTREAM,
        		DOWNLOAD_26_UPSTREAM,
        		DOWNLOAD_26_START,
        		DOWNLOAD_26_END,
        		DOWNLOAD_26_REFERENCE,
        		DOWNLOAD_26_ALTERNATIVE,
        		DOWNLOAD_26_FORMAT,
        		DOWNLOAD_26_QUOTES,
        		DOWNLOAD_26_HEADERS,
        		DOWNLOAD_26_CHROMOSOME_ID
        		);
        
        List<SNPChromosome> expected = new ArrayList<SNPChromosome>();
        
        when(serviceSNPChromosome26Mock.download(downloadCriteria)).thenReturn(expected);
        
        CSVResponse csvResponse = controller.download(downloadCriteria);
        
        verify(serviceSNPChromosome26Mock, times(1)).download(downloadCriteria);
        
        verifyNoMoreInteractions(serviceSNPChromosome26Mock);
        
        List<SNPChromosome> actual = csvResponse;
        
        assertEquals(expected, actual);
    }

	
    @Test
    public void search27() {
    	
        DTOSearch dtoSearch = createSearchCriteria(
        		SEARCH_27_PAGE_INDEX,
        		SEARCH_27_GENE_NAME,
        		SEARCH_27_DOWNSTREAM,
        		SEARCH_27_UPSTREAM,
        		SEARCH_27_START,
        		SEARCH_27_END,
        		SEARCH_27_REFERENCE,
        		SEARCH_27_ALTERNATIVE,
        		SEARCH_27_CHROMOSOME_ID
        		);
        
        PageSNPChromosome expected = null;
        
        when(serviceSNPChromosome27Mock.search(dtoSearch, SEARCH_27_PAGE_INDEX)).thenReturn((PageSNPChromosome) expected);
        
        BindingAwareModelMap model = new BindingAwareModelMap();
        RedirectAttributes attributes = new RedirectAttributesModelMap();

        String view = controller.search(dtoSearch, model, attributes);
        
        verify(serviceSNPChromosome27Mock, times(1)).search(dtoSearch, SEARCH_27_PAGE_INDEX);
        verifyNoMoreInteractions(serviceSNPChromosome27Mock);
        
        assertEquals(ControllerSNPChromosome.SNPCHROMOSOME_SEARCH_RESULT_VIEW, view);
        
        PageSNPChromosome actual = (PageSNPChromosome) model.asMap().get(ControllerSNPChromosome.MODEL_ATTRIBUTE_SNPCHROMOSOMES);
        
        assertEquals(expected, actual);
    }


	@Test
    public void download27() throws IOException {
    	
        DTODownload downloadCriteria = createDownloadCriteria(
        		DOWNLOAD_27_DOWNSTREAM,
        		DOWNLOAD_27_UPSTREAM,
        		DOWNLOAD_27_START,
        		DOWNLOAD_27_END,
        		DOWNLOAD_27_REFERENCE,
        		DOWNLOAD_27_ALTERNATIVE,
        		DOWNLOAD_27_FORMAT,
        		DOWNLOAD_27_QUOTES,
        		DOWNLOAD_27_HEADERS,
        		DOWNLOAD_27_CHROMOSOME_ID
        		);
        
        List<SNPChromosome> expected = new ArrayList<SNPChromosome>();
        
        when(serviceSNPChromosome27Mock.download(downloadCriteria)).thenReturn(expected);
        
        CSVResponse csvResponse = controller.download(downloadCriteria);
        
        verify(serviceSNPChromosome27Mock, times(1)).download(downloadCriteria);
        
        verifyNoMoreInteractions(serviceSNPChromosome27Mock);
        
        List<SNPChromosome> actual = csvResponse;
        
        assertEquals(expected, actual);
    }

	
    @Test
    public void search28() {
    	
        DTOSearch dtoSearch = createSearchCriteria(
        		SEARCH_28_PAGE_INDEX,
        		SEARCH_28_GENE_NAME,
        		SEARCH_28_DOWNSTREAM,
        		SEARCH_28_UPSTREAM,
        		SEARCH_28_START,
        		SEARCH_28_END,
        		SEARCH_28_REFERENCE,
        		SEARCH_28_ALTERNATIVE,
        		SEARCH_28_CHROMOSOME_ID
        		);
        
        PageSNPChromosome expected = null;
        
        when(serviceSNPChromosome28Mock.search(dtoSearch, SEARCH_28_PAGE_INDEX)).thenReturn((PageSNPChromosome) expected);
        
        BindingAwareModelMap model = new BindingAwareModelMap();
        RedirectAttributes attributes = new RedirectAttributesModelMap();

        String view = controller.search(dtoSearch, model, attributes);
        
        verify(serviceSNPChromosome28Mock, times(1)).search(dtoSearch, SEARCH_28_PAGE_INDEX);
        verifyNoMoreInteractions(serviceSNPChromosome28Mock);
        
        assertEquals(ControllerSNPChromosome.SNPCHROMOSOME_SEARCH_RESULT_VIEW, view);
        
        PageSNPChromosome actual = (PageSNPChromosome) model.asMap().get(ControllerSNPChromosome.MODEL_ATTRIBUTE_SNPCHROMOSOMES);
        
        assertEquals(expected, actual);
    }


	@Test
    public void download28() throws IOException {
    	
        DTODownload downloadCriteria = createDownloadCriteria(
        		DOWNLOAD_28_DOWNSTREAM,
        		DOWNLOAD_28_UPSTREAM,
        		DOWNLOAD_28_START,
        		DOWNLOAD_28_END,
        		DOWNLOAD_28_REFERENCE,
        		DOWNLOAD_28_ALTERNATIVE,
        		DOWNLOAD_28_FORMAT,
        		DOWNLOAD_28_QUOTES,
        		DOWNLOAD_28_HEADERS,
        		DOWNLOAD_28_CHROMOSOME_ID
        		);
        
        List<SNPChromosome> expected = new ArrayList<SNPChromosome>();
        
        when(serviceSNPChromosome28Mock.download(downloadCriteria)).thenReturn(expected);
        
        CSVResponse csvResponse = controller.download(downloadCriteria);
        
        verify(serviceSNPChromosome28Mock, times(1)).download(downloadCriteria);
        
        verifyNoMoreInteractions(serviceSNPChromosome28Mock);
        
        List<SNPChromosome> actual = csvResponse;
        
        assertEquals(expected, actual);
    }

	
    @Test
    public void search32() {
    	
        DTOSearch dtoSearch = createSearchCriteria(
        		SEARCH_32_PAGE_INDEX,
        		SEARCH_32_GENE_NAME,
        		SEARCH_32_DOWNSTREAM,
        		SEARCH_32_UPSTREAM,
        		SEARCH_32_START,
        		SEARCH_32_END,
        		SEARCH_32_REFERENCE,
        		SEARCH_32_ALTERNATIVE,
        		SEARCH_32_CHROMOSOME_ID
        		);
        
        PageSNPChromosome expected = null;
        
        when(serviceSNPChromosome32Mock.search(dtoSearch, SEARCH_32_PAGE_INDEX)).thenReturn((PageSNPChromosome) expected);
        
        BindingAwareModelMap model = new BindingAwareModelMap();
        RedirectAttributes attributes = new RedirectAttributesModelMap();

        String view = controller.search(dtoSearch, model, attributes);
        
        verify(serviceSNPChromosome32Mock, times(1)).search(dtoSearch, SEARCH_32_PAGE_INDEX);
        verifyNoMoreInteractions(serviceSNPChromosome32Mock);
        
        assertEquals(ControllerSNPChromosome.SNPCHROMOSOME_SEARCH_RESULT_VIEW, view);
        
        PageSNPChromosome actual = (PageSNPChromosome) model.asMap().get(ControllerSNPChromosome.MODEL_ATTRIBUTE_SNPCHROMOSOMES);
        
        assertEquals(expected, actual);
    }


	@Test
    public void download32() throws IOException {
    	
        DTODownload downloadCriteria = createDownloadCriteria(
        		DOWNLOAD_32_DOWNSTREAM,
        		DOWNLOAD_32_UPSTREAM,
        		DOWNLOAD_32_START,
        		DOWNLOAD_32_END,
        		DOWNLOAD_32_REFERENCE,
        		DOWNLOAD_32_ALTERNATIVE,
        		DOWNLOAD_32_FORMAT,
        		DOWNLOAD_32_QUOTES,
        		DOWNLOAD_32_HEADERS,
        		DOWNLOAD_32_CHROMOSOME_ID
        		);
        
        List<SNPChromosome> expected = new ArrayList<SNPChromosome>();
        
        when(serviceSNPChromosome32Mock.download(downloadCriteria)).thenReturn(expected);
        
        CSVResponse csvResponse = controller.download(downloadCriteria);
        
        verify(serviceSNPChromosome32Mock, times(1)).download(downloadCriteria);
        
        verifyNoMoreInteractions(serviceSNPChromosome32Mock);
        
        List<SNPChromosome> actual = csvResponse;
        
        assertEquals(expected, actual);
    }

	
    @Test
    public void searchW() {
    	
        DTOSearch dtoSearch = createSearchCriteria(
        		SEARCH_W_PAGE_INDEX,
        		SEARCH_W_GENE_NAME,
        		SEARCH_W_DOWNSTREAM,
        		SEARCH_W_UPSTREAM,
        		SEARCH_W_START,
        		SEARCH_W_END,
        		SEARCH_W_REFERENCE,
        		SEARCH_W_ALTERNATIVE,
        		SEARCH_W_CHROMOSOME_ID
        		);
        
        PageSNPChromosome expected = null;
        
        when(serviceSNPChromosomeWMock.search(dtoSearch, SEARCH_W_PAGE_INDEX)).thenReturn((PageSNPChromosome) expected);
        
        BindingAwareModelMap model = new BindingAwareModelMap();
        RedirectAttributes attributes = new RedirectAttributesModelMap();

        String view = controller.search(dtoSearch, model, attributes);
        
        verify(serviceSNPChromosomeWMock, times(1)).search(dtoSearch, SEARCH_W_PAGE_INDEX);
        verifyNoMoreInteractions(serviceSNPChromosomeWMock);
        
        assertEquals(ControllerSNPChromosome.SNPCHROMOSOME_SEARCH_RESULT_VIEW, view);
        
        PageSNPChromosome actual = (PageSNPChromosome) model.asMap().get(ControllerSNPChromosome.MODEL_ATTRIBUTE_SNPCHROMOSOMES);
        
        assertEquals(expected, actual);
    }


	@Test
    public void downloadW() throws IOException {
    	
        DTODownload downloadCriteria = createDownloadCriteria(
        		DOWNLOAD_W_DOWNSTREAM,
        		DOWNLOAD_W_UPSTREAM,
        		DOWNLOAD_W_START,
        		DOWNLOAD_W_END,
        		DOWNLOAD_W_REFERENCE,
        		DOWNLOAD_W_ALTERNATIVE,
        		DOWNLOAD_W_FORMAT,
        		DOWNLOAD_W_QUOTES,
        		DOWNLOAD_W_HEADERS,
        		DOWNLOAD_W_CHROMOSOME_ID
        		);
        
        List<SNPChromosome> expected = new ArrayList<SNPChromosome>();
        
        when(serviceSNPChromosomeWMock.download(downloadCriteria)).thenReturn(expected);
        
        CSVResponse csvResponse = controller.download(downloadCriteria);
        
        verify(serviceSNPChromosomeWMock, times(1)).download(downloadCriteria);
        
        verifyNoMoreInteractions(serviceSNPChromosomeWMock);
        
        List<SNPChromosome> actual = csvResponse;
        
        assertEquals(expected, actual);
    }

	
    @Test
    public void searchZ() {
    	
        DTOSearch dtoSearch = createSearchCriteria(
        		SEARCH_Z_PAGE_INDEX,
        		SEARCH_Z_GENE_NAME,
        		SEARCH_Z_DOWNSTREAM,
        		SEARCH_Z_UPSTREAM,
        		SEARCH_Z_START,
        		SEARCH_Z_END,
        		SEARCH_Z_REFERENCE,
        		SEARCH_Z_ALTERNATIVE,
        		SEARCH_Z_CHROMOSOME_ID
        		);
        
        PageSNPChromosome expected = null;
        
        when(serviceSNPChromosomeZMock.search(dtoSearch, SEARCH_Z_PAGE_INDEX)).thenReturn((PageSNPChromosome) expected);
        
        BindingAwareModelMap model = new BindingAwareModelMap();
        RedirectAttributes attributes = new RedirectAttributesModelMap();

        String view = controller.search(dtoSearch, model, attributes);
        
        verify(serviceSNPChromosomeZMock, times(1)).search(dtoSearch, SEARCH_Z_PAGE_INDEX);
        verifyNoMoreInteractions(serviceSNPChromosomeZMock);
        
        assertEquals(ControllerSNPChromosome.SNPCHROMOSOME_SEARCH_RESULT_VIEW, view);
        
        PageSNPChromosome actual = (PageSNPChromosome) model.asMap().get(ControllerSNPChromosome.MODEL_ATTRIBUTE_SNPCHROMOSOMES);
        
        assertEquals(expected, actual);
    }


	@Test
    public void downloadZ() throws IOException {
    	
        DTODownload downloadCriteria = createDownloadCriteria(
        		DOWNLOAD_Z_DOWNSTREAM,
        		DOWNLOAD_Z_UPSTREAM,
        		DOWNLOAD_Z_START,
        		DOWNLOAD_Z_END,
        		DOWNLOAD_Z_REFERENCE,
        		DOWNLOAD_Z_ALTERNATIVE,
        		DOWNLOAD_Z_FORMAT,
        		DOWNLOAD_Z_QUOTES,
        		DOWNLOAD_Z_HEADERS,
        		DOWNLOAD_Z_CHROMOSOME_ID
        		);
        
        List<SNPChromosome> expected = new ArrayList<SNPChromosome>();
        
        when(serviceSNPChromosomeZMock.download(downloadCriteria)).thenReturn(expected);
        
        CSVResponse csvResponse = controller.download(downloadCriteria);
        
        verify(serviceSNPChromosomeZMock, times(1)).download(downloadCriteria);
        
        verifyNoMoreInteractions(serviceSNPChromosomeZMock);
        
        List<SNPChromosome> actual = csvResponse;
        
        assertEquals(expected, actual);
    }

	
    @Test
    public void searchLGE22C19W28_E50C23() {
    	
        DTOSearch dtoSearch = createSearchCriteria(
        		SEARCH_LGE22C19W28_E50C23_PAGE_INDEX,
        		SEARCH_LGE22C19W28_E50C23_GENE_NAME,
        		SEARCH_LGE22C19W28_E50C23_DOWNSTREAM,
        		SEARCH_LGE22C19W28_E50C23_UPSTREAM,
        		SEARCH_LGE22C19W28_E50C23_START,
        		SEARCH_LGE22C19W28_E50C23_END,
        		SEARCH_LGE22C19W28_E50C23_REFERENCE,
        		SEARCH_LGE22C19W28_E50C23_ALTERNATIVE,
        		SEARCH_LGE22C19W28_E50C23_CHROMOSOME_ID
        		);
        
        PageSNPChromosome expected = null;
        
        when(serviceSNPChromosomeLGE22C19W28_E50C23Mock.search(dtoSearch, SEARCH_LGE22C19W28_E50C23_PAGE_INDEX)).thenReturn((PageSNPChromosome) expected);
        
        BindingAwareModelMap model = new BindingAwareModelMap();
        RedirectAttributes attributes = new RedirectAttributesModelMap();

        String view = controller.search(dtoSearch, model, attributes);
        
        verify(serviceSNPChromosomeLGE22C19W28_E50C23Mock, times(1)).search(dtoSearch, SEARCH_LGE22C19W28_E50C23_PAGE_INDEX);
        verifyNoMoreInteractions(serviceSNPChromosomeLGE22C19W28_E50C23Mock);
        
        assertEquals(ControllerSNPChromosome.SNPCHROMOSOME_SEARCH_RESULT_VIEW, view);
        
        PageSNPChromosome actual = (PageSNPChromosome) model.asMap().get(ControllerSNPChromosome.MODEL_ATTRIBUTE_SNPCHROMOSOMES);
        
        assertEquals(expected, actual);
    }


	@Test
    public void downloadLGE22C19W28_E50C23() throws IOException {
    	
        DTODownload downloadCriteria = createDownloadCriteria(
        		DOWNLOAD_LGE22C19W28_E50C23_DOWNSTREAM,
        		DOWNLOAD_LGE22C19W28_E50C23_UPSTREAM,
        		DOWNLOAD_LGE22C19W28_E50C23_START,
        		DOWNLOAD_LGE22C19W28_E50C23_END,
        		DOWNLOAD_LGE22C19W28_E50C23_REFERENCE,
        		DOWNLOAD_LGE22C19W28_E50C23_ALTERNATIVE,
        		DOWNLOAD_LGE22C19W28_E50C23_FORMAT,
        		DOWNLOAD_LGE22C19W28_E50C23_QUOTES,
        		DOWNLOAD_LGE22C19W28_E50C23_HEADERS,
        		DOWNLOAD_LGE22C19W28_E50C23_CHROMOSOME_ID
        		);
        
        List<SNPChromosome> expected = new ArrayList<SNPChromosome>();
        
        when(serviceSNPChromosomeLGE22C19W28_E50C23Mock.download(downloadCriteria)).thenReturn(expected);
        
        CSVResponse csvResponse = controller.download(downloadCriteria);
        
        verify(serviceSNPChromosomeLGE22C19W28_E50C23Mock, times(1)).download(downloadCriteria);
        
        verifyNoMoreInteractions(serviceSNPChromosomeLGE22C19W28_E50C23Mock);
        
        List<SNPChromosome> actual = csvResponse;
        
        assertEquals(expected, actual);
    }

	
    @Test
    public void searchLGE64() {
    	
        DTOSearch dtoSearch = createSearchCriteria(
        		SEARCH_LGE64_PAGE_INDEX,
        		SEARCH_LGE64_GENE_NAME,
        		SEARCH_LGE64_DOWNSTREAM,
        		SEARCH_LGE64_UPSTREAM,
        		SEARCH_LGE64_START,
        		SEARCH_LGE64_END,
        		SEARCH_LGE64_REFERENCE,
        		SEARCH_LGE64_ALTERNATIVE,
        		SEARCH_LGE64_CHROMOSOME_ID
        		);
        
        PageSNPChromosome expected = null;
        
        when(serviceSNPChromosomeLGE64Mock.search(dtoSearch, SEARCH_LGE64_PAGE_INDEX)).thenReturn((PageSNPChromosome) expected);
        
        BindingAwareModelMap model = new BindingAwareModelMap();
        RedirectAttributes attributes = new RedirectAttributesModelMap();

        String view = controller.search(dtoSearch, model, attributes);
        
        verify(serviceSNPChromosomeLGE64Mock, times(1)).search(dtoSearch, SEARCH_LGE64_PAGE_INDEX);
        verifyNoMoreInteractions(serviceSNPChromosomeLGE64Mock);
        
        assertEquals(ControllerSNPChromosome.SNPCHROMOSOME_SEARCH_RESULT_VIEW, view);
        
        PageSNPChromosome actual = (PageSNPChromosome) model.asMap().get(ControllerSNPChromosome.MODEL_ATTRIBUTE_SNPCHROMOSOMES);
        
        assertEquals(expected, actual);
    }


	@Test
    public void downloadLGE64() throws IOException {
    	
        DTODownload downloadCriteria = createDownloadCriteria(
        		DOWNLOAD_LGE64_DOWNSTREAM,
        		DOWNLOAD_LGE64_UPSTREAM,
        		DOWNLOAD_LGE64_START,
        		DOWNLOAD_LGE64_END,
        		DOWNLOAD_LGE64_REFERENCE,
        		DOWNLOAD_LGE64_ALTERNATIVE,
        		DOWNLOAD_LGE64_FORMAT,
        		DOWNLOAD_LGE64_QUOTES,
        		DOWNLOAD_LGE64_HEADERS,
        		DOWNLOAD_LGE64_CHROMOSOME_ID
        		);
        
        List<SNPChromosome> expected = new ArrayList<SNPChromosome>();
        
        when(serviceSNPChromosomeLGE64Mock.download(downloadCriteria)).thenReturn(expected);
        
        CSVResponse csvResponse = controller.download(downloadCriteria);
        
        verify(serviceSNPChromosomeLGE64Mock, times(1)).download(downloadCriteria);
        
        verifyNoMoreInteractions(serviceSNPChromosomeLGE64Mock);
        
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
