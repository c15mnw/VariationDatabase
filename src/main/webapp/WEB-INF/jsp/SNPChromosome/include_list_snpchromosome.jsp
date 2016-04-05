<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<c:if test="${SNPChromosome != null && totalPages != 0}">

<div class="row spacer">
  <div class="span12">

    <table class="table table-bordered table-condensed">
      <thead>

      <c:if test="${dtoDownload.isDownloadSortFieldPosition() || dtoDownload.isDownloadSortFieldNone()}">
      <tr>
        <td>
          <spring:message code="snpchromosome.list.label.chromosomeId"/>
        </td>
        <td>
          <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=desc" >
              <spring:message code="snpchromosome.list.label.position"/><span class="sortarrow">&#9662;</span>
            </a>
          </c:if>
          <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.position"/><span class="sortarrow">&#9650;</span>
            </a>
          </c:if>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.reference"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.alternative"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.region"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblGene"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblTranscript"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblAnnotation"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
          <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain7Allele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainPAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainWAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainNAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain6Allele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainCAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/>
            </td>
          </c:if>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.aminoAcidSubs"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.predictionCategory"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreProvean"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreSift"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreConservation"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.proteinAlignNumber"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
        </tr>
      </c:if>
      
      <c:if test="${dtoDownload.isDownloadSortFieldReference()}">
      <tr>
        <td>
          <spring:message code="snpchromosome.list.label.chromosomeId"/>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.position"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
          <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=desc" >
              <spring:message code="snpchromosome.list.label.reference"/><span class="sortarrow">&#9662;</span>
            </a>
          </c:if>
          <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.reference"/><span class="sortarrow">&#9650;</span>
            </a>
          </c:if>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.alternative"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.region"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblGene"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblTranscript"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblAnnotation"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
          <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain7Allele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainPAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainWAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainNAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain6Allele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainCAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/>
            </td>
          </c:if>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.aminoAcidSubs"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.predictionCategory"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreProvean"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreSift"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreConservation"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.proteinAlignNumber"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
        </tr>
      </c:if>

      <c:if test="${dtoDownload.isDownloadSortFieldAlternative()}">
      <tr>
        <td>
          <spring:message code="snpchromosome.list.label.chromosomeId"/>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.position"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.reference"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
          <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=desc" >
              <spring:message code="snpchromosome.list.label.alternative"/><span class="sortarrow">&#9662;</span>
            </a>
          </c:if>
          <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.alternative"/><span class="sortarrow">&#9650;</span>
            </a>
          </c:if>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.region"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblGene"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblTranscript"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblAnnotation"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
          <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain7Allele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainPAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainWAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainNAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain6Allele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainCAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/>
            </td>
          </c:if>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.aminoAcidSubs"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.predictionCategory"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreProvean"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreSift"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreConservation"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.proteinAlignNumber"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
        </tr>
      </c:if>

      <c:if test="${dtoDownload.isDownloadSortFieldRegion()}">
      <tr>
        <td>
          <spring:message code="snpchromosome.list.label.chromosomeId"/>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.position"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.reference"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.alternative"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
          <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=desc" >
              <spring:message code="snpchromosome.list.label.region"/><span class="sortarrow">&#9662;</span>
            </a>
          </c:if>
          <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.region"/><span class="sortarrow">&#9650;</span>
            </a>
          </c:if>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblGene"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblTranscript"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblAnnotation"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
          <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain7Allele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainPAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainWAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainNAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain6Allele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainCAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/>
            </td>
          </c:if>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.aminoAcidSubs"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.predictionCategory"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreProvean"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreSift"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreConservation"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.proteinAlignNumber"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
        </tr>
      </c:if>

      <c:if test="${dtoDownload.isDownloadSortFieldEnsemblGene()}">
      <tr>
        <td>
          <spring:message code="snpchromosome.list.label.chromosomeId"/>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.position"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.reference"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.alternative"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.region"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
          <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=desc" >
              <spring:message code="snpchromosome.list.label.ensemblGene"/><span class="sortarrow">&#9662;</span>
            </a>
          </c:if>
          <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblGene"/><span class="sortarrow">&#9650;</span>
            </a>
          </c:if>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblTranscript"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblAnnotation"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
          <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain7Allele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainPAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainWAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainNAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain6Allele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainCAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/>
            </td>
          </c:if>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.aminoAcidSubs"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.predictionCategory"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreProvean"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreSift"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreConservation"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.proteinAlignNumber"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
        </tr>
      </c:if>

      <c:if test="${dtoDownload.isDownloadSortFieldEnsemblTranscript()}">
      <tr>
        <td>
          <spring:message code="snpchromosome.list.label.chromosomeId"/>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.position"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.reference"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.alternative"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.region"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblGene"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
          <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=desc" >
              <spring:message code="snpchromosome.list.label.ensemblTranscript"/><span class="sortarrow">&#9662;</span>
            </a>
          </c:if>
          <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblTranscript"/><span class="sortarrow">&#9650;</span>
            </a>
          </c:if>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblAnnotation"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
          <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain7Allele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainPAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainWAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainNAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain6Allele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainCAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/>
            </td>
          </c:if>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.aminoAcidSubs"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.predictionCategory"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreProvean"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreSift"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreConservation"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.proteinAlignNumber"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
        </tr>
      </c:if>

      <c:if test="${dtoDownload.isDownloadSortFieldEnsemblAnnotation()}">
      <tr>
        <td>
          <spring:message code="snpchromosome.list.label.chromosomeId"/>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.position"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.reference"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.alternative"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.region"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblGene"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblTranscript"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
          <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=desc" >
              <spring:message code="snpchromosome.list.label.ensemblAnnotation"/><span class="sortarrow">&#9662;</span>
            </a>
          </c:if>
          <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblAnnotation"/><span class="sortarrow">&#9650;</span>
            </a>
          </c:if>
        </td>
          <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain7Allele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainPAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainWAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainNAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain6Allele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainCAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/>
            </td>
          </c:if>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.aminoAcidSubs"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.predictionCategory"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreProvean"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreSift"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreConservation"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.proteinAlignNumber"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
        </tr>
      </c:if>

      <c:if test="${dtoDownload.isDownloadSortFieldAminoAcidSubs()}">
      <tr>
        <td>
          <spring:message code="snpchromosome.list.label.chromosomeId"/>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.position"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.reference"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.alternative"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.region"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblGene"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblTranscript"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblAnnotation"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
          <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain7Allele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainPAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainWAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainNAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain6Allele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainCAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/>
            </td>
          </c:if>
          <td>
          <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=desc" >
              <spring:message code="snpchromosome.list.label.aminoAcidSubs"/><span class="sortarrow">&#9662;</span>
            </a>
          </c:if>
          <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.aminoAcidSubs"/><span class="sortarrow">&#9650;</span>
            </a>
          </c:if>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.predictionCategory"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreProvean"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreSift"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreConservation"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.proteinAlignNumber"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
        </tr>
      </c:if>

      <c:if test="${dtoDownload.isDownloadSortFieldPredictionCategory()}">
      <tr>
        <td>
          <spring:message code="snpchromosome.list.label.chromosomeId"/>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.position"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.reference"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.alternative"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.region"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblGene"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblTranscript"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblAnnotation"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
          <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain7Allele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainPAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainWAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainNAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain6Allele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainCAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/>
            </td>
          </c:if>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.aminoAcidSubs"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
          <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=desc" >
              <spring:message code="snpchromosome.list.label.predictionCategory"/><span class="sortarrow">&#9662;</span>
            </a>
          </c:if>
          <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.predictionCategory"/><span class="sortarrow">&#9650;</span>
            </a>
          </c:if>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreProvean"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreSift"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreConservation"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.proteinAlignNumber"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
        </tr>
      </c:if>

      <c:if test="${dtoDownload.isDownloadSortFieldScoreSift()}">
      <tr>
        <td>
          <spring:message code="snpchromosome.list.label.chromosomeId"/>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.position"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.reference"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.alternative"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.region"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblGene"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblTranscript"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblAnnotation"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
          <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain7Allele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainPAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainWAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainNAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain6Allele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainCAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/>
            </td>
          </c:if>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.aminoAcidSubs"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.predictionCategory"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreProvean"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
          <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=desc" >
              <spring:message code="snpchromosome.list.label.scoreSift"/><span class="sortarrow">&#9662;</span>
            </a>
          </c:if>
          <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreSift"/><span class="sortarrow">&#9650;</span>
            </a>
          </c:if>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreConservation"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.proteinAlignNumber"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
        </tr>
      </c:if>

      <c:if test="${dtoDownload.isDownloadSortFieldScoreConservation()}">
      <tr>
        <td>
          <spring:message code="snpchromosome.list.label.chromosomeId"/>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.position"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.reference"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.alternative"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.region"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblGene"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblTranscript"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblAnnotation"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
          <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain7Allele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainPAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainWAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainNAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain6Allele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainCAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/>
            </td>
          </c:if>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.aminoAcidSubs"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.predictionCategory"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreProvean"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreSift"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
          <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=desc" >
              <spring:message code="snpchromosome.list.label.scoreConservation"/><span class="sortarrow">&#9662;</span>
            </a>
          </c:if>
          <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreConservation"/><span class="sortarrow">&#9650;</span>
            </a>
          </c:if>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.proteinAlignNumber"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
        </tr>
      </c:if>

      <c:if test="${dtoDownload.isDownloadSortFieldProteinAlignNumber()}">
      <tr>
        <td>
          <spring:message code="snpchromosome.list.label.chromosomeId"/>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.position"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
          <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=desc" >
              <spring:message code="snpchromosome.list.label.reference"/><span class="sortarrow">&#9650;</span>
            </a>
          </c:if>
          <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.reference"/><span class="sortarrow">&#9650;</span>
            </a>
          </c:if>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.alternative"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.region"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblGene"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblTranscript"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblAnnotation"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
          <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain7Allele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainPAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainWAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainNAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain6Allele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainCAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/>
            </td>
          </c:if>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.aminoAcidSubs"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.predictionCategory"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreProvean"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreSift"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreConservation"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
          <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=desc" >
              <spring:message code="snpchromosome.list.label.proteinAlignNumber"/><span class="sortarrow">&#9662;</span>
            </a>
          </c:if>
          <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.proteinAlignNumber"/><span class="sortarrow">&#9650;</span>
            </a>
          </c:if>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
        </tr>
      </c:if>

      <c:if test="${dtoDownload.isDownloadSortFieldTotalAlignSequenceNumber()}">
      <tr>
        <td>
          <spring:message code="snpchromosome.list.label.chromosomeId"/>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.position"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.reference"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.alternative"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.region"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblGene"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblTranscript"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblAnnotation"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
          <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain7Allele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainPAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainWAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainNAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain6Allele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainCAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/>
            </td>
          </c:if>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.aminoAcidSubs"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.predictionCategory"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreProvean"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreSift"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreConservation"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.proteinAlignNumber"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
          <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=desc" >
              <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/><span class="sortarrow">&#9662;</span>
            </a>
          </c:if>
          <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/><span class="sortarrow">&#9650;</span>
            </a>
          </c:if>
          </td>
        </tr>
      </c:if>

      <c:if test="${dtoDownload.isDownloadSortFieldScoreProvean()}">
      <tr>
        <td>
          <spring:message code="snpchromosome.list.label.chromosomeId"/>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.position"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.reference"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.alternative"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.region"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblGene"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblTranscript"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
        <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblAnnotation"/><span class="sortarrow">&#9650;</span>
            </a>
        </td>
          <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain7Allele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainPAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainWAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainNAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain6Allele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainCAllele"/>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/>
            </td>
          </c:if>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.aminoAcidSubs"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.predictionCategory"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
          <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=desc" >
              <spring:message code="snpchromosome.list.label.scoreProvean"/><span class="sortarrow">&#9662;</span>
            </a>
          </c:if>
          <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreProvean"/><span class="sortarrow">&#9650;</span>
            </a>
          </c:if>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreSift"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreConservation"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.proteinAlignNumber"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
          <td>
            <a href="/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/><span class="sortarrow">&#9650;</span>
            </a>
          </td>
        </tr>
      </c:if>
        
      </thead>
      <tbody>
        <c:forEach items="${SNPChromosome}" var="snpchromosome" varStatus="rowStatus">
          <tr>
            <td>
              <c:out value="${snpchromosome.chromosomeId}"/>
            </td>
            <td>
              <c:out value="${snpchromosome.position}"/>
            </td>
            <td>
              <c:out value="${snpchromosome.reference}"/>
            </td>
            <td>
              <c:out value="${snpchromosome.alternative}"/>
            </td>
            <td>
              <c:out value="${snpchromosome.getRegionMultiLines()}"/>
            </td>
            <td>
              <c:out value="${snpchromosome.getEnsemblGeneMultiLines()}"/>
            </td>
            <td>
              <c:out value="${snpchromosome.getEnsemblTranscriptMultiLines()}"/>
            </td>
            <td>
              <c:out value="${snpchromosome.getEnsemblAnnotationMultiLines()}"/>
            </td>
            <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
              <td>
                <c:out value="${snpchromosome.getStrain7Allele()}"/>
              </td>
              <td>
                <c:out value="${snpchromosome.getStrain7AlleleFixed()}"/>
              </td>
            </c:if>
            <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
              <td>
                <c:out value="${snpchromosome.getStrainPAllele()}"/>
              </td>
              <td>
                <c:out value="${snpchromosome.getStrainPAlleleFixed()}"/>
              </td>
            </c:if>
            <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
              <td>
                <c:out value="${snpchromosome.getStrainWAllele()}"/>
              </td>
              <td>
                <c:out value="${snpchromosome.getStrainWAlleleFixed()}"/>
              </td>
            </c:if>
            <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
              <td>
                <c:out value="${snpchromosome.getStrainNAllele()}"/>
              </td>
              <td>
                <c:out value="${snpchromosome.getStrainNAlleleFixed()}"/>
              </td>
            </c:if>
            <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
              <td>
                <c:out value="${snpchromosome.getStrain15IAllele()}"/>
              </td>
              <td>
                <c:out value="${snpchromosome.getStrain15IAlleleFixed()}"/>
              </td>
            </c:if>
            <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
              <td>
                <c:out value="${snpchromosome.getStrainZeroAllele()}"/>
              </td>
              <td>
                <c:out value="${snpchromosome.getStrainZeroAlleleFixed()}"/>
              </td>
            </c:if>
            <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
              <td>
                <c:out value="${snpchromosome.getStrain6Allele()}"/>
              </td>
              <td>
                <c:out value="${snpchromosome.getStrain6AlleleFixed()}"/>
              </td>
            </c:if>
            <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
              <td>
                <c:out value="${snpchromosome.getStrainCAllele()}"/>
              </td>
              <td>
                <c:out value="${snpchromosome.getStrainCAlleleFixed()}"/>
              </td>
            </c:if>
            <td>
              <c:out value="${snpchromosome.getAminoAcidSubs()}"/>
            </td>
            <td>
              <c:out value="${snpchromosome.getPredictionCategory()}"/>
            </td>
            <td>
              <c:out value="${snpchromosome.getScoreProvean()}"/>
            </td>
            <td>
              <c:out value="${snpchromosome.getScoreSift()}"/>
            </td>
            <td>
              <c:out value="${snpchromosome.getScoreConservation()}"/>
            </td>
            <td>
              <c:out value="${snpchromosome.getProteinAlignNumber()}"/>
            </td>
            <td>
              <c:out value="${snpchromosome.getTotalAlignSequenceNumber()}"/>
            </td>
          </tr>
        </c:forEach>
      </tbody>
    </table>

  </div><!-- close span12 -->
</div><!-- close row spacer -->

</c:if>
