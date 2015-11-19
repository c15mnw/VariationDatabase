package com.roslin.mwicks.spring.variation.dto;

import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;

import org.hibernate.validator.constraints.NotEmpty;

import com.roslin.mwicks.spring.variation.model.SNPChromosome;

import com.roslin.mwicks.utility.ObjectConverter;
import com.roslin.mwicks.utility.StringUtility;


/**
 * A DTO object which is used as a form object
 * in create person and edit person forms.
 * @author Mike Wicks
 */
public class DTOSNPChromosome {
    
    private Long oid;
    
    @NotEmpty
    private String snpId;
    
    @NotEmpty
    private String chromosomeId;
    
    @NotEmpty
    private String position;
    
    @NotEmpty
    private String reference;    
    
    @NotEmpty
    private String alternative;
    
    @NotEmpty
    private String region;
    
    @NotEmpty
    private String ensemblGene;
    
    @NotEmpty
    private String ensemblTranscript;
    
    @NotEmpty
    private String ensemblAnnotation;
    
    @NotEmpty
    private String strain7Allele;
    
    @NotEmpty
    private String strain7AlleleFixed;
    
    @NotEmpty
    private String strain7AlleleRatio;
    
    @NotEmpty
    private String strainPAllele;
    
    @NotEmpty
    private String strainPAlleleFixed;
    
    @NotEmpty
    private String strainPAlleleRatio;
    
    @NotEmpty
    private String strainWAllele;
    
    @NotEmpty
    private String strainWAlleleFixed;
    
    @NotEmpty
    private String strainWAlleleRatio;
    
    @NotEmpty
    private String strainNAllele;
    
    @NotEmpty
    private String strainNAlleleFixed;
    
    @NotEmpty
    private String strainNAlleleRatio;
    
    @NotEmpty
    private String strain15IAllele;
    
    @NotEmpty
    private String strain15IAlleleFixed;
    
    @NotEmpty
    private String strain15IAlleleRatio;
    
    @NotEmpty
    private String strainZEROAllele;
    
    @NotEmpty
    private String strainZEROAlleleFixed;
    
    @NotEmpty
    private String strainZEROAlleleRatio;
    
    @NotEmpty
    private String strain6Allele;
    
    @NotEmpty
    private String strain6AlleleFixed;
    
    @NotEmpty
    private String strain6AlleleRatio;
    
    @NotEmpty
    private String strainCAllele;
    
    @NotEmpty
    private String strainCAlleleFixed;
    
    @NotEmpty
    private String strainCAlleleRatio;
    
    @NotEmpty
    private Date creationTime;
    
    @NotEmpty
    private Date modificationTime;
    
    @NotEmpty
    private long version;


    public DTOSNPChromosome() {

    }

    // Getters ------------------------------------------------------------------------------------
    public long getOid() {
    	return oid;
    }
    public String getSnpId() {
    	return snpId;
    }
    public String getChromosomeId() {
    	return chromosomeId;
    }
    public String getPosition() {
    	return position;
    }
    public String getReference() {
    	return reference;    
    }
    public String getAlternative() {
    	return alternative;
    }
    public String getRegion() {
    	return region;
    }
    public String getEnsemblGene() {
    	return ensemblGene;
    }
    public String getEnsemblTranscript() {
    	return ensemblTranscript;
    }
    public String getEnsemblAnnotation() {
    	return ensemblAnnotation;
    }
    public String getStrain7Allele() {
    	return strain7Allele;
    }
    public String getStrain7AlleleFixed() {
    	return strain7AlleleFixed;
    }
    public String getStrain7AlleleRatio() {
    	return strain7AlleleRatio;
    }
    public String getStrainPAllele() {
    	return strainPAllele;
    }
    public String getStrainPAlleleFixed() {
    	return strainPAlleleFixed;
    }
    public String getStrainPAlleleRatio() {
    	return strainPAlleleRatio;
    }
    public String getStrainWAllele() {
    	return strainWAllele;
    }
    public String getStrainWAlleleFixed() {
    	return strainWAlleleFixed;
    }
    public String getStrainWAlleleRatio() {
    	return strainWAlleleRatio;
    }
    public String getStrainNAllele() {
    	return strainNAllele;
    }
    public String getStrainNAlleleFixed() {
    	return strainNAlleleFixed;
    }
    public String getStrainNAlleleRatio() {
    	return strainNAlleleRatio;
    }
    public String getStrain15IAllele() {
    	return strain15IAllele;
    }
    public String getStrain15IAlleleFixed() {
    	return strain15IAlleleFixed;
    }
    public String getStrain15IAlleleRatio() {
    	return strain15IAlleleRatio;
    }
    public String getStrainZEROAllele() {
    	return strainZEROAllele;
    }
    public String getStrainZEROAlleleFixed() {  
    	return strainZEROAlleleFixed;
    }
    public String getStrainZEROAlleleRatio() {
    	return strainZEROAlleleRatio;
    }
    public String getStrain6Allele() {
    	return strain6Allele;
    }
    public String getStrain6AlleleFixed() {
    	return strain6AlleleFixed;
    }
    public String getStrain6AlleleRatio() {
    	return strain6AlleleRatio;
    }
    public String getStrainCAllele() {
    	return strainCAllele;
    }
    public String getStrainCAlleleFixed() {
    	return strainCAlleleFixed;
    }
    public String getStrainCAlleleRatio() {
    	return strainCAlleleRatio;
    }
    public Date getCreationTime() {
    	return creationTime;
    }
    public Date getModificationTime() {
    	return modificationTime;
    }
    public long getVersion() {
        return version;
    }
    
