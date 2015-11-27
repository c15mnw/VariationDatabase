<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- <div class="messages alert alert-danger"> -->

    <c:if test="${feedbackMessage != null}">
        <div class="messages alert alert-info"><c:out value="${feedbackMessage}"/></div>
    </c:if>
    
    <c:if test="${errorMessage != null}">
        <div class="messages alert alert-danger"><c:out value="${errorMessage}"/></div>
    </c:if>
    
<!-- </div> -->
