package cn.com.software.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ActionServletExeception extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		execute(request,response);	
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		execute(request,response);
	}
	
	private void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uri = request.getRequestURI(); 
		//获取URL地址
		System.out.println("uri:" + uri);
		String path = uri.substring(uri.lastIndexOf("/"), uri.lastIndexOf(".")); 
		System.out.println("path:" + path);
		
		response.setContentType("text/html;charset=utf-8"); 
		PrintWriter out = response.getWriter(); 
		if(path.equals("/check_username")){ 
			//获取用户名
			String username = request.getParameter("username"); 
			//改变地址栏的随机数
			String tvalue =request.getParameter("t");
			System.out.println("username:" + username +" t=" + tvalue);
			if(username.equals("zs")){ 
				out.println("用户名被占用"); 
			}else{ 
				out.println("可以使用"); 
			}
			out.flush();
		} out.close(); 
		} 
	}
