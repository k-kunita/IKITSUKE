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
	</div>

	<!-- main_contents -->
	<div class="container">
			<h1>
				あなただけのIKITSUKEを<br>作りませんか？
			</h1>

			<spring:url value="/login/doLogin" var="action" />
			<form:form modelAttribute="LoginInputForm" action="${action}"
				method="post" class="form-signin">
				<h2 class="form-signin-heading">Please sign in</h2>
				<label for="mailAddress" class="sr-only">Email address</label>
				<form:input path="mailAddress" type="email" class="form-control"
					placeholder="Email address" required="true" autofocus="true" />
				<label for="loginPassword" class="sr-only">Password</label>
				<form:input path="loginPassword" type="password"
					class="form-control" placeholder="Password" required="true" />
				<button class="btn btn-lg btn-primary btn-block" type="submit">Sign
					in</button>

			</form:form>
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
