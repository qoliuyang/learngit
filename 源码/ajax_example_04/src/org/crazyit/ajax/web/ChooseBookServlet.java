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
        //�ͻ��������ѯ��ͼ����
		int id = Integer.parseInt(
				request.getParameter("id"));
		
		//�������ݿ���ʲ�Ķ���
		BookDao bookDao = new BookDao();
		//���ò�ѯ���ݿ�ķ���
		
		response.setContentType("text/html;charset=GBK");
		PrintWriter out = response.getWriter();
		out.println(new JSONArray(books));
	}
	

}