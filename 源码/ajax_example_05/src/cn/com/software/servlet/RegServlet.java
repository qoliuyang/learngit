package cn.com.software.servlet;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * Description:
 * <br/>网站: <a href="http://www.crazyjava.org">疯狂Java联盟</a> 
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
		//设置使用GBK字符集来解析请求参数
		request.setCharacterEncoding("GBK");
		//取得用户的两个请求参数
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		//进行服务器端的输入校验
		if (name == null || pass == null)
		{
			request.setAttribute("tip" , "用户名和密码都不能为空");
			forward("/reg.jsp" , request , response);
		}
		try
		{
			//调用ChatService对象的addUser方法来增加用户
			//如果注册成功
			if (ChatService.instance().addUser(name , pass))
			{
				request.setAttribute("tip" , "注册成功，请登陆系统");
				forward("/reg.jsp" ,request , response);
			}
			//如果注册失败
			else
			{
				request.setAttribute("tip" , "无法正常注册，请重试");
				forward("/reg.jsp" ,request , response);
			}
		}
		catch (Exception e)
		{
			request.setAttribute("tip" , e.getMessage());
			forward("/reg.jsp" ,request , response);
		}
	}
	//执行转发请求的方法
	private void forward(String url , HttpServletRequest request,
		HttpServletResponse response)throws ServletException,IOException
	{
		//获取RequestDispatcher对象
		RequestDispatcher rd = request.getRequestDispatcher(url);
		//执行转发
		rd.forward(request,response);
	}
}