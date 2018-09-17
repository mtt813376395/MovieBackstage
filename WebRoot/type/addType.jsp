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
    <title>添加电影类别</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  
  <body>
    <table border="0" width="600px">
     <tr>
       <td align="center" style="font-size:27px; color:#666">添加电影类别</td>
     </tr>
     <tr>
      <td align="right"> 
       <a href="javascript:document.getElementById('saveForm').submit()">保存</a> &nbsp;&nbsp;
       <a href="javascript:history.go(-1)">退回 </a>
      </td>
    </tr>
  </table>
   <br/>
   <br/><br/>
   <s:form id="saveForm" action="type_save" method="post" namespace="/" theme="simple">
    <table>
    <tr>
      <td style="font-size:18px">请输入新增的电影类别：</td>
      <td><s:textfield name="tmovietype" cssStyle="height:30px"/></td>
      
    </tr>
    <tr>
      <td style="font-size:18px">类别英文名：</td>
      <td><s:textfield name="tenglish" cssStyle="height:30px"/></td>
    </tr>
</table>
</s:form>
  </body>
</html>