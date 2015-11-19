package com.roslin.mwicks.spring.variation.dto;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * A DTO class which is used as a form object in the download form.
 * @author Mike Wicks
 */
public class DTODownload {

	private String downloadLowRange;
    private String downloadHighRange;
    private String downloadReference;
    private String downloadAlternative;
    private String downloadFormat;
    private String downloadQuotes;

    public DTODownload() {

    }

    // Getters ------------------------------------------------------------------------------------
    public String getDownloadLowRange() {
        return downloadLowRange;
    }
    public String getDownloadHighRange() {
        return downloadHighRange;
    }
    public String getDownloadReference() {
        return downloadReference;
    }
    public String getDownloadAlternative() {
        return downloadAlternative;
    }
    public String getDownloadFormat() {
        return downloadFormat;
    }
    public String getDownloadQuotes() {
        return downloadQuotes;
    }

    // Setters ------------------------------------------------------------------------------------
    public void setDownloadLowRange(String downloadLowRange) {
        this.downloadLowRange = downloadLowRange;
    }
    public void setDownloadHighRange(String downloadHighRange) {
        this.downloadHighRange = downloadHighRange;
    }
    public void setDownloadReference(String downloadReference) {
        this.downloadReference = downloadReference;
    }
    public void setDownloadAlternative(String downloadAlternative) {
        this.downloadAlternative = downloadAlternative;
    }
    public void setDownloadFormat(String downloadFormat) {
        this.downloadFormat = downloadFormat;
    }
    public void setDownloadQuotes(String downloadQuotes) {
        this.downloadQuotes = downloadQuotes;
    }

    // helpers ------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
