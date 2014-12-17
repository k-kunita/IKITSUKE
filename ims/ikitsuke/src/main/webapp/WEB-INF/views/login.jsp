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

    <div>
    	<c:out value="${unko}"></c:out>
    </div>

    <!-- main_contents -->
    <div class="main_contents">
    <div class="login_contents">
    <h1>あなただけのIKITSUKEを<br>作りませんか？</h1>
    <spring:url value="/login/doLogin" var="action" />
    <form:form modelAttribute="LoginInputForm" action="${action}" method="post" >
    <ul class="login_id_pass">
      <li><form:input path="mailAddress" type="text" value="" placeholder="ID" class="login_form" /></li>
      <li><form:input path="loginPassword" type="password" value="" placeholder="PASS" class="login_form" /></li>
    </ul>
    <input type="submit" value="ログイン">
    </form:form>
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
