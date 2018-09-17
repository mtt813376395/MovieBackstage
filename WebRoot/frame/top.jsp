<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>上</title>
<style type="text/css">
.div2{margin-top:1px; margin-left:6px; font-size:30px; color:black}
.div1{ margin-top:3px; margin-left:60px; font-size:20px; color:red}
</style>
</head>
<body bgColor=#DDF0FB leftMargin=0 topMargin=0 marginwidth="0" marginheight="0">
<div align="left" class="div2">电影后台管理系统</div>
  <div align="center" class="div1">
    <table border="0">
      <tr>
        <td valign="middle">欢迎您：<s:property value="#session.existUser.username"/></td>
      </tr>
    </table>
  </div>
</body>
</html>