package com.roslin.mwicks.spring.variation.repository;

import com.roslin.mwicks.spring.variation.model.SNPChromosomeLGE64;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Specifies methods used to obtain and modify SNPChromosomeLGE64 related information
 * which is stored in the database.
 * @author Mike Wicks
 */
public interface RepositorySNPChromosomeLGE64 extends JpaRepository<SNPChromosomeLGE64, Long> {

    /**
     * Finds SNPChromosomeLGE64s by using the strLowRange and strHighRange as a coordinate range for search criteria.
     * @param strLowRange - Low SNP Coordinate
     * @param strHighRange - High SNP Coordinate
     * @return  A list of SNPChromosomeLGE64s between a supplied coordinate range
     *          If no SNPChromosomeLGE64s is found, this method returns an empty list.
     */
	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainPAllele )" )
	public Page<SNPChromosomeLGE64> findByRangeANDStrain7NEStrainP(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainWAllele )" )
    public Page<SNPChromosomeLGE64> findByRangeANDStrain7NEStrainW(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainNAllele )" )
    public Page<SNPChromosomeLGE64> findByRangeANDStrain7NEStrainN(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strain15IAllele )" )
    public Page<SNPChromosomeLGE64> findByRangeANDStrain7NEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainZEROAllele )" )
    public Page<SNPChromosomeLGE64> findByRangeANDStrain7NEStrainZERO(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strain6Allele )" )
    public Page<SNPChromosomeLGE64> findByRangeANDStrain7NEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainCAllele )" )
    public Page<SNPChromosomeLGE64> findByRangeANDStrain7NEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainWAllele )" )
    public Page<SNPChromosomeLGE64> findByRangeANDStrainPNEStrainW(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainNAllele )" )
    public Page<SNPChromosomeLGE64> findByRangeANDStrainPNEStrainN(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strain15IAllele )" )
    public Page<SNPChromosomeLGE64> findByRangeANDStrainPNEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainZEROAllele )" )
    public Page<SNPChromosomeLGE64> findByRangeANDStrainPNEStrainZERO(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strain6Allele )" )
    public Page<SNPChromosomeLGE64> findByRangeANDStrainPNEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainCAllele )" )
    public Page<SNPChromosomeLGE64> findByRangeANDStrainPNEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strainNAllele )" )
    public Page<SNPChromosomeLGE64> findByRangeANDStrainWNEStrainN(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strain15IAllele )" )
    public Page<SNPChromosomeLGE64> findByRangeANDStrainWNEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strainZEROAllele )" )
    public Page<SNPChromosomeLGE64> findByRangeANDStrainWNEStrainZERO(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strain6Allele )" )
    public Page<SNPChromosomeLGE64> findByRangeANDStrainWNEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strainCAllele )" )
    public Page<SNPChromosomeLGE64> findByRangeANDStrainWNEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strain15IAllele )" )
    public Page<SNPChromosomeLGE64> findByRangeANDStrainNNEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strainZEROAllele )" )
    public Page<SNPChromosomeLGE64> findByRangeANDStrainNNEStrainZERO(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strain6Allele )" )
    public Page<SNPChromosomeLGE64> findByRangeANDStrainNNEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strainCAllele )" )
    public Page<SNPChromosomeLGE64> findByRangeANDStrainNNEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain15IAllele = p.strainZEROAllele )" )
    public Page<SNPChromosomeLGE64> findByRangeANDStrain15INEStrainZERO(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain15IAllele = p.strain6Allele )" )
    public Page<SNPChromosomeLGE64> findByRangeANDStrain15INEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain15IAllele = p.strainCAllele )" )
    public Page<SNPChromosomeLGE64> findByRangeANDStrain15INEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainZEROAllele = p.strain6Allele )" )
    public Page<SNPChromosomeLGE64> findByRangeANDStrainZERONEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainZEROAllele = p.strainCAllele )" )
    public Page<SNPChromosomeLGE64> findByRangeANDStrainZERONEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);
	
	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain6Allele = p.strainCAllele )" )
    public Page<SNPChromosomeLGE64> findByRangeANDStrain6NEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange, Pageable pageable);

	
    /**
     * Lists SNPChromosomeLGE64s by using the strLowRange and strHighRange as a coordinate range for search criteria.
     * @param strLowRange - Low SNP Coordinate
     * @param strHighRange - High SNP Coordinate
     * @return  A list of SNPChromosomeLGE64s between a supplied coordinate range
     *          If no SNPChromosomeLGE64s is found, this method returns an empty list.
     */
	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainPAllele )" )
	public List<SNPChromosomeLGE64> listByRangeANDStrain7NEStrainP(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainWAllele )" )
    public List<SNPChromosomeLGE64> listByRangeANDStrain7NEStrainW(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainNAllele )" )
    public List<SNPChromosomeLGE64> listByRangeANDStrain7NEStrainN(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strain15IAllele )" )
    public List<SNPChromosomeLGE64> listByRangeANDStrain7NEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainZEROAllele )" )
    public List<SNPChromosomeLGE64> listByRangeANDStrain7NEStrainZERO(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strain6Allele )" )
    public List<SNPChromosomeLGE64> listByRangeANDStrain7NEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain7Allele = p.strainCAllele )" )
    public List<SNPChromosomeLGE64> listByRangeANDStrain7NEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainWAllele )" )
    public List<SNPChromosomeLGE64> listByRangeANDStrainPNEStrainW(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainNAllele )" )
    public List<SNPChromosomeLGE64> listByRangeANDStrainPNEStrainN(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strain15IAllele )" )
    public List<SNPChromosomeLGE64> listByRangeANDStrainPNEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainZEROAllele )" )
    public List<SNPChromosomeLGE64> listByRangeANDStrainPNEStrainZERO(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strain6Allele )" )
    public List<SNPChromosomeLGE64> listByRangeANDStrainPNEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainPAllele = p.strainCAllele )" )
    public List<SNPChromosomeLGE64> listByRangeANDStrainPNEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strainNAllele )" )
    public List<SNPChromosomeLGE64> listByRangeANDStrainWNEStrainN(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strain15IAllele )" )
    public List<SNPChromosomeLGE64> listByRangeANDStrainWNEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strainZEROAllele )" )
    public List<SNPChromosomeLGE64> listByRangeANDStrainWNEStrainZERO(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strain6Allele )" )
    public List<SNPChromosomeLGE64> listByRangeANDStrainWNEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainWAllele = p.strainCAllele )" )
    public List<SNPChromosomeLGE64> listByRangeANDStrainWNEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strain15IAllele )" )
    public List<SNPChromosomeLGE64> listByRangeANDStrainNNEStrain15I(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strainZEROAllele )" )
    public List<SNPChromosomeLGE64> listByRangeANDStrainNNEStrainZERO(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strain6Allele )" )
    public List<SNPChromosomeLGE64> listByRangeANDStrainNNEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainNAllele = p.strainCAllele )" )
    public List<SNPChromosomeLGE64> listByRangeANDStrainNNEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain15IAllele = p.strainZEROAllele )" )
    public List<SNPChromosomeLGE64> listByRangeANDStrain15INEStrainZERO(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain15IAllele = p.strain6Allele )" )
    public List<SNPChromosomeLGE64> listByRangeANDStrain15INEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain15IAllele = p.strainCAllele )" )
    public List<SNPChromosomeLGE64> listByRangeANDStrain15INEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainZEROAllele = p.strain6Allele )" )
    public List<SNPChromosomeLGE64> listByRangeANDStrainZERONEStrain6(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strainZEROAllele = p.strainCAllele )" )
    public List<SNPChromosomeLGE64> listByRangeANDStrainZERONEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);
	
	@Query("Select p from SNPChromosomeLGE64 p where p.position > :intLowRange and p.position < :intHighRange and not ( p.strain6Allele = p.strainCAllele )" )
    public List<SNPChromosomeLGE64> listByRangeANDStrain6NEStrainC(@Param("intLowRange") int intLowRange, @Param("intHighRange") int intHighRange);

}
