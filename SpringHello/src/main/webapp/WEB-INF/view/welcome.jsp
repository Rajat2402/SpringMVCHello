<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
I am welcome file.
<form action= "<%= request.getContextPath() %>/displayName" method="get">
<input type="text" name="firstName">
<input type="submit" value="Submit">
</form>
</body>
</html>