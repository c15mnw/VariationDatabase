<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<form:form action="/search" commandName="searchCriteria" method="POST">

    <fieldset>
    
        <legend><spring:message code="snpchromosome.search.form.title"/></legend>
        
        <div>
            <form:label path="searchLowRange"><spring:message code="snpchromosome.search.searchlowrange.label"/></form:label>
            <form:input path="searchLowRange" type="text"/>
        </div>
        
        <div>
            <form:label path="searchHighRange"><spring:message code="snpchromosome.search.searchhighrange.label"/></form:label>
            <form:input path="searchHighRange" type="text"/>
        </div>
        
        <div>
            <form:label path="SearchReference"><spring:message code="snpchromosome.search.searchreference.label"/></form:label>
            <form:select path="SearchReference">
                <form:option value="NONE"><spring:message code="SearchReference.NONE"/></form:option>
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
                <form:option value="NONE"><spring:message code="SearchAlternative.NONE"/></form:option>
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
