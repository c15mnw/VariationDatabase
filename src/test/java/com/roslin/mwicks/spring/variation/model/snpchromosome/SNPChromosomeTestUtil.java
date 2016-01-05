package com.roslin.mwicks.spring.variation.model.snpchromosome;

import com.roslin.mwicks.spring.variation.dto.DTOSNPChromosome;

/**
 * An utility class which contains useful methods for unit testing person related
 * functions.
 * @author Petri Kainulainen
 */
public class SNPChromosomeTestUtil {

    public static DTOSNPChromosome createDTO(
            Long oid,
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
    		String strainPAllele,
    		String strainPAlleleFixed,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		String strain15IAllele,
    		String strain15IAlleleFixed,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		String strainCAllele,
    		String strainCAlleleFixed         
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
        dto.setStrainPAllele(strainPAllele);
        dto.setStrainPAlleleFixed(strainPAlleleFixed);
        dto.setStrainWAllele(strainWAllele);
        dto.setStrainWAlleleFixed(strainWAlleleFixed);
        dto.setStrainNAllele(strainNAllele);
        dto.setStrainNAlleleFixed(strainNAlleleFixed);
        dto.setStrain15IAllele(strain15IAllele);
        dto.setStrain15IAlleleFixed(strain15IAlleleFixed);
        dto.setStrainZeroAllele(strainZeroAllele);
        dto.setStrainZeroAlleleFixed(strainZeroAlleleFixed);  
        dto.setStrain6Allele(strain6Allele);
        dto.setStrain6AlleleFixed(strain6AlleleFixed);
        dto.setStrainCAllele(strainCAllele);
        dto.setStrainCAlleleFixed(strainCAlleleFixed);

        return dto;
    }

    
    public static SNPChromosome createModelObject(
            Long oid,
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
    		String strainPAllele,
    		String strainPAlleleFixed,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		String strain15IAllele,
    		String strain15IAlleleFixed,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		String strainCAllele,
    		String strainCAlleleFixed
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
    		strainPAllele,
    		strainPAlleleFixed,
    		strainWAllele,
    		strainWAlleleFixed,
    		strainNAllele,
    		strainNAlleleFixed,
    		strain15IAllele,
    		strain15IAlleleFixed,
    		strainZeroAllele,
    		strainZeroAlleleFixed,
    		strain6Allele,
    		strain6AlleleFixed,
    		strainCAllele,
    		strainCAlleleFixed         
        ).build();

        model.setOid(oid);

