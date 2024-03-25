package com.tcs;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
            
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String userId=request.getParameter("userId");
		String userEmail=request.getParameter("userEmail");
		
		UserDao dao =new UserDao();
		int result=dao.loginCheck("userId","userEmail");
		
		request.setAttribute("Status", result);
		RequestDispatcher dispatcher=request.getRequestDispatcher("logindisplay.jsp");
	
		dispatcher.forward(request, response);
	}

}