    // Getters As Required DataTypes --------------------------------------------------------------
    public long getOidAsString() {
    	return ObjectConverter.convert(oid, Long.class);
    }
    public int getPositionAsInteger() {
    	return ObjectConverter.convert(position, Integer.class);
    }
    public boolean getStrain7AlleleFixedAsBoolean() {
    	return ObjectConverter.convert(ObjectConverter.convert(strain7AlleleFixed, Integer.class), Boolean.class);
    }
    public long getStrain7AlleleRatioAsLong() {
    	return ObjectConverter.convert(strain7AlleleRatio, Long.class);
    }
    public boolean getStrainPAlleleFixedAsBoolean() {
    	return ObjectConverter.convert(ObjectConverter.convert(strainPAlleleFixed, Integer.class), Boolean.class);
    }
    public long getStrainPAlleleRatioAsLong() {
    	return ObjectConverter.convert(strainPAlleleRatio, Long.class);
    }
    public boolean getStrainWAlleleFixedAsBoolean() {
    	return ObjectConverter.convert(ObjectConverter.convert(strainWAlleleFixed, Integer.class), Boolean.class);
    }
    public long getStrainWAlleleRatioAsLong() {
    	return ObjectConverter.convert(strainWAlleleRatio, Long.class);
    }
    public boolean getStrainNAlleleFixedAsBoolean() {
    	return ObjectConverter.convert(ObjectConverter.convert(strainNAlleleFixed, Integer.class), Boolean.class);
    }
    public long getStrainNAlleleRatioAsLong() {
    	return ObjectConverter.convert(strainNAlleleRatio, Long.class);
    }
    public boolean getStrain15IAlleleFixedAsBoolean() {
    	return ObjectConverter.convert(ObjectConverter.convert(strain15IAlleleFixed, Integer.class), Boolean.class);
    }
    public long getStrain15IAlleleRatioAsLong() {
    	return ObjectConverter.convert(strain15IAlleleRatio, Long.class);
    }
    public boolean getStrainZEROAlleleFixedAsBoolean() {  
    	return ObjectConverter.convert(ObjectConverter.convert(strainZEROAlleleFixed, Integer.class), Boolean.class);
    }
    public long getStrainZEROAlleleRatioAsLong() {
    	return ObjectConverter.convert(strainZEROAlleleRatio, Long.class);
    }
    public boolean getStrain6AlleleFixedAsBoolean() {
    	return ObjectConverter.convert(ObjectConverter.convert(strain6AlleleFixed, Integer.class), Boolean.class);
    }
    public long getStrain6AlleleRatioAsLong() {
    	return ObjectConverter.convert(strain6AlleleRatio, Long.class);
    }
    public boolean getStrainCAlleleFixedAsBoolean() {
    	return ObjectConverter.convert(ObjectConverter.convert(strainCAlleleFixed, Integer.class), Boolean.class);
    }
    public long getStrainCAlleleRatioAsLong() {
    	return ObjectConverter.convert(strainCAlleleRatio, Long.class);
    }
    public String getCreationTimeAsString() {
    	return ObjectConverter.convert(creationTime, String.class);
    }
    public String getModificationTimeAsString() {
    	return ObjectConverter.convert(modificationTime, String.class);
    }
    public String getVersionAsString() {
    	return ObjectConverter.convert(version, String.class);
    }

