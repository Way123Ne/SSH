<%@ page language="java" import="java.util.*"
	import="com.wayne.domain.Cat" pageEncoding="UTF-8"%>
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
	<h1>c:foreach迭代标签</h1>
	<%
		ArrayList<Cat> al = new ArrayList<Cat>();

		Cat cat1 = new Cat();
		cat1.setName("小米");
		cat1.setAge(3);

		Cat cat2 = new Cat();
		cat2.setName("小咪");
		cat2.setAge(2);

		Cat cat3 = new Cat();
		cat3.setName("小崽");
		cat3.setAge(1);

		//放入到al
		al.add(cat1);
		al.add(cat2);
		al.add(cat3);
		request.setAttribute("allcats", al);
	%>

	<%
		ArrayList<Cat> al2 = (ArrayList<Cat>) request
				.getAttribute("allcats");
		//传统遍历
		for (Cat cat : al2) {
			out.println(cat.getName() + " " + cat.getAge());
		}
	%>

	<h2>c:foreach迭代标签迭代集合中的对象</h2>
	<!-- ${allcats}表示 域对象的哪个属性(一般是一个集合) var cat表示取出的一个具体对象 -->
	<c:forEach items="${allcats }" var="cat">
		<c:out value="${cat.name }"></c:out>
		<c:out value="${cat.age }"></c:out>
	</c:forEach>

	<h2>c:foreach迭代标签迭代数值</h2>
	<c:forEach var="i" begin="1" end="10">
		<c:out value="${i }"></c:out>-->
    
    </c:forEach>
    
    <h2>c:foreach迭代标签迭代数值2</h2>
	<c:forEach var="i" begin="1" end="10" step="2">
		<c:out value="${i }"></c:out>-->
    
    </c:forEach>
</body>
</html>
