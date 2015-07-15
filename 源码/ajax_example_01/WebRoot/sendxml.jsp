<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
	  //获取XMLHttpRequest对象,该对象由浏览器提供，但是浏览器并没有提供标准化设置
	  function getXmlHttpRequest(){
		  //声明XMLHttpRequest对象
		  var xmlHttpRequest;
		  //针对不同的浏览器，创建的方式不同
		  try{
			//Firefox, Opera ,Safari等浏览器
			  xmlHttpRequest = new XMLHttpRequest();
		  }catch(e){
			  try{
				//Internet Explorer
				  xmlHttpRequest = new ActiveXObject("Microsoft.XMLHttp");
			  }catch(e){
				  alert('您的浏览器不支持ajax');
				  return null;
			  }			  
		  }	
		  return xmlHttpRequest;
	  }	  
	 
	  
	  //验证用户名的唯一性
	  function checkUsername(){
		  //获取用户名
		 var myusername = document.getElementById("uname").value;
		 //用Ajax技术向服务器发送请求，验证用户的合法性
		 //step 1 :获取XMLHttpRequest对象
		 var xmlHttpRequest = getXmlHttpRequest();
		
		 //step 2 :向服务器发送请求
		 xmlHttpRequest.open('GET','<%=path%>/LoginUserServlet',true);
		  alert('test');
		 //step 4:获取 
		 xmlHttpRequest.onreadystatechange = function(){
			 if(xmlHttpRequest.readyState==4){
				 if(xmlHttpRequest.status == 200){					
					 alert(xmlHttpRequest.responseText);
				 }
			 }
		 }
		 
		 xmlHttpRequest.send();
	  }
	  
	</script>
  </head>
  
  <body>
     <form name="myform" action="">
     	username:<input type='text' name='uname' id='uname' onblur="checkUsername();" ><br>
     	password:<input type='password' name='pwd'><br>
     	<input type='submit' name='submit' value='登陆'>
     </form>
  </body>
</html>
