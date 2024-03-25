package com.sathya.cookies;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 //get the data
		String designation =request.getParameter("qualification");
		String qualification =request.getParameter("designation");
		
		//create the cookies object
		Cookie cookie3=new Cookie("designation", designation);
		Cookie cookie4=new Cookie("qualification", qualification);
		//insert the data into cookies object
		response.addCookie(cookie3);
		response.addCookie(cookie4);
		
		//forward the request to next form
		RequestDispatcher dispatcher = request.getRequestDispatcher("ThirdForm.html");
		dispatcher.forward(request, response);
		
		
		
	}

}