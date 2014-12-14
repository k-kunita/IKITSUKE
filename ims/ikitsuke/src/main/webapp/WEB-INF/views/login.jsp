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
<link href="<c:url value="/resources/css/login.css" />" rel="stylesheet">

</head>
<body>

  <!-- heade -->
  <header>
    <nav>
          <a href="#">
      <ul class="nav_bar">
        <li class="title">
            title
          </a>
        </li>
        </ul>
      </nav>
    </header>

    <!-- main_contents -->
    <div class="main_contents">
    <div class="login_contents">
    <h1>あなただけのIKITSUKEを<br>作りませんか？</h1>
    <spring:url value="/ikitsuke/login/in" var="action" />
    <form id="LoginInputForm" action="${action}" method="post" >
    <ul class="login_id_pass">
      <li><input id="mailAddress" type="text" name="" value="" placeholder="ID" class="login_form"></li>
      <li><input id="loginPassword" type="password" name="" value="" placeholder="PASS" class="login_form"></li>
      <form:input path="mailAddress" />
    </ul>
    <input type="submit" value="ログイン">
    </form>
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
