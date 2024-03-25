package com.sathta.fullname;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FullnameServlet
 */
@SuppressWarnings("serial")
@WebServlet("/FullnameServlet")
public class FullnameServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get the client request
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		
		//process the data 
		String fullname;
		fullname=firstname+lastname;
		//render the response to browser
         response.setContentType("text/plain");	
        PrintWriter writer=response.getWriter();
        writer.println("full name......"+fullname);
		
	}

	

}
