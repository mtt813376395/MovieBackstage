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
    <title>类别清单</title>
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
         <td align="center" style="font-size:24px; color:#666"> 影片类别</td>
       </tr>
       <tr>
         <td align="right"><a href="${pageContext.request.contextPath}/type_saveUI.action">添加</a></td>
       </tr>
    </table>
    <br/>
     <table cellspacing="0" border="1" class="table1">
        <thead>
          <tr>
              <th width="5%" align="center">类别中文名</th>
              <th width="5%" align="center">类别英文名</th>
              <th width="3%" align="center">编辑</th>
              <th width="3%" align="center">删除</th>
          </tr>
        </thead>
        <s:iterator value="list" var="d">
        <tr>
          <td align="center"><s:property value="#d.tmovietype"/></td>
          <td align="center"><s:property value="#d.tenglish"/></td>
          <td width="2%" align="center"><a href="${pageContext.request.contextPath}/type_edit.action?tid=<s:property value="#d.tid"/>"><img src="${pageContext.request.contextPath}/images/modify.png" class="img"/></a>
          <td width="2%" align="center"><a href="${pageContext.request.contextPath}/type_delete.action?tid=<s:property value="#d.tid"/>"><img src="${pageContext.request.contextPath}/images/delete.png" class="img"/></a>
        </tr>
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
       <a href="${pageContext.request.contextPath}/type_findAll.action?currPage=1">[首页]</a>&nbsp;&nbsp;
       <a href="${pageContext.request.contextPath}/type_findAll.action?currPage=<s:property value="currPage-1"/>">[上一页]</a>&nbsp;&nbsp;
   </s:if>
   <s:if test="currPage!=totalPage">
       <a href="${pageContext.request.contextPath}/type_findAll.action?currPage=<s:property value="currPage+1"/>">[下一页]</a>&nbsp;&nbsp;
       <a href="${pageContext.request.contextPath}/type_findAll.action?currPage=<s:property value="totalPage"/>">[尾页]</a>&nbsp;&nbsp;
    </s:if>
   </span>
</td>
</tr>
</table>
  </body>
</html>