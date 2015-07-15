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
			request.setCharacterEncoding("utf-8"); 
			String uri = request.getRequestURI(); 
			String path = uri.substring(uri.lastIndexOf("/"), uri.lastIndexOf(".")); 
			response.setContentType("text/html;charset=utf-8"); 
			PrintWriter out = response.getWriter(); 
			if(path.equals("/prod")){ 
				String name = request.getParameter("name"); 
				System.out.println("name:" + name); 
				if(name.equals("qq")){ 
					out.println("性价比高"); 
				}else if(name.equals("bmw")){ 
					out.println("驾驶性能出众"); }else{ 
						out.println("好车,也贵");
					} 
				} out.close(); 
			} 
	}
