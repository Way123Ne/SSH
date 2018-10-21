<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'html.jsp' starting page</title>
    
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
  <html:button property="mybutton1" value="提交"></html:button><br>
	<a href="http://www.baidu.com">go to baidu website</a><br>
	<!-- image实际上是一个图片按钮,img是一个图片 -->
	<html:image src="images/image.jpg"></html:image>
	<img alt="" src="images/image.jpg"><br>
	
	<html:form action="/login.do" method="post">
	<html:text property="name"></html:text>
	<html:checkbox property="fruit" value="apple">apple</html:checkbox>
	</html:form>
  </body>
</html>
