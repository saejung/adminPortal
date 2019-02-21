<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta id="_csrf" name="_csrf" content="${_csrf.token}" />
	<meta id="_csrf_header" name="_csrf_header" content="${_csrf.headerName}" />
	<title>청년사회진입활동 관리 포털</title>
	<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/board.css'/>" />
	<script type="text/javascript" src="<c:url value='/resources/js/3.3.1/jquery-3.3.1.min.js'/>"></script>
	<script type="text/javascript">   
        $(document).ready(function() {
            $('#logout').click(function() {
            	$('#logoutform').submit();
            	return false;
        	});
        }); 
    </script>
</head>
<body>
	<div id="wrap">
		<div id="header">
			<tiles:insertAttribute name="header" />
		</div>
		<div id="container">
			<div id="left">
				<tiles:insertAttribute name="left" />
			</div>
			<div id="content">
				<tiles:insertAttribute name="content" />
			</div>
		</div>
		<div id="footer">
			<tiles:insertAttribute name="footer" />
		</div>
	</div>
</body>
</html>