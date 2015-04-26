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
<link href="<c:url value="/resources/css/detaillist.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/jquery-ui.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery.js" />"></script>
<script src="<c:url value="/resources/js/jquery-ui.min.js" />"></script>
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
		<div class="cf">
			<h1>${ShopEditOutputForm.categoryName}のIKITSUKE一覧</h1>
			<input type="button" value="追加" onClick="location. href='shopAdd'"
				class="add_ikitsuke_btn btn btn-warning">
		</div>


		<c:forEach var="obj" items="${ShopEditOutputForm.shopInfoList}">
			<div class="col-sm-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							<c:out value="${obj.shopName}" />
						</h3>
					</div>
					<div class="panel-body">
						<table>
							<tbody>
								<tr>
									<th class="title-area" >TEL</th>
									<td class="text-area"><c:out value="${obj.shopTel}" /></td>
								</tr>
								<tr>
									<th class="title-area">Memo</th>
									<td class="text-area"><c:out value="${obj.shopMemo}" /></td>
								</tr>
							</tbody>
						</table>
					</div>
					<div class="panel-body">
						<input type="button" value="編集"
							onClick="location.href='shopDetail/<c:out value="${obj.shopId}"/>'"
							class="edit_ikitsuke_btn btn btn-warning">
					</div>
				</div>
			</div>
		</c:forEach>
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
