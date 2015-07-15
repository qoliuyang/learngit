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
		  xhr.open('post','city.do',true); 
		  xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded"); 
		  xhr.onreadystatechange=function(){ 
			  //服务器返回 yy,岳阳;cs,长沙;hh,怀化 
			  if(xhr.readyState == 4){ 
				  var txt = xhr.responseText; 
				  var arr = txt.split(';'); 
				  document.getElementById('s2').innerHTML = '';
				  for(i=0;i<arr.length;i++){ 
					  var arr1 = arr[i]; 
					  var arr2 = arr1.split(','); 
					  var op = new Option(arr2[1],arr2[0]); 
					  document.getElementById('s2').options[i] = op; 
					  } 
				  } 
			  }; 
			  xhr.send('name=' + v1); 
          } 
	  </script>
		

  </head>
  <body style="font-size:30px;"> 
   <select id="s1" style="width:120px;" onchange="change(this.value);"> 
   <option value="hn">湖南</option> 
   <option value="bj">北京</option> 
   </select> 
   <select id="s2" style="width:120px;"> 
   </select> 
  </body>  
</html>
