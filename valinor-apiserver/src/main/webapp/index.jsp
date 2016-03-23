<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page session="false"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>Valinor Server</title>
  </head>
  
  <body>
	<h1>Valinor server started.</h1>
  </body>
</html>
