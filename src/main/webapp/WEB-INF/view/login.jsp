<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	String path=request.getContextPath();
%>    

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath() %>/resoures/css/index_work.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath() %>/resoures/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/resoures/js/jquery.form.js"></script>
<script type="text/javascript" src="js/jquery.validate.js"></script>
</head>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Jekyll v3.8.6">
   
<title>注册</title>
	<link href="/resources/css/bootstrap-4.3.1/css/signin.css" rel="canonical">

	<link href="/resources/css/bootstrap-4.3.1/css/bootstrap.css" rel="stylesheet">
	<script type="text/javascript" src="/resources/js/jquery-3.2.1/jquery.js"></script>
	<script type="text/javascript" src="/resources/js/jqueryvalidate/jquery.validate.js"></script>
	<script type="text/javascript" src="/resources/js/jqueryvalidate/localization/messages_zh.js"></script>
	
	<link href="/resources/css/bootstrap-4.3.1/css/signin.css" rel="stylesheet">
	<style >
		.error{
			color:#ff0000;
		}
	
	
	</style>
</head>
<body class="text-center">
	<%-- <form action="/user/register" method="post" name = "formRegister">
		<input type = "text" name = "username">
		<input type = "text" name = "password">
		<input type = "submit" value = "提交">
	</form> --%>

	<f:form class="form-signin" action="/user/login" method="post" name = "formRegister" modelAttribute="user">
		<img class="mb-4" src="/resources/js/images/logo.png" alt="无法显示图片" width="72" height="72">
		  <h1 class="h3 mb-3 font-weight-normal">登录</h1>
		 
		 <f:input path="username" class="form-control" ></f:input>
		 <f:errors path = "username"></f:errors>
		 <f:input path="password" class="form-control"/>
		 <f:errors path = "password"></f:errors>
		  <button class="btn btn-lg btn-primary btn-block" type="submit">注册</button>
		  
		  <p class="mt-5 mb-3 text-muted">© 2017-2020</p>
		  <p><a href="/user/toRegister">去注册</a></p>
	</f:form>

	 
	<script type="text/javascript">
		
	</script>


</body>
</html>
	

