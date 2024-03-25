package com.sathya.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//total 6-details = 4-details session 2-request 
		Cookie[] cookies=request.getCookies();
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("User name..."+cookies[0].getValue());
		writer.println("<br>");
		writer.println("User Age..."+cookies[1].getValue());
		writer.println("<br>");
		writer.println("User Qualifation..."+cookies[2].getValue());
		writer.println("<br>");
		writer.println("User Dessignation..."+cookies[3].getValue());
		writer.println("<br>");
		writer.println("User mobile..."+request.getParameter("mobile"));
		writer.println("<br>");
		writer.println("User Email..."+request.getParameter("email"));
	
	}
}