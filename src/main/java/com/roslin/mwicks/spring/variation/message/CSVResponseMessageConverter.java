package com.roslin.mwicks.spring.variation.message;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.IOUtils;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import com.roslin.mwicks.spring.variation.model.other.CSVResponse;
import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosome;

import com.roslin.mwicks.utility.CsvUtil;


public class CSVResponseMessageConverter extends AbstractHttpMessageConverter<CSVResponse> {
	
	public static final MediaType MEDIA_TYPE = new MediaType("text", "csv", Charset.forName("utf-8"));
	

	public CSVResponseMessageConverter() {
	
		super(MEDIA_TYPE);
	}


	public CSVResponseMessageConverter(MediaType supportedMediaType) {
	
		super(supportedMediaType);
	}


	public CSVResponseMessageConverter(MediaType... supportedMediaTypes) {
	
		super(supportedMediaTypes);
	}


	@Override
	protected boolean supports(Class<?> clazz) {
	
		return CSVResponse.class.equals(clazz);
	}

    @Override
    protected CSVResponse readInternal(Class<? extends CSVResponse> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        
        CSVResponse csvResponse = new CSVResponse();

        System.out.println("CSVResponse readInternal : " + csvResponse);

        return csvResponse;
    }

    @Override
	protected void writeInternal(CSVResponse csvResponse, HttpOutputMessage output) throws IOException, HttpMessageNotWritableException {
	
        char separator = ',';
        char tab = '\t';
        char comma = ',';

    	output.getHeaders().setContentType(MEDIA_TYPE);
        output.getHeaders().set("Content-Disposition", "attachment; filename=\" download.csv \"");
		
        // Create CSV.
        List<List<String>> csvList = new ArrayList<List<String>>();
        
        if ( csvResponse.isDownloadQuotesYes() ) {
        	
            for (SNPChromosome snpchromosome : csvResponse) {

                csvList.add(Arrays.asList(
                		snpchromosome.getSnpIdQuoted(),
                		snpchromosome.getChromosomeIdQuoted(),
                		snpchromosome.getPositionAsStringQuoted(),
                		snpchromosome.getReferenceQuoted(),
                		snpchromosome.getAlternativeQuoted(),
                		snpchromosome.getRegionQuoted(),
                		snpchromosome.getEnsemblGeneQuoted(),
                		snpchromosome.getEnsemblTranscriptQuoted(),
                		snpchromosome.getEnsemblAnnotationQuoted(),
                		snpchromosome.getStrain7AlleleQuoted(),
                		snpchromosome.getStrain7AlleleFixedAsStringQuoted(),
                		snpchromosome.getStrainPAlleleQuoted(),
                		snpchromosome.getStrainPAlleleFixedAsStringQuoted(),
                		snpchromosome.getStrainWAlleleQuoted(),
                		snpchromosome.getStrainWAlleleFixedAsStringQuoted(),
                		snpchromosome.getStrainNAlleleQuoted(),
                		snpchromosome.getStrainNAlleleFixedAsStringQuoted(),
                		snpchromosome.getStrain15IAlleleQuoted(),
                		snpchromosome.getStrain15IAlleleFixedAsStringQuoted(),
                		snpchromosome.getStrainZeroAlleleQuoted(),
                		snpchromosome.getStrainZeroAlleleFixedAsStringQuoted(),
                		snpchromosome.getStrain6AlleleQuoted(),
                		snpchromosome.getStrain6AlleleFixedAsStringQuoted(),
                		snpchromosome.getStrainCAlleleQuoted(),
                		snpchromosome.getStrainCAlleleFixedAsStringQuoted(),
                		snpchromosome.getVersionAsStringQuoted()
                	));
            }
        }
        
        if ( csvResponse.isDownloadQuotesNo() ) {
        	
            for (SNPChromosome snpchromosome : csvResponse) {

                csvList.add(Arrays.asList(
                		snpchromosome.getSnpId(),
                		snpchromosome.getChromosomeId(),
                		snpchromosome.getPositionAsString(),
                		snpchromosome.getReference(),
                		snpchromosome.getAlternative(),
                		snpchromosome.getRegion(),
                		snpchromosome.getEnsemblGene(),
                		snpchromosome.getEnsemblTranscript(),
                		snpchromosome.getEnsemblAnnotation(),
                		snpchromosome.getStrain7Allele(),
                		snpchromosome.getStrain7AlleleFixedAsString(),
                		snpchromosome.getStrainPAllele(),
                		snpchromosome.getStrainPAlleleFixedAsString(),
                		snpchromosome.getStrainWAllele(),
                		snpchromosome.getStrainWAlleleFixedAsString(),
                		snpchromosome.getStrainNAllele(),
                		snpchromosome.getStrainNAlleleFixedAsString(),
                		snpchromosome.getStrain15IAllele(),
                		snpchromosome.getStrain15IAlleleFixedAsString(),
                		snpchromosome.getStrainZeroAllele(),
                		snpchromosome.getStrainZeroAlleleFixedAsString(),
                		snpchromosome.getStrain6Allele(),
                		snpchromosome.getStrain6AlleleFixedAsString(),
                		snpchromosome.getStrainCAllele(),
                		snpchromosome.getStrainCAlleleFixedAsString(),
                		snpchromosome.getVersionAsString()
                	));
            }
        }
        
        // Format TSV or CSV
        if ( csvResponse.isDownloadFormatTSV() ) {
        	separator = tab;
        }
        if ( csvResponse.isDownloadFormatCSV() ) {
        	separator = comma;
        }
        
        InputStream csvInput = CsvUtil.formatCsvWithQuotes(csvList, separator);

        try {
	    	
	        IOUtils.copy(csvInput, output.getBody());
	    }
	    catch (IOException e) {
	        
	    	e.printStackTrace();
	    }
        catch(Exception e){
	    
	    	System.out.println("Exception in file download :"+e);
	    }
	}
	
}

