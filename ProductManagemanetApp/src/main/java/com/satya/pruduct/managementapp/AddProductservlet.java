package com.satya.pruduct.managementapp;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.io.IOUtils;

@WebServlet("/AddProductservlet")
@MultipartConfig
public class AddProductservlet extends HttpServlet {
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//Read the date from form  page 
			String proId = request.getParameter("proId");
			String proName = request.getParameter("proName");
			double proPrice =Double.parseDouble(request.getParameter("proPrice"));
			String proBrand = request.getParameter("proBrand");
			String proMadeIn = request.getParameter("proMadeIn");
			Date proManfacturingDate = Date.valueOf(request.getParameter("proManfacturingDate"));
			Date proExpireDate = Date.valueOf(request.getParameter("proExpireDate"));
			
			Part part = request.getPart("proImage");
			InputStream inputStream = part.getInputStream();
			//conversion of inputStream into bytr[]
			byte[] proImage = IOUtils.toByteArray(inputStream);
			
			
			//Using Above details create  product Object
			Product product = new Product();
			product.setProId(proId);
			product.setProName(proName);
			product.setProPrice(proPrice);
			product.setProBrand(proBrand);
			product.setProMadeIn(proMadeIn);
			product.setManfactureDate(proManfacturingDate);
			product.setExpireDate(proExpireDate);
			product.setProImage(proImage);
			
			//Call save method from Dap layer and give above product object to save method
			//Saving the product object to Dao layer
			ProductDao dao = new ProductDao();
			int result = dao.save(product);
			
			response.setContentType("text/html");
			PrintWriter writer = response.getWriter();

			
			
			if(result==1) {
				//To send the data to JSP file ass the data into request object
				request.setAttribute("saveResult", result);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("productlist.jsp");
				requestDispatcher.forward(request, response);
			}
			else {
			  writer.println("<html>");
			  writer.println("<body>");
			  writer.println("<h3 style=\"color: red; text-align: center;\">Data Insertion failed check once..."+result+"</h3>");
			  writer.println("</body>");
			  writer.println("</html>");
			  RequestDispatcher requestDispatcher = request.getRequestDispatcher("add-product.html");
			  requestDispatcher.include(request, response);
			}
			
			/*
			 * response.setContentType("text/html"); PrintW							riter writer =
			 * response.getWriter(); writer.println("hi this is sertvlet page...");
			 */

	}

}
