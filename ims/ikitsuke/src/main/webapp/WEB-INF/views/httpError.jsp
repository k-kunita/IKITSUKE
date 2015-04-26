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
<link href="<c:url value="/resources/bootstrap/css/bootstrap-theme.min.css" /> "rel="stylesheet">
<link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" /> "rel="stylesheet">
<link href="<c:url value="/resources/css/index.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/login.css" />" rel="stylesheet">


</head>
<body>
	<!-- header -->
	<header>
		<nav>
				<ul class="nav_bar">
					<li class="title"><a href="#"> IKITSUKE </a></li>
				</ul>
		</nav>
	</header>

	<!-- main_contents -->
	<div class="main_contents">
		<h1><%= request.getParameter("status") %></h1>
		<div>
			<input type="button" value="HOME画面へ戻る" onClick="location.href='/ikitsuke/categoryList'" class="detailedit_btn cancel_btn btn btn-warning">
		</div>
	</div>
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
