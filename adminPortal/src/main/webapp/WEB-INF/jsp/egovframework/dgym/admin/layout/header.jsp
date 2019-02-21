<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form"	prefix="form"%>

<style>
	a{text-decoration: none; color:#333;}
	#logo{text-align: center;}
	.top_nav{text-align: right;}
</style>

<header>
	<h1 id="logo">대구 청년사회진입활동 관리 포털</h1>
	<div class="top_nav">	
		<a href="<c:url value='/admin/main'/>">포탈 HOME</a> 
		<a href="<c:url value='/admin/login'/>">로그인</a>
		<a href="<c:url value='/admin/aa'/>">tiles테스트</a>
		<a href="void(0);" onclick="return false;" title="로그아웃" id="logout" target="_self">로그아웃</a>
		<a href="<c:url value='/admin/tt'/>">회원가입하기</a>
	</div>
</header>

<form:form id="logoutform" name="logoutform" action="${pageContext.request.contextPath}/admin/logout" method="POST" class="hide">
</form:form>