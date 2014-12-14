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
	<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">

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
    <h1>カテゴリを編集して行きつけをまとめよう！</h1>

    <div class="detail_contents">
      <ul class="category_list">
        <form>
        <li>
          <input type="button" value="Bar" onClick="location. href='detaillist.html'" id="detail_look1" class="category_btn">
          <input type="button" value="編集" id="category_edit" class="edit_btn">
        </li>
        </form>
        <form>
        <li>
          <input type="button" value="手羽次郎手羽次郎手羽" onClick="location. href='detaillist.html'" id="detail_look2" class="category_btn">
          <input type="button" value="編集" id="category_edit" class="edit_btn">
        </li>
        </form>
        <form>
        <li>
          <input type="button" value="カフェ" onClick="location. href='detaillist.html'" id="detail_look3" class="category_btn">
          <input type="button" value="編集" id="category_edit" class="edit_btn">
        </li>
        </form>
        <form>
        <li>
          <input type="button" value="デートに使える" onClick="location. href='detaillist.html'" id="detail_look4" class="category_btn">
          <input type="button" value="編集" id="category_edit" class="edit_btn">
        </li>
        </form>
      </ul>

      <ul class="category_list">
        <form>
        <li>
          <input type="button" value="Bar" onClick="location. href='detaillist.html'" id="detail_look5" class="category_btn">
          <input type="button" value="編集" id="category_edit" class="edit_btn">
        </li>
        </form>
        <form>
        <li>
          <input type="button" value="手羽次郎手羽次郎手羽" onClick="location. href='detaillist.html'" id="detail_look6" class="category_btn">
          <input type="button" value="編集" id="category_edit" class="edit_btn">
        </li>
        </form>
        <form>
        <li>
          <input type="button" value="カフェ" onClick="location. href='detaillist.html'" id="detail_look7" class="category_btn">
          <input type="button" value="編集" id="category_edit" class="edit_btn">
        </li>
        </form>
        <form>
        <li>
          <input type="button" value="デートに使える" onClick="location. href='detaillist.html'" id="detail_look8" class="category_btn">
          <input type="button" value="編集" id="category_edit" class="edit_btn">
        </li>
        </form>
      </ul>
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