    // Setters ------------------------------------------------------------------------------------
    public void setOid(long oid) {
    	this.oid = oid;
    }
    public void setSnpId(String snpId) {
    	this.snpId = snpId;
    }
    public void setChromosomeId(String chromosomeId) {
    	this.chromosomeId = chromosomeId;
    }
    public void setPosition(String position) {
    	this.position = position;
    }
    public void setReference(String reference) {
    	this.reference = reference;    
    }
    public void setAlternative(String alternative) {
    	this.alternative = alternative;
    }
    public void setRegion(String region) {
    	this.region = region;
    }
    public void setEnsemblGene(String ensemblGene) {
    	this.ensemblGene = ensemblGene;
    }
    public void setEnsemblTranscript(String ensemblTranscript) {
    	this.ensemblTranscript = ensemblTranscript;
    }
    public void setEnsemblAnnotation(String ensemblAnnotation) {
    	this.ensemblAnnotation = ensemblAnnotation;
    }
    public void setStrain7Allele(String strain7Allele) {
    	this.strain7Allele = strain7Allele;
    }
    public void setStrain7AlleleFixed(String strain7AlleleFixed) {
    	this.strain7AlleleFixed = strain7AlleleFixed;
    }
    public void setStrain7AlleleRatio(String strain7AlleleRatio) {
    	this.strain7AlleleRatio = strain7AlleleRatio;
    }
    public void setStrainPAllele(String strainPAllele) {
    	this.strainPAllele = strainPAllele;
    }
    public void setStrainPAlleleFixed(String strainPAlleleFixed) {
    	this.strainPAlleleFixed = strainPAlleleFixed;
    }
    public void setStrainPAlleleRatio(String strainPAlleleRatio) {
    	this.strainPAlleleRatio = strainPAlleleRatio;
    }
    public void setStrainWAllele(String strainWAllele) {
    	this.strainWAllele = strainWAllele;
    }
    public void setStrainWAlleleFixed(String strainWAlleleFixed) {
    	this.strainWAlleleFixed = strainWAlleleFixed;
    }
    public void setStrainWAlleleRatio(String strainWAlleleRatio) {
    	this.strainWAlleleRatio = strainWAlleleRatio;
    }
    public void setStrainNAllele(String strainNAllele) {
    	this.strainNAllele = strainNAllele;
    }
    public void setStrainNAlleleFixed(String strainNAlleleFixed) {
    	this.strainNAlleleFixed = strainNAlleleFixed;
    }
    public void setStrainNAlleleRatio(String strainNAlleleRatio) {
    	this.strainNAlleleRatio = strainNAlleleRatio;
    }
    public void setStrain15IAllele(String strain15IAllele) {
    	this.strain15IAllele = strain15IAllele;
    }
    public void setStrain15IAlleleFixed(String strain15IAlleleFixed) {
    	this.strain15IAlleleFixed = strain15IAlleleFixed;
    }
    public void setStrain15IAlleleRatio(String strain15IAlleleRatio) {
    	this.strain15IAlleleRatio = strain15IAlleleRatio;
    }
    public void setStrainZEROAllele(String strainZEROAllele) {
    	this.strainZEROAllele = strainZEROAllele;
    }
    public void setStrainZEROAlleleFixed(String strainZEROAlleleFixed) {  
    	this.strainZEROAlleleFixed = strainZEROAlleleFixed;
    }
    public void setStrainZEROAlleleRatio(String strainZEROAlleleRatio) {
    	this.strainZEROAlleleRatio = strainZEROAlleleRatio;
    }
    public void setStrain6Allele(String strain6Allele) {
    	this.strain6Allele = strain6Allele;
    }
    public void setStrain6AlleleFixed(String strain6AlleleFixed) {
    	this.strain6AlleleFixed = strain6AlleleFixed;
    }
    public void setStrain6AlleleRatio(String strain6AlleleRatio) {
    	this.strain6AlleleRatio = strain6AlleleRatio;
    }
    public void setStrainCAllele(String strainCAllele) {
    	this.strainCAllele = strainCAllele;
    }
    public void setStrainCAlleleFixed(String strainCAlleleFixed) {
    	this.strainCAlleleFixed = strainCAlleleFixed;
    }
    public void setStrainCAlleleRatio(String strainCAlleleRatio) {
    	this.strainCAlleleRatio = strainCAlleleRatio;
    }
    public void setCreationTime(Date creationTime) {
    	this.creationTime = creationTime;
    }
    public void setModificationTime(Date modificationTime) {
    	this.modificationTime = modificationTime;
    }
    public void setVersion(long version) {
    	this.version = version;
    }
    
