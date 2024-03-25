package com.sathya.loginpage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginPageServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get the data request from object 
		//get the data request from object 
				String username=request.getParameter("username");
				String password=request.getParameter("password");
				String status;
		        //process the data
				if(username.equalsIgnoreCase("ratan") && password.equals("Ratan@123")) {
					status="login success...";
				}
				else
				{
					status="login fail...";
				}
				//print the data
				response.setContentType("text/html");
				PrintWriter writer=response.getWriter();
				writer.println("<html><body bgcolor=Wheat>");
				writer.println("<h1>Login Status:"+status+"</h1>");
			
		
	}

}
