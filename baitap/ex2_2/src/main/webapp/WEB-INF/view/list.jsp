<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>chuyendoi</title>
</head>
<body>
<form action="/test" method="post">
    Number1 <input type="text"  name="num1" value="${n1}">
    Number2 <input type="text"  name="num2" value="${n2}"><br>

    Addition(+) <input type="submit" value="cong" name="toantu">

    Subtraction(-)<input type="submit" value="tru" name="toantu" >
    Multiplication(*)<input type="submit" value="nhan" name="toantu">

    Division(/)<input type="submit" value="chia" name="toantu" >
</form>
<p> ${a}</p>
</body>
</html>