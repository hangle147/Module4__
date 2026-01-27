<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Chuyển đổi tỉ giá</title></head>
<body>
<h1>Chuyển đổi USD sang VND</h1>

<form action="convert" method="post">
    Tỉ giá (VNĐ/USD): <input type="text" name="rate" required /><br/>
    Số tiền (USD): <input type="text" name="usd" required /><br/>
    <input type="submit" value="Chuyển đổi"/>
</form>

<c:choose>
    <c:when test="${not empty vnd}">
        <div class="result">
            <strong>Kết quả:</strong><br/>
                ${usd} USD * ${rate} = <strong>${vnd}</strong> VNĐ
        </div>
    </c:when>
    <c:otherwise>
        <div class="result">
            <em>Vui lòng nhập tỉ giá và số USD để chuyển đổi.</em>
        </div>
    </c:otherwise>
</c:choose>
</body>
</html>