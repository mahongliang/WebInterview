package com.interview.codeencode;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		req.setCharacterEncoding("UTF-8");
//		String username = req.getParameter("username");
//		System.out.println(username);
		
		String username = req.getParameter("username");
		username = new String(username.getBytes("ISO8859-1"),"UTF-8");
		System.out.println(username);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//req.setCharacterEncoding("UTF-8");对request的body设置编码，即对post方式有效
//		String username = req.getParameter("username");
//		username = new String(username.getBytes("ISO8859-1"),"UTF-8");
//		
//		System.out.println(username);
		
		//url形式
		req.setCharacterEncoding("UTF-8");
		String  username = req.getParameter("username");
		System.out.println(username);
	}
}
