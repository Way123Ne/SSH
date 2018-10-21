<%@ page language="java" import="java.util.*" import="com.yourcompany.struts.domain.Bird" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'bean.jsp' starting page</title>
    
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
	<h2>bean标签的使用</h2>
  <%
  		//模拟代码，以下代码将来在控制器中写
  		request.setAttribute("abc", "hello world!");
  		
  		Bird bd = new Bird();
  		bd.setName("little red");
  		bd.setAge(2);
  		request.setAttribute("bird2", bd);
  		
   %>
   <h3>bean:write标签的使用</h3>
   <!--bean:write用来输出信息-->
   <bean:write name="abc"/><br>
   <bean:write name="bird2" property="name"/><br>
    <bean:write name="bird2" property="age"/>
    
    <h3>bean:message标签的使用</h3>
    <bean:message key="key1" arg0="john"/><br>
     <bean:message key="err1" arg0="username is not right" arg1="password is not right"/><br>
    
  </body>
</html>
