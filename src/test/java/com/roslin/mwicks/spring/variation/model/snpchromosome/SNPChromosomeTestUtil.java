package com.roslin.mwicks.spring.variation.model.snpchromosome;

import com.roslin.mwicks.spring.variation.dto.DTOSNPChromosome;

/**
 * An utility class which contains useful methods for unit testing person related
 * functions.
 * @author Petri Kainulainen
 */
public class SNPChromosomeTestUtil {

    public static DTOSNPChromosome createDTO(
            long oid,
            String snpId,
    		String chromosomeId,
    		String position,
    		String reference,    
    		String alternative,
    		String region,
    		String ensemblGene,
    		String ensemblTranscript,
    		String ensemblAnnotation,
    		String strain7Allele,
    		String strain7AlleleFixed,
    		String strain7AlleleRatio,
    		String strainPAllele,
    		String strainPAlleleFixed,
    		String strainPAlleleRatio,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		String strainWAlleleRatio,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		String strainNAlleleRatio,
    		String strain15IAllele,
    		String strain15IAlleleFixed,
    		String strain15IAlleleRatio,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		String strainZeroAlleleRatio,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		String strain6AlleleRatio,
    		String strainCAllele,
    		String strainCAlleleFixed,
    		String strainCAlleleRatio         
    		) {
    
        DTOSNPChromosome dto = new DTOSNPChromosome();

        dto.setOid(oid);
        dto.setSnpId(snpId);
        dto.setChromosomeId(chromosomeId);
        dto.setPosition(position);
        dto.setReference(reference);
        dto.setAlternative(alternative);
        dto.setRegion(region);
        dto.setEnsemblGene(ensemblGene);
        dto.setEnsemblTranscript(ensemblTranscript);
        dto.setEnsemblAnnotation(ensemblAnnotation);
        dto.setStrain7Allele(strain7Allele);
        dto.setStrain7AlleleFixed(strain7AlleleFixed);
        dto.setStrain7AlleleRatio(strain7AlleleRatio);
        dto.setStrainPAllele(strainPAllele);
        dto.setStrainPAlleleFixed(strainPAlleleFixed);
        dto.setStrainPAlleleRatio(strainPAlleleRatio);
        dto.setStrainWAllele(strainWAllele);
        dto.setStrainWAlleleFixed(strainWAlleleFixed);
        dto.setStrainWAlleleRatio(strainWAlleleRatio);
        dto.setStrainNAllele(strainNAllele);
        dto.setStrainNAlleleFixed(strainNAlleleFixed);
        dto.setStrainNAlleleRatio(strainNAlleleRatio);
        dto.setStrain15IAllele(strain15IAllele);
        dto.setStrain15IAlleleFixed(strain15IAlleleFixed);
        dto.setStrain15IAlleleRatio(strain15IAlleleRatio);
        dto.setStrainZeroAllele(strainZeroAllele);
        dto.setStrainZeroAlleleFixed(strainZeroAlleleFixed);  
        dto.setStrainZeroAlleleRatio(strainZeroAlleleRatio);
        dto.setStrain6Allele(strain6Allele);
        dto.setStrain6AlleleFixed(strain6AlleleFixed);
        dto.setStrain6AlleleRatio(strain6AlleleRatio);
        dto.setStrainCAllele(strainCAllele);
        dto.setStrainCAlleleFixed(strainCAlleleFixed);
        dto.setStrainCAlleleRatio(strainCAlleleRatio);

        return dto;
    }

    public static SNPChromosome createModelObject(
            long oid,
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
    		String strain7AlleleFixed,
    		long strain7AlleleRatio,
    		String strainPAllele,
    		String strainPAlleleFixed,
    		long strainPAlleleRatio,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		long strainWAlleleRatio,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		long strainNAlleleRatio,
    		String strain15IAllele,
    		String strain15IAlleleFixed,
    		long strain15IAlleleRatio,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		long strainZeroAlleleRatio,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		long strain6AlleleRatio,
    		String strainCAllele,
    		String strainCAlleleFixed,
    		long strainCAlleleRatio         
        ) {
    
        SNPChromosome model = SNPChromosome.getBuilder(
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
    		strainZeroAllele,
    		strainZeroAlleleFixed,
    		strainZeroAlleleRatio,
    		strain6Allele,
    		strain6AlleleFixed,
    		strain6AlleleRatio,
    		strainCAllele,
    		strainCAlleleFixed,
    		strainCAlleleRatio         
        ).build();

        model.setOid(oid);

        return model;
    }
}
