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
	<link href="<c:url value="/resources/css/detailedit.css" />" rel="stylesheet">
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
      <h1>行きつけのお店を編集しよう！</h1>
      <form>
      <div class="detail_edit_contents">
      <dl class="detailedit_list">
        <dt>カテゴリ名</dt>
        <dd>Bar</dd>
        <dt>店舗名</dt>
        <dd><input type="text" maxlength="15" class="detailedit_form"></dd>
        <dt>電話番号</dt>
        <dd><input type="text" maxlength="11" class="detailedit_form"></dd>
        <dt>URL</dt>
        <dd><input type="text" maxlength="2083" class="detailedit_form"></dd>
        <dt>備考</dt>
        <dd><input type="textarea" maxlength="500" class="detailedit_form addcoment_form"></dd>
      </dl>

      <!-- 削除はゴミ箱アイコンにしたい。。。 -->
      <div class="detailedit_btn_group">
        <input type="button" value="削除" id="" class="detailedit_btn delete_btn">
        <input type="button" value="保存" id="" class="detailedit_btn">
        <input type="button" value="キャンセル" id="" class="detailedit_btn">
      </div>
      </div>
      </form>
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