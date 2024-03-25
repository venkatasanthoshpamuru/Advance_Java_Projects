package com.satya.pruduct.managementapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteProductSertvlet")
public class DeleteProductSertvlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String proId = request.getParameter("proId");
		 
		 ProductDao dao = new ProductDao();
		int result = dao.deleteProductById(proId);
		
		if(result==1) {
			request.setAttribute("deleteResult", result);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("productlist.jsp");
			requestDispatcher.forward(request, response);
		}
    	}
}