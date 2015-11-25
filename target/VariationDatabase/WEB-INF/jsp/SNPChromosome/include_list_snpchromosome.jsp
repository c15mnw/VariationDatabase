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
            <td><spring:message code="snpchromosome.list.label.strain7Allele"/></td>
            <td><spring:message code="snpchromosome.list.label.strain7AlleleFixed"/></td>
            <td><spring:message code="snpchromosome.list.label.strainPAllele"/></td>
            <td><spring:message code="snpchromosome.list.label.strainPAlleleFixed"/></td>
            <td><spring:message code="snpchromosome.list.label.strainWAllele"/></td>
            <td><spring:message code="snpchromosome.list.label.strainWAlleleFixed"/></td>
            <td><spring:message code="snpchromosome.list.label.strainNAllele"/></td>
            <td><spring:message code="snpchromosome.list.label.strainNAlleleFixed"/></td>
            <td><spring:message code="snpchromosome.list.label.strain15IAllele"/></td>
            <td><spring:message code="snpchromosome.list.label.strain15IAlleleFixed"/></td>
            <td><spring:message code="snpchromosome.list.label.strainZEROAllele"/></td>
            <td><spring:message code="snpchromosome.list.label.strainZEROAlleleFixed"/></td>
            <td><spring:message code="snpchromosome.list.label.strain6Allele"/></td>
            <td><spring:message code="snpchromosome.list.label.strain6AlleleFixed"/></td>
            <td><spring:message code="snpchromosome.list.label.strainCAllele"/></td>
            <td><spring:message code="snpchromosome.list.label.strainCAlleleFixed"/></td>
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
                <td><c:out value="${snpchromosome.strain7Allele}"/></td>
                <td><c:out value="${snpchromosome.getStrain7AlleleFixedAsString()}"/></td>
                <td><c:out value="${snpchromosome.strainPAllele}"/></td>
                <td><c:out value="${snpchromosome.getStrainPAlleleFixedAsString()}"/></td>
                <td><c:out value="${snpchromosome.strainWAllele}"/></td>
                <td><c:out value="${snpchromosome.getStrainWAlleleFixedAsString()}"/></td>
                <td><c:out value="${snpchromosome.strainNAllele}"/></td>
                <td><c:out value="${snpchromosome.getStrainNAlleleFixedAsString()}"/></td>
                <td><c:out value="${snpchromosome.strain15IAllele}"/></td>
                <td><c:out value="${snpchromosome.getStrain15IAlleleFixedAsString()}"/></td>
                <td><c:out value="${snpchromosome.strainZEROAllele}"/></td>
                <td><c:out value="${snpchromosome.getStrainZEROAlleleFixedAsString()}"/></td>
                <td><c:out value="${snpchromosome.strain6Allele}"/></td>
                <td><c:out value="${snpchromosome.getStrain6AlleleFixedAsString()}"/></td>
                <td><c:out value="${snpchromosome.strainCAllele}"/></td>
                <td><c:out value="${snpchromosome.getStrainCAlleleFixedAsString()}"/></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    </div> <!-- close span12 -->
</div>

</c:if>
