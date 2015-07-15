package cn.com.software.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ActionServlet extends HttpServlet {

	
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
		String path = uri.substring(uri.lastIndexOf("/"), uri.lastIndexOf(".")); 
		response.setContentType("text/html;charset=utf-8"); 
		PrintWriter out = response.getWriter(); 
		if(path.equals("/check_username")){ 
			if(1==1){ 
				throw new ServletException("some error"); 
			} 
			String username = request.getParameter("username"); 
			System.out.println("username:" + username);
			if(username.equals("zs")){ 
				out.println("用户名被占用"); 
			}else{ 
				out.println("可以使用"); 
			}
			out.flush();
		} out.close(); 
		} 
	}
