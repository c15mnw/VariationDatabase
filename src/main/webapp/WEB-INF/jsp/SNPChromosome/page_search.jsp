<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>

<head>
    <title><spring:message code="spring.data.jpa.variation.title"/></title>
    
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/possible.css" type="text/css"/> 
    
</head>

<body>

<jsp:include page="include_navigation.jsp"/>

<h1><spring:message code="spring.data.jpa.variation.title"/></h1>

<jsp:include page="include_messages.jsp"/>

<jsp:include page="include_form_search.jsp"/>

</body>
</html>