<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test="${snpchromosome != null && snpchromosome.totalPages != 0}">

<c:url var="firstUrl" value="/results/1/${searchCriteria.searchLowRange}/${searchCriteria.searchHighRange}/${searchCriteria.searchReference}/${searchCriteria.searchAlternative}" />
<c:url var="lastUrl" value="/results/${snpchromosome.totalPages}/${searchCriteria.searchLowRange}/${searchCriteria.searchHighRange}/${searchCriteria.searchReference}/${searchCriteria.searchAlternative}" />
<c:url var="prevUrl" value="/results/${currentIndex - 1}/${searchCriteria.searchLowRange}/${searchCriteria.searchHighRange}/${searchCriteria.searchReference}/${searchCriteria.searchAlternative}" />
<c:url var="nextUrl" value="/results/${currentIndex + 1}/${searchCriteria.searchLowRange}/${searchCriteria.searchHighRange}/${searchCriteria.searchReference}/${searchCriteria.searchAlternative}" />

<div class="pagination">
    <ul>
        <c:choose>
            <c:when test="${currentIndex == 1}">
                <li class="disabled"><a href="#">&lt;&lt;</a></li>
                <li class="disabled"><a href="#">&lt;</a></li>
            </c:when>
            <c:otherwise>
                <li><a href="${firstUrl}">&lt;&lt;</a></li>
                <li><a href="${prevUrl}">&lt;</a></li>
            </c:otherwise>
        </c:choose>
        
        <c:forEach var="i" begin="${beginIndex}" end="${endIndex}">
            <c:url var="pageUrl" value="/results/${i}/${searchCriteria.searchLowRange}/${searchCriteria.searchHighRange}/${searchCriteria.searchReference}/${searchCriteria.searchAlternative}" />
            <c:choose>
                <c:when test="${i == currentIndex}">
                    <li class="active"><a href="${pageUrl}"><c:out value="${i}" /></a></li>
                </c:when>
                <c:otherwise>
                    <li><a href="${pageUrl}"><c:out value="${i}" /></a></li>
                </c:otherwise>
            </c:choose>
        </c:forEach>
        
        <c:choose>
            <c:when test="${currentIndex == snpchromosome.totalPages}">
                <li class="disabled"><a href="#">&gt;</a></li>
                <li class="disabled"><a href="#">&gt;&gt;</a></li>
            </c:when>
            <c:otherwise>
                <li><a href="${nextUrl}">&gt;</a></li>
                <li><a href="${lastUrl}">&gt;&gt;</a></li>
            </c:otherwise>
        </c:choose>
        
    </ul>
</div>

</c:if>
