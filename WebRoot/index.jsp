<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title><s:text name="登录"></s:text></title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body style="background: url(images/back.jpg)">
    <br/><br/><br/><br/>
    <h3 align="center">欢迎登录</h3>
  
    <s:form action="login" method="post" namespace="/">
    <h4 align="center"><s:actionerror/></h4>
      <table border="1" align="center">
         <tr>
           <td>
             <s:textfield name="username" label="用户姓名"/>
           </td>
         </tr>
         <tr>
           <td>
             <s:password name="password" label="用户密码"/>
           </td>
         </tr>
         <tr>
           <td colspan="2" align="center">
              <s:submit value="登录"/>
           </td>
         </tr>
      </table>
    </s:form>
  </body>
</html>
