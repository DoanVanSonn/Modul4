<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>chuyendoi</title>
</head>
<body>
<form action="/test" method="post">

    Letture <input type="checkbox" value="Letture" name="condiment"><br>

    Tomato<input type="checkbox" value="Tomato" name="condiment" ><br>
    Mustard<input type="checkbox" value="Mustard" name="condiment"><br>

    Sprouts<input type="checkbox" value="Sprouts" name="condiment" ><br>
    <input type="submit" value="save">
</form>
<p> ${str}</p>
</body>
</html>