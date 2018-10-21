<%@ page language="java" import="java.util.*"
	import="com.yourcompany.struts.domain.Fish" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'logic.jsp' starting page</title>

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
	<h2>logic标签的使用</h2>
	<%
		Fish f1 = new Fish();
		f1.setName("xiao1");
		f1.setAge(3);
		Fish f2 = new Fish();
		f2.setName("xiao3");
		f2.setAge(5);
		Fish f3 = new Fish();
		f3.setName("xiao5");
		f3.setAge(7);

		ArrayList<Fish> al = new ArrayList<Fish>();
		al.add(f1);
		al.add(f2);
		al.add(f3);

		request.setAttribute("fishs", al);
	%>
	<logic:iterate id="myfish" name="fishs">
   ${myfish.name}||${myfish.age}
   <!--<bean:write name="myfish" property="name"/>
     <bean:write name="myfish" property="age"/><br>-->
	</logic:iterate>
	<br>
	
	<logic:empty name="ee">
   ee属性不存在
   </logic:empty>
	<br>
	<logic:notEmpty name="fishs">
   ee属性存在
   </logic:notEmpty>
   
	<h2>logic:greaterThan属性可以判断大小</h2>
	<logic:iterate id="myfish" name="fishs">
	<logic:greaterThan name="myfish" value="4" property="age">
	<bean:write name="myfish" property="name"/>年龄大于4岁<br>
	</logic:greaterThan>
	</logic:iterate>

</body>
</html>
