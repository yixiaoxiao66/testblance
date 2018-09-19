<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>
<body>
	这是首页
	
	
	<hr>
	
	欢迎<b> [${sessionScope.uname }] </b>登录诗系统
	<br/>
	<br/>
	&nbsp;&nbsp;这个世界不只有眼前的苟且，还有诗与远方。
	<br/>
	<br/>
	<hr/>
	
	<a href="${pageContext.request.contextPath }/logout.do" >退出登录</a>
</body>
</html>