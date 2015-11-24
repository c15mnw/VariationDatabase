<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<script>
    $("#searchGeneName").autocomplete("getEnsemblIds.jsp");
</script>
        

<form:form action="${pageContext.request.contextPath}/search" commandName="dtoSearch" method="POST">

    <fieldset>
    
        <legend><spring:message code="snpchromosome.search.form.legend"/></legend>

        <h2><spring:message code="snpchromosome.search.form.subtitle1"/></h2>

        <div>
            <form:label path="searchGeneName"><spring:message code="snpchromosome.search.searchGeneName.label"/></form:label>
            <form:input path="searchGeneName" type="text"/>
        </div>
        
<script>
    $("#searchGeneName").autocomplete("${pageContext.request.contextPath}/getEnsemblIds.jsp");
</script>
        
        <div>
            <form:label path="searchDownStream"><spring:message code="snpchromosome.search.searchDownStream.label"/></form:label>
            <form:input path="searchDownStream" type="text"/>
        </div>
        
        <div>
            <form:label path="searchUpStream"><spring:message code="snpchromosome.search.searchUpStream.label"/></form:label>
            <form:input path="searchUpStream" type="text"/>
        </div>
        
        <h1><spring:message code="snpchromosome.search.form.subtitle2"/></h1>

        <h2><spring:message code="snpchromosome.search.form.subtitle3"/></h2>

        <div>
            <form:label path="SearchChromosome"><spring:message code="snpchromosome.search.searchchromosome.label"/></form:label>
            <form:select path="SearchChromosome">
                <form:option value="CHROMOSOME_NONE"><spring:message code="SearchChromosome.CHROMOSOME_NONE"/></form:option>
                <form:option value="CHROMOSOME_1"><spring:message code="SearchChromosome.CHROMOSOME_1"/></form:option>
                <form:option value="CHROMOSOME_3"><spring:message code="SearchChromosome.CHROMOSOME_3"/></form:option>
                <form:option value="CHROMOSOME_4"><spring:message code="SearchChromosome.CHROMOSOME_4"/></form:option>
                <form:option value="CHROMOSOME_5"><spring:message code="SearchChromosome.CHROMOSOME_5"/></form:option>
                <form:option value="CHROMOSOME_6"><spring:message code="SearchChromosome.CHROMOSOME_6"/></form:option>
                <form:option value="CHROMOSOME_7"><spring:message code="SearchChromosome.CHROMOSOME_7"/></form:option>
                <form:option value="CHROMOSOME_8"><spring:message code="SearchChromosome.CHROMOSOME_8"/></form:option>
                <form:option value="CHROMOSOME_9"><spring:message code="SearchChromosome.CHROMOSOME_9"/></form:option>
                <form:option value="CHROMOSOME_10"><spring:message code="SearchChromosome.CHROMOSOME_10"/></form:option>
                <form:option value="CHROMOSOME_11"><spring:message code="SearchChromosome.CHROMOSOME_11"/></form:option>
                <form:option value="CHROMOSOME_12"><spring:message code="SearchChromosome.CHROMOSOME_12"/></form:option>
                <form:option value="CHROMOSOME_13"><spring:message code="SearchChromosome.CHROMOSOME_13"/></form:option>
                <form:option value="CHROMOSOME_14"><spring:message code="SearchChromosome.CHROMOSOME_14"/></form:option>
                <form:option value="CHROMOSOME_15"><spring:message code="SearchChromosome.CHROMOSOME_15"/></form:option>
                <form:option value="CHROMOSOME_16"><spring:message code="SearchChromosome.CHROMOSOME_16"/></form:option>
                <form:option value="CHROMOSOME_17"><spring:message code="SearchChromosome.CHROMOSOME_17"/></form:option>
                <form:option value="CHROMOSOME_18"><spring:message code="SearchChromosome.CHROMOSOME_18"/></form:option>
                <form:option value="CHROMOSOME_19"><spring:message code="SearchChromosome.CHROMOSOME_19"/></form:option>
                <form:option value="CHROMOSOME_20"><spring:message code="SearchChromosome.CHROMOSOME_20"/></form:option>
                <form:option value="CHROMOSOME_21"><spring:message code="SearchChromosome.CHROMOSOME_21"/></form:option>
                <form:option value="CHROMOSOME_22"><spring:message code="SearchChromosome.CHROMOSOME_22"/></form:option>
                <form:option value="CHROMOSOME_23"><spring:message code="SearchChromosome.CHROMOSOME_23"/></form:option>
                <form:option value="CHROMOSOME_24"><spring:message code="SearchChromosome.CHROMOSOME_24"/></form:option>
                <form:option value="CHROMOSOME_25"><spring:message code="SearchChromosome.CHROMOSOME_25"/></form:option>
                <form:option value="CHROMOSOME_26"><spring:message code="SearchChromosome.CHROMOSOME_26"/></form:option>
                <form:option value="CHROMOSOME_27"><spring:message code="SearchChromosome.CHROMOSOME_27"/></form:option>
                <form:option value="CHROMOSOME_28"><spring:message code="SearchChromosome.CHROMOSOME_28"/></form:option>
                <form:option value="CHROMOSOME_32"><spring:message code="SearchChromosome.CHROMOSOME_32"/></form:option>
                <form:option value="CHROMOSOME_LGE22C19W28_E50C23"><spring:message code="SearchChromosome.CHROMOSOME_LGE22C19W28_E50C23"/></form:option>
                <form:option value="CHROMOSOME_LGE64"><spring:message code="SearchChromosome.CHROMOSOME_LGE64"/></form:option>
                <form:option value="CHROMOSOME_W"><spring:message code="SearchChromosome.CHROMOSOME_W"/></form:option>
                <form:option value="CHROMOSOME_Z"><spring:message code="SearchChromosome.CHROMOSOME_Z"/></form:option>
            </form:select>
        </div>

        <div>
            <form:label path="searchLowRange"><spring:message code="snpchromosome.search.searchlowrange.label"/></form:label>
            <form:input path="searchLowRange" type="text"/>
        </div>
        
        <div>
            <form:label path="searchHighRange"><spring:message code="snpchromosome.search.searchhighrange.label"/></form:label>
            <form:input path="searchHighRange" type="text"/>
        </div>
        
        <h1><spring:message code="snpchromosome.search.form.subtitle4"/></h1>

        <h2><spring:message code="snpchromosome.search.form.subtitle5"/></h2>
        
        <div>
            <form:label path="SearchReference"><spring:message code="snpchromosome.search.searchreference.label"/></form:label>
            <form:select path="SearchReference">
                <form:option value="STRAIN_NONE"><spring:message code="SearchReference.STRAIN_NONE"/></form:option>
                <form:option value="STRAIN_7"><spring:message code="SearchReference.STRAIN_7"/></form:option>
                <form:option value="STRAIN_P"><spring:message code="SearchReference.STRAIN_P"/></form:option>
                <form:option value="STRAIN_W"><spring:message code="SearchReference.STRAIN_W"/></form:option>
                <form:option value="STRAIN_N"><spring:message code="SearchReference.STRAIN_N"/></form:option>
                <form:option value="STRAIN_15I"><spring:message code="SearchReference.STRAIN_15I"/></form:option>
                <form:option value="STRAIN_ZERO"><spring:message code="SearchReference.STRAIN_ZERO"/></form:option>
                <form:option value="STRAIN_6"><spring:message code="SearchReference.STRAIN_6"/></form:option>
                <form:option value="STRAIN_C"><spring:message code="SearchReference.STRAIN_C"/></form:option>
            </form:select>
        </div>
        
        <div>
            <form:label path="SearchAlternative"><spring:message code="snpchromosome.search.searchalternative.label"/></form:label>
            <form:select path="SearchAlternative">
                <form:option value="STRAIN_NONE"><spring:message code="SearchAlternative.STRAIN_NONE"/></form:option>
                <form:option value="STRAIN_7"><spring:message code="SearchAlternative.STRAIN_7"/></form:option>
                <form:option value="STRAIN_P"><spring:message code="SearchAlternative.STRAIN_P"/></form:option>
                <form:option value="STRAIN_W"><spring:message code="SearchAlternative.STRAIN_W"/></form:option>
                <form:option value="STRAIN_N"><spring:message code="SearchAlternative.STRAIN_N"/></form:option>
                <form:option value="STRAIN_15I"><spring:message code="SearchAlternative.STRAIN_15I"/></form:option>
                <form:option value="STRAIN_ZERO"><spring:message code="SearchAlternative.STRAIN_ZERO"/></form:option>
                <form:option value="STRAIN_6"><spring:message code="SearchAlternative.STRAIN_6"/></form:option>
                <form:option value="STRAIN_C"><spring:message code="SearchAlternative.STRAIN_C"/></form:option>
            </form:select>
        </div>

        <div>
            <input type="submit" value="<spring:message code="snpchromosome.search.form.submit.label"/>"/>
        </div>
        
    </fieldset>
    
</form:form>
