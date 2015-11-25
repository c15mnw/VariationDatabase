<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test="${SNPChromosome != null && totalPages != 0}">

<div class="row spacer">
    <div class="span12">

<form:form action="${pageContext.request.contextPath}/download" commandName="dtoDownload" method="POST">

    <fieldset>
    
        <legend><spring:message code="snpchromosome.download.form.title"/></legend>
        
        <input type="hidden" id="downloadChromosome" name="downloadChromosome" value="${dtoDownload.downloadChromosome}" />
        <input type="hidden" id="downloadLowRange" name="downloadLowRange" value="${dtoDownload.downloadLowRange}" />
        <input type="hidden" id="downloadHighRange" name="downloadHighRange" value="${dtoDownload.downloadHighRange}" />
        <input type="hidden" id="downloadReference" name="downloadReference" value="${dtoDownload.downloadReference}" />
        <input type="hidden" id="downloadAlternative" name="downloadAlternative" value="${dtoDownload.downloadAlternative}" />

    </div><!-- close span12 -->
</div><!-- close row -->

<div class="row">
    <div class="span12">
        <div class="row">
            <div class="span6">
            <form:label path="DownloadFormat"><h4><spring:message code="snpchromosome.download.format.label"/></h4></form:label>
                <div class="row-fluid">
                    <div class="span8">
            <form:label path="DownloadFormat"><spring:message code="DownloadFormat.FORMAT_CSV"/></form:label>
                    </div>
                    <div class="span4">
            <form:radiobutton path="DownloadFormat" value="FORMAT_CSV"/>
                    </div>
                    <div class="row-fluid">
                        <div class="span8">
            <form:label path="DownloadFormat"><spring:message code="DownloadFormat.FORMAT_TSV"/></form:label>
                        </div>
                        <div class="span4">
            <form:radiobutton path="DownloadFormat" value="FORMAT_TSV"/>
                        </div>
                    </div>
                </div>
            </div>
            <div class="span6">
            <form:label path="DownloadQuotes"><h4><spring:message code="snpchromosome.download.quotes.label"/></h4></form:label>
                <div class="row-fluid">
                    <div class="span8">
            <form:label path="DownloadQuotes"><spring:message code="DownloadQuotes.QUOTES_YES"/></form:label>
                    </div>
                    <div class="span4">
            <form:radiobutton path="DownloadQuotes" value="QUOTES_YES"/>
                    </div>
                    <div class="row-fluid">
                        <div class="span8">
            <form:label path="DownloadQuotes"><spring:message code="DownloadQuotes.QUOTES_NO"/></form:label>
                        </div>
                        <div class="span4">
            <form:radiobutton path="DownloadQuotes" value="QUOTES_NO"/>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
    <div class="row spacer">
        <div class="span12">
            <input type="submit" value="<spring:message code="snpchromosome.download.form.submit.label"/>"/>
        </div><!-- close span12 -->
    </div><!-- close row -->
</div>
        
    </fieldset>
    
</form:form>

</c:if>
