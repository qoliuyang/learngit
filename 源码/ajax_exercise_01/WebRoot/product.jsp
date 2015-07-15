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
    <style> 
    #d1{ 
    	background-color:#fff8dc; 
    	width:220px; 
    }
    </style>
    
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
	  
	  function change(v1){ 
		  var xhr = getXmlHttpRequest(); 
		  xhr.open('get','prod.do?name='+v1,true); 
		  xhr.onreadystatechange=function(){ 
			  if(xhr.readyState == 4){ 
				  var txt = xhr.responseText; 
				  document.getElementById('d1').innerHTML = txt; 
			  } 
			  
		  } 
		  xhr.send(null);
	  }
	  
	</script>
  </head>
  
 
   <body style="font-size:30px;"> 
   <select style="width:120px;" id="s1" onchange="change(this.value);"> 
        <option value="qq">QQ</option> 
        <option value="bmw">宝马</option> 
        <option value="ff">法拉利</option> 
   </select> <div id="d1"></div> </body>
 
</html>
