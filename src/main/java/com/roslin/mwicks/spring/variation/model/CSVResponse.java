package com.roslin.mwicks.spring.variation.model;

import java.util.ArrayList;
import java.util.Collection;

import com.roslin.mwicks.spring.variation.model.SNPChromosome;


@SuppressWarnings("serial")
public class CSVResponse extends ArrayList<SNPChromosome> {

    // Constants ----------------------------------------------------------------------------------
	private static final String CSV = "CSV";
	private static final String TSV = "TSV";
	private static final String YES = "YES";
	private static final String NO = "NO";

    private String downloadFormat;
    private String downloadQuotes;

    
    // Getters ------------------------------------------------------------------------------------
    public String getDownloadFormat() {
        return downloadFormat;
    }
    public String getDownloadQuotes() {
        return downloadQuotes;
    }

    public boolean isDownloadFormatCSV(){
        
        if ( this.downloadFormat.equals(CSV) ) {
            return true;
        }
        else {
            return false;        
        }
    }
    public boolean isDownloadFormatTSV(){
        
        if ( this.downloadFormat.equals(TSV) ) {
            return true;
        }
        else {
            return false;        
        }
    }
    public boolean isDownloadQuotesYes(){
        
        if ( this.downloadQuotes.equals(YES) ) {
            return true;
        }
        else {
            return false;        
        }
    }
    public boolean isDownloadQuotesNo(){
        
        if ( this.downloadQuotes.equals(NO) ) {
            return true;
        }
        else {
            return false;        
        }
    }

    // Setters ------------------------------------------------------------------------------------
    public void setDownloadFormat(String downloadFormat) {
        this.downloadFormat = downloadFormat;
    }
    public void setDownloadQuotes(String downloadQuotes) {
        this.downloadQuotes = downloadQuotes;
    }

	
	public CSVResponse() {
    }

    public CSVResponse(String downloadFormat, String downloadQuotes, Collection<? extends SNPChromosome> c) {
     
    	super(c);

    	this.downloadFormat = downloadFormat;
    	this.downloadQuotes = downloadQuotes;
    }
	
}