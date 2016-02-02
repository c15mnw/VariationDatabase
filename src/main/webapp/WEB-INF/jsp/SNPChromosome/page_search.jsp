<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>

<head>

<meta charset="utf-8">
<title><spring:message code="spring.data.jpa.variation.title1"/></title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<!-- Stylesheets
================ -->
<link href="${pageContext.request.contextPath}/static/css/bootstrap.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/static/css/docs.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/static/css/jquery.autocomplete.css" rel="stylesheet">

<style>
        input {
            font-size: 120%;
        }
</style>
  
<!-- IE Hack
============ -->
<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
<script src="${pageContext.request.contextPath}/static/js/html5shiv.js"></script>
<![endif]-->

<!-- Fav and touch icons
======================== -->
<link rel="apple-touch-icon-precomposed" sizes="144x144" href="${pageContext.request.contextPath}/static/img/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114" href="${pageContext.request.contextPath}/static/img/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72" href="${pageContext.request.contextPath}/static/img/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed" href="${pageContext.request.contextPath}/static/img/ico/apple-touch-icon-57-precomposed.png">
<link rel="shortcut icon" href="${pageContext.request.contextPath}/static/img/ico/favicon.png">

<!-- Javascripts
================ -->
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/jquery.autocomplete.js"></script>

<!-- Google Analytics
===================== -->
<script>
  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');
  ga('create', 'UA-43390855-1', 'narf.ac.uk');
  ga('send', 'pageview');
</script>

</head>

<body>

<div id="wrap">

  <jsp:include page="include_header.jsp"/>

  <div class="container">

    <jsp:include page="include_navigation_search.jsp"/>
 
    <h1><spring:message code="spring.data.jpa.variation.title2"/></h1>

    <jsp:include page="include_messages.jsp"/>

    <jsp:include page="include_form_search.jsp"/>

  </div><!-- /.container -->

</div><!-- /.wrap -->

<jsp:include page="include_footer.jsp"/>

</body>
</html>