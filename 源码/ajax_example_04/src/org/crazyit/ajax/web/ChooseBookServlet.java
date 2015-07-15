package org.crazyit.ajax.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;


public class ChooseBookServlet extends HttpServlet
{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		execute(request,response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		execute(request,response);
	}
	
	
	private void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        //客户端请求查询的图书编号
		int id = Integer.parseInt(
				request.getParameter("id"));
		
		//创建数据库访问层的对象
		BookDao bookDao = new BookDao();
		//调用查询数据库的方法
		
		response.setContentType("text/html;charset=GBK");
		PrintWriter out = response.getWriter();
		out.println(new JSONArray(books));
	}
	

}