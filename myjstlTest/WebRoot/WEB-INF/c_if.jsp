<%@ page language="java" import="java.util.*"
	import="com.wayne.domain.Rat" pageEncoding="UTF-8"%>
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
	<h1>c:if的使用</h1>
	request.setAttribute("a","hello");
	<br>
	<%
		request.setAttribute("a", "hello");
		request.setAttribute("age", "23");

		//放入一个老鼠对象
		Rat rat = new Rat();
		rat.setName("小宝");
		rat.setAge(10);
		request.setAttribute("rat1", rat);
	%>

	<h2>判断字符串</h2>
	<c:if test="${a=='hello'}">
   ok!
   </c:if>
	<br>
	<c:if test="${a!='hello' }">
   no ok!
   </c:if>

	<h2>判断数值</h2>
	<c:if test="${age==58}">
   年龄等于58
   </c:if>
	<br>
	<c:if test="${age<58 }">
      年龄小于58
   </c:if>
	<c:if test="${age>10 and age<30 }">
      age>10 and age<30
   </c:if>

	<h2>判断对象的属性</h2>
	<c:if test="${rat1.age<13 }">
   小老鼠的年龄小于13岁
   </c:if>
</body>
</html>
