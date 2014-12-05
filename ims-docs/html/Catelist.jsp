<%@ page language="java" contentType="text/html; charset=Windows-31J"
	pageEncoding="Windows-31J" import="java.io.*,java.util.*,java.text.*"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8" />
<title>サイト名</title>
<link rel="stylesheet" type="text/css" media="screen" href="style.css" />
<!--[if lt IE 9]>
<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js" type="text/javascript"></script>
<![endif]-->
<title>カテゴリ一覧</title>
</head>
<body>
	<form action="***.java" method="post">
		<br /> <br />
		<%
			request.setCharacterEncoding("utf-8");
				int i=0;
				    ArrayList<String> cate = new ArrayList<String>((ArrayList<String>)request.getAttribute("cate"));
				    for(i=0;i<cate.size();i++){
				    	String scate=cate.get(i);
		%>
		<script type="text/javascript">

		</script>
		<input type="image" formaction="" name="<%=scate%>" class="catebutton"
			value="<%=scate%>">
		<%
			if ((i + 1) % 2 == 0) {
		%><br> <br>
		<%
			}
			}
			if ((i + 1) % 2 == 0) {
		%><br><br> <input type="image" formaction="" name="Newcate" class="catebutton" value="NewCategoly">
		<%
			} else {
		%>
		<input type="image" formaction="" name="Newcate" class="catebutton" value="NewCategoly">
		<%
			}
		%>

	</form>
</body>
</html>