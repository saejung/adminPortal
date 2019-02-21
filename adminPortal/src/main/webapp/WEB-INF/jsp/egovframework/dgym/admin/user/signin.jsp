<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>

<h2>회원가입</h2>
<form action='<c:url value="admin/user/insertUser"/>' method="post">
	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
	<input type="text" name="userId" id="userId" /> 
	<input type="password" name="userPwd" id="userPwd" /> 
	<input type="text" name="userNm" id="userNm"/>
	<select name="authority">
		<option value="ROLE_USER">사용자</option>
		<option value="ROLE_ADMIN">관리자</option>
	</select> 
	<input type="submit" value="회원가입">
</form>
