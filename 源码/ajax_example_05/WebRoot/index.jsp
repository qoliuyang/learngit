<%--
��վ: <a href="http://www.crazyjava.org">���Java����</a>
author  yeeku.H.lee kongyeeku@163.com
version  1.0
Copyright (C), 2001-2010, yeeku.H.Lee
This program is protected by copyright laws.
Program Name:
Date: 
--%>

<%@ page contentType="text/html;charset=GBK" errorPage="error.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title> ��¼������ </title>
	<meta name="website" content="http://www.leegang.org" />
</head>
<body>
<table width="540" border="1" align="center" bgcolor="#dddddd">
<tr>
<td align="center">
<form id="loginForm" method="post" action="login.do">
<font color="red">
${requestScope.error}
</font>
<hr/>
<table>
<tr>
	<td colspan="2" align="center">
		�������û����������½
	</td>
</tr>
<tr>
	<td>�û�����</td>
	<td><input id="name" type="text" name="name"/></td>
</tr>
<tr>
	<td>��&nbsp;&nbsp;�룺</td>
	<td><input id="pass" type="text" name="pass"/></td>
</tr>
<tr>
	<td colspan="2" align="center">
		<input type="submit" value="�ύ"/>
		<input type="reset" value="����"/>
	</td>
</tr>
</table>
<br/>
<div align="center">
<a href="reg.jsp">ע�����û�</a>
</div>
</form>
</td>
</tr>
</table>
<script>
	function check()
	{
		var name = document.getElementById("name");
		var pass = document.getElementById("pass");
		var errStr = "";
		if (name.value == "" || name.value == null)
		{
			errStr += "�û�������Ϊ��\n";
		}
		if (pass.value == "" || pass.value == null)
		{
			errStr += "���벻��Ϊ��\n";
		}
		if (errStr == "" || errStr == null)
		{
			return true;
		}
		alert(errStr);
		return false;
	}
	document.getElementById("loginForm").onsubmit = check;
</script>
</body>
</html>
