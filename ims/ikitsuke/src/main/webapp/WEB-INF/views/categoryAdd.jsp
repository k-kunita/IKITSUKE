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
<link href="<c:url value="/resources/bootstrap/css/bootstrap-theme.min.css" />" rel="stylesheet">
<link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/index.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/detailedit.css" />"
	rel="stylesheet">
</head>
<body>

	<!-- heade -->
	<header>
		<nav>
			<ul class="nav_bar">
				<li class="title"><a href="#"> IKITSUKE </a></li>
				<li><a href="/ikitsuke/categoryList"> Home</a></li>
				<li><a href="/ikitsuke/logout"> Logout </a></li>
			</ul>
		</nav>
	</header>

	<!-- main_contents -->
	<div class="main_contents">
		<h1>カテゴリを追加しよう！</h1>
		<spring:url value="add/doAdd" var="action" />
		<form:form modelAttribute="CatetgoryAddInputForm" action="${action}" method="post">
			<div class="detail_edit_contents l-category_edit">
				<dl class="detailedit_list">
					<dt>カテゴリ名</dt>
					<dd>
						<form:input path="categoryName" type="text" maxlength="15" value="" class="detailedit_form" />
					</dd>
				</dl>

				<!-- 削除はゴミ箱アイコンにしたい。。。 -->
				<div class="detailedit_btn_group l-categoryDetail__BtnArea">
					<input type="submit" value="保存" class="detailedit_btn btn btn-warning">
					<input type="button" value="キャンセル" onClick="location.href='/ikitsuke/categoryList'"
					class="detailedit_btn cancel_btn btn btn-warning">
				</div>
			</div>
			</form:form>
	</div>

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
