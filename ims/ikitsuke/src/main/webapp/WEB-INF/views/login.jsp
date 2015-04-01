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
			<a href="#">
					<li class="title">title</li>
			</a>
				</ul>
		</nav>
	</header>

	<div>
		<c:out value="${unko}"></c:out>
	</div>

	<!-- main_contents -->
	<div class="main_contents">
		<div class="login_contents">
			<h1>
				あなただけのIKITSUKEを<br>作りませんか？
			</h1>

			<spring:url value="/login/doLogin" var="action" />
			<form:form modelAttribute="LoginInputForm" action="${action}"
				method="post" class="login_id_pass">
				<h2 class="form-signin-heading">Please sign in</h2>
				<ul class="login_id_pass">
				<label for="mailAddress" class="sr-only">Email address</label>
				<li>
				<form:input path="mailAddress" type="email" class="login_form"
					placeholder="Email address" required="true" autofocus="true" />
				</li>
				<label for="loginPassword" class="sr-only">Password</label>
				<li>
				<form:input path="loginPassword" type="password" class="login_form"
					placeholder="Password" required="true" />
				</li>
				</ul>
				<button class="login_btn btn btn-warning" type="submit">Sign
					in</button>

			</form:form>
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
