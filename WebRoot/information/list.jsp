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
    <title>电影信息列表</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
        .table1{
            border:1px solid #ddd;
            width:900px;
            
        }
        thead{
            background-color:lightblue;
        }

    </style>
  </head>
  
  <body>
    <table border="0" width="900px">
<tr>
<td align="center" style="font-size:24px; color:#666">影片管理</td>
</tr>
<tr>
<td align="right" > <a href="${pageContext.request.contextPath}/information_saveUI.action">添加</a></td>
</tr>
</table>
<br/>
<table cellspacing="0" border="1" class="table1">
<thead>
<tr>
<td align="center">电影名</td>
<td align="center">主演</td>
<td align="center">导演</td>
<td align="center">上映时间</td>

<td align="center">影片简介</td>
<td align="center">编辑</td>
<td align="center">删除</td>
</tr>
</thead>
<s:iterator value="list" var="i">
<tbody>
<tr>
<td align="center"><s:property value="#i.iname"/></td>
<td align="center"><s:property value="#i.iactor"/></td>
<td align="center"><s:property value="#i.idirect"/></td>
<td align="center"><s:date name="#i.itime" format="yyyy-MM-dd"/></td>

<td align="center"><s:property value="#i.idescription"/></td>
<td align="center"><a href="${pageContext.request.contextPath}/information_edit.action?iid=<s:property value="#i.iid"/>"><img src="${pageContext.request.contextPath}/images/modify.png"></a></td>
<td align="center"><a href="${pageContext.request.contextPath}/information_delete.action?iid=<s:property value="#i.iid"/>"><img src="${pageContext.request.contextPath}/images/delete.png"></a></td>
</tr>
</tbody>
</s:iterator>
</table>
<br/>

<table border="0" cellspacing="0" cellpadding="0"  width="900px">
<tr>
<td align="right">
   <span>第<s:property value="currPage"/>/<s:property value="totalPage"/>页</span>&nbsp;&nbsp;
   <span>总记录数：<s:property value="totalCount"/>&nbsp;&nbsp;每页显示：<s:property value="pageSize"/></span>&nbsp;&nbsp;
   <span>
   <s:if test="currPage!=1">
       <a href="${pageContext.request.contextPath}/information_findAll.action?currPage=1">[首页]</a>&nbsp;&nbsp;
       <a href="${pageContext.request.contextPath}/information_findAll.action?currPage=<s:property value="currPage-1"/>">[上一页]</a>&nbsp;&nbsp;
   </s:if>
   <s:if test="currPage!=totalPage">
       <a href="${pageContext.request.contextPath}/information_findAll.action?currPage=<s:property value="currPage+1"/>">[下一页]</a>&nbsp;&nbsp;
       <a href="${pageContext.request.contextPath}/information_findAll.action?currPage=<s:property value="totalPage"/>">[尾页]</a>&nbsp;&nbsp;
   </s:if>
   </span>
</td>
</tr>
</table>
  </body>
</html>
