package com.tcs;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SaveUserServlet")
public class SaveUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//get the data
		String Id=request.getParameter("userId");
		String Name=request.getParameter("userName");
		String Email=request.getParameter("userEmail");
		String mNumber=request.getParameter("userMobile");
		String location=request.getParameter("userLocation");
		
		
		User user=new User();
		user.setUserId(Id);
		user.setUserName(Name);
		user.setUserEmail(Email);
		user.setUserMobile(mNumber);
		user.setUserLocation(location);
		
		//calling the dao method by passing servlet data
		UserDao dao=new UserDao();
		int result	=	dao.saveUser(user);
		//set the data into request object to use in jsp
		request.setAttribute("saveResult",result);
		//forward the request into jsp
		RequestDispatcher dispatcher=request.getRequestDispatcher("savestatus.jsp");
		dispatcher.forward(request, response);
		
	}

}
