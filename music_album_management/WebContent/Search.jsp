<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Music App</title>
</head>
<body>
<h1>Search For Album</h1>
<form action="searchAlbum.do" method="post">
Search:<input type="text" name="search"/>
<input type="submit" value="Search"/>
<h3>${message}</h3>
</form>

</body>
</html>