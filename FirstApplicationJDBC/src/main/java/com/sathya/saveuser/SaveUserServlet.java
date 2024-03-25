package com.sathya.saveuser;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SaveUserServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get the data
		String userId=request.getParameter("userId");
		String userName=request.getParameter("userName");
		String userEmail=request.getParameter("userEmail");
		String userMobile=request.getParameter("userMobile");
		String useruserLocationId=request.getParameter("userLocation");
		
		//calling the dao method by passing servlet data.
		UserDao userDao= new UserDao();
		userDao.saveUser(userId, userName, userEmail, userMobile, useruserLocationId);
		
		//Response
		PrintWriter writer=response.getWriter();
		writer.println("Data inserted sucessfully.....");
	}

	

}
