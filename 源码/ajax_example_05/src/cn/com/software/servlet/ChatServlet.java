package cn.com.software.servlet;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

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
public class ChatServlet extends HttpServlet
{
	public void service(HttpServletRequest request,
		HttpServletResponse response)throws IOException,ServletException
	{
		//����ʹ��UTF-8�ַ����������������
		//XMLHttpRequest�����͵�POST����Ĭ�ϲ���UTF-8�ַ���
        request.setCharacterEncoding("UTF-8");
		String msg = request.getParameter("chatMsg");
		if ( msg != null &&  !msg.equals(""))
		{
			//ȡ�õ�ǰ�û�
			String user = (String)request.getSession(true)
				.getAttribute("user");
			//����ChatService��addMsg�����������Ϣ
			ChatService.instance().addMsg(user , msg);
		}
		//������Ӧ���ݵ�����
		response.setContentType("text/html;charset=GBK");
		//��ȡҳ�������
		PrintWriter out = response.getWriter();
		//ֱ��������Ӧ
		out.println(ChatService.instance().getMsg());
	}
}