        return model;
    }
    
    
    public static SNPChromosome1 createModelObject1(
            Long oid,
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
    		String strainPAllele,
    		String strainPAlleleFixed,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		String strain15IAllele,
    		String strain15IAlleleFixed,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		String strainCAllele,
    		String strainCAlleleFixed         
        ) {
    
        SNPChromosome1 model = SNPChromosome1.getBuilder(
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
    		strainPAllele,
    		strainPAlleleFixed,
    		strainWAllele,
    		strainWAlleleFixed,
    		strainNAllele,
    		strainNAlleleFixed,
    		strain15IAllele,
    		strain15IAlleleFixed,
    		strainZeroAllele,
    		strainZeroAlleleFixed,
    		strain6Allele,
    		strain6AlleleFixed,
    		strainCAllele,
    		strainCAlleleFixed         
        ).build();

        model.setOid(oid);

        return model;
    }
    
    
    public static SNPChromosome3 createModelObject3(
            Long oid,
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
    		String strainPAllele,
    		String strainPAlleleFixed,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		String strain5IAllele,
    		String strain5IAlleleFixed,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		String strainCAllele,
    		String strainCAlleleFixed         
        ) {
    
        SNPChromosome3 model = SNPChromosome3.getBuilder(
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
    		strainPAllele,
    		strainPAlleleFixed,
    		strainWAllele,
    		strainWAlleleFixed,
    		strainNAllele,
    		strainNAlleleFixed,
    		strain5IAllele,
    		strain5IAlleleFixed,
    		strainZeroAllele,
    		strainZeroAlleleFixed,
    		strain6Allele,
    		strain6AlleleFixed,
    		strainCAllele,
    		strainCAlleleFixed         
        ).build();

        model.setOid(oid);

        return model;
    }
    
    
    public static SNPChromosome4 createModelObject4(
            Long oid,
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
    		String strainPAllele,
    		String strainPAlleleFixed,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		String strain5IAllele,
    		String strain5IAlleleFixed,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		String strainCAllele,
    		String strainCAlleleFixed         
        ) {
    
        SNPChromosome4 model = SNPChromosome4.getBuilder(
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
    		strainPAllele,
    		strainPAlleleFixed,
    		strainWAllele,
    		strainWAlleleFixed,
    		strainNAllele,
    		strainNAlleleFixed,
    		strain5IAllele,
    		strain5IAlleleFixed,
    		strainZeroAllele,
    		strainZeroAlleleFixed,
    		strain6Allele,
    		strain6AlleleFixed,
    		strainCAllele,
    		strainCAlleleFixed         
        ).build();

        model.setOid(oid);

        return model;
    }
    
    
    public static SNPChromosome5 createModelObject5(
            Long oid,
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
    		String strainPAllele,
    		String strainPAlleleFixed,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		String strain5IAllele,
    		String strain5IAlleleFixed,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		String strainCAllele,
    		String strainCAlleleFixed         
        ) {
    
        SNPChromosome5 model = SNPChromosome5.getBuilder(
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
    		strainPAllele,
    		strainPAlleleFixed,
    		strainWAllele,
    		strainWAlleleFixed,
    		strainNAllele,
    		strainNAlleleFixed,
    		strain5IAllele,
    		strain5IAlleleFixed,
    		strainZeroAllele,
    		strainZeroAlleleFixed,
    		strain6Allele,
    		strain6AlleleFixed,
    		strainCAllele,
    		strainCAlleleFixed         
        ).build();

        model.setOid(oid);

        return model;
    }
    
    
    public static SNPChromosome6 createModelObject6(
            Long oid,
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
    		String strainPAllele,
    		String strainPAlleleFixed,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		String strain5IAllele,
    		String strain5IAlleleFixed,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		String strainCAllele,
    		String strainCAlleleFixed         
        ) {
    
        SNPChromosome6 model = SNPChromosome6.getBuilder(
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
    		strainPAllele,
    		strainPAlleleFixed,
    		strainWAllele,
    		strainWAlleleFixed,
    		strainNAllele,
    		strainNAlleleFixed,
    		strain5IAllele,
    		strain5IAlleleFixed,
    		strainZeroAllele,
    		strainZeroAlleleFixed,
    		strain6Allele,
    		strain6AlleleFixed,
    		strainCAllele,
    		strainCAlleleFixed         
        ).build();

        model.setOid(oid);

        return model;
    }
    
    
    public static SNPChromosome7 createModelObject7(
            Long oid,
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
    		String strainPAllele,
    		String strainPAlleleFixed,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		String strain5IAllele,
    		String strain5IAlleleFixed,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		String strainCAllele,
    		String strainCAlleleFixed         
        ) {
    
        SNPChromosome7 model = SNPChromosome7.getBuilder(
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
    		strainPAllele,
    		strainPAlleleFixed,
    		strainWAllele,
    		strainWAlleleFixed,
    		strainNAllele,
    		strainNAlleleFixed,
    		strain5IAllele,
    		strain5IAlleleFixed,
    		strainZeroAllele,
    		strainZeroAlleleFixed,
    		strain6Allele,
    		strain6AlleleFixed,
    		strainCAllele,
    		strainCAlleleFixed         
        ).build();

        model.setOid(oid);

        return model;
    }
    
    
    public static SNPChromosome8 createModelObject8(
            Long oid,
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
    		String strainPAllele,
    		String strainPAlleleFixed,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		String strain5IAllele,
    		String strain5IAlleleFixed,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		String strainCAllele,
    		String strainCAlleleFixed         
        ) {
    
        SNPChromosome8 model = SNPChromosome8.getBuilder(
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
    		strainPAllele,
    		strainPAlleleFixed,
    		strainWAllele,
    		strainWAlleleFixed,
    		strainNAllele,
    		strainNAlleleFixed,
    		strain5IAllele,
    		strain5IAlleleFixed,
    		strainZeroAllele,
    		strainZeroAlleleFixed,
    		strain6Allele,
    		strain6AlleleFixed,
    		strainCAllele,
    		strainCAlleleFixed         
        ).build();

        model.setOid(oid);

        return model;
    }
    
    
    public static SNPChromosome9 createModelObject9(
            Long oid,
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
    		String strainPAllele,
    		String strainPAlleleFixed,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		String strain5IAllele,
    		String strain5IAlleleFixed,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		String strainCAllele,
    		String strainCAlleleFixed         
        ) {
    
        SNPChromosome9 model = SNPChromosome9.getBuilder(
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
    		strainPAllele,
    		strainPAlleleFixed,
    		strainWAllele,
    		strainWAlleleFixed,
    		strainNAllele,
    		strainNAlleleFixed,
    		strain5IAllele,
    		strain5IAlleleFixed,
    		strainZeroAllele,
    		strainZeroAlleleFixed,
    		strain6Allele,
    		strain6AlleleFixed,
    		strainCAllele,
    		strainCAlleleFixed         
        ).build();

        model.setOid(oid);

        return model;
    }
    
    public static SNPChromosome10 createModelObject10(
            Long oid,
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
    		String strainPAllele,
    		String strainPAlleleFixed,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		String strain15IAllele,
    		String strain15IAlleleFixed,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		String strainCAllele,
    		String strainCAlleleFixed         
        ) {
    
        SNPChromosome10 model = SNPChromosome10.getBuilder(
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
    		strainPAllele,
    		strainPAlleleFixed,
    		strainWAllele,
    		strainWAlleleFixed,
    		strainNAllele,
    		strainNAlleleFixed,
    		strain15IAllele,
    		strain15IAlleleFixed,
    		strainZeroAllele,
    		strainZeroAlleleFixed,
    		strain6Allele,
    		strain6AlleleFixed,
    		strainCAllele,
    		strainCAlleleFixed         
        ).build();

        model.setOid(oid);

        return model;
    }
    
    
    public static SNPChromosome11 createModelObject11(
            Long oid,
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
    		String strainPAllele,
    		String strainPAlleleFixed,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		String strain15IAllele,
    		String strain15IAlleleFixed,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		String strainCAllele,
    		String strainCAlleleFixed         
        ) {
    
        SNPChromosome11 model = SNPChromosome11.getBuilder(
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
    		strainPAllele,
    		strainPAlleleFixed,
    		strainWAllele,
    		strainWAlleleFixed,
    		strainNAllele,
    		strainNAlleleFixed,
    		strain15IAllele,
    		strain15IAlleleFixed,
    		strainZeroAllele,
    		strainZeroAlleleFixed,
    		strain6Allele,
    		strain6AlleleFixed,
    		strainCAllele,
    		strainCAlleleFixed         
        ).build();

        model.setOid(oid);

        return model;
    }
    
    
    public static SNPChromosome12 createModelObject12(
            Long oid,
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
    		String strainPAllele,
    		String strainPAlleleFixed,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		String strain15IAllele,
    		String strain15IAlleleFixed,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		String strainCAllele,
    		String strainCAlleleFixed         
        ) {
    
        SNPChromosome12 model = SNPChromosome12.getBuilder(
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
    		strainPAllele,
    		strainPAlleleFixed,
    		strainWAllele,
    		strainWAlleleFixed,
    		strainNAllele,
    		strainNAlleleFixed,
    		strain15IAllele,
    		strain15IAlleleFixed,
    		strainZeroAllele,
    		strainZeroAlleleFixed,
    		strain6Allele,
    		strain6AlleleFixed,
    		strainCAllele,
    		strainCAlleleFixed         
        ).build();

        model.setOid(oid);

        return model;
    }
    
    
    public static SNPChromosome13 createModelObject13(
            Long oid,
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
    		String strainPAllele,
    		String strainPAlleleFixed,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		String strain15IAllele,
    		String strain15IAlleleFixed,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		String strainCAllele,
    		String strainCAlleleFixed         
        ) {
    
        SNPChromosome13 model = SNPChromosome13.getBuilder(
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
    		strainPAllele,
    		strainPAlleleFixed,
    		strainWAllele,
    		strainWAlleleFixed,
    		strainNAllele,
    		strainNAlleleFixed,
    		strain15IAllele,
    		strain15IAlleleFixed,
    		strainZeroAllele,
    		strainZeroAlleleFixed,
    		strain6Allele,
    		strain6AlleleFixed,
    		strainCAllele,
    		strainCAlleleFixed         
        ).build();

        model.setOid(oid);

        return model;
    }
    
    
    public static SNPChromosome14 createModelObject14(
            Long oid,
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
    		String strainPAllele,
    		String strainPAlleleFixed,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		String strain15IAllele,
    		String strain15IAlleleFixed,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		String strainCAllele,
    		String strainCAlleleFixed         
        ) {
    
        SNPChromosome14 model = SNPChromosome14.getBuilder(
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
    		strainPAllele,
    		strainPAlleleFixed,
    		strainWAllele,
    		strainWAlleleFixed,
    		strainNAllele,
    		strainNAlleleFixed,
    		strain15IAllele,
    		strain15IAlleleFixed,
    		strainZeroAllele,
    		strainZeroAlleleFixed,
    		strain6Allele,
    		strain6AlleleFixed,
    		strainCAllele,
    		strainCAlleleFixed         
        ).build();

        model.setOid(oid);

        return model;
    }
    
    
    public static SNPChromosome15 createModelObject15(
            Long oid,
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
    		String strainPAllele,
    		String strainPAlleleFixed,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		String strain15IAllele,
    		String strain15IAlleleFixed,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		String strainCAllele,
    		String strainCAlleleFixed         
        ) {
    
        SNPChromosome15 model = SNPChromosome15.getBuilder(
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
    		strainPAllele,
    		strainPAlleleFixed,
    		strainWAllele,
    		strainWAlleleFixed,
    		strainNAllele,
    		strainNAlleleFixed,
    		strain15IAllele,
    		strain15IAlleleFixed,
    		strainZeroAllele,
    		strainZeroAlleleFixed,
    		strain6Allele,
    		strain6AlleleFixed,
    		strainCAllele,
    		strainCAlleleFixed         
        ).build();

        model.setOid(oid);

        return model;
    }
    
    
    public static SNPChromosome16 createModelObject16(
            Long oid,
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
    		String strainPAllele,
    		String strainPAlleleFixed,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		String strain15IAllele,
    		String strain15IAlleleFixed,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		String strainCAllele,
    		String strainCAlleleFixed         
        ) {
    
        SNPChromosome16 model = SNPChromosome16.getBuilder(
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
    		strainPAllele,
    		strainPAlleleFixed,
    		strainWAllele,
    		strainWAlleleFixed,
    		strainNAllele,
    		strainNAlleleFixed,
    		strain15IAllele,
    		strain15IAlleleFixed,
    		strainZeroAllele,
    		strainZeroAlleleFixed,
    		strain6Allele,
    		strain6AlleleFixed,
    		strainCAllele,
    		strainCAlleleFixed         
        ).build();

        model.setOid(oid);

        return model;
    }
    
    
    public static SNPChromosome17 createModelObject17(
            Long oid,
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
    		String strainPAllele,
    		String strainPAlleleFixed,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		String strain15IAllele,
    		String strain15IAlleleFixed,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		String strainCAllele,
    		String strainCAlleleFixed         
        ) {
    
        SNPChromosome17 model = SNPChromosome17.getBuilder(
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
    		strainPAllele,
    		strainPAlleleFixed,
    		strainWAllele,
    		strainWAlleleFixed,
    		strainNAllele,
    		strainNAlleleFixed,
    		strain15IAllele,
    		strain15IAlleleFixed,
    		strainZeroAllele,
    		strainZeroAlleleFixed,
    		strain6Allele,
    		strain6AlleleFixed,
    		strainCAllele,
    		strainCAlleleFixed         
        ).build();

        model.setOid(oid);

        return model;
    }
    
    
    public static SNPChromosome18 createModelObject18(
            Long oid,
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
    		String strainPAllele,
    		String strainPAlleleFixed,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		String strain15IAllele,
    		String strain15IAlleleFixed,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		String strainCAllele,
    		String strainCAlleleFixed         
        ) {
    
        SNPChromosome18 model = SNPChromosome18.getBuilder(
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
    		strainPAllele,
    		strainPAlleleFixed,
    		strainWAllele,
    		strainWAlleleFixed,
    		strainNAllele,
    		strainNAlleleFixed,
    		strain15IAllele,
    		strain15IAlleleFixed,
    		strainZeroAllele,
    		strainZeroAlleleFixed,
    		strain6Allele,
    		strain6AlleleFixed,
    		strainCAllele,
    		strainCAlleleFixed         
        ).build();

        model.setOid(oid);

        return model;
    }
    
    
    public static SNPChromosome19 createModelObject19(
            Long oid,
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
    		String strainPAllele,
    		String strainPAlleleFixed,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		String strain15IAllele,
    		String strain15IAlleleFixed,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		String strainCAllele,
    		String strainCAlleleFixed         
        ) {
    
        SNPChromosome19 model = SNPChromosome19.getBuilder(
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
    		strainPAllele,
    		strainPAlleleFixed,
    		strainWAllele,
    		strainWAlleleFixed,
    		strainNAllele,
    		strainNAlleleFixed,
    		strain15IAllele,
    		strain15IAlleleFixed,
    		strainZeroAllele,
    		strainZeroAlleleFixed,
    		strain6Allele,
    		strain6AlleleFixed,
    		strainCAllele,
    		strainCAlleleFixed         
        ).build();

        model.setOid(oid);

        return model;
    }
    
    
    public static SNPChromosome20 createModelObject20(
            Long oid,
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
    		String strainPAllele,
    		String strainPAlleleFixed,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		String strain15IAllele,
    		String strain15IAlleleFixed,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		String strainCAllele,
    		String strainCAlleleFixed         
        ) {
    
        SNPChromosome20 model = SNPChromosome20.getBuilder(
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
    		strainPAllele,
    		strainPAlleleFixed,
    		strainWAllele,
    		strainWAlleleFixed,
    		strainNAllele,
    		strainNAlleleFixed,
    		strain15IAllele,
    		strain15IAlleleFixed,
    		strainZeroAllele,
    		strainZeroAlleleFixed,
    		strain6Allele,
    		strain6AlleleFixed,
    		strainCAllele,
    		strainCAlleleFixed         
        ).build();

        model.setOid(oid);

        return model;
    }
    
    
    public static SNPChromosome21 createModelObject21(
            Long oid,
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
    		String strainPAllele,
    		String strainPAlleleFixed,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		String strain15IAllele,
    		String strain15IAlleleFixed,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		String strainCAllele,
    		String strainCAlleleFixed         
        ) {
    
        SNPChromosome21 model = SNPChromosome21.getBuilder(
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
    		strainPAllele,
    		strainPAlleleFixed,
    		strainWAllele,
    		strainWAlleleFixed,
    		strainNAllele,
    		strainNAlleleFixed,
    		strain15IAllele,
    		strain15IAlleleFixed,
    		strainZeroAllele,
    		strainZeroAlleleFixed,
    		strain6Allele,
    		strain6AlleleFixed,
    		strainCAllele,
    		strainCAlleleFixed         
        ).build();

        model.setOid(oid);

        return model;
    }
    
    
    public static SNPChromosome22 createModelObject22(
            Long oid,
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
    		String strainPAllele,
    		String strainPAlleleFixed,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		String strain15IAllele,
    		String strain15IAlleleFixed,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		String strainCAllele,
    		String strainCAlleleFixed         
        ) {
    
        SNPChromosome22 model = SNPChromosome22.getBuilder(
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
    		strainPAllele,
    		strainPAlleleFixed,
    		strainWAllele,
    		strainWAlleleFixed,
    		strainNAllele,
    		strainNAlleleFixed,
    		strain15IAllele,
    		strain15IAlleleFixed,
    		strainZeroAllele,
    		strainZeroAlleleFixed,
    		strain6Allele,
    		strain6AlleleFixed,
    		strainCAllele,
    		strainCAlleleFixed         
        ).build();

        model.setOid(oid);

        return model;
    }
    
    
    public static SNPChromosome23 createModelObject23(
            Long oid,
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
    		String strainPAllele,
    		String strainPAlleleFixed,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		String strain15IAllele,
    		String strain15IAlleleFixed,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		String strainCAllele,
    		String strainCAlleleFixed         
        ) {
    
        SNPChromosome23 model = SNPChromosome23.getBuilder(
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
    		strainPAllele,
    		strainPAlleleFixed,
    		strainWAllele,
    		strainWAlleleFixed,
    		strainNAllele,
    		strainNAlleleFixed,
    		strain15IAllele,
    		strain15IAlleleFixed,
    		strainZeroAllele,
    		strainZeroAlleleFixed,
    		strain6Allele,
    		strain6AlleleFixed,
    		strainCAllele,
    		strainCAlleleFixed         
        ).build();

        model.setOid(oid);

        return model;
    }
    
    
    public static SNPChromosome24 createModelObject24(
            Long oid,
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
    		String strainPAllele,
    		String strainPAlleleFixed,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		String strain15IAllele,
    		String strain15IAlleleFixed,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		String strainCAllele,
    		String strainCAlleleFixed         
        ) {
    
        SNPChromosome24 model = SNPChromosome24.getBuilder(
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
    		strainPAllele,
    		strainPAlleleFixed,
    		strainWAllele,
    		strainWAlleleFixed,
    		strainNAllele,
    		strainNAlleleFixed,
    		strain15IAllele,
    		strain15IAlleleFixed,
    		strainZeroAllele,
    		strainZeroAlleleFixed,
    		strain6Allele,
    		strain6AlleleFixed,
    		strainCAllele,
    		strainCAlleleFixed         
        ).build();

        model.setOid(oid);

        return model;
    }
    
    
    public static SNPChromosome25 createModelObject25(
            Long oid,
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
    		String strainPAllele,
    		String strainPAlleleFixed,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		String strain15IAllele,
    		String strain15IAlleleFixed,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		String strainCAllele,
    		String strainCAlleleFixed         
        ) {
    
        SNPChromosome25 model = SNPChromosome25.getBuilder(
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
    		strainPAllele,
    		strainPAlleleFixed,
    		strainWAllele,
    		strainWAlleleFixed,
    		strainNAllele,
    		strainNAlleleFixed,
    		strain15IAllele,
    		strain15IAlleleFixed,
    		strainZeroAllele,
    		strainZeroAlleleFixed,
    		strain6Allele,
    		strain6AlleleFixed,
    		strainCAllele,
    		strainCAlleleFixed         
        ).build();

        model.setOid(oid);

        return model;
    }
    
    
    public static SNPChromosome26 createModelObject26(
            Long oid,
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
    		String strainPAllele,
    		String strainPAlleleFixed,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		String strain15IAllele,
    		String strain15IAlleleFixed,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		String strainCAllele,
    		String strainCAlleleFixed         
        ) {
    
        SNPChromosome26 model = SNPChromosome26.getBuilder(
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
    		strainPAllele,
    		strainPAlleleFixed,
    		strainWAllele,
    		strainWAlleleFixed,
    		strainNAllele,
    		strainNAlleleFixed,
    		strain15IAllele,
    		strain15IAlleleFixed,
    		strainZeroAllele,
    		strainZeroAlleleFixed,
    		strain6Allele,
    		strain6AlleleFixed,
    		strainCAllele,
    		strainCAlleleFixed         
        ).build();

        model.setOid(oid);

        return model;
    }
    
    
    public static SNPChromosome27 createModelObject27(
            Long oid,
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
    		String strainPAllele,
    		String strainPAlleleFixed,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		String strain15IAllele,
    		String strain15IAlleleFixed,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		String strainCAllele,
    		String strainCAlleleFixed         
        ) {
    
        SNPChromosome27 model = SNPChromosome27.getBuilder(
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
    		strainPAllele,
    		strainPAlleleFixed,
    		strainWAllele,
    		strainWAlleleFixed,
    		strainNAllele,
    		strainNAlleleFixed,
    		strain15IAllele,
    		strain15IAlleleFixed,
    		strainZeroAllele,
    		strainZeroAlleleFixed,
    		strain6Allele,
    		strain6AlleleFixed,
    		strainCAllele,
    		strainCAlleleFixed         
        ).build();

        model.setOid(oid);

        return model;
    }
    
    
    public static SNPChromosome28 createModelObject28(
            Long oid,
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
    		String strainPAllele,
    		String strainPAlleleFixed,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		String strain15IAllele,
    		String strain15IAlleleFixed,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		String strainCAllele,
    		String strainCAlleleFixed         
        ) {
    
        SNPChromosome28 model = SNPChromosome28.getBuilder(
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
    		strainPAllele,
    		strainPAlleleFixed,
    		strainWAllele,
    		strainWAlleleFixed,
    		strainNAllele,
    		strainNAlleleFixed,
    		strain15IAllele,
    		strain15IAlleleFixed,
    		strainZeroAllele,
    		strainZeroAlleleFixed,
    		strain6Allele,
    		strain6AlleleFixed,
    		strainCAllele,
    		strainCAlleleFixed         
        ).build();

        model.setOid(oid);

        return model;
    }
    
    
    public static SNPChromosome32 createModelObject32(
            Long oid,
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
    		String strainPAllele,
    		String strainPAlleleFixed,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		String strain15IAllele,
    		String strain15IAlleleFixed,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		String strainCAllele,
    		String strainCAlleleFixed         
        ) {
    
        SNPChromosome32 model = SNPChromosome32.getBuilder(
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
    		strainPAllele,
    		strainPAlleleFixed,
    		strainWAllele,
    		strainWAlleleFixed,
    		strainNAllele,
    		strainNAlleleFixed,
    		strain15IAllele,
    		strain15IAlleleFixed,
    		strainZeroAllele,
    		strainZeroAlleleFixed,
    		strain6Allele,
    		strain6AlleleFixed,
    		strainCAllele,
    		strainCAlleleFixed         
        ).build();

        model.setOid(oid);

        return model;
    }
    
    
    public static SNPChromosomeW createModelObjectW(
            Long oid,
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
    		String strainPAllele,
    		String strainPAlleleFixed,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		String strain15IAllele,
    		String strain15IAlleleFixed,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		String strainCAllele,
    		String strainCAlleleFixed         
        ) {
    
        SNPChromosomeW model = SNPChromosomeW.getBuilder(
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
    		strainPAllele,
    		strainPAlleleFixed,
    		strainWAllele,
    		strainWAlleleFixed,
    		strainNAllele,
    		strainNAlleleFixed,
    		strain15IAllele,
    		strain15IAlleleFixed,
    		strainZeroAllele,
    		strainZeroAlleleFixed,
    		strain6Allele,
    		strain6AlleleFixed,
    		strainCAllele,
    		strainCAlleleFixed         
        ).build();

        model.setOid(oid);

        return model;
    }
    
    
    public static SNPChromosomeZ createModelObjectZ(
            Long oid,
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
    		String strainPAllele,
    		String strainPAlleleFixed,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		String strain15IAllele,
    		String strain15IAlleleFixed,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		String strainCAllele,
    		String strainCAlleleFixed         
        ) {
    
        SNPChromosomeZ model = SNPChromosomeZ.getBuilder(
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
    		strainPAllele,
    		strainPAlleleFixed,
    		strainWAllele,
    		strainWAlleleFixed,
    		strainNAllele,
    		strainNAlleleFixed,
    		strain15IAllele,
    		strain15IAlleleFixed,
    		strainZeroAllele,
    		strainZeroAlleleFixed,
    		strain6Allele,
    		strain6AlleleFixed,
    		strainCAllele,
    		strainCAlleleFixed         
        ).build();

        model.setOid(oid);

        return model;
    }
    
    
    public static SNPChromosomeLGE22C19W28_E50C23 createModelObjectLGE22C19W28_E50C23(
            Long oid,
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
    		String strainPAllele,
    		String strainPAlleleFixed,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		String strain15IAllele,
    		String strain15IAlleleFixed,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		String strainCAllele,
    		String strainCAlleleFixed         
        ) {
    
        SNPChromosomeLGE22C19W28_E50C23 model = SNPChromosomeLGE22C19W28_E50C23.getBuilder(
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
    		strainPAllele,
    		strainPAlleleFixed,
    		strainWAllele,
    		strainWAlleleFixed,
    		strainNAllele,
    		strainNAlleleFixed,
    		strain15IAllele,
    		strain15IAlleleFixed,
    		strainZeroAllele,
    		strainZeroAlleleFixed,
    		strain6Allele,
    		strain6AlleleFixed,
    		strainCAllele,
    		strainCAlleleFixed         
        ).build();

        model.setOid(oid);

        return model;
    }
    
    
    public static SNPChromosomeLGE64 createModelObjectLGE64(
            Long oid,
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
    		String strainPAllele,
    		String strainPAlleleFixed,
    		String strainWAllele,
    		String strainWAlleleFixed,
    		String strainNAllele,
    		String strainNAlleleFixed,
    		String strain15IAllele,
    		String strain15IAlleleFixed,
    		String strainZeroAllele,
    		String strainZeroAlleleFixed,
    		String strain6Allele,
    		String strain6AlleleFixed,
    		String strainCAllele,
    		String strainCAlleleFixed         
        ) {
    
        SNPChromosomeLGE64 model = SNPChromosomeLGE64.getBuilder(
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
    		strainPAllele,
    		strainPAlleleFixed,
    		strainWAllele,
    		strainWAlleleFixed,
    		strainNAllele,
    		strainNAlleleFixed,
    		strain15IAllele,
    		strain15IAlleleFixed,
    		strainZeroAllele,
    		strainZeroAlleleFixed,
    		strain6Allele,
    		strain6AlleleFixed,
    		strainCAllele,
    		strainCAlleleFixed         
        ).build();

        model.setOid(oid);

        return model;
    }
    
    
}
