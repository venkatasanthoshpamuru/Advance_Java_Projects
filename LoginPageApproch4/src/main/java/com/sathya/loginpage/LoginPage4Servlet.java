package com.sathya.loginpage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginPage4Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
        //process the data
		if(username.equalsIgnoreCase("ratan") && password.equals("Ratan@123")) {
			response.sendRedirect("https://sathyatech.com/");
		}
		else
		{ 
			response.sendError(909,"you enter invalid details"); 
			
		}
	}


}
