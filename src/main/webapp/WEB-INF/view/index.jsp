<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>smart-framework</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>id</th>
			<th>name</th>
			<th>sex</th>
			<th>year</th>
		</tr>
		<c:forEach items="${students}" var="a">
			<tr align="center">
				<td>${a.id}</td>
				<td>${a.name}</td>
				<td>${a.sex}</td>
				<td>${a.year}</td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>