    // Check for Required DataTypes ---------------------------------------------------------------
    public boolean isPositionAnInteger() {
         
    	if ( StringUtility.isItNumeric(this.position) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isStrain7AlleleFixedABoolean() {

    	if ( this.strain7AlleleFixed.equals("1") || this.strain7AlleleFixed.equals("0")) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrain7AlleleRatioALong() {

    	if ( StringUtility.isItNumeric(this.strain7AlleleRatio) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainPAlleleFixedABoolean() {

    	if ( this.strainPAlleleFixed.equals("1") || this.strainPAlleleFixed.equals("0")) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainPAlleleRatioALong() {

    	if ( StringUtility.isItNumeric(this.strainPAlleleRatio) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainWAlleleFixedABoolean() {

    	if ( this.strainWAlleleFixed.equals("1") || this.strainWAlleleFixed.equals("0")) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainWAlleleRatioALong() {

    	if ( StringUtility.isItNumeric(this.strainWAlleleRatio) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainNAlleleFixedABoolean() {

    	if ( this.strainNAlleleFixed.equals("1") || this.strainNAlleleFixed.equals("0")) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainNAlleleRatioALong() {

    	if ( StringUtility.isItNumeric(this.strainNAlleleRatio) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrain15IAlleleFixedABoolean() {

    	if ( this.strain15IAlleleFixed.equals("1") || this.strain15IAlleleFixed.equals("0")) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrain15IAlleleRatioALong() {

    	if ( StringUtility.isItNumeric(this.strain15IAlleleRatio) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainZEROAlleleFixedABoolean() {  

    	if ( this.strainZEROAlleleFixed.equals("1") || this.strainZEROAlleleFixed.equals("0")) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainZEROAlleleRatioALong() {

    	if ( StringUtility.isItNumeric(this.strainZEROAlleleRatio) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrain6AlleleFixedABoolean() {

    	if ( this.strain6AlleleFixed.equals("1") || this.strain6AlleleFixed.equals("0")) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrain6AlleleRatioALong() {

    	if ( StringUtility.isItNumeric(this.strain6AlleleRatio) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainCAlleleFixedABoolean() {

    	if ( this.strainCAlleleFixed.equals("1") || this.strainCAlleleFixed.equals("0")) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean isStrainCAlleleRatioALong() {

    	if ( StringUtility.isItNumeric(this.strainCAlleleRatio) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    // Helpers ------------------------------------------------------------------------------------    
    /*
     * Is this SNPChromosome VALID?
     */
    public boolean isThisAValidSNPChromosome(){

        if (this.isPositionAnInteger() && 
        	    this.isStrain7AlleleFixedABoolean() && 
        	    this.isStrain7AlleleRatioALong() &&
        	    this.isStrainPAlleleFixedABoolean() &&
        	    this.isStrainPAlleleRatioALong() && 
        	    this.isStrainWAlleleFixedABoolean() && 
        	    this.isStrainWAlleleRatioALong() && 
        	    this.isStrainNAlleleFixedABoolean() && 
        	    this.isStrainNAlleleRatioALong() && 
        	    this.isStrain15IAlleleFixedABoolean() && 
        	    this.isStrain15IAlleleRatioALong() && 
        	    this.isStrainZEROAlleleFixedABoolean() && 
        	    this.isStrainZEROAlleleRatioALong() && 
        	    this.isStrain6AlleleFixedABoolean() && 
        	    this.isStrain6AlleleRatioALong() && 
        	    this.isStrainCAlleleFixedABoolean() && 
        	    this.isStrainCAlleleRatioALong() 
        	    ) {

        	return true;
        }
        else {

        	return false;
        }
    }


    /*
     * Convert a DTOSNPChromosome Object to an SNPChromosome Object
     */
    public SNPChromosome convertToSNPChromosome(){

    	SNPChromosome snpchromosome = SNPChromosome.getBuilder(
        		this.getSnpId(),
        		this.getChromosomeId(),
        		this.getPositionAsInteger(),
        		this.getReference(),    
        		this.getAlternative(),
        		this.getRegion(),
        		this.getEnsemblGene(),
        		this.getEnsemblTranscript(),
        		this.getEnsemblAnnotation(),
        		this.getStrain7Allele(),
        		this.getStrain7AlleleFixedAsBoolean(),
        		this.getStrain7AlleleRatioAsLong(),
        		this.getStrainPAllele(),
        		this.getStrainPAlleleFixedAsBoolean(),
        		this.getStrainPAlleleRatioAsLong(),
        		this.getStrainWAllele(),
        		this.getStrainWAlleleFixedAsBoolean(),
        		this.getStrainWAlleleRatioAsLong(),
        		this.getStrainNAllele(),
        		this.getStrainNAlleleFixedAsBoolean(),
        		this.getStrainNAlleleRatioAsLong(),
        		this.getStrain15IAllele(),
        		this.getStrain15IAlleleFixedAsBoolean(),
        		this.getStrain15IAlleleRatioAsLong(),
        		this.getStrainZEROAllele(),
        		this.getStrainZEROAlleleFixedAsBoolean(),
        		this.getStrainZEROAlleleRatioAsLong(),
        		this.getStrain6Allele(),
        		this.getStrain6AlleleFixedAsBoolean(),
        		this.getStrain6AlleleRatioAsLong(),
        		this.getStrainCAllele(),
        		this.getStrainCAlleleFixedAsBoolean(),
        		this.getStrainCAlleleRatioAsLong()
        		).build();
        
        return snpchromosome;
    }

    
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
