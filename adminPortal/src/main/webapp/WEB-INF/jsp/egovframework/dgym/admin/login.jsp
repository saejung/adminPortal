<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="_csrf" content="${_csrf.token}" />
	<meta name="_csrf_header" content="${_csrf.headerName}" />
	<title>로그인</title>
</head>
<body>
	<div id="login_wrap">
		<h2>로그인</h2>
		<form method="POST" action="<c:url value='/admin/loginProcess'/>">
			<input type="text" name="userId" id="userId" /> 
			<input type="password" name="userPwd" id="userPwd" /> 
			<input type="button" value="로그인" onclick="goLogin();return false;">
		</form>
	</div>
</body>
</html>
