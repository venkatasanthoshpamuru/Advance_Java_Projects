package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get the data from object
		String UserId=request.getParameter("userid");
		String Password=request.getParameter("password");
		
		//output
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//process the date
		if(UserId.equalsIgnoreCase("venkatt") && Password.equals("VENkatt@123"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("/Success.jsp");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("/Fail.jsp");
			rd.forward(request, response);
		}
	}

}
