package com.roslin.mwicks.spring.variation.dto;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * A DTO class which is used as a form object in the search form.
 * @author Mike Wicks
 */
public class DTOSearch {

    private int pageIndex;

    private String searchLowRange;
    private String searchHighRange;

    private SearchReference searchReference;
    private SearchAlternative searchAlternative;

    public DTOSearch() {

    }

    // Getters ------------------------------------------------------------------------------------
    public int getPageIndex() {
        return pageIndex;
    }
    public String getSearchLowRange() {
        return searchLowRange;
    }
    public String getSearchHighRange() {
        return searchHighRange;
    }
    public SearchReference getSearchReference() {
        return searchReference;
    }
    public SearchAlternative getSearchAlternative() {
        return searchAlternative;
    }

    // Setters ------------------------------------------------------------------------------------
    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }
    public void setSearchLowRange(String searchLowRange) {
        this.searchLowRange = searchLowRange;
    }
    public void setSearchHighRange(String searchHighRange) {
        this.searchHighRange = searchHighRange;
    }
    public void setSearchReference(SearchReference searchReference) {
        this.searchReference = searchReference;
    }
    public void setSearchAlternative(SearchAlternative searchAlternative) {
        this.searchAlternative = searchAlternative;
    }

    // helpers ------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
