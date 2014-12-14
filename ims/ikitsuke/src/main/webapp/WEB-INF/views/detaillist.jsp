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
	<link href="<c:url value="/resources/css/index.css" />" rel="stylesheet">
	<link href="<c:url value="/resources/css/detaillist.css" />" rel="stylesheet">
	<link href="<c:url value="/resources/css/jquery-ui.min.css" />" rel="stylesheet">
	<link href="<c:url value="/resources/css/reset.css" />" rel="stylesheet">
	<script src="<c:url value="/resources/js/jquery.js" />"></script>
	<script src="<c:url value="/resources/js/jquery-ui.min.js" />"></script>
</head>
<body>

  <!-- heade -->
  <header>
    <nav>
      <ul class="nav_bar">
        <li class="title">
          <a href="#">
            title
          </a>
        </li>
        <li>
          <a href="main.html">
            Home</a>
          </li>
          <li>
           <a href="login.html">
             Logout
           </a>
         </li>
        </ul>
      </nav>
    </header>

    <!-- main_contents -->
    <div class="main_contents">
      <div class="cf">
    <h1>○○のIKITSUKE一覧</h1>
    <input type="button" value="追加" onClick="location.href='detailedit.html'" class="add_ikitsuke_btn">
    </div>

    <div class="detalist_contents">
    <div class="ikitsuke_list">
    <ul class="detail_list">
      <li>手羽次郎</li>
      <li>03-3464-5745</li>
      <li>memo</li>
      <li><input type="button" value="編集" onClick="location.href='edit_detailedit.html'" class="edit_ikitsuke_btn"></li>
    </ul>
    </div>

    <div class="ikitsuke_list_grp">
    <div class="ikitsuke_list">
    <ul class="detail_list">
      <li>手羽次郎</li>
      <li>03-3464-5745</li>
      <li>memo</li>
      <li><input type="button" value="編集" onClick="location.href='edit_detailedit.html'" class="edit_ikitsuke_btn"></li>
    </ul>
    </div>

    <div class="ikitsuke_list">
    <ul class="detail_list">
      <li>手羽次郎</li>
      <li>03-3464-5745</li>
      <li>memo</li>
      <li><input type="button" value="編集" onClick="location.href='edit_detailedit.html'" class="edit_ikitsuke_btn"></li>
    </ul>
    </div>
  </div>
  </div>
</div>

    <!-- footer -->
    <footer id="footer">
      <div class="footer_iner">
        <small>
          <div class="footer_text">copyright &copy;IKITSUKE.inc All Rights Reserved. </div></small>
      </div>
    </footer>
  </body>
  </html>
