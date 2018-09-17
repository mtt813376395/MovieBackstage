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
    <title>修改电影信息</title>
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
    <table border="0" width="600px">
      <tr>
        <td align="center" style="font-size:24px; color:#666">修改电影信息</td>
      </tr>
     <tr>
        <td align="right" > 
          <a href="javascript:document.getElementById('saveForm').submit()">保存</a> &nbsp;&nbsp;
          <a href="javascript:history.go(-1)">退回</a>
        </td>
    </tr>
  </table>
<br/>
<s:form action="information_update" method="post" namespace="/" id="saveForm" theme="simple">
<s:hidden name="iid" value="%{model.iid}"/>
   <table border='0' cellpadding="0"  cellspacing="10">
     <tr>
       <td>电影名：</td>
         <td><s:textfield name="iname" value="%{model.iname}"/></td>
         <td>主演：</td>
         <td><s:textfield name="iactor" value="%{model.iactor}"/></td>
    </tr>
    <tr>
     <td>导演：</td>
     <td><s:textfield name="idirect" value="%{model.idirect}"/></td>
     <td>上映时间：</td>
     <td><input type="text" name="itime" value="<s:date name="model.itime" format="yyyy-MM-dd"/>"/></td>
   </tr>
   <tr>
    
     <td>影片简介：</td>
     <td><s:textfield name="idescription" value="%{model.idescription}"/></td>
  </tr>
  </table>
</s:form>
  </body>
</html>
