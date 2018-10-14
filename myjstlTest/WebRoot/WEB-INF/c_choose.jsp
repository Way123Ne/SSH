<%@ page language="java" import="java.util.*"
	import="com.wayne.domain.Dog" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!-- 引入jstl标签库 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'c_if.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<h1>c:choose的使用</h1>
	<br>
	<%
		//放入一个老鼠对象
		Dog dg = new Dog();
		dg.setName("大黄");
		dg.setAge(5);
		request.setAttribute("dg1", dg);
	%>
	<c:choose>
		<c:when test="${dg1.age>10 }">
	大黄狗年龄很小，不能吃
	</c:when>
		<c:when test="${dg1.age>3 and dg1.age<8 }">
	大黄狗年龄合适，可以吃
	</c:when>
	<c:otherwise>
	大黄狗年龄很老，不好吃
	</c:otherwise>
	</c:choose>

</body>
</html>
