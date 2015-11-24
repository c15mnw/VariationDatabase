<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>

<head>

<title><spring:message code="spring.data.jpa.variation.title"/></title>
    
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/possible.css" type="text/css"/> 
    
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/jquery.autocomplete.css" />
<script type="text/javascript"
        src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/jquery.autocomplete.js"></script>  
    
</head>

<body>

<jsp:include page="include_navigation.jsp"/>

<h1><spring:message code="spring.data.jpa.variation.title"/></h1>

<jsp:include page="include_messages.jsp"/>

<jsp:include page="include_form_search.jsp"/>

</body>
</html>