package com.sathya.productinvoice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class ProductInvoiceServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get the data
		int proId=Integer.parseInt(request.getParameter("proId"));
		String proName=request.getParameter("proName");
		double proPrice=Double.parseDouble(request.getParameter("proPrice"));
		int proQuantity=Integer.parseInt(request.getParameter("proQuantity"));
          
		double totalPrice;
		totalPrice=proPrice*proQuantity;
		double discount=0.0;
		String discountMassage="no discount";
		
		if(totalPrice>1000 && totalPrice<5000)
		{
			discount=totalPrice*0.05;
			discountMassage="5% discount";
		}
		else if(totalPrice>5000 && totalPrice<10000)
		{
			discount=totalPrice*0.1;
			discountMassage="10% discount";
		}
		else if(totalPrice>10000)
		{
			discount=totalPrice*0.15;
			discountMassage="10% discount";
		}
		
		double finalPrice=0.0;
		finalPrice=totalPrice-discount;
		
		//render the response
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		
		writer.println("<html><body bgcolor=gray>");
		writer.println("<h1>****Product Invoice****</h1>");
		writer.println("<p>your product Id:"+proId+"</p>");
		writer.println("<p>your product Name:"+proName+"</p>");
		writer.println("<p>your product Price:"+proPrice+"</p>");
		writer.println("<p>your total Price:"+totalPrice+"</p>");
		writer.println("<p>"+discountMassage+"discount Amount:"+discount+"</p>");
		writer.println("<p>Net Amount:"+finalPrice+"</p>");
		
		
		
	}

}
