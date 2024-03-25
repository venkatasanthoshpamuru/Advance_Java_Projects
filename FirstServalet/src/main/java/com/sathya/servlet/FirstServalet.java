package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstServalet extends HttpServlet {
	private static final long serialVersionUID = 1L;

 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//set the type of data
		response.setContentType("text/plain");
		
		//output
		PrintWriter writer=response.getWriter();
		writer.println("<h1>This is first servlet</h1>");
		writer.println("Adv java class by Mr.ratan sir");
	}

	

}
