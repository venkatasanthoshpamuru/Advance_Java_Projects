package com.sathya.databaseconnection;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SaveStudentServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   	  //get the data 
		String Id=request.getParameter("studentId");
		String Name=request.getParameter("studentName");
		String Bill=request.getParameter("studentBill");
	   
		//sets the data from Student object
		Student student=new Student();
		student.setStudentName(Id);
		student.setStudentFee(Bill);
	
	}
	
}
