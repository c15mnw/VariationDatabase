<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

    <div class="row">
        <div class="span12">
            <ul class="breadcrumb">
                <li><a href="${pageContext.request.contextPath}/"><spring:message code="snpchromosome.list.link.label"/></a> <span class="divider">/</span></li>
                <li><a href="${pageContext.request.contextPath}/"><spring:message code="snpchromosome.list.link.search"/></a> <span class="divider">/</span></li>
                <li class="active"><spring:message code="snpchromosome.list.link.search.results"/></li>
            </ul>
        </div>
    </div>
    <!-- Three columns of text below the carousel -->

