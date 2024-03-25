package com.tcs;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Id=request.getParameter("userId");
		UserDao dao=new UserDao();
		int result=dao.deleteById(Id);
		request.setAttribute("result",result);
		RequestDispatcher dispatcher = request.getRequestDispatcher("deletedisplay.jsp");
		dispatcher.forward(request, response);
		
	}

}
