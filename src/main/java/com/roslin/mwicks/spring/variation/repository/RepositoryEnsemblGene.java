package com.roslin.mwicks.spring.variation.repository;

import com.roslin.mwicks.spring.variation.model.EnsemblGene;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Specifies methods used to obtain and modify SNPChromosome related information
 * which is stored in the database.
 * @author Mike Wicks
 */
public interface RepositoryEnsemblGene extends JpaRepository<EnsemblGene, Long> {

    /**
     * Finds EnsemblGene by using the strGeneName for search criteria.
     * @param strLowRange - Low SNP Coordinate
     * @return  A list of SNPChromosomes between a supplied coordinate range
     *          If no SNPChromosomes is found, this method returns an empty list.
     */
	@Query("Select p from EnsemblGene p where p.ensemblId LIKE :strGeneName" )
	public List<EnsemblGene> findByGeneName(@Param("strGeneName") String strGeneName);

}
