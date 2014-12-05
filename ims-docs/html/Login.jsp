<%@ page language="java" contentType="text/html; charset=utf-8"%>

<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8" />
<title>ログイン</title>
<link rel="stylesheet" type="text/css" media="screen" href="style.css" />
<link rel="stylesheet" type="text/css" href="Ikitsuke2/Ikitsuke.css">
<!--[if lt IE 9]>
<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js" type="text/javascript"></script>
<![endif]-->
</head>
<body>
	<form action="*******.java" method="post">
		<div class="sample">
			<br /> <br />
			<%-- 入力された内容が間違っています--%>
			<br /> <br />
			<div id="id">
			ID&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;：
				<input class="login" type="text" name="id" maxlength="8" >
			</div>
			<br /> <br />
			<div id="pass">パスワード：
				<input  class="login"type="password" name="pass" maxlength="8">
			</div><br>
			<div class="loginbutton">
				<input class="loginbutton" type="submit" value="ログイン">
			</div>
		</div>
	</form>
</body>
</html>