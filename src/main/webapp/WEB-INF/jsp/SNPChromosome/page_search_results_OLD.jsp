<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>

<head>
    <title><spring:message code="spring.data.jpa.variation.results"/></title>
    
    <link rel="stylesheet" href="/static/css/possible.css" type="text/css"/> 
    
</head>

<body>

<jsp:include page="include_search_criteria_hidden.jsp"/>

<jsp:include page="include_navigation.jsp"/>

<h1><spring:message code="spring.data.jpa.variation.results"/></h1>

<jsp:include page="include_messages.jsp"/>

<jsp:include page="include_search_form.jsp"/>

<jsp:include page="include_search_criteria_output.jsp"/>

<jsp:include page="include_download_form.jsp"/>

<jsp:include page="include_pagination_search.jsp"/>

<jsp:include page="include_snpchromosome_list.jsp"/>

</body>

</html>