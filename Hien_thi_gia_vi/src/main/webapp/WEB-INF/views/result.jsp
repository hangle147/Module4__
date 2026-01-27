<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/27/2026
  Time: 8:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Selected Condiments</title>
</head>
<body>
<h1>Your selected: </h1>
<c:choose>
    <c:when test="${not empty condiments}">
        <c:forEach var="c" items="${condiments}" varStatus="loop">
            <c:out value="${c}"/>
            <c:if test="${!loop.last}">, </c:if>
        </c:forEach>
    </c:when>
    <c:otherwise>
        None
    </c:otherwise>
</c:choose>
<br/><br/>
<a href="/">Back</a>
</body>
</html>
