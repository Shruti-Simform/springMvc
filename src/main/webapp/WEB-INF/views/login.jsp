<%@ page language = "java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.io.*"%>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Yahoo From JSP</title>
</head>
<body>
<!-- My First JSP -- name is ${name} and password is ${password} -->
<form action="/login" method="POST">
Name <input type="text" name="name"/>
Password <input type="password" name="password"/><input type = "submit" value="Login"/>
<p><font color = red>${errorMessage}</font</p>
</form>
</body>
</html>