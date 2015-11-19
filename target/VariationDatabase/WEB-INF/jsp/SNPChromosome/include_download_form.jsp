<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test="${SNPChromosome != null && snpchromosome.totalPages != 0}">

<form:form action="/download" commandName="downloadCriteria" method="POST">

    <fieldset>
    
        <legend><spring:message code="snpchromosome.download.form.title"/></legend>
        
        <input type="hidden" id="downloadLowRange" name="downloadLowRange" value="${searchCriteria.searchLowRange}" />
        <input type="hidden" id="downloadHighRange" name="downloadHighRange" value="${searchCriteria.searchHighRange}" />
        <input type="hidden" id="downloadReference" name="downloadReference" value="${searchCriteria.searchReference}" />
        <input type="hidden" id="downloadAlternative" name="downloadAlternative" value="${searchCriteria.searchAlternative}" />

        <div>
            <form:label path="downloadFormat"><spring:message code="snpchromosome.download.format.label"/></form:label>

            <form:label path="downloadFormat"><spring:message code="downloadFormat.downloadCSV"/></form:label>
            <form:radiobutton path="downloadFormat" value="CSV"/>
            <form:label path="downloadFormat"><spring:message code="downloadFormat.downloadTSV"/></form:label>
            <form:radiobutton path="downloadFormat" value="TSV"/>
        </div>
        
        <div>
            <form:label path="downloadQuotes"><spring:message code="snpchromosome.download.quotes.label"/></form:label>

            <form:label path="downloadQuotes"><spring:message code="downloadQuotes.downloadYES"/></form:label>
            <form:radiobutton path="downloadQuotes" value="YES"/>
            <form:label path="downloadQuotes"><spring:message code="downloadQuotes.downloadNO"/></form:label>
            <form:radiobutton path="downloadQuotes" value="NO"/>
        </div>

        <div>
            <input type="submit" value="<spring:message code="snpchromosome.download.form.submit.label"/>"/>
        </div>
        
    </fieldset>
    
</form:form>

</c:if>
