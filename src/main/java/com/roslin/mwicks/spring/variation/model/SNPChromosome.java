package com.roslin.mwicks.spring.variation.model;

import org.apache.commons.lang.builder.ToStringBuilder;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

import java.util.Date;

import com.roslin.mwicks.utility.ObjectConverter;

/**
 * An entity class which contains the information of a single SNPChromosome Table Row.
 * @author Mike Wicks
 */
@Entity
@NamedQueries(
		{
		    //Query 1
			@NamedQuery(name = "snpchromosome.findByRangeANDStrain7NEStrainP", 
			         query = "Select p from SNPChromosome p where p.position > ?1 and p.position < ?2 " +
			         		"and not ( p.strain7Allele = p.strainPAllele )" ),
			//Query 2
			@NamedQuery(name = "snpchromosome.findByRangeANDStrain7NEStrainW", 
			         query = "Select p from SNPChromosome p where p.position > ?1 and p.position < ?2 " +
			                 "and not ( p.strain7Allele = p.strainWAllele )" ),
			//Query 3
			@NamedQuery(name = "snpchromosome.findByRangeANDStrain7NEStrainN", 
			         query = "Select p from SNPChromosome p where p.position > ?1 and p.position < ?2 " +
			                 "and not ( p.strain7Allele = p.strainNAllele )" ),
			//Query 4
			@NamedQuery(name = "snpchromosome.findByRangeANDStrain7NEStrain15I", 
			         query = "Select p from SNPChromosome p where p.position > ?1 and p.position < ?2 " +
			                 "and not ( p.strain7Allele = p.strain15IAllele )" ),
			//Query 5
			@NamedQuery(name = "snpchromosome.findByRangeANDStrain7NEStrainZERO", 
			         query = "Select p from SNPChromosome p where p.position > ?1 and p.position < ?2 " +
			                 "and not ( p.strain7Allele = p.strainZEROAllele )" ),
			//Query 6
			@NamedQuery(name = "snpchromosome.findByRangeANDStrain7NEStrain6", 
			         query = "Select p from SNPChromosome p where p.position > ?1 and p.position < ?2 " +
			                 "and not ( p.strain7Allele = p.strain6Allele )" ),
			//Query 7
			@NamedQuery(name = "snpchromosome.findByRangeANDStrain7NEStrainC", 
			         query = "Select p from SNPChromosome p where p.position > ?1 and p.position < ?2 " +
			                 "and not ( p.strain7Allele = p.strainCAllele )" ),
			//Query 8
			@NamedQuery(name = "snpchromosome.findByRangeANDStrainPNEStrainW", 
			         query = "Select p from SNPChromosome p where p.position > ?1 and p.position < ?2 " +
			                 "and not ( p.strainPAllele = p.strainWAllele )" ),
			//Query 9
			@NamedQuery(name = "snpchromosome.findByRangeANDStrainPNEStrainN", 
			         query = "Select p from SNPChromosome p where p.position > ?1 and p.position < ?2 " +
			                 "and not ( p.strainPAllele = p.strainNAllele )" ),
			//Query 10
			@NamedQuery(name = "snpchromosome.findByRangeANDStrainPNEStrain15I", 
			         query = "Select p from SNPChromosome p where p.position > ?1 and p.position < ?2 " +
			                 "and not ( p.strainPAllele = p.strain15IAllele )" ),
			//Query 11
			@NamedQuery(name = "snpchromosome.findByRangeANDStrainPNEStrainZERO", 
			         query = "Select p from SNPChromosome p where p.position > ?1 and p.position < ?2 " +
			                 "and not ( p.strainPAllele = p.strainZEROAllele )" ),
			//Query 12
			@NamedQuery(name = "snpchromosome.findByRangeANDStrainPNEStrain6", 
			         query = "Select p from SNPChromosome p where p.position > ?1 and p.position < ?2 " +
			                 "and not ( p.strainPAllele = p.strain6Allele )" ),
			//Query 13
			@NamedQuery(name = "snpchromosome.findByRangeANDStrainPNEStrainC", 
			         query = "Select p from SNPChromosome p where p.position > ?1 and p.position < ?2 " +
			                 "and not ( p.strainPAllele = p.strainCAllele )" ),
			//Query 14
			@NamedQuery(name = "snpchromosome.findByRangeANDStrainWNEStrainN", 
			         query = "Select p from SNPChromosome p where p.position > ?1 and p.position < ?2 " +
			                 "and not ( p.strainWAllele = p.strainNAllele )" ),
			//Query 15
			@NamedQuery(name = "snpchromosome.findByRangeANDStrainWNEStrain15I", 
			         query = "Select p from SNPChromosome p where p.position > ?1 and p.position < ?2 " +
			                 "and not ( p.strainWAllele = p.strain15IAllele )" ),
			//Query 16
			@NamedQuery(name = "snpchromosome.findByRangeANDStrainWNEStrainZERO", 
			         query = "Select p from SNPChromosome p where p.position > ?1 and p.position < ?2 " +
			                 "and not ( p.strainWAllele = p.strainZEROAllele )" ),
			//Query 17
			@NamedQuery(name = "snpchromosome.findByRangeANDStrainWNEStrain6", 
			         query = "Select p from SNPChromosome p where p.position > ?1 and p.position < ?2 " +
			                 "and not ( p.strainWAllele = p.strain6Allele )" ),
			//Query 18
			@NamedQuery(name = "snpchromosome.findByRangeANDStrainWNEStrainC", 
			         query = "Select p from SNPChromosome p where p.position > ?1 and p.position < ?2 " +
			                 "and not ( p.strainWAllele = p.strainCAllele )" ),
			//Query 19
			@NamedQuery(name = "snpchromosome.findByRangeANDStrainNNEStrain15I", 
			         query = "Select p from SNPChromosome p where p.position > ?1 and p.position < ?2 " +
			                 "and not ( p.strainNAllele = p.strain15IAllele )" ),
			//Query 20
			@NamedQuery(name = "snpchromosome.findByRangeANDStrainNNEStrainZERO", 
			         query = "Select p from SNPChromosome p where p.position > ?1 and p.position < ?2 " +
			                 "and not ( p.strainNAllele = p.strainZEROAllele )" ),
			//Query 21
			@NamedQuery(name = "snpchromosome.findByRangeANDStrainNNEStrain6", 
			         query = "Select p from SNPChromosome p where p.position > ?1 and p.position < ?2 " +
			                 "and not ( p.strainNAllele = p.strain6Allele )" ),
			//Query 22
			@NamedQuery(name = "snpchromosome.findByRangeANDStrainNNEStrainC", 
			         query = "Select p from SNPChromosome p where p.position > ?1 and p.position < ?2 " +
			                 "and not ( p.strainNAllele = p.strainCAllele )" ),
			//Query 23
			@NamedQuery(name = "snpchromosome.findByRangeANDStrain15INEStrainZERO", 
			         query = "Select p from SNPChromosome p where p.position > ?1 and p.position < ?2 " +
			                 "and not ( p.strain15IAllele = p.strainZEROAllele )" ),
			//Query 24
			@NamedQuery(name = "snpchromosome.findByRangeANDStrain15INEStrain6", 
			         query = "Select p from SNPChromosome p where p.position > ?1 and p.position < ?2 " +
			                 "and not ( p.strain15IAllele = p.strain6Allele )" ),
			//Query 25
			@NamedQuery(name = "snpchromosome.findByRangeANDStrain15INEStrainC", 
			         query = "Select p from SNPChromosome p where p.position > ?1 and p.position < ?2 " +
			                 "and not ( p.strain15IAllele = p.strainCAllele )" ),
			//Query 26
			@NamedQuery(name = "snpchromosome.findByRangeANDStrainZERONEStrain6", 
			         query = "Select p from SNPChromosome p where p.position > ?1 and p.position < ?2 " +
			                 "and not ( p.strainZEROAllele = p.strain6Allele )" ),
			//Query 27
			@NamedQuery(name = "snpchromosome.findByRangeANDStrainZERONEStrainC", 
			         query = "Select p from SNPChromosome p where p.position > ?1 and p.position < ?2 " +
			                 "and not ( p.strainZEROAllele = p.strainCAllele )" ),
			//Query 28
			@NamedQuery(name = "snpchromosome.findByRangeANDStrain6NEStrainC", 
			         query = "Select p from SNPChromosome p where p.position > ?1 and p.position < ?2 " +
			                 "and not ( p.strain6Allele = p.strainCAllele )" )
			}
		)	

