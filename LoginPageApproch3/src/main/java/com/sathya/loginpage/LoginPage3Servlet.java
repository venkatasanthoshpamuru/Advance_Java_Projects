 package com.sathya.loginpage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginPage3Servlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
        //process the data
		if(username.equalsIgnoreCase("ratan") && password.equals("Ratan@123")) {
			RequestDispatcher dispatcher=request.getRequestDispatcher("Success3.html");
			dispatcher.forward(request, response);
		}
		else
		{ 
			response.setContentType("text/html");
			PrintWriter writer=response.getWriter();
			writer.println("Login fail... try again valid data");
			RequestDispatcher dispatcher=request.getRequestDispatcher("LoginForm3.html");
			dispatcher.include(request, response);
		}
	}


}
