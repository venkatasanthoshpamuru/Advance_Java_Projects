package com.sathya.calculatorservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class CalculatorServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get the data
		int firstnumber=Integer.parseInt(request.getParameter("firstnumber"));
		int secondnumber=Integer.parseInt(request.getParameter("secondnumber"));
		String output=request.getParameter("test");
		
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		//process the data
		if("Addition".equalsIgnoreCase(output)) {
		int addition;
		addition=firstnumber+secondnumber;
		writer.println("<html><body bgcolor=gray>");
		  writer.println("<h1>"+"Addition of "+addition+"</h1>");
		}if("Substraction".equalsIgnoreCase(output)) {
		int subtraction;
		subtraction=firstnumber-secondnumber;
		writer.println("<html><body bgcolor=gray>");
		 writer.println("<h1>"+"Subtraction of "+subtraction+"</h1>");
		}else if("Multilication".equalsIgnoreCase(output)) {
		int multiplication;
		multiplication=firstnumber*secondnumber;
		writer.println("<html><body bgcolor=gray>");
		 writer.println("<h1>"+"Multipilication of "+multiplication+"</h1>");
		}else if("Division".equalsIgnoreCase(output)) {
		int division;
		division=firstnumber/secondnumber;
		writer.println("<html><body bgcolor=gray>");
		 writer.println("<h1>"+"Division of "+division+"</h1>");
		}else if("Modulus".equalsIgnoreCase(output)) {
		int modulus;
		modulus=firstnumber%secondnumber;
		writer.println("<html><body bgcolor=gray>");
		 writer.println("<h1>"+"Modulus of "+modulus+"</h1>");
		}
		//render the data
		
		
		
		
	}

}
