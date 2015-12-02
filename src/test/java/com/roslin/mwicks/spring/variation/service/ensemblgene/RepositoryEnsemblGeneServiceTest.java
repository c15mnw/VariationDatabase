package  com.roslin.mwicks.spring.variation.service.ensemblgene;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.roslin.mwicks.spring.variation.dto.DTOEnsemblGene;

import com.roslin.mwicks.spring.variation.model.ensemblgene.EnsemblGene;
import com.roslin.mwicks.spring.variation.model.ensemblgene.EnsemblGeneTestUtil;

import com.roslin.mwicks.spring.variation.repository.ensemblgene.RepositoryEnsemblGene;

import com.roslin.mwicks.spring.variation.exception.ExceptionEnsemblGeneNotFound;

import org.junit.Before;
import org.junit.Test;

import org.mockito.ArgumentCaptor;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;

import static org.mockito.Mockito.*;

/**
 * @author Petri Kainulainen
 */
public class RepositoryEnsemblGeneServiceTest {

    private static final int NUMBER_OF_ENSEMBL_GENES_PER_PAGE = 30;

    private static final Long ENSEMBL_GENE_OID = Long.valueOf(5);
    
    private static final String ENSEMBL_ID = "ENSGALT00000012809";
    private static final String REGION = "transcript";
    private static final String CHROMOSOME_ID = "3";
    private static final String START = "855515";
    private static final String END = "901472";    
    private static final long START_LONG = 855515;
    private static final long END_LONG = 901472;    
    private static final String STRAND = "+";

    private static final String ENSEMBL_ID_UPDATED = "ENSGALG00000007879";
    private static final String REGION_UPDATED = "gene";
    private static final String CHROMOSOME_ID_UPDATED = "3";
    private static final String START_UPDATED = "900795";
    private static final String END_UPDATED = "929281";    
    private static final String STRAND_UPDATED = "-";
    
    private ServiceRepositoryEnsemblGene serviceEnsemblGene;

    private RepositoryEnsemblGene repositoryEnsemblGeneMock;

    @Before
    public void setUp() {

    	serviceEnsemblGene = new ServiceRepositoryEnsemblGene();

    	repositoryEnsemblGeneMock = mock(RepositoryEnsemblGene.class);

        serviceEnsemblGene.setRepositoryEnsemblGene(repositoryEnsemblGeneMock);
    }
    
    @Test
    public void create() {
        
    	DTOEnsemblGene created = EnsemblGeneTestUtil.createDTO(null, 
    			ENSEMBL_ID,
                REGION,
                CHROMOSOME_ID,
                START,
                END,
                STRAND
                );
        
        EnsemblGene persisted = EnsemblGeneTestUtil.createModelObject(
        		ENSEMBL_GENE_OID,
    			ENSEMBL_ID,
                REGION,
                CHROMOSOME_ID,
                START_LONG,
                END_LONG,
                STRAND
                );
        
        when(repositoryEnsemblGeneMock.save(any(EnsemblGene.class))).thenReturn(persisted);
        
        EnsemblGene returned = serviceEnsemblGene.create(created);

        ArgumentCaptor<EnsemblGene> ensemblgeneArgument = ArgumentCaptor.forClass(EnsemblGene.class);
        
        verify(repositoryEnsemblGeneMock, times(1)).save(ensemblgeneArgument.capture());
        verifyNoMoreInteractions(repositoryEnsemblGeneMock);

        assertEnsemblGene(created, ensemblgeneArgument.getValue());
        assertEquals(persisted, returned);
    }
    
    
    @Test
    public void delete() throws ExceptionEnsemblGeneNotFound {
    	
        EnsemblGene deleted = EnsemblGeneTestUtil.createModelObject(
        		ENSEMBL_GENE_OID,
    			ENSEMBL_ID,
                REGION,
                CHROMOSOME_ID,
                START_LONG,
                END_LONG,
                STRAND
        		);
        
        when(repositoryEnsemblGeneMock.findOne(ENSEMBL_GENE_OID)).thenReturn(deleted);
        
        EnsemblGene returned = serviceEnsemblGene.delete(ENSEMBL_GENE_OID);
        
        verify(repositoryEnsemblGeneMock, times(1)).findOne(ENSEMBL_GENE_OID);
        verify(repositoryEnsemblGeneMock, times(1)).delete(deleted);
        verifyNoMoreInteractions(repositoryEnsemblGeneMock);
        
        assertEquals(deleted, returned);
    }
    
    
    @Test(expected = ExceptionEnsemblGeneNotFound.class)
    public void deleteWhenEnsemblGeneIsNotFound() throws ExceptionEnsemblGeneNotFound {
    	
        when(repositoryEnsemblGeneMock.findOne(ENSEMBL_GENE_OID)).thenReturn(null);
        
        serviceEnsemblGene.delete(ENSEMBL_GENE_OID);
        
        verify(repositoryEnsemblGeneMock, times(1)).findOne(ENSEMBL_GENE_OID);
        verifyNoMoreInteractions(repositoryEnsemblGeneMock);
    }
    
    
    @Test
    public void findAll() {
    	
        List<EnsemblGene> ensemblgenes = new ArrayList<EnsemblGene>();
        
        when(repositoryEnsemblGeneMock.findAll()).thenReturn(ensemblgenes);
        
        List<EnsemblGene> returned = serviceEnsemblGene.findAll();
        
        verify(repositoryEnsemblGeneMock, times(1)).findAll();
        verifyNoMoreInteractions(repositoryEnsemblGeneMock);
        
        assertEquals(ensemblgenes, returned);
    }
    
    
    @Test
    public void findByOid() {
    	
        EnsemblGene ensemblgene = EnsemblGeneTestUtil.createModelObject(
        		ENSEMBL_GENE_OID,
    			ENSEMBL_ID,
                REGION,
                CHROMOSOME_ID,
                START_LONG,
                END_LONG,
                STRAND
        		);
        
        when(repositoryEnsemblGeneMock.findOne(ENSEMBL_GENE_OID)).thenReturn(ensemblgene);
        
        EnsemblGene returned = serviceEnsemblGene.findByOid(ENSEMBL_GENE_OID);
        
        verify(repositoryEnsemblGeneMock, times(1)).findOne(ENSEMBL_GENE_OID);
        verifyNoMoreInteractions(repositoryEnsemblGeneMock);
        
        assertEquals(ensemblgene, returned);
    }
    
    
    @Test
    public void findByGeneName() {
    	
        List<EnsemblGene> expected = new ArrayList<EnsemblGene>();
        
        when(repositoryEnsemblGeneMock.findByGeneName(ENSEMBL_ID)).thenReturn(expected);
        
        List<EnsemblGene> actual = serviceEnsemblGene.findByGeneName(ENSEMBL_ID);
        
        verify(repositoryEnsemblGeneMock, times(1)).findByGeneName(ENSEMBL_ID);
        verifyNoMoreInteractions(repositoryEnsemblGeneMock);
        
        assertEquals(expected, actual);
    }
    
    
    @Test
    public void findByEnsemblIdLike() {
    	
    	Page<EnsemblGene> expected = null;
    	
    	Integer pageNumber = 1;
    	
    	PageRequest pageRequest = new PageRequest(pageNumber - 1, NUMBER_OF_ENSEMBL_GENES_PER_PAGE, Sort.Direction.ASC, "ensemblId");
        
        when(repositoryEnsemblGeneMock.findByEnsemblIdLike(ENSEMBL_ID, pageRequest)).thenReturn(expected);
        
        Page<EnsemblGene> actual = serviceEnsemblGene.findByEnsemblIdLike(ENSEMBL_ID, pageRequest);
        
        verify(repositoryEnsemblGeneMock, times(1)).findByEnsemblIdLike(ENSEMBL_ID, pageRequest);
        verifyNoMoreInteractions(repositoryEnsemblGeneMock);
        
        assertEquals(expected, actual);
    }
    
    
    
