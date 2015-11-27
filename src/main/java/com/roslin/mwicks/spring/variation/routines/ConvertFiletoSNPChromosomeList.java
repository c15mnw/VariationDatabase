package com.roslin.mwicks.spring.variation.routines;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.roslin.mwicks.utility.CsvUtil;
import com.roslin.mwicks.utility.FileUtil;
import com.roslin.mwicks.spring.variation.dto.DTOSNPChromosome;
import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosome;


public final class ConvertFiletoSNPChromosomeList {

	public static List<SNPChromosome> run ( File file ) throws Exception {

        // Create List of SNPChromosomes
        List<SNPChromosome> outputsnpchromosomeList = new ArrayList<SNPChromosome>();

		try {
		
	        // Format InputStream for CSV.
	        InputStream csvInput = FileUtil.readStream(file);
	        
	        // Create CSV List
	        List<List<String>> csvList = CsvUtil.parseCsv(csvInput, '\t');

	        // Create CSV List

	        Iterator<List<String>> iteratorRow = csvList.iterator();
	        
	     	while (iteratorRow.hasNext()) {
	    		
	    		List<String> row = iteratorRow.next();

	            Iterator<String> iteratorColumn = row.iterator();
	            
	            int i = 1;
	            
	            DTOSNPChromosome dtosnpchromosome = new DTOSNPChromosome();
	            
	         	while (iteratorColumn.hasNext()) {
	        		
	        		String column = iteratorColumn.next();
	        		
	        	    dtosnpchromosome.setStrain7AlleleRatio("0");
	        	    dtosnpchromosome.setStrainPAlleleRatio("0");
	        	    dtosnpchromosome.setStrainWAlleleRatio("0");
	        	    dtosnpchromosome.setStrainNAlleleRatio("0");
	        	    dtosnpchromosome.setStrain15IAlleleRatio("0");
	        	    dtosnpchromosome.setstrainZeroAlleleRatio("0");
	        	    dtosnpchromosome.setStrain6AlleleRatio("0");
	        	    dtosnpchromosome.setStrainCAlleleRatio("0");

	        		if ( i == 1 ) {
		        	    dtosnpchromosome.setSnpId(column.trim());
	        		}
	        		if ( i == 2 ) {
		        	    dtosnpchromosome.setChromosomeId(column.trim());
	        		}
	        		if ( i == 3 ) {
		        	    dtosnpchromosome.setPosition(column.trim());
	        		}
	        		if ( i == 4 ) {
		        	    dtosnpchromosome.setReference(column.trim());
	        		}
	        		if ( i == 5 ) {
		        	    dtosnpchromosome.setAlternative(column.trim());
	        		}
	        		if ( i == 6 ) {
		        	    dtosnpchromosome.setRegion(column.trim());
	        		}
	        		if ( i == 7 ) {
		        	    dtosnpchromosome.setEnsemblGene(column.trim());
	        		}
	        		if ( i == 8 ) {
		        	    dtosnpchromosome.setEnsemblTranscript(column.trim());
	        		}
	        		if ( i == 9 ) {
		        	    dtosnpchromosome.setEnsemblAnnotation(column.trim());
	        		}
	        		if ( i == 10 ) {
		        	    dtosnpchromosome.setStrain7Allele(column.trim());
	        		}
	        		if ( i == 11 ) {
		        	    dtosnpchromosome.setStrain7AlleleFixed(column.trim());
	        		}
	        		if ( i == 12 ) {
		        	    dtosnpchromosome.setStrainPAllele(column.trim());
	        		}
	        		if ( i == 13 ) {
		        	    dtosnpchromosome.setStrainPAlleleFixed(column.trim());
	        		}
	        		if ( i == 14 ) {
		        	    dtosnpchromosome.setStrainWAllele(column.trim());
	        		}
	        		if ( i == 15 ) {
		        	    dtosnpchromosome.setStrainWAlleleFixed(column.trim());
	        		}
	        		if ( i == 16 ) {
		        	    dtosnpchromosome.setStrainNAllele(column.trim());
	        		}
	        		if ( i == 17 ) {
		        	    dtosnpchromosome.setStrainNAlleleFixed(column.trim());
	        		}
	        		if ( i == 18 ) {
		        	    dtosnpchromosome.setStrain15IAllele(column.trim());
	        		}
	        		if ( i == 19 ) {
		        	    dtosnpchromosome.setStrain15IAlleleFixed(column.trim());
	        		}
	        		if ( i == 20 ) {
		        	    dtosnpchromosome.setstrainZeroAllele(column.trim());
	        		}
	        		if ( i == 21 ) {
		        	    dtosnpchromosome.setstrainZeroAlleleFixed(column.trim());
	        		}
	        		if ( i == 22 ) {
		        	    dtosnpchromosome.setStrain6Allele(column.trim());
	        		}
	        		if ( i == 23 ) {
		        	    dtosnpchromosome.setStrain6AlleleFixed(column.trim());
	        		}
	        		if ( i == 24 ) {
		        	    dtosnpchromosome.setStrainCAllele(column.trim());
	        		}
	        		if ( i == 25 ) {
		        	    dtosnpchromosome.setStrainCAlleleFixed(column.trim());
	        		}
	        		
	        		i++;
	         	}
	         	
		     	int error = 0;
		     	
	         	if ( dtosnpchromosome.isThisAValidSNPChromosome() ) {
	         		
		         	outputsnpchromosomeList.add(dtosnpchromosome.convertToSNPChromosome());
	         	}
	         	else {
	         		
	         		error++;
	         		System.out.println("Error No." + error + " : " + dtosnpchromosome.toString());
	         	}

	     	}
		
		}
		catch (Exception e) {
			
	        System.out.println("Exception : " + e.toString() );
		}
		
		return outputsnpchromosomeList;

	}
}