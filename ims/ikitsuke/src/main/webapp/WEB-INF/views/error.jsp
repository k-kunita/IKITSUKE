<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang=ja>
<head>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width">
<title>IKITSUKE</title>

<link href="<c:url value="/resources/css/reset.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/index.css" />" rel="stylesheet">
<link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet">
<link href="<c:url value="/resources/bootstrap/css/signin.css" />" rel="stylesheet">


</head>
<body>
	<!-- heade -->
	<header>
		<nav>
			<a href="#">
				<ul class="nav_bar">
					<li class="title">title
				</ul>
			</a>
		</nav>
	</header>

	<div>
		<c:out value="${unko}"></c:out>
		
	<c:forEach var="msg" items="${errorMessageForm.errorMessageList}" varStatus="status">
	　　項目：<c:out value="${msg.errorItem}"/><br>
	　　メッセージ：<c:out value="${msg.errorMessage}"/><br>
	</c:forEach>
	</div>

	<!-- main_contents -->
	
	error page
	
	<!-- /container -->
	<!-- footer -->
	<footer id="footer">
		<div class="footer_iner">
			<small>
				<div class="footer_text">copyright &copy;IKITSUKE.inc All
					Rights Reserved.</div>
			</small>
		</div>
	</footer>
</body>
</html>
