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
<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">

<link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet">
<link href="<c:url value="/resources/bootstrap/css/bootstrap-theme.min.css" />" rel="stylesheet">


</head>
<body>

	<!-- heade -->
	<header>
		<nav>
			<ul class="nav_bar">
				<li class="title"><a href="#"> title </a></li>
				<li><a href="/ikitsuke/categoryList"> Home</a></li>
				<li><a href="/ikitsuke/logout">Logout</a></li>
			</ul>
		</nav>
	</header>

	<!-- main_contents -->
	<div class="main_contents">
		<h1>カテゴリを編集して行きつけをまとめよう！</h1>
		<div class="detail_contents">
		
			<spring:url value="/categoryList/rename" var="action" />
			<form:form modelAttribute="CategoryInputForm" action="${action}" method="post" class="form-signin">
				<h2 class="form-signin-heading">カテゴリ名変更テスト</h2>
				<label for="categoryId" class="sr-only">CategoryId</label>
				<form:input path="categoryId" type="text" class="form-control" placeholder="category id" required="true" autofocus="true" />
				<label for="categoryName" class="sr-only">CategoryName</label>
				<form:input path="categoryName" type="text" class="form-control" placeholder="category name" required="true" />
				<button class="btn btn-lg btn-primary btn-block" type="submit">カテゴリ名更新</button>
			</form:form>
		
			<spring:url value="/categoryList/delete" var="action" />
			<form:form modelAttribute="CategoryInputForm" action="${action}" method="post" class="form-signin">
				<h2 class="form-signin-heading">カテゴリ削除テスト</h2>
				<label for="categoryId" class="sr-only">CategoryId</label>
				<form:input path="categoryId" type="text" class="form-control" placeholder="category id" required="true" autofocus="true" />
				<button class="btn btn-lg btn-primary btn-block" type="submit">カテゴリ削除</button>
			</form:form>
		
				<c:forEach var="obj" items="${CategoryOutputForm.shopCategoryList}">
					<form>
						<input type="button"
							value="<c:out value="${obj.categoryName}"/>"
							onClick="location. href='categoryList/<c:out value="${obj.categoryId}/shopList"/>'"
							id="<c:out value="${obj.categoryId}"/>" class="btn btn-lg btn-default">
							 <input type="button" value="編集" id="category_edit" class="btn btn-xs btn-default">
					</form>
				</c:forEach>
		</div>
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
