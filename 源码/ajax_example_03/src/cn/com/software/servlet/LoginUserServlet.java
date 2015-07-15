package cn.com.software.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginUserServlet extends HttpServlet {

	
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
		String username = request.getParameter("uname");
	
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		//�ж��û����Ƿ�Ϊadmin�����������ʹ�ã��������ʹ��
		if("admin".equals(username)){
			out.println("���û����Ѵ���!");				
		}else{
			out.println("���û�����ʹ��!");						
		}
		out.flush();
		out.close();		
		
	}

}
