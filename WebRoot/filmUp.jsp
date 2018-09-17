<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>影片上传</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
.div1{ margin-top:5px; margin-left:30px; font-size:23px; color:blue}
</style>
  </head>
  
  <body>
    <p class="div1">影片上传</p> 
    <hr/>
    <s:form action="upLoad" enctype="multipart/form-data" method="post">
       <s:textfield name="title" label="影片名"/><br/>
       <s:file name="upload" label="选择影片"/><br/>
       <s:submit value="上传"/>
    </s:form>
  </body>
</html>
