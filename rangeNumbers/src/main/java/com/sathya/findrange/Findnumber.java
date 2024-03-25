package com.sathya.findrange;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Findnumber extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer startingNumber = Integer.parseInt(request.getParameter("starting"));
		Integer endingNumber = Integer.parseInt(request.getParameter("ending"));
		
		String actionType = request.getParameter("numbers");
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		//Process the data
		switch (actionType) {
		case "even":
			for (Integer i = startingNumber; i <= endingNumber; i++){
				if (i % 2 == 0) {
					 result.add(i);
				}
			} 
			
		    break;
		    
		case "odd":
			for (Integer i = startingNumber; i <= endingNumber; i++) {
				if (i % 2 != 0) {
					result.add(i);
				}
			}
			
			break;
		}
		
		//type of content
		 response.setContentType("text/html");
		 
		 //print the response
			PrintWriter writer = response.getWriter();
			RequestDispatcher dispatcher = request.getRequestDispatcher("HomePage.html");
			dispatcher.include(request, response);
		    writer.println("Result is......."+result);
	}


}
