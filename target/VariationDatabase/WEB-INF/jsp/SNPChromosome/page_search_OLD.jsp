<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>

<head>
    <title><spring:message code="spring.data.jpa.variation.title"/></title>
    
    <link rel="stylesheet" href="/static/css/possible.css" type="text/css"/> 
    <!-- <link rel="stylesheet" href="/static/css/styles.css" type="text/css"/> -->
    <!-- <link rel="stylesheet" href="/static/bootstrap/css/bootstrap.css" type="text/css"/>  -->
    
</head>

<body>

<jsp:include page="include_navigation.jsp"/>

<h1><spring:message code="spring.data.jpa.variation.title"/></h1>

<jsp:include page="include_messages.jsp"/>

<jsp:include page="include_search_form.jsp"/>

<jsp:include page="include_pagination.jsp"/>

<jsp:include page="include_snpchromosome_list.jsp"/>

</body>
</html>