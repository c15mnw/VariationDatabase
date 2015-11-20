package com.roslin.mwicks.spring.variation.model;

import java.util.ArrayList;
import java.util.Collection;

import com.roslin.mwicks.spring.variation.dto.DownloadFormat;
import com.roslin.mwicks.spring.variation.dto.DownloadQuotes;
import com.roslin.mwicks.spring.variation.model.SNPChromosome;


@SuppressWarnings("serial")
public class CSVResponse extends ArrayList<SNPChromosome> {

    // Constants ----------------------------------------------------------------------------------
	protected static final String QUOTES_NONE = "QUOTES_NONE";
	protected static final String QUOTES_YES = "QUOTES_YES";
	protected static final String QUOTES_NO = "QUOTES_NO";

	protected static final String FORMAT_NONE = "FORMAT_NONE";
	protected static final String FORMAT_CSV = "FORMAT_CSV";
	protected static final String FORMAT_TSV = "FORMAT_TSV";


	// Properties ---------------------------------------------------------------------------------
    private DownloadFormat downloadFormat;
    private DownloadQuotes downloadQuotes;

    
    // Constructor --------------------------------------------------------------------------------
	public CSVResponse() {
    }

    public CSVResponse(DownloadFormat downloadFormat, DownloadQuotes downloadQuotes, Collection<? extends SNPChromosome> c) {
     
    	super(c);

    	this.downloadFormat = downloadFormat;
    	this.downloadQuotes = downloadQuotes;
    }

    
    // Getters ------------------------------------------------------------------------------------
    public DownloadFormat getDownloadFormat() {
        return downloadFormat;
    }
    public DownloadQuotes getDownloadQuotes() {
        return downloadQuotes;
    }

    
    // Setters ------------------------------------------------------------------------------------
    public void setDownloadFormat(DownloadFormat downloadFormat) {
        this.downloadFormat = downloadFormat;
    }
    public void setDownloadQuotes(DownloadQuotes downloadQuotes) {
        this.downloadQuotes = downloadQuotes;
    }

    
    // Helpers ------------------------------------------------------------------------------------
    public boolean isDownloadFormatNone() {
    	if ( this.downloadFormat.name().equals(FORMAT_NONE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadFormatCSV() {
    	if ( this.downloadFormat.name().equals(FORMAT_CSV)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadFormatTSV() {
    	if ( this.downloadFormat.name().equals(FORMAT_TSV)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public boolean isDownloadQuotesNone() {
    	if ( this.downloadQuotes.name().equals(QUOTES_NONE)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadQuotesYes() {
    	if ( this.downloadQuotes.name().equals(QUOTES_YES)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isDownloadQuotesNo() {
    	if ( this.downloadQuotes.name().equals(QUOTES_NO)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
}