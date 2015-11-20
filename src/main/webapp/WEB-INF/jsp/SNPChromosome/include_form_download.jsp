<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test="${SNPChromosome != null && totalPages != 0}">

<form:form action="${pageContext.request.contextPath}/download" commandName="dtoDownload" method="POST">

    <fieldset>
    
        <legend><spring:message code="snpchromosome.download.form.title"/></legend>
        
        <input type="hidden" id="downloadChromosome" name="downloadChromosome" value="${dtoDownload.downloadChromosome}" />
        <input type="hidden" id="downloadLowRange" name="downloadLowRange" value="${dtoDownload.downloadLowRange}" />
        <input type="hidden" id="downloadHighRange" name="downloadHighRange" value="${dtoDownload.downloadHighRange}" />
        <input type="hidden" id="downloadReference" name="downloadReference" value="${dtoDownload.downloadReference}" />
        <input type="hidden" id="downloadAlternative" name="downloadAlternative" value="${dtoDownload.downloadAlternative}" />

        <div>
            <form:label path="DownloadFormat"><spring:message code="snpchromosome.download.format.label"/></form:label>

            <form:label path="DownloadFormat"><spring:message code="DownloadFormat.FORMAT_CSV"/></form:label>
            <form:radiobutton path="DownloadFormat" value="FORMAT_CSV"/>
            <form:label path="DownloadFormat"><spring:message code="DownloadFormat.FORMAT_TSV"/></form:label>
            <form:radiobutton path="DownloadFormat" value="FORMAT_TSV"/>
        </div>
        
        <div>
            <form:label path="DownloadQuotes"><spring:message code="snpchromosome.download.quotes.label"/></form:label>

            <form:label path="DownloadQuotes"><spring:message code="DownloadQuotes.QUOTES_YES"/></form:label>
            <form:radiobutton path="DownloadQuotes" value="QUOTES_YES"/>
            <form:label path="DownloadQuotes"><spring:message code="DownloadQuotes.QUOTES_NO"/></form:label>
            <form:radiobutton path="DownloadQuotes" value="QUOTES_NO"/>
        </div>

        <div>
            <input type="submit" value="<spring:message code="snpchromosome.download.form.submit.label"/>"/>
        </div>
        
    </fieldset>
    
</form:form>

</c:if>
