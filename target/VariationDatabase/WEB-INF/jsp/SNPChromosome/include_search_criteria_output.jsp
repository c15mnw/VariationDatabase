<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<p>
<spring:message code="snpchromosome.search.result.page.title"/>
: 
<spring:message code="snpchromosome.search.result.searchrange.label"/> 
<c:out value="${searchCriteria.searchLowRange}"/>
 - 
<c:out value="${searchCriteria.searchHighRange}"/>
; 
<spring:message code="snpchromosome.search.result.searchreference.label"/> 
<c:out value="${searchCriteria.searchReference}"/>
<spring:message code="snpchromosome.search.result.searchalternative.label"/>
 And 
<c:out value="${searchCriteria.searchAlternative}"/>
</p>
