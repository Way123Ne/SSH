<%@ page language="java" import="java.util.*" import="com.wayne.domain.User"  pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!-- 引入jstl标签库 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'c_out.jsp' starting page</title>
    
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
  <%
  //out.println("hello,world!");
  //如果域对象中存在相同属性名，c:out优先级是pageContext>request>session>application
  //request.setAttribute("abc3", "你好<a href='www.baidu.com'>baidu</a>");
  //session.setAttribute("abc", "你好2");
  //application.setAttribute("abc", "你好3");
  //pageContext.setAttribute("abc", "你好4");
  
  User u = new User();
  u.setName("xiaosong");
  u.setAge(44);
  request.setAttribute("user1", u);
   %>
  
  <h1>c_out的使用方法</h1>
  <c:out value="hello,world!"></c:out><br>
  <h2>如何输出request/session/application/ pageContext域对象的数据</h1>
  <!-- escapeXML:用于指定是否按照html样式显示,默认true[表示文本] false[表示html形式] -->
  <c:out value="${abc3}" default="没有值" escapeXml="false"></c:out><br>
  <hr>
  <!-- 利用c_out标签输出一个对象 -->
  <h3>利用c_out标签输出一个对象</h3>
  <c:out value="${user1.name}"></c:out>||<c:out value="${user1.age}"></c:out>
  </body>
</html>
