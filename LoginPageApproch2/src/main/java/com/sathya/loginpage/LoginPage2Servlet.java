package com.sathya.loginpage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginPage2Servlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get the data request from object 
				String username=request.getParameter("username");
				String password=request.getParameter("password");
				
		        //process the data
				if(username.equalsIgnoreCase("ratan") && password.equals("Ratan@123")) {
					RequestDispatcher dispatcher=request.getRequestDispatcher("Success.html");
					dispatcher.forward(request, response);
				}
				else
				{
					RequestDispatcher dispatcher=request.getRequestDispatcher("Fail.html");
					dispatcher.forward(request, response);
				}
				
	}

}
