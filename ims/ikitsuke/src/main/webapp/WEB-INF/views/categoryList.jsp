<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

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
<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/jquery-ui.min.css" />" rel="stylesheet">


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
		<h1>カテゴリを編集して行きつけをまとめよう！</h1>
		<div class="detail_contents">
	       <ul>
				<c:forEach var="obj" items="${CategoryOutputForm.shopCategoryList}">
					<li class="category_list">
					<form>
						<input type="button"
							value="<c:out value="${obj.categoryName}"/>"
							onClick="location. href='categoryList/<c:out value="${obj.categoryId}/shopList"/>'"
							id="<c:out value="${obj.categoryId}"/>" class="category_btn">
						<input type="button" value="編集"
							onClick="location. href='categoryList/<c:out value="${obj.categoryId}"/>'"
							id="<c:out value="${obj.categoryId}"/>" class="edit_btn btn btn-warning">
					</form>
					</li>
				</c:forEach>
				
				<li class="category_list">
				<form>
				       <input type="button" value="追加" onClick="location.href='/ikitsuke/categoryList/add'" class="category_btn--add">
				</form>
				 </li>
			</ul>
		</div>
	</div>
	<!-- footer -->
	<footer id="footer">
		<div class="footer_iner">
		<div class="footer_text">
			<small>
				copyright &copy;IKITSUKE.inc All
					Rights Reserved.
			</small>
			</div>
		</div>
	</footer>
</body>
</html>
