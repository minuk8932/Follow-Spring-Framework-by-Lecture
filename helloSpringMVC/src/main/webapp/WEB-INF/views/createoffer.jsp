<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sform" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css"
		href="${pageContext.request.contextPath}/resources/css/main.css">

<title>Insert title here</title>
</head>
<body>
	<sform:form method="get" action="${pageContext.request.contextPath}/docreate" modelAttribute="offer">
		<table class="formtable">
			<tr>
				<td class="label">Name: </td>
				<td><sform:input class="control" path="name" type="text"/><br>
				<sform:errors cssClass="error" path="name"></sform:errors>
				</td>
			</tr>
			<tr>
				<td class="label">Email: </td>
				<td><sform:input class="control" path="email" type="text"/><br>
				<sform:errors cssClass="error" path="email"></sform:errors>
				</td>
			</tr>
			<tr>
				<td class="label">Text: </td>
				<td><sform:textarea class="control" path="text" rows="10" cols="10"></sform:textarea><br>
				<sform:errors cssClass="error" path="text"></sform:errors>
				</td>
			</tr>
			<tr>
				<td class="label"></td>
				<td><input class="control" value="Create offer" type="submit"/></td>
			</tr>
		</table>
	</sform:form>
</body>
</html>