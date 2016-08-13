<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>request post 中文乱码</title>
</head>
<body>

<form action="RequestServlet" method= "post">
	用户名：<input type="text" name="username" />
	<input type="submit" value="post提交方式">

</form>
</body>
</html>