@Table(name = "VSC_SNP_CHROMOSOME")
@Transactional

public class SNPChromosome {
    
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "VSS_OID", nullable = false)
    private Long oid;
    
    @Column(name = "VSS_SNP_ID", nullable = false)
    private String snpId;
    
    @Column(name = "VSS_CHROMOSOME_ID", nullable = false)
    private String chromosomeId;
    
    @Column(name = "VSS_POSITION", nullable = false)
    private int position;
    
    @Column(name = "VSS_REFERENCE", nullable = false)
    private String reference;    
    
    @Column(name = "VSS_ALTERNATIVE", nullable = false)
    private String alternative;
    
    @Column(name = "VSS_REGION", nullable = false)
    private String region;
    
    @Column(name = "VSS_ENSEMBL_GENE", nullable = false)
    private String ensemblGene;
    
    @Column(name = "VSS_ENSEMBL_TRANSCRIPT", nullable = false)
    private String ensemblTranscript;
    
    @Column(name = "VSS_ENSEMBL_ANNOTATION", nullable = false)
    private String ensemblAnnotation;
    
    @Column(name = "VSS_STRAIN_7_ALTERNATIVE_ALLELE", nullable = false)
    private String strain7Allele;
    
    @Column(name = "VSS_STRAIN_7_ALTERNATIVE_ALLELE_FIXED", nullable = false)
    private boolean strain7AlleleFixed;
    
    @Column(name = "VSS_STRAIN_7_ALTERNATIVE_ALLELE_RATIO", nullable = false)
    private long strain7AlleleRatio;
    
    @Column(name = "VSS_STRAIN_P_ALTERNATIVE_ALLELE", nullable = false)
    private String strainPAllele;
    
    @Column(name = "VSS_STRAIN_P_ALTERNATIVE_ALLELE_FIXED", nullable = false)
    private boolean strainPAlleleFixed;
    
    @Column(name = "VSS_STRAIN_P_ALTERNATIVE_ALLELE_RATIO", nullable = false)
    private long strainPAlleleRatio;
    
    @Column(name = "VSS_STRAIN_W_ALTERNATIVE_ALLELE", nullable = false)
    private String strainWAllele;
    
    @Column(name = "VSS_STRAIN_W_ALTERNATIVE_ALLELE_FIXED", nullable = false)
    private boolean strainWAlleleFixed;
    
    @Column(name = "VSS_STRAIN_W_ALTERNATIVE_ALLELE_RATIO", nullable = false)
    private long strainWAlleleRatio;
    
    @Column(name = "VSS_STRAIN_N_ALTERNATIVE_ALLELE", nullable = false)
    private String strainNAllele;
    
    @Column(name = "VSS_STRAIN_N_ALTERNATIVE_ALLELE_FIXED", nullable = false)
    private boolean strainNAlleleFixed;
    
    @Column(name = "VSS_STRAIN_N_ALTERNATIVE_ALLELE_RATIO", nullable = false)
    private long strainNAlleleRatio;
    
    @Column(name = "VSS_STRAIN_15I_ALTERNATIVE_ALLELE", nullable = false)
    private String strain15IAllele;
    
    @Column(name = "VSS_STRAIN_15I_ALTERNATIVE_ALLELE_FIXED", nullable = false)
    private boolean strain15IAlleleFixed;
    
    @Column(name = "VSS_STRAIN_15I_ALTERNATIVE_ALLELE_RATIO", nullable = false)
    private long strain15IAlleleRatio;
    
    @Column(name = "VSS_STRAIN_ZERO_ALTERNATIVE_ALLELE", nullable = false)
    private String strainZEROAllele;
    
    @Column(name = "VSS_STRAIN_ZERO_ALTERNATIVE_ALLELE_FIXED", nullable = false)
    private boolean strainZEROAlleleFixed;
    
    @Column(name = "VSS_STRAIN_ZERO_ALTERNATIVE_ALLELE_RATIO", nullable = false)
    private long strainZEROAlleleRatio;
    
    @Column(name = "VSS_STRAIN_6_ALTERNATIVE_ALLELE", nullable = false)
    private String strain6Allele;
    
    @Column(name = "VSS_STRAIN_6_ALTERNATIVE_ALLELE_FIXED", nullable = false)
    private boolean strain6AlleleFixed;
    
    @Column(name = "VSS_STRAIN_6_ALTERNATIVE_ALLELE_RATIO", nullable = false)
    private long strain6AlleleRatio;
    
    @Column(name = "VSS_STRAIN_C_ALTERNATIVE_ALLELE", nullable = false)
    private String strainCAllele;
    
    @Column(name = "VSS_STRAIN_C_ALTERNATIVE_ALLELE_FIXED", nullable = false)
    private boolean strainCAlleleFixed;
    
    @Column(name = "VSS_STRAIN_C_ALTERNATIVE_ALLELE_RATIO", nullable = false)
    private long strainCAlleleRatio;
    
    @Column(name = "VSS_CREATION_TIME", nullable = false)
    private Date creationTime;
    
    @Column(name = "VSS_MODIFICATION_TIME", nullable = true)
    private Date modificationTime;
    
    @Version
    @Column(name = "VSS_VERSION", nullable = false)
    private long version;
    

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
    public int getPosition() {
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
    public boolean getStrain7AlleleFixed() {
    	return strain7AlleleFixed;
    }
    public boolean isStrain7AlleleFixed() {
    	return strain7AlleleFixed;
    }
    public long getStrain7AlleleRatio() {
    	return strain7AlleleRatio;
    }
    public String getStrainPAllele() {
    	return strainPAllele;
    }
    public boolean getStrainPAlleleFixed() {
    	return strainPAlleleFixed;
    }
    public boolean isStrainPAlleleFixed() {
    	return strainPAlleleFixed;
    }
    public long getStrainPAlleleRatio() {
    	return strainPAlleleRatio;
    }
    public String getStrainWAllele() {
    	return strainWAllele;
    }
    public boolean getStrainWAlleleFixed() {
    	return strainWAlleleFixed;
    }
    public boolean isStrainWAlleleFixed() {
    	return strainWAlleleFixed;
    }
    public long getStrainWAlleleRatio() {
    	return strainWAlleleRatio;
    }
    public String getStrainNAllele() {
    	return strainNAllele;
    }
    public boolean getStrainNAlleleFixed() {
    	return strainNAlleleFixed;
    }
    public boolean isStrainNAlleleFixed() {
    	return strainNAlleleFixed;
    }
    public long getStrainNAlleleRatio() {
    	return strainNAlleleRatio;
    }
    public String getStrain15IAllele() {
    	return strain15IAllele;
    }
    public boolean getStrain15IAlleleFixed() {
    	return strain15IAlleleFixed;
    }
    public boolean isStrain15IAlleleFixed() {
    	return strain15IAlleleFixed;
    }
    public long getStrain15IAlleleRatio() {
    	return strain15IAlleleRatio;
    }
    public String getStrainZEROAllele() {
    	return strainZEROAllele;
    }
    public boolean getStrainZEROAlleleFixed() {  
    	return strainZEROAlleleFixed;
    }
    public boolean isStrainZEROAlleleFixed() {
    	return strainZEROAlleleFixed;
    }
    public long getStrainZEROAlleleRatio() {
    	return strainZEROAlleleRatio;
    }
    public String getStrain6Allele() {
    	return strain6Allele;
    }
    public boolean getStrain6AlleleFixed() {
    	return strain6AlleleFixed;
    }
    public boolean isStrain6AlleleFixed() {
    	return strain6AlleleFixed;
    }
    public long getStrain6AlleleRatio() {
    	return strain6AlleleRatio;
    }
    public String getStrainCAllele() {
    	return strainCAllele;
    }
    public boolean getStrainCAlleleFixed() {
    	return strainCAlleleFixed;
    }
    public boolean isStrainCAlleleFixed() {
    	return strainCAlleleFixed;
    }
    public long getStrainCAlleleRatio() {
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
    
    // Getters As Strings -------------------------------------------------------------------------
    public String getOidAsString() {
    	return ObjectConverter.convert(oid, String.class);
    }
    public String getPositionAsString() {
    	return ObjectConverter.convert(position, String.class);
    }
    public String getStrain7AlleleFixedAsString() {
    	return ObjectConverter.convert(strain7AlleleFixed, String.class);
    }
    public String getStrain7AlleleRatioAsString() {
    	return ObjectConverter.convert(strain7AlleleRatio, String.class);
    }
    public String getStrainPAlleleFixedAsString() {
    	return ObjectConverter.convert(strainPAlleleFixed, String.class);
    }
    public String getStrainPAlleleRatioAsString() {
    	return ObjectConverter.convert(strainPAlleleRatio, String.class);
    }
    public String getStrainWAlleleFixedAsString() {
    	return ObjectConverter.convert(strainWAlleleFixed, String.class);
    }
    public String getStrainWAlleleRatioAsString() {
    	return ObjectConverter.convert(strainWAlleleRatio, String.class);
    }
    public String getStrainNAlleleFixedAsString() {
    	return ObjectConverter.convert(strainNAlleleFixed, String.class);
    }
    public String getStrainNAlleleRatioAsString() {
    	return ObjectConverter.convert(strainNAlleleRatio, String.class);
    }
    public String getStrain15IAlleleFixedAsString() {
    	return ObjectConverter.convert(strain15IAlleleFixed, String.class);
    }
    public String getStrain15IAlleleRatioAsString() {
    	return ObjectConverter.convert(strain15IAlleleRatio, String.class);
    }
    public String getStrainZEROAlleleFixedAsString() {  
    	return ObjectConverter.convert(strainZEROAlleleFixed, String.class);
    }
    public String getStrainZEROAlleleRatioAsString() {
    	return ObjectConverter.convert(strainZEROAlleleRatio, String.class);
    }
    public String getStrain6AlleleFixedAsString() {
    	return ObjectConverter.convert(strain6AlleleFixed, String.class);
    }
    public String getStrain6AlleleRatioAsString() {
    	return ObjectConverter.convert(strain6AlleleRatio, String.class);
    }
    public String getStrainCAlleleFixedAsString() {
    	return ObjectConverter.convert(strainCAlleleFixed, String.class);
    }
    public String getStrainCAlleleRatioAsString() {
    	return ObjectConverter.convert(strainCAlleleRatio, String.class);
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

    // Getters As Strings Enclosed in Quotes ------------------------------------------------------
    public String getOidAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(oid, String.class) + '\"';
    }
    public String getPositionAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(position, String.class) + '\"';
    }
    public String getStrain7AlleleFixedAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(strain7AlleleFixed, String.class) + '\"';
    }
    public String getStrain7AlleleRatioAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(strain7AlleleRatio, String.class) + '\"';
    }
    public String getStrainPAlleleFixedAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(strainPAlleleFixed, String.class) + '\"';
    }
    public String getStrainPAlleleRatioAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(strainPAlleleRatio, String.class) + '\"';
    }
    public String getStrainWAlleleFixedAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(strainWAlleleFixed, String.class) + '\"';
    }
    public String getStrainWAlleleRatioAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(strainWAlleleRatio, String.class) + '\"';
    }
    public String getStrainNAlleleFixedAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(strainNAlleleFixed, String.class) + '\"';
    }
    public String getStrainNAlleleRatioAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(strainNAlleleRatio, String.class) + '\"';
    }
    public String getStrain15IAlleleFixedAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(strain15IAlleleFixed, String.class) + '\"';
    }
    public String getStrain15IAlleleRatioAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(strain15IAlleleRatio, String.class) + '\"';
    }
    public String getStrainZEROAlleleFixedAsStringQuoted() {  
    	return '\"' + ObjectConverter.convert(strainZEROAlleleFixed, String.class) + '\"';
    }
    public String getStrainZEROAlleleRatioAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(strainZEROAlleleRatio, String.class) + '\"';
    }
    public String getStrain6AlleleFixedAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(strain6AlleleFixed, String.class) + '\"';
    }
    public String getStrain6AlleleRatioAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(strain6AlleleRatio, String.class) + '\"';
    }
    public String getStrainCAlleleFixedAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(strainCAlleleFixed, String.class) + '\"';
    }
    public String getStrainCAlleleRatioAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(strainCAlleleRatio, String.class) + '\"';
    }
    public String getCreationTimeAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(creationTime, String.class) + '\"';
    }
    public String getModificationTimeAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(modificationTime, String.class) + '\"';
    }
    public String getVersionAsStringQuoted() {
    	return '\"' + ObjectConverter.convert(version, String.class) + '\"';
    }
    public String getSnpIdQuoted() {
    	return '\"' + snpId + '\"';
    }
    public String getChromosomeIdQuoted() {
    	return '\"' + chromosomeId + '\"';
    }
    public String getReferenceQuoted() {
    	return '\"' + reference + '\"';    
    }
    public String getAlternativeQuoted() {
    	return '\"' + alternative + '\"';
    }
    public String getRegionQuoted() {
    	return '\"' + region + '\"';
    }
    public String getEnsemblGeneQuoted() {
    	return '\"' + ensemblGene + '\"';
    }
    public String getEnsemblTranscriptQuoted() {
    	return '\"' + ensemblTranscript + '\"';
    }
    public String getEnsemblAnnotationQuoted() {
    	return '\"' + ensemblAnnotation + '\"';
    }
    public String getStrain7AlleleQuoted() {
    	return '\"' + strain7Allele + '\"';
    }
    public String getStrainPAlleleQuoted() {
    	return '\"' + strainPAllele + '\"';
    }
    public String getStrainWAlleleQuoted() {
    	return '\"' + strainWAllele + '\"';
    }
    public String getStrainNAlleleQuoted() {
    	return '\"' + strainNAllele + '\"';
    }
    public String getStrain15IAlleleQuoted() {
    	return '\"' + strain15IAllele + '\"';
    }
    public String getStrainZEROAlleleQuoted() {
    	return '\"' + strainZEROAllele + '\"';
    }
    public String getStrain6AlleleQuoted() {
    	return '\"' + strain6Allele + '\"';
    }
    public String getStrainCAlleleQuoted() {
    	return '\"' + strainCAllele + '\"';
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
    public void setPosition(int position) {
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
    public void setStrain7AlleleFixed(boolean strain7AlleleFixed) {
    	this.strain7AlleleFixed = strain7AlleleFixed;
    }
    public void setStrain7AlleleRatio(long strain7AlleleRatio) {
    	this.strain7AlleleRatio = strain7AlleleRatio;
    }
    public void setStrainPAllele(String strainPAllele) {
    	this.strainPAllele = strainPAllele;
    }
    public void setStrainPAlleleFixed(boolean strainPAlleleFixed) {
    	this.strainPAlleleFixed = strainPAlleleFixed;
    }
    public void setStrainPAlleleRatio(long strainPAlleleRatio) {
    	this.strainPAlleleRatio = strainPAlleleRatio;
    }
    public void setStrainWAllele(String strainWAllele) {
    	this.strainWAllele = strainWAllele;
    }
    public void setStrainWAlleleFixed(boolean strainWAlleleFixed) {
    	this.strainWAlleleFixed = strainWAlleleFixed;
    }
    public void setStrainWAlleleRatio(long strainWAlleleRatio) {
    	this.strainWAlleleRatio = strainWAlleleRatio;
    }
    public void setStrainNAllele(String strainNAllele) {
    	this.strainNAllele = strainNAllele;
    }
    public void setStrainNAlleleFixed(boolean strainNAlleleFixed) {
    	this.strainNAlleleFixed = strainNAlleleFixed;
    }
    public void setStrainNAlleleRatio(long strainNAlleleRatio) {
    	this.strainNAlleleRatio = strainNAlleleRatio;
    }
    public void setStrain15IAllele(String strain15IAllele) {
    	this.strain15IAllele = strain15IAllele;
    }
    public void setStrain15IAlleleFixed(boolean strain15IAlleleFixed) {
    	this.strain15IAlleleFixed = strain15IAlleleFixed;
    }
    public void setStrain15IAlleleRatio(long strain15IAlleleRatio) {
    	this.strain15IAlleleRatio = strain15IAlleleRatio;
    }
    public void setStrainZEROAllele(String strainZEROAllele) {
    	this.strainZEROAllele = strainZEROAllele;
    }
    public void setStrainZEROAlleleFixed(boolean strainZEROAlleleFixed) {  
    	this.strainZEROAlleleFixed = strainZEROAlleleFixed;
    }
    public void setStrainZEROAlleleRatio(long strainZEROAlleleRatio) {
    	this.strainZEROAlleleRatio = strainZEROAlleleRatio;
    }
    public void setStrain6Allele(String strain6Allele) {
    	this.strain6Allele = strain6Allele;
    }
    public void setStrain6AlleleFixed(boolean strain6AlleleFixed) {
    	this.strain6AlleleFixed = strain6AlleleFixed;
    }
    public void setStrain6AlleleRatio(long strain6AlleleRatio) {
    	this.strain6AlleleRatio = strain6AlleleRatio;
    }
    public void setStrainCAllele(String strainCAllele) {
    	this.strainCAllele = strainCAllele;
    }
    public void setStrainCAlleleFixed(boolean strainCAlleleFixed) {
    	this.strainCAlleleFixed = strainCAlleleFixed;
    }
    public void setStrainCAlleleRatio(long strainCAlleleRatio) {
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

    // Helpers ------------------------------------------------------------------------------------    
    /*
     * Is this Component the same as the Supplied Component?
     */
    public boolean isSameAs(SNPChromosome snpchromosome){

        if (this.getOid() == snpchromosome.getOid() && 
        		this.getSnpId().equals(snpchromosome.getSnpId()) && 
        		this.getChromosomeId().equals(snpchromosome.getChromosomeId()) && 
        		this.getPosition() == snpchromosome.getPosition() &&
        	    this.getReference().equals(snpchromosome.getReference()) && 
        	    this.getAlternative().equals(snpchromosome.getAlternative()) && 
        	    this.getRegion().equals(snpchromosome.getRegion()) && 
        	    this.getEnsemblGene().equals(snpchromosome.getEnsemblGene()) && 
        	    this.getEnsemblTranscript().equals(snpchromosome.getEnsemblTranscript()) && 
        	    this.getEnsemblAnnotation().equals(snpchromosome.getEnsemblAnnotation()) && 
        	    this.getStrain7Allele().equals(snpchromosome.getStrain7Allele()) && 
        	    this.getStrain7AlleleFixed() == snpchromosome.getStrain7AlleleFixed() && 
        	    this.getStrain7AlleleRatio() == snpchromosome.getStrain7AlleleRatio() && 
        	    this.getStrainPAllele().equals(snpchromosome.getStrainPAllele()) && 
        	    this.getStrainPAlleleFixed() == snpchromosome.getStrainPAlleleFixed() && 
        	    this.getStrainPAlleleRatio() == snpchromosome.getStrainPAlleleRatio() && 
        	    this.getStrainWAllele().equals(snpchromosome.getStrainWAllele()) && 
        	    this.getStrainWAlleleFixed() == snpchromosome.getStrainWAlleleFixed() && 
        	    this.getStrainWAlleleRatio() == snpchromosome.getStrainWAlleleRatio() && 
        	    this.getStrainNAllele().equals(snpchromosome.getStrainNAllele()) && 
        	    this.getStrainNAlleleFixed() == snpchromosome.getStrainNAlleleFixed() && 
        	    this.getStrainNAlleleRatio() == snpchromosome.getStrainNAlleleRatio() && 
        	    this.getStrain15IAllele().equals(snpchromosome.getStrain15IAllele()) && 
        	    this.getStrain15IAlleleFixed() == snpchromosome.getStrain15IAlleleFixed()  && 
        	    this.getStrain15IAlleleRatio() == snpchromosome.getStrain15IAlleleRatio() && 
        	    this.getStrainZEROAllele().equals(snpchromosome.getStrainZEROAllele()) && 
        	    this.getStrainZEROAlleleFixed() == snpchromosome.getStrainZEROAlleleFixed() &&  
        	    this.getStrainZEROAlleleRatio() == snpchromosome.getStrainZEROAlleleRatio() && 
        	    this.getStrain6Allele().equals(snpchromosome.getStrain6Allele()) && 
        	    this.getStrain6AlleleFixed() == snpchromosome.getStrain6AlleleFixed() && 
        	    this.getStrain6AlleleRatio() == snpchromosome.getStrain6AlleleRatio() && 
        	    this.getStrainCAllele().equals(snpchromosome.getStrainCAllele()) && 
        	    this.getStrainCAlleleFixed() == snpchromosome.getStrainCAlleleFixed() && 
        	    this.getStrainCAlleleRatio() == snpchromosome.getStrainCAlleleRatio() 
        	    ) {

        	return true;
        }
        else {

        	return false;
        }
    }

    /*
     * The OID is unique for each Component.
     *  So this should compare Component by OID only.
     */
    public boolean equals(Object other) {
    	
        return (other instanceof SNPChromosome) && (oid != null) 
        		? oid.equals(((SNPChromosome) other).oid) 
        		: (other == this);
    }
    

    public void update(
    		String snpId,
    		String chromosomeId,
    		int position,
    		String reference,    
    		String alternative,
    		String region,
    		String ensemblGene,
    		String ensemblTranscript,
    		String ensemblAnnotation,
    		String strain7Allele,
    		boolean strain7AlleleFixed,
    		long strain7AlleleRatio,
    		String strainPAllele,
    		boolean strainPAlleleFixed,
    		long strainPAlleleRatio,
    		String strainWAllele,
    		boolean strainWAlleleFixed,
    		long strainWAlleleRatio,
    		String strainNAllele,
    		boolean strainNAlleleFixed,
    		long strainNAlleleRatio,
    		String strain15IAllele,
    		boolean strain15IAlleleFixed,
    		long strain15IAlleleRatio,
    		String strainZEROAllele,
    		boolean strainZEROAlleleFixed,
    		long strainZEROAlleleRatio,
    		String strain6Allele,
    		boolean strain6AlleleFixed,
    		long strain6AlleleRatio,
    		String strainCAllele,
    		boolean strainCAlleleFixed,
    		long strainCAlleleRatio ) {

    	this.snpId = snpId;
    	this.chromosomeId = chromosomeId;
    	this.position = position;
    	this.reference = reference;    
    	this.alternative = alternative;
    	this.region = region;
    	this.ensemblGene = ensemblGene;
    	this.ensemblTranscript = ensemblTranscript;
    	this.ensemblAnnotation = ensemblAnnotation;
    	this.strain7Allele = strain7Allele;
    	this.strain7AlleleFixed = strain7AlleleFixed;
    	this.strain7AlleleRatio = strain7AlleleRatio;
    	this.strainPAllele = strainPAllele;
    	this.strainPAlleleFixed = strainPAlleleFixed;
    	this.strainPAlleleRatio = strainPAlleleRatio;
    	this.strainWAllele = strainWAllele;
    	this.strainWAlleleFixed = strainWAlleleFixed;
    	this.strainWAlleleRatio = strainWAlleleRatio;
    	this.strainNAllele = strainNAllele;
    	this.strainNAlleleFixed = strainNAlleleFixed;
    	this.strainNAlleleRatio = strainNAlleleRatio;
    	this.strain15IAllele = strain15IAllele;
    	this.strain15IAlleleFixed = strain15IAlleleFixed;
    	this.strain15IAlleleRatio = strain15IAlleleRatio;
    	this.strainZEROAllele = strainZEROAllele;
    	this.strainZEROAlleleFixed = strainZEROAlleleFixed;
    	this.strainZEROAlleleRatio = strainZEROAlleleRatio;
    	this.strain6Allele = strain6Allele;
    	this.strain6AlleleFixed = strain6AlleleFixed;
    	this.strain6AlleleRatio = strain6AlleleRatio;
    	this.strainCAllele = strainCAllele;
    	this.strainCAlleleFixed = strainCAlleleFixed;
    	this.strainCAlleleRatio = strainCAlleleRatio;
    }
    
    @PreUpdate
    public void preUpdate() {
    	
    	this.modificationTime = new Date();
    }
    
    @PrePersist
    public void prePersist() {
    	
        Date now = new Date();
        
        this.creationTime = now;
        this.modificationTime = now;
    }

    @Override
    public String toString() {
    	
        return ToStringBuilder.reflectionToString(this);
    }

    // SNPChromosome Builder ---------------------------------------------------------------------
    /**
     * Gets a builder which is used to create SNPChromosome objects.
     * 
     * @param snpId The SNP ID
     * @param chromosomeId The Chromosome ID
     * @param position The SNP Position or coordinate
     * @param reference The Reference or Expected Nucleobase
     * @param alternative The Alternative Nucleobase as found
     * @param region The Region
     * @param ensemblGene The Ensembl Gene Name
     * @param ensemblTranscript The Ensembl Transcript
     * @param ensemblAnnotation Coding predictions based on Ensembl gene models
     * @param strain7Allele For Strain 7 the Alternative Allele
     * @param strain7AlleleFixed For Strain 7 is this fixed or not
     * @param strain7AlleleRatio For Strain 7 for not fixed alleles what is the ratio that this occurs else 1 for fixed
     * @param strainPAllele For Strain P the Alternative Allele
     * @param strainPAlleleFixed For Strain P is this fixed or not
     * @param strainPAlleleRatio For Strain P for not fixed alleles what is the ratio that this occurs else 1 for fixed
     * @param strainWAllele For Strain W the Alternative Allele
     * @param strainWAlleleFixed For Strain W is this fixed or not
     * @param strainWAlleleRatio For Strain W for not fixed alleles what is the ratio that this occurs else 1 for fixed
     * @param strainNAllele For Strain N the Alternative Allele
     * @param strainNAlleleFixed For Strain N is this fixed or not
     * @param strainNAlleleRatio For Strain N for not fixed alleles what is the ratio that this occurs else 1 for fixed
     * @param strain15IAllele For Strain 15I the Alternative Allele
     * @param strain15IAlleleFixed For Strain 15I is this fixed or not
     * @param strain15IAlleleRatio For Strain 15I for not fixed alleles what is the ratio that this occurs else 1 for fixed
     * @param strainZEROAllele For Strain ZERO the Alternative Allele
     * @param strainZEROAlleleFixed For Strain ZERO is this fixed or not
     * @param strainZEROAlleleRatio For Strain ZERO for not fixed alleles what is the ratio that this occurs else 1 for fixed
     * @param strain6Allele For Strain 6 the Alternative Allele
     * @param strain6AlleleFixed For Strain 6 is this fixed or not
     * @param strain6AlleleRatio For Strain 6 for not fixed alleles what is the ratio that this occurs else 1 for fixed
     * @param strainCAllele For Strain C the Alternative Allele
     * @param strainCAlleleFixed For Strain C is this fixed or not
     * @param strainCAlleleRatio For Strain C for not fixed alleles what is the ratio that this occurs else 1 for fixed
     * 
     * @return  A new Builder instance.
     */
    public static Builder getBuilder(
    		String snpId,
    		String chromosomeId,
    		int position,
    		String reference,    
    		String alternative,
    		String region,
    		String ensemblGene,
    		String ensemblTranscript,
    		String ensemblAnnotation,
    		String strain7Allele,
    		boolean strain7AlleleFixed,
    		long strain7AlleleRatio,
    		String strainPAllele,
    		boolean strainPAlleleFixed,
    		long strainPAlleleRatio,
    		String strainWAllele,
    		boolean strainWAlleleFixed,
    		long strainWAlleleRatio,
    		String strainNAllele,
    		boolean strainNAlleleFixed,
    		long strainNAlleleRatio,
    		String strain15IAllele,
    		boolean strain15IAlleleFixed,
    		long strain15IAlleleRatio,
    		String strainZEROAllele,
    		boolean strainZEROAlleleFixed,
    		long strainZEROAlleleRatio,
    		String strain6Allele,
    		boolean strain6AlleleFixed,
    		long strain6AlleleRatio,
    		String strainCAllele,
    		boolean strainCAlleleFixed,
    		long strainCAlleleRatio ) {
    	
        return new Builder(
        		snpId,
        		chromosomeId,
        		position,
        		reference,    
        		alternative,
        		region,
        		ensemblGene,
        		ensemblTranscript,
        		ensemblAnnotation,
        		strain7Allele,
        		strain7AlleleFixed,
        		strain7AlleleRatio,
        		strainPAllele,
        		strainPAlleleFixed,
        		strainPAlleleRatio,
        		strainWAllele,
        		strainWAlleleFixed,
        		strainWAlleleRatio,
        		strainNAllele,
        		strainNAlleleFixed,
        		strainNAlleleRatio,
        		strain15IAllele,
        		strain15IAlleleFixed,
        		strain15IAlleleRatio,
        		strainZEROAllele,
        		strainZEROAlleleFixed,
        		strainZEROAlleleRatio,
        		strain6Allele,
        		strain6AlleleFixed,
        		strain6AlleleRatio,
        		strainCAllele,
        		strainCAlleleFixed,
        		strainCAlleleRatio );
    }
    
    /**
     * A Builder class used to create new SNPChromosome objects.
     */
    public static class Builder {
    	
        SNPChromosome built;

        /**
         * Creates a new Builder instance.
         * @param snpId The SNP ID
         * @param chromosomeId The Chromosome ID
         * @param position The SNP Position or coordinate
         * @param reference The Reference or Expected Nucleobase
         * @param alternative The Alternative Nucleobase as found
         * @param region The Region
         * @param ensemblGene The Ensembl Gene Name
         * @param ensemblTranscript The Ensembl Transcript
         * @param ensemblAnnotation Coding predictions based on Ensembl gene models
         * @param strain7Allele For Strain 7 the Alternative Allele
         * @param strain7AlleleFixed For Strain 7 is this fixed or not
         * @param strain7AlleleRatio For Strain 7 for not fixed alleles what is the ratio that this occurs else 1 for fixed
         * @param strainPAllele For Strain P the Alternative Allele
         * @param strainPAlleleFixed For Strain P is this fixed or not
         * @param strainPAlleleRatio For Strain P for not fixed alleles what is the ratio that this occurs else 1 for fixed
         * @param strainWAllele For Strain W the Alternative Allele
         * @param strainWAlleleFixed For Strain W is this fixed or not
         * @param strainWAlleleRatio For Strain W for not fixed alleles what is the ratio that this occurs else 1 for fixed
         * @param strainNAllele For Strain N the Alternative Allele
         * @param strainNAlleleFixed For Strain N is this fixed or not
         * @param strainNAlleleRatio For Strain N for not fixed alleles what is the ratio that this occurs else 1 for fixed
         * @param strain15IAllele For Strain 15I the Alternative Allele
         * @param strain15IAlleleFixed For Strain 15I is this fixed or not
         * @param strain15IAlleleRatio For Strain 15I for not fixed alleles what is the ratio that this occurs else 1 for fixed
         * @param strainZEROAllele For Strain ZERO the Alternative Allele
         * @param strainZEROAlleleFixed For Strain ZERO is this fixed or not
         * @param strainZEROAlleleRatio For Strain ZERO for not fixed alleles what is the ratio that this occurs else 1 for fixed
         * @param strain6Allele For Strain 6 the Alternative Allele
         * @param strain6AlleleFixed For Strain 6 is this fixed or not
         * @param strain6AlleleRatio For Strain 6 for not fixed alleles what is the ratio that this occurs else 1 for fixed
         * @param strainCAllele For Strain C the Alternative Allele
         * @param strainCAlleleFixed For Strain C is this fixed or not
         * @param strainCAlleleRatio For Strain C for not fixed alleles what is the ratio that this occurs else 1 for fixed
         */
        Builder(
        		String snpId,
        		String chromosomeId,
        		int position,
        		String reference,    
        		String alternative,
        		String region,
        		String ensemblGene,
        		String ensemblTranscript,
        		String ensemblAnnotation,
        		String strain7Allele,
        		boolean strain7AlleleFixed,
        		long strain7AlleleRatio,
        		String strainPAllele,
        		boolean strainPAlleleFixed,
        		long strainPAlleleRatio,
        		String strainWAllele,
        		boolean strainWAlleleFixed,
        		long strainWAlleleRatio,
        		String strainNAllele,
        		boolean strainNAlleleFixed,
        		long strainNAlleleRatio,
        		String strain15IAllele,
        		boolean strain15IAlleleFixed,
        		long strain15IAlleleRatio,
        		String strainZEROAllele,
        		boolean strainZEROAlleleFixed,
        		long strainZEROAlleleRatio,
        		String strain6Allele,
        		boolean strain6AlleleFixed,
        		long strain6AlleleRatio,
        		String strainCAllele,
        		boolean strainCAlleleFixed,
        		long strainCAlleleRatio ) {
        	
            built = new SNPChromosome();
            
        	built.snpId = snpId;
        	built.chromosomeId = chromosomeId;
        	built.position = position;
        	built.reference = reference;    
        	built.region = region;
        	built.alternative = alternative;
        	built.ensemblGene = ensemblGene;
        	built.ensemblTranscript = ensemblTranscript;
        	built.ensemblAnnotation = ensemblAnnotation;
        	built.strain7Allele = strain7Allele;
        	built.strain7AlleleFixed = strain7AlleleFixed;
        	built.strain7AlleleRatio = strain7AlleleRatio;
        	built.strainPAllele = strainPAllele;
        	built.strainPAlleleFixed = strainPAlleleFixed;
        	built.strainPAlleleRatio = strainPAlleleRatio;
        	built.strainWAllele = strainWAllele;
        	built.strainWAlleleFixed = strainWAlleleFixed;
        	built.strainWAlleleRatio = strainWAlleleRatio;
        	built.strainNAllele = strainNAllele;
        	built.strainNAlleleFixed = strainNAlleleFixed;
        	built.strainNAlleleRatio = strainNAlleleRatio;
        	built.strain15IAllele = strain15IAllele;
        	built.strain15IAlleleFixed = strain15IAlleleFixed;
        	built.strain15IAlleleRatio = strain15IAlleleRatio;
        	built.strainZEROAllele = strainZEROAllele;
        	built.strainZEROAlleleFixed = strainZEROAlleleFixed;
        	built.strainZEROAlleleRatio = strainZEROAlleleRatio;
        	built.strain6Allele = strain6Allele;
        	built.strain6AlleleFixed = strain6AlleleFixed;
        	built.strain6AlleleRatio = strain6AlleleRatio;
        	built.strainCAllele = strainCAllele;
        	built.strainCAlleleFixed = strainCAlleleFixed;
        	built.strainCAlleleRatio = strainCAlleleRatio;
        }

        /**
         * Builds the new SNPChromosome object.
         * 
         * @return  The created SNPChromosome object.
         */
        public SNPChromosome build() {
        	
            return built;
        }
    }

    /**
     * This setter method should only be used by unit tests.
     * @param oid
     */
    protected void setId(Long oid) {
        this.oid = oid;
    }
}
