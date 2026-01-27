<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/27/2026
  Time: 7:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Kết quả tra cứu</title>
</head>
<body>
<div class="container">
    <h2>Kết quả tra cứu</h2>

    <c:if test="${not empty vietnamese}">
        <div class="success">
            <strong>${english}</strong> → ${vietnamese}
        </div>
    </c:if>

    <c:if test="${notFound}">
        <div class="error">
            Không tìm thấy từ "<strong>${searchWord}</strong>".
        </div>
    </c:if>

    <br>
    <a href="/">Quay lại</a>
</div>
</body>
</html>
