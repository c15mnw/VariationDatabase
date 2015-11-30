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


    	// Set Download File SUFFIX and Format
        if ( csvResponse.isDownloadFormatTSV() ) {
            output.getHeaders().set("Content-Disposition", "attachment; filename=\" download.tsv \"");
        	separator = tab;
        }
        if ( csvResponse.isDownloadFormatCSV() ) {
            output.getHeaders().set("Content-Disposition", "attachment; filename=\" download.csv \"");
        	separator = comma;
        }

        // Create CSV.
        List<List<String>> csvList = new ArrayList<List<String>>();
        
        List<String> headerList = new ArrayList<String>();

        if ( csvResponse.isDownloadHeadersYes() && csvResponse.isDownloadQuotesNo()) {
        	
        	headerList.add("SNP Identifier");
        	headerList.add("Chromosome Identifier");
        	headerList.add("Position");
        	headerList.add("Reference Allele");
        	headerList.add("Alternative Allele");
        	headerList.add("Region");
        	headerList.add("Ensembl Gene");
        	headerList.add("Ensembl Transcript");
        	headerList.add("Ensembl Coding Predictions");

        	if ( csvResponse.isDownloadReference7() || csvResponse.isDownloadAlternative7() ) {
        		headerList.add("Strain 7 Allele");
            	headerList.add("Strain 7 Allele Fixed?");
        	}
        	if ( csvResponse.isDownloadReferenceP() || csvResponse.isDownloadAlternativeP() ) {
        		headerList.add("Strain P Allele");
            	headerList.add("Strain P Allele Fixed?");
        	}
        	if ( csvResponse.isDownloadReferenceW() || csvResponse.isDownloadAlternativeW() ) {
        		headerList.add("Strain W Allele");
            	headerList.add("Strain W Allele Fixed?");
        	}
        	if ( csvResponse.isDownloadReferenceN() || csvResponse.isDownloadAlternativeN() ) {
        		headerList.add("Strain N Allele");
            	headerList.add("Strain N Allele Fixed?");
        	}
        	if ( csvResponse.isDownloadReference15I() || csvResponse.isDownloadAlternative15I() ) {
        		headerList.add("Strain 15I Allele");
            	headerList.add("Strain 15I Allele Fixed?");
        	}
        	if ( csvResponse.isDownloadReferenceZero() || csvResponse.isDownloadAlternativeZero() ) {
        		headerList.add("Strain Zero Allele");
            	headerList.add("Strain Zero Allele Fixed?");
        	}
        	if ( csvResponse.isDownloadReference6() || csvResponse.isDownloadAlternative6() ) {
        		headerList.add("Strain 6 Allele");
            	headerList.add("Strain 6 Allele Fixed?");
        	}
        	if ( csvResponse.isDownloadReferenceC() || csvResponse.isDownloadAlternativeC() ) {
        		headerList.add("Strain C Allele");
            	headerList.add("Strain C Allele Fixed?");
        	}
        		
            csvList.add(headerList);
        }

        if ( csvResponse.isDownloadHeadersYes() && csvResponse.isDownloadQuotesYes()) {
        	
        	headerList.add("\"SNP Identifier\"");
        	headerList.add("\"Chromosome Identifier\"");
        	headerList.add("\"Position\"");
        	headerList.add("\"Reference Allele\"");
        	headerList.add("\"Alternative Allele\"");
        	headerList.add("\"Region\"");
        	headerList.add("\"Ensembl Gene\"");
        	headerList.add("\"Ensembl Transcript\"");
        	headerList.add("\"Ensembl Coding Predictions\"");

        	if ( csvResponse.isDownloadReference7() || csvResponse.isDownloadAlternative7() ) {
        		headerList.add("\"Strain 7 Allele\"");
            	headerList.add("\"Strain 7 Allele Fixed?\"");
        	}
        	if ( csvResponse.isDownloadReferenceP() || csvResponse.isDownloadAlternativeP() ) {
        		headerList.add("\"Strain P Allele\"");
            	headerList.add("\"Strain P Allele Fixed?\"");
        	}
        	if ( csvResponse.isDownloadReferenceW() || csvResponse.isDownloadAlternativeW() ) {
        		headerList.add("\"Strain W Allele\"");
            	headerList.add("\"Strain W Allele Fixed?\"");
        	}
        	if ( csvResponse.isDownloadReferenceN() || csvResponse.isDownloadAlternativeN() ) {
        		headerList.add("\"Strain N Allele\"");
            	headerList.add("\"Strain N Allele Fixed?\"");
        	}
        	if ( csvResponse.isDownloadReference15I() || csvResponse.isDownloadAlternative15I() ) {
        		headerList.add("\"Strain 15I Allele\"");
            	headerList.add("\"Strain 15I Allele Fixed?\"");
        	}
        	if ( csvResponse.isDownloadReferenceZero() || csvResponse.isDownloadAlternativeZero() ) {
        		headerList.add("\"Strain Zero Allele\"");
            	headerList.add("\"Strain Zero Allele Fixed?\"");
        	}
        	if ( csvResponse.isDownloadReference6() || csvResponse.isDownloadAlternative6() ) {
        		headerList.add("\"Strain 6 Allele\"");
            	headerList.add("\"Strain 6 Allele Fixed?\"");
        	}
        	if ( csvResponse.isDownloadReferenceC() || csvResponse.isDownloadAlternativeC() ) {
        		headerList.add("\"Strain C Allele\"");
            	headerList.add("\"Strain C Allele Fixed?\"");
        	}
        		
            csvList.add(headerList);
        }

        if ( csvResponse.isDownloadQuotesYes() ) {
        	
            for (SNPChromosome snpchromosome : csvResponse) {
            	
                List<String> outputList = new ArrayList<String>();
                
            	outputList.add(snpchromosome.getSnpIdQuoted());
            	outputList.add(snpchromosome.getChromosomeIdQuoted());
            	outputList.add(snpchromosome.getPositionAsStringQuoted());
            	outputList.add(snpchromosome.getReferenceQuoted());
            	outputList.add(snpchromosome.getAlternativeQuoted());
            	outputList.add(snpchromosome.getRegionQuoted());
            	outputList.add(snpchromosome.getEnsemblGeneQuoted());
            	outputList.add(snpchromosome.getEnsemblTranscriptQuoted());
            	outputList.add(snpchromosome.getEnsemblAnnotationQuoted());

            	if ( csvResponse.isDownloadReference7() || csvResponse.isDownloadAlternative7() ) {
            		outputList.add(snpchromosome.getStrain7AlleleQuoted());
                	outputList.add(snpchromosome.getStrain7AlleleFixedAsStringQuoted());
            	}
            	if ( csvResponse.isDownloadReferenceP() || csvResponse.isDownloadAlternativeP() ) {
            		outputList.add(snpchromosome.getStrainPAlleleQuoted());
                	outputList.add(snpchromosome.getStrainPAlleleFixedAsStringQuoted());
            	}
            	if ( csvResponse.isDownloadReferenceW() || csvResponse.isDownloadAlternativeW() ) {
            		outputList.add(snpchromosome.getStrainWAlleleQuoted());
                	outputList.add(snpchromosome.getStrainWAlleleFixedAsStringQuoted());
            	}
            	if ( csvResponse.isDownloadReferenceN() || csvResponse.isDownloadAlternativeN() ) {
            		outputList.add(snpchromosome.getStrainNAlleleQuoted());
                	outputList.add(snpchromosome.getStrainNAlleleFixedAsStringQuoted());
            	}
            	if ( csvResponse.isDownloadReference15I() || csvResponse.isDownloadAlternative15I() ) {
            		outputList.add(snpchromosome.getStrain15IAlleleQuoted());
                	outputList.add(snpchromosome.getStrain15IAlleleFixedAsStringQuoted());
            	}
            	if ( csvResponse.isDownloadReferenceZero() || csvResponse.isDownloadAlternativeZero() ) {
            		outputList.add(snpchromosome.getStrainZeroAlleleQuoted());
                	outputList.add(snpchromosome.getStrainZeroAlleleFixedAsStringQuoted());
            	}
            	if ( csvResponse.isDownloadReference6() || csvResponse.isDownloadAlternative6() ) {
            		outputList.add(snpchromosome.getStrain6AlleleQuoted());
                	outputList.add(snpchromosome.getStrain6AlleleFixedAsStringQuoted());
            	}
            	if ( csvResponse.isDownloadReferenceC() || csvResponse.isDownloadAlternativeC() ) {
            		outputList.add(snpchromosome.getStrainCAlleleQuoted());
                	outputList.add(snpchromosome.getStrainCAlleleFixedAsStringQuoted());
            	}
            		
                csvList.add(outputList);
            }
        }
        
        if ( csvResponse.isDownloadQuotesNo() ) {
        	
            for (SNPChromosome snpchromosome : csvResponse) {

                List<String> outputList = new ArrayList<String>();

            	outputList.add(snpchromosome.getSnpId());
            	outputList.add(snpchromosome.getChromosomeId());
            	outputList.add(snpchromosome.getPositionAsString());
            	outputList.add(snpchromosome.getReference());
            	outputList.add(snpchromosome.getAlternative());
            	outputList.add(snpchromosome.getRegion());
            	outputList.add(snpchromosome.getEnsemblGene());
            	outputList.add(snpchromosome.getEnsemblTranscript());
            	outputList.add(snpchromosome.getEnsemblAnnotation());

            	if ( csvResponse.isDownloadReference7() || csvResponse.isDownloadAlternative7() ) {
            		outputList.add(snpchromosome.getStrain7Allele());
                	outputList.add(snpchromosome.getStrain7AlleleFixedAsString());
            	}
            	if ( csvResponse.isDownloadReferenceP() || csvResponse.isDownloadAlternativeP() ) {
            		outputList.add(snpchromosome.getStrainPAllele());
                	outputList.add(snpchromosome.getStrainPAlleleFixedAsString());
            	}
            	if ( csvResponse.isDownloadReferenceW() || csvResponse.isDownloadAlternativeW() ) {
            		outputList.add(snpchromosome.getStrainWAllele());
                	outputList.add(snpchromosome.getStrainWAlleleFixedAsString());
            	}
            	if ( csvResponse.isDownloadReferenceN() || csvResponse.isDownloadAlternativeN() ) {
            		outputList.add(snpchromosome.getStrainNAllele());
                	outputList.add(snpchromosome.getStrainNAlleleFixedAsString());
            	}
            	if ( csvResponse.isDownloadReference15I() || csvResponse.isDownloadAlternative15I() ) {
            		outputList.add(snpchromosome.getStrain15IAllele());
                	outputList.add(snpchromosome.getStrain15IAlleleFixedAsString());
            	}
            	if ( csvResponse.isDownloadReferenceZero() || csvResponse.isDownloadAlternativeZero() ) {
            		outputList.add(snpchromosome.getStrainZeroAllele());
                	outputList.add(snpchromosome.getStrainZeroAlleleFixedAsString());
            	}
            	if ( csvResponse.isDownloadReference6() || csvResponse.isDownloadAlternative6() ) {
            		outputList.add(snpchromosome.getStrain6Allele());
                	outputList.add(snpchromosome.getStrain6AlleleFixedAsString());
            	}
            	if ( csvResponse.isDownloadReferenceC() || csvResponse.isDownloadAlternativeC() ) {
            		outputList.add(snpchromosome.getStrainCAllele());
                	outputList.add(snpchromosome.getStrainCAlleleFixedAsString());
            	}
            		
                csvList.add(outputList);
            }
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

