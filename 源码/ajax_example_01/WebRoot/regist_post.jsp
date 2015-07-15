<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'regist.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<style> 
	.s1{ 
		color:red; 
		font-size:24px; 
		font-style:italic; 
	} 
	</style> 
	<script type="text/javascript">
		function getXmlHttpRequest(){ 
			var xhr = null; 
			if((typeof XMLHttpRequest)!='undefined'){ 
				xhr = new XMLHttpRequest(); 
			}else { 
				xhr = new ActiveXObject('Microsoft.XMLHttp'); 
			} 
			return xhr; 
		}
		
		
		function check_username(){ 
			var myusername = document.getElementById('username').value;
			//step1 获得XmlHttpRequest对象 
			var xhr = getXmlHttpRequest(); 
			//step2 发送请求 
			//step2 发送请求 
			xhr.open('post', 'check_username.do',true); 
			xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded"); 
			xhr.onreadystatechange=function(){ 
				//step4 获取服务器返回的数据，更新页面 
				if(xhr.readyState == 4){ 
					if(xhr.status == 200){ 
						var txt = xhr.responseText; 
						document.getElementById('username_msg').innerHTML = txt; 
					}else{
						document.getElementById('username_msg').innerHTML = '系统错误，稍后重试'; 
					} 
				}else{
				  document.getElementById('username_msg').innerHTML = '正在验证...'; 
				  } 
				}; 
				xhr.send('username=' +myusername+"&t=123"); 
			}
	</script>

  </head>
  
  <body style="font-size:30px;"> 
  <form action="" method="post"> 
  用户名:<input name="username" id="username" onblur="check_username();"/> 
  <span class="s1" id="username_msg"></span> 
  <br/> 
  密码:<input type="password" name="pwd" id="pwd"/><br/> 
  <input type="submit" value="确讣"/> 
  </form> 
  </body> 
  </html>
