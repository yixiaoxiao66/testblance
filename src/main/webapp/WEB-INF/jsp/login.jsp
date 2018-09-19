<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<script type="text/javascript">
</script>
</head>
<body>
	<h1>系统欢迎你</h1>
	
	<form action="${pageContext.request.contextPath }/login.do" method="post" >
		<table>
			<tr>
				<td>账号: </td>
				<td><input name="uname" type="text" placeholder="请输入账号" ></td>
			</tr>
			<tr>
				<td>密码: </td>
				<td><input name="passwd" type="password" placeholder="请输入密码" ></td>
			</tr>
			<tr>
				<td colspan="2" ><input type="submit" value="登录" > </td>
			</tr>
		</table>
	</form>
	<br/>
	<br/>
	<div style="color: #F00; " >
	${msg }
	</div>
</body>
</html>