<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css"
		href="${pageContext.request.contextPath}/resources/css/main.css">

<title>Insert title here</title>
</head>
<body>
	<form method="get" action="${pageContext.request.contextPath}/docreate">
		<table class="formtable">
			<tr>
				<td class="label">Name: </td>
				<td><input class="control" name="name" type="text"/></td>
			</tr>
			<tr>
				<td class="label">Email: </td>
				<td><input class="control" name="email" type="text"/></td>
			</tr>
			<tr>
				<td class="label">Text: </td>
				<td><textarea class="control" name="text" rows="10" cols="10"></textarea></td>
			</tr>
			<tr>
				<td class="label"></td>
				<td><input class="control" value="Create offer" type="submit"/></td>
			</tr>
		</table>
	</form>
</body>
</html>