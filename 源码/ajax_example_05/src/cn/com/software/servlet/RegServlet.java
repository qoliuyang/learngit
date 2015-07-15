package cn.com.software.servlet;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyjava.org">���Java����</a> 
 * <br/>Copyright (C), 2001-2010, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class RegServlet extends HttpServlet
{
	public void service(HttpServletRequest request,
		HttpServletResponse response)throws IOException,ServletException
	{
		//����ʹ��GBK�ַ����������������
		request.setCharacterEncoding("GBK");
		//ȡ���û��������������
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		//���з������˵�����У��
		if (name == null || pass == null)
		{
			request.setAttribute("tip" , "�û��������붼����Ϊ��");
			forward("/reg.jsp" , request , response);
		}
		try
		{
			//����ChatService�����addUser�����������û�
			//���ע��ɹ�
			if (ChatService.instance().addUser(name , pass))
			{
				request.setAttribute("tip" , "ע��ɹ������½ϵͳ");
				forward("/reg.jsp" ,request , response);
			}
			//���ע��ʧ��
			else
			{
				request.setAttribute("tip" , "�޷�����ע�ᣬ������");
				forward("/reg.jsp" ,request , response);
			}
		}
		catch (Exception e)
		{
			request.setAttribute("tip" , e.getMessage());
			forward("/reg.jsp" ,request , response);
		}
	}
	//ִ��ת������ķ���
	private void forward(String url , HttpServletRequest request,
		HttpServletResponse response)throws ServletException,IOException
	{
		//��ȡRequestDispatcher����
		RequestDispatcher rd = request.getRequestDispatcher(url);
		//ִ��ת��
		rd.forward(request,response);
	}
}