<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${r }
	<form action="student.reg">
		이름: <input name="s_name"><p>
		별명: <input name="s_nickname"><p>
		<button>등록</button>
	</form>
	<c:forEach var="s" items="${sList }">
	    ${s.s_name } - ${s.s_nickname }<p>
	</c:forEach>
	<hr>
</body>
</html>