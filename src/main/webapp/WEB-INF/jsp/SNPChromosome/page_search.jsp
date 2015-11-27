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

<!-- Le styles -->
<link href="${pageContext.request.contextPath}/static/css/bootstrap.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/static/css/bootstrap-responsive.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/static/css/docs.css" rel="stylesheet">


<link href="${pageContext.request.contextPath}/static/css/jquery.autocomplete.css" rel="stylesheet">

  
<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
<script src="js/html5shiv.js"></script>
<![endif]-->

<!-- Fav and touch icons -->
<link rel="apple-touch-icon-precomposed" sizes="144x144" href="${pageContext.request.contextPath}/static/img/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114" href="${pageContext.request.contextPath}/static/img/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72" href="${pageContext.request.contextPath}/static/img/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed" href="${pageContext.request.contextPath}/static/img/ico/apple-touch-icon-57-precomposed.png">
<link rel="shortcut icon" href="${pageContext.request.contextPath}/static/img/ico/favicon.png">

    <!-- Le javascript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->

<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js"></script>

<script src="${pageContext.request.contextPath}/static/js/jquery.autocomplete.js"></script>


</head>

<body>

<div id="wrap">

    <jsp:include page="include_header.jsp"/>

    <jsp:include page="include_navigation.jsp"/>


    <div class="container"><!-- InstanceBeginEditable name="Editable Region" -->
 
        <h1><spring:message code="spring.data.jpa.variation.title2"/></h1>

        <jsp:include page="include_messages.jsp"/>

        <jsp:include page="include_form_search.jsp"/>

    </div><!-- /.container -->

</div><!-- Close Wrap -->

<jsp:include page="include_footer.jsp"/>

</body>
</html>