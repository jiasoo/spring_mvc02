<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>결과보기</h1>
	<h2>이름 : ${name}</h2>
	<h2>나이 : ${age}</h2>
	<h2>주소 : ${addr}</h2>
	<hr>
	<h1>View/admin/output.jsp</h1>
	<c:forEach var="k" items="${dongName }">
		<li>${k}</li>
	</c:forEach>

</body>
</html>