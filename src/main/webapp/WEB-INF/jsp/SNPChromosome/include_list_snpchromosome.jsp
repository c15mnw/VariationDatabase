<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<c:if test="${SNPChromosome != null && totalPages != 0}">

<div class="row spacer">
    <div class="span12">

    <table class="table table-bordered table-condensed">
        <thead>
        <tr>
            <td><spring:message code="snpchromosome.list.label.snpId"/></td>
            <td><spring:message code="snpchromosome.list.label.chromosomeId"/></td>
            <td><spring:message code="snpchromosome.list.label.position"/></td>
            <td><spring:message code="snpchromosome.list.label.reference"/></td>
            <td><spring:message code="snpchromosome.list.label.alternative"/></td>
            <td><spring:message code="snpchromosome.list.label.region"/></td>
            <td><spring:message code="snpchromosome.list.label.ensemblGene"/></td>
            <td><spring:message code="snpchromosome.list.label.ensemblTranscript"/></td>
            <td><spring:message code="snpchromosome.list.label.ensemblAnnotation"/></td>
            <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
            <td><spring:message code="snpchromosome.list.label.strain7Allele"/></td>
            <td><spring:message code="snpchromosome.list.label.strain7AlleleFixed"/></td>
            </c:if>
            <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
            <td><spring:message code="snpchromosome.list.label.strainPAllele"/></td>
            <td><spring:message code="snpchromosome.list.label.strainPAlleleFixed"/></td>
            </c:if>
            <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
            <td><spring:message code="snpchromosome.list.label.strainWAllele"/></td>
            <td><spring:message code="snpchromosome.list.label.strainWAlleleFixed"/></td>
            </c:if>
            <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
            <td><spring:message code="snpchromosome.list.label.strainNAllele"/></td>
            <td><spring:message code="snpchromosome.list.label.strainNAlleleFixed"/></td>
            </c:if>
            <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
            <td><spring:message code="snpchromosome.list.label.strain15IAllele"/></td>
            <td><spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/></td>
            </c:if>
            <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
            <td><spring:message code="snpchromosome.list.label.strainZeroAllele"/></td>
            <td><spring:message code="snpchromosome.list.label.strainZeroAlleleFixed"/></td>
            </c:if>
            <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
            <td><spring:message code="snpchromosome.list.label.strain6Allele"/></td>
            <td><spring:message code="snpchromosome.list.label.strain6AlleleFixed"/></td>
            </c:if>
            <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
            <td><spring:message code="snpchromosome.list.label.strainCAllele"/></td>
            <td><spring:message code="snpchromosome.list.label.strainCAlleleFixed"/></td>
            </c:if>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${SNPChromosome}" var="snpchromosome" varStatus="rowStatus">
            <tr>
                <td><c:out value="${snpchromosome.snpId}"/></td>
                <td><c:out value="${snpchromosome.chromosomeId}"/></td>
                <td><c:out value="${snpchromosome.position}"/></td>
                <td><c:out value="${snpchromosome.reference}"/></td>
                <td><c:out value="${snpchromosome.alternative}"/></td>
                <td><c:out value="${snpchromosome.getRegionMultiLines()}"/></td>
                <td><c:out value="${snpchromosome.getEnsemblGeneMultiLines()}"/></td>
                <td><c:out value="${snpchromosome.getEnsemblTranscriptMultiLines()}"/></td>
                <td><c:out value="${snpchromosome.getEnsemblAnnotationMultiLines()}"/></td>
                <c:if test="${dtoDownload.isDownloadReference7() || dtoDownload.isDownloadAlternative7()}">
                <td><c:out value="${snpchromosome.getStrain7Allele()}"/></td>
                <td><c:out value="${snpchromosome.getStrain7AlleleFixed()}"/></td>
                </c:if>
                <c:if test="${dtoDownload.isDownloadReferenceP() || dtoDownload.isDownloadAlternativeP()}">
                <td><c:out value="${snpchromosome.getStrainPAllele()}"/></td>
                <td><c:out value="${snpchromosome.getStrainPAlleleFixed()}"/></td>
                </c:if>
                <c:if test="${dtoDownload.isDownloadReferenceW() || dtoDownload.isDownloadAlternativeW()}">
                <td><c:out value="${snpchromosome.getStrainWAllele()}"/></td>
                <td><c:out value="${snpchromosome.getStrainWAlleleFixed()}"/></td>
                </c:if>
                <c:if test="${dtoDownload.isDownloadReferenceN() || dtoDownload.isDownloadAlternativeN()}">
                <td><c:out value="${snpchromosome.getStrainNAllele()}"/></td>
                <td><c:out value="${snpchromosome.getStrainNAlleleFixed()}"/></td>
                </c:if>
                <c:if test="${dtoDownload.isDownloadReference15I() || dtoDownload.isDownloadAlternative15I()}">
                <td><c:out value="${snpchromosome.getStrain15IAllele()}"/></td>
                <td><c:out value="${snpchromosome.getStrain15IAlleleFixed()}"/></td>
                </c:if>
                <c:if test="${dtoDownload.isDownloadReferenceZero() || dtoDownload.isDownloadAlternativeZero()}">
                <td><c:out value="${snpchromosome.getStrainZeroAllele()}"/></td>
                <td><c:out value="${snpchromosome.getStrainZeroAlleleFixed()}"/></td>
                </c:if>
                <c:if test="${dtoDownload.isDownloadReference6() || dtoDownload.isDownloadAlternative6()}">
                <td><c:out value="${snpchromosome.getStrain6Allele()}"/></td>
                <td><c:out value="${snpchromosome.getStrain6AlleleFixed()}"/></td>
                </c:if>
                <c:if test="${dtoDownload.isDownloadReferenceC() || dtoDownload.isDownloadAlternativeC()}">
                <td><c:out value="${snpchromosome.getStrainCAllele()}"/></td>
                <td><c:out value="${snpchromosome.getStrainCAlleleFixed()}"/></td>
                </c:if>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    </div> <!-- close span12 -->
</div>

</c:if>
