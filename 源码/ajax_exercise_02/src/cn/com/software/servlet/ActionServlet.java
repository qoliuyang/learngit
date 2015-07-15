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
		System.out.println("path" + path);
		if(path.equals("/city")){ 
			String name = request.getParameter("name"); 
			if(name.equals("hn")){ 
				out.println("yy,����;hh,����;cs,��ɳ"); 
			}else if(name.equals("bj")){ 
				out.println("cy,����;hd,����;dc,����;xc,����"); 
				} 
			} 
		out.flush();
		out.close(); 
			} 
	}