    @Test
    public void update() throws ExceptionEnsemblGeneNotFound {
    	
        DTOEnsemblGene updated = EnsemblGeneTestUtil.createDTO(
        		ENSEMBL_GENE_OID,
    			ENSEMBL_ID_UPDATED,
                REGION_UPDATED,
                CHROMOSOME_ID_UPDATED,
                START_UPDATED,
                END_UPDATED,
                STRAND_UPDATED
        		);
        
        EnsemblGene ensemblgene = EnsemblGeneTestUtil.createModelObject(
        		ENSEMBL_GENE_OID,
    			ENSEMBL_ID,
                REGION,
                CHROMOSOME_ID,
                START_LONG,
                END_LONG,
                STRAND
        		);
        
        when(repositoryEnsemblGeneMock.findOne(updated.getOid())).thenReturn(ensemblgene);
        
        EnsemblGene returned = serviceEnsemblGene.update(updated);
        
        verify(repositoryEnsemblGeneMock, times(1)).findOne(updated.getOid());
        verifyNoMoreInteractions(repositoryEnsemblGeneMock);
        
        assertEnsemblGene(updated, returned);
    }
    
    
    @Test(expected = ExceptionEnsemblGeneNotFound.class)
    public void updateWhenEnsemblGeneIsNotFound() throws ExceptionEnsemblGeneNotFound {
    	
        DTOEnsemblGene updated = EnsemblGeneTestUtil.createDTO(
        		ENSEMBL_GENE_OID,
    			ENSEMBL_ID_UPDATED,
                REGION_UPDATED,
                CHROMOSOME_ID_UPDATED,
                START_UPDATED,
                END_UPDATED,
                STRAND_UPDATED
        		);
        
        when(repositoryEnsemblGeneMock.findOne(updated.getOid())).thenReturn(null);

        serviceEnsemblGene.update(updated);

        verify(repositoryEnsemblGeneMock, times(1)).findOne(updated.getOid());
        verifyNoMoreInteractions(repositoryEnsemblGeneMock);
    }

    
    private void assertEnsemblGene(DTOEnsemblGene expected, EnsemblGene actual) {
    	
        assertEquals(expected.getOid(), actual.getOid());
        
        assertEquals(expected.getEnsemblId(), actual.getEnsemblId());
        assertEquals(expected.getRegion(), actual.getRegion());
        assertEquals(expected.getChromosomeId(), actual.getChromosomeId());
        assertEquals(expected.getStart(), actual.getStart());
        assertEquals(expected.getEnd(), actual.getEnd());
        assertEquals(expected.getStrand(), actual.getStrand());
    }

}
