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
          <spring:message code="snpchromosome.list.label.chromosomeId"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Chromosome Id"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
        </td>
        <td>
          <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=desc" >
              <spring:message code="snpchromosome.list.label.position"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Position"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-213-arrow-down.png" alt="Help" height="15" width="15">
            </a>
          </c:if>
          <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.position"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Position"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </c:if>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.reference"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Reference Allele"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.alternative"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Alternative Allele"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.region"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblGene"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Gene Name"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblTranscript"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Transcript"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblAnnotation"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Coding Predictions"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
          <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain7Allele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 7"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 7 Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainPAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain P"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain P Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainWAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain W"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain W Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainNAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain N"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain N Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 15I"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 15I Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain Zero"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain Zero Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain6Allele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 6"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 6 Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainCAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain C"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain C Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.aminoAcidSubs"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Amino Acid Substitution Information"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.predictionCategory"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Prediction Category"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreProvean"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="PROVEAN Score"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreSift"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="SIFT Score"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreConservation"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.proteinAlignNumber"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Total Number of Sequence Aligned"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
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
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.position"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Position"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
          <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=desc" >
              <spring:message code="snpchromosome.list.label.reference"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Reference Allele"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-213-arrow-down.png" alt="Help" height="15" width="15">
            </a>
          </c:if>
          <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.reference"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Reference Allele"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </c:if>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.alternative"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Alternative Allele"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.region"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblGene"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Gene Name"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblTranscript"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Transcript"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblAnnotation"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Coding Predictions"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
          <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain7Allele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 7"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 7 Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainPAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain P"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain P Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainWAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain W"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain W Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainNAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain N"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain N Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 15I"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 15I Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain Zero"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain Zero Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain6Allele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 6"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 6 Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainCAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain C"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain C Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.aminoAcidSubs"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Amino Acid Substitution Information"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.predictionCategory"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Prediction Category"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreProvean"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="PROVEAN Score"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreSift"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="SIFT Score"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreConservation"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.proteinAlignNumber"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Total Number of Sequence Aligned"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
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
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.position"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Position"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.reference"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Reference Allele"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
          <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=desc" >
              <spring:message code="snpchromosome.list.label.alternative"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Alternative Allele"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-213-arrow-down.png" alt="Help" height="15" width="15">
            </a>
          </c:if>
          <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.alternative"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Alternative Allele"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </c:if>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.region"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblGene"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Gene Name"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblTranscript"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Transcript"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblAnnotation"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Coding Predictions"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
          <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain7Allele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 7"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 7 Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainPAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain P"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain P Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainWAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain W"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain W Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainNAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain N"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain N Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 15I"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 15I Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain Zero"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain Zero Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain6Allele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 6"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 6 Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainCAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain C"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain C Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.aminoAcidSubs"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Amino Acid Substitution Information"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.predictionCategory"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Prediction Category"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreProvean"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="PROVEAN Score"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreSift"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="SIFT Score"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreConservation"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.proteinAlignNumber"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Total Number of Sequence Aligned"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
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
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.position"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Position"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.reference"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Reference Allele"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.alternative"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Alternative Allele"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
          <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=desc" >
              <spring:message code="snpchromosome.list.label.region"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-213-arrow-down.png" alt="Help" height="15" width="15">
            </a>
          </c:if>
          <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.region"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </c:if>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblGene"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Gene Name"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblTranscript"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Transcript"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblAnnotation"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Coding Predictions"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
          <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain7Allele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 7"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 7 Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainPAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain P"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain P Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainWAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain W"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain W Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainNAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain N"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain N Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 15I"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 15I Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain Zero"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain Zero Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain6Allele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 6"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 6 Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainCAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain C"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain C Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.aminoAcidSubs"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Amino Acid Substitution Information"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.predictionCategory"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Prediction Category"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreProvean"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="PROVEAN Score"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreSift"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="SIFT Score"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreConservation"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.proteinAlignNumber"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Total Number of Sequence Aligned"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
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
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.position"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Position"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.reference"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Reference Allele"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.alternative"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Alternative Allele"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.region"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
          <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=desc" >
              <spring:message code="snpchromosome.list.label.ensemblGene"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Gene Name"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-213-arrow-down.png" alt="Help" height="15" width="15">
            </a>
          </c:if>
          <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblGene"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Gene Name"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </c:if>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblTranscript"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Transcript"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblAnnotation"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Coding Predictions"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
          <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain7Allele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 7"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 7 Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainPAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain P"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain P Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainWAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain W"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain W Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainNAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain N"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain N Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 15I"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 15I Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain Zero"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain Zero Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain6Allele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 6"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 6 Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainCAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain C"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain C Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.aminoAcidSubs"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Amino Acid Substitution Information"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.predictionCategory"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Prediction Category"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreProvean"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="PROVEAN Score"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreSift"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="SIFT Score"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreConservation"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.proteinAlignNumber"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Total Number of Sequence Aligned"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
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
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.position"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Position"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.reference"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Reference Allele"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.alternative"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Alternative Allele"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.region"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblGene"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Gene Name"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
          <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=desc" >
              <spring:message code="snpchromosome.list.label.ensemblTranscript"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Transcript"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-213-arrow-down.png" alt="Help" height="15" width="15">
            </a>
          </c:if>
          <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblTranscript"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Transcript"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </c:if>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblAnnotation"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Coding Predictions"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
          <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain7Allele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 7"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 7 Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainPAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain P"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain P Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainWAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain W"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain W Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainNAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain N"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain N Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 15I"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 15I Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain Zero"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain Zero Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain6Allele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 6"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 6 Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainCAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain C"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain C Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.aminoAcidSubs"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Amino Acid Substitution Information"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.predictionCategory"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Prediction Category"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreProvean"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="PROVEAN Score"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreSift"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="SIFT Score"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreConservation"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.proteinAlignNumber"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Total Number of Sequence Aligned"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
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
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.position"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Position"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.reference"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Reference Allele"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.alternative"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Alternative Allele"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.region"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblGene"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Gene Name"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblTranscript"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Transcript"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
          <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=desc" >
              <spring:message code="snpchromosome.list.label.ensemblAnnotation"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Coding Predictions"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-213-arrow-down.png" alt="Help" height="15" width="15">
            </a>
          </c:if>
          <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblAnnotation"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Coding Predictions"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </c:if>
        </td>
          <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain7Allele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 7"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 7 Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainPAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain P"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain P Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainWAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain W"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain W Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainNAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain N"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain N Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 15I"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 15I Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain Zero"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain Zero Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain6Allele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 6"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 6 Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainCAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain C"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain C Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.aminoAcidSubs"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Amino Acid Substitution Information"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.predictionCategory"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Prediction Category"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreProvean"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="PROVEAN Score"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreSift"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="SIFT Score"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreConservation"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.proteinAlignNumber"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Total Number of Sequence Aligned"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
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
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.position"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Position"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.reference"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Reference Allele"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.alternative"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Alternative Allele"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.region"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblGene"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Gene Name"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblTranscript"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Transcript"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblAnnotation"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Coding Predictions"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
          <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain7Allele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 7"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 7 Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainPAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain P"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain P Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainWAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain W"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain W Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainNAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain N"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain N Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 15I"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 15I Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain Zero"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain Zero Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain6Allele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 6"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 6 Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainCAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain C"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain C Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <td>
          <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=desc" >
              <spring:message code="snpchromosome.list.label.aminoAcidSubs"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Amino Acid Substitution Information"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-213-arrow-down.png" alt="Help" height="15" width="15">
            </a>
          </c:if>
          <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.aminoAcidSubs"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Amino Acid Substitution Information"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </c:if>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.predictionCategory"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Prediction Category"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreProvean"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="PROVEAN Score"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreSift"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="SIFT Score"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreConservation"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.proteinAlignNumber"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Total Number of Sequence Aligned"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
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
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.position"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Position"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.reference"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Reference Allele"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.alternative"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Alternative Allele"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.region"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblGene"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Gene Name"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblTranscript"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Transcript"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblAnnotation"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Coding Predictions"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
          <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain7Allele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 7"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 7 Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainPAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain P"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain P Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainWAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain W"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain W Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainNAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain N"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain N Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 15I"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 15I Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain Zero"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain Zero Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain6Allele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 6"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 6 Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainCAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain C"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain C Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.aminoAcidSubs"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Amino Acid Substitution Information"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
          <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=desc" >
              <spring:message code="snpchromosome.list.label.predictionCategory"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Prediction Category"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-213-arrow-down.png" alt="Help" height="15" width="15">
            </a>
          </c:if>
          <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.predictionCategory"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Prediction Category"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </c:if>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreProvean"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="PROVEAN Score"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreSift"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="SIFT Score"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreConservation"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.proteinAlignNumber"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Total Number of Sequence Aligned"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
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
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.position"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Position"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.reference"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Reference Allele"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.alternative"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Alternative Allele"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.region"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblGene"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Gene Name"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblTranscript"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Transcript"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblAnnotation"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Coding Predictions"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
          <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain7Allele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 7"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 7 Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainPAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain P"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain P Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainWAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain W"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain W Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainNAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain N"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain N Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 15I"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 15I Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain Zero"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain Zero Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain6Allele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 6"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 6 Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainCAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain C"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain C Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.aminoAcidSubs"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Amino Acid Substitution Information"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.predictionCategory"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Prediction Category"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreProvean"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="PROVEAN Score"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
          <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=desc" >
              <spring:message code="snpchromosome.list.label.scoreSift"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="SIFT Score"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-213-arrow-down.png" alt="Help" height="15" width="15">
            </a>
          </c:if>
          <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreSift"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="SIFT Score"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </c:if>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreConservation"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.proteinAlignNumber"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Total Number of Sequence Aligned"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
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
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.position"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Position"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.reference"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Reference Allele"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.alternative"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Alternative Allele"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.region"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblGene"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Gene Name"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblTranscript"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Transcript"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblAnnotation"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Coding Predictions"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
          <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain7Allele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 7"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 7 Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainPAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain P"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain P Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainWAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain W"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain W Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainNAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain N"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain N Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 15I"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 15I Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain Zero"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain Zero Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain6Allele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 6"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 6 Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainCAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain C"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain C Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.aminoAcidSubs"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Amino Acid Substitution Information"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.predictionCategory"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Prediction Category"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreProvean"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="PROVEAN Score"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreSift"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="SIFT Score"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
          <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=desc" >
              <spring:message code="snpchromosome.list.label.scoreConservation"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-213-arrow-down.png" alt="Help" height="15" width="15">
            </a>
          </c:if>
          <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreConservation"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </c:if>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.proteinAlignNumber"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Total Number of Sequence Aligned"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
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
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.position"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Position"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
          <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=desc" >
              <spring:message code="snpchromosome.list.label.reference"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Reference Allele"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </c:if>
          <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.reference"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Reference Allele"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </c:if>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.alternative"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Alternative Allele"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.region"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblGene"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Gene Name"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblTranscript"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Transcript"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblAnnotation"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Coding Predictions"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
          <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain7Allele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 7"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 7 Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainPAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain P"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain P Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainWAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain W"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain W Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainNAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain N"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain N Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 15I"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 15I Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain Zero"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain Zero Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain6Allele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 6"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 6 Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainCAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain C"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain C Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.aminoAcidSubs"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Amino Acid Substitution Information"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.predictionCategory"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Prediction Category"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreProvean"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="PROVEAN Score"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreSift"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="SIFT Score"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreConservation"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
          <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=desc" >
              <spring:message code="snpchromosome.list.label.proteinAlignNumber"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-213-arrow-down.png" alt="Help" height="15" width="15">
            </a>
          </c:if>
          <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.proteinAlignNumber"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </c:if>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Total Number of Sequence Aligned"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
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
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.position"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Position"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.reference"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Reference Allele"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.alternative"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Alternative Allele"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.region"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblGene"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Gene Name"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblTranscript"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Transcript"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblAnnotation"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Coding Predictions"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
          <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain7Allele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 7"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 7 Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainPAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain P"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain P Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainWAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain W"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain W Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainNAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain N"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain N Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 15I"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 15I Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain Zero"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain Zero Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain6Allele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 6"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 6 Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainCAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain C"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain C Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.aminoAcidSubs"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Amino Acid Substitution Information"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.predictionCategory"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Prediction Category"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreProvean"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="PROVEAN Score"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreSift"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="SIFT Score"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreConservation"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.proteinAlignNumber"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
          <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=desc" >
              <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Total Number of Sequence Aligned"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-213-arrow-down.png" alt="Help" height="15" width="15">
            </a>
          </c:if>
          <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Total Number of Sequence Aligned"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
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
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=position&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.position"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Position"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=reference&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.reference"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Reference Allele"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=alternative&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.alternative"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Alternative Allele"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=region&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.region"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblGene&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblGene"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Gene Name"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblTranscript&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblTranscript"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Transcript"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=ensemblAnnotation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.ensemblAnnotation"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Ensembl Coding Predictions"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
        </td>
          <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain7Allele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 7"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain7AlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 7 Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainPAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain P"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainPAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain P Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainWAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain W"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainWAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain W Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainNAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain N"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainNAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain N Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 15I"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 15I Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain Zero"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain Zero Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
            <td>
              <spring:message code="snpchromosome.list.label.strain6Allele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 6"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strain6AlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain 6 Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
            <td>
              <spring:message code="snpchromosome.list.label.strainCAllele"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain C"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>

            </td>
            <td>
              <spring:message code="snpchromosome.list.label.strainCAlleleFixed"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Strain C Fixed?"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
            </td>
          </c:if>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=aminoAcidSubs&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.aminoAcidSubs"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Amino Acid Substitution Information"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=predictionCategory&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.predictionCategory"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Prediction Category"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
          <c:if test="${dtoDownload.isDownloadSortDirectionAsc()}">
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=desc" >
              <spring:message code="snpchromosome.list.label.scoreProvean"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="PROVEAN Score"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-213-arrow-down.png" alt="Help" height="15" width="15">
            </a>
          </c:if>
          <c:if test="${dtoDownload.isDownloadSortDirectionDesc()}">
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreProvean&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreProvean"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="PROVEAN Score"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </c:if>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreSift&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreSift"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="SIFT Score"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=scoreConservation&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.scoreConservation"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=proteinAlignNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.proteinAlignNumber"/><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
            </a>
          </td>
          <td>
            <a href="${pageContext.request.contextPath}/results/1?chr=${dtoDownload.getDownloadChromosomeAsString()}&low=${dtoDownload.downloadLowRange}&high=${dtoDownload.downloadHighRange}&ref=${dtoDownload.getDownloadReferenceAsString()}&alt=${dtoDownload.getDownloadAlternativeAsString()}&sortfield=totalAlignSequenceNumber&sortdir=asc" >
              <spring:message code="snpchromosome.list.label.totalAlignSequenceNumber"/><a style="color:#5a5a5a;" href="#" data-toggle="tooltip" data-placement="right" title="Total Number of Sequence Aligned"><img src="${pageContext.request.contextPath}/static/img/png/glyphicons-196-info-sign.png" alt="Help" height="15" width="15"></a>
<img src="${pageContext.request.contextPath}/static/img/png/glyphicons-214-arrow-up.png" alt="Help" height="15" width="15">
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
