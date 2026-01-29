<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Máy tính</title>
</head>
<body>
<h1><b>Máy tính</b></h1>
<form action="calculate" method="post">
    <input type="text" name="num1" placeholder="Nhập số"/>
    <input type="text" name="num2" placeholder="Nhập số"/><br><br>

    <button type="submit" name="operation" value="add">Addition(+)</button>
    <button type="submit" name="operation" value="sub">Subtraction(-)</button>
    <button type="submit" name="operation" value="mul">Multiplication(X)</button>
    <button type="submit" name="operation" value="div">Division(/)</button>
</form>

<h2>${result}</h2>
</body>
</html>