<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>${success}</h3>
<h3>${failure}</h3>
<form action="delete" method="post">
id<input type="text" name="id">
<button type="submit">Delete</button>
</form>
</body>
</html>