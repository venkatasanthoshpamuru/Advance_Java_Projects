<%@page import="com.satya.pruduct.managementapp.ProductDao" import="java.util.Base64"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"> 
  <title>Product List</title>
</head>
<body>
   <h1 class="text-center font-italic mb-1 text-info">LIST OF PRODUCT</h1>
   <div>
    <a class="btn btn-success mt-5" href="add-product.html">Save Product</a>
   </div>
   <div style="text-align: right;">
     <input type="text" placeholder="search">
   </div>
   <div>
      <c:if test="${saveResult==1}">
          <h3 class="text-success text-center">Data insertion success check below..</h3>
      </c:if>
   </div>
   <div>
      <c:if test="${deleteResult==1}">
          <h3 class="text-danger text-center">Data deletion success check below..</h3>
      </c:if>
   </div>
   <table class="table table-borderd table-striped">
      <thead class="thead-dark">
        <tr> 
            <th>Product ID</th>
            <th>Product Name</th>
            <th>Product Cost</th>
            <th>Brand</th>
            <th>Made In</th>
            <th>Manufacture Date</th>
            <th>Expire Date</th>
            <th>Image</th>
            <th>Actions</th>
         </tr> 
    </thead>
    <tbody> 
    <c:forEach var="product" items="<%=ProductDao.findAll()%>">
          <tr> 
                <td class="bg-primary">${product.proId}</td>
                <td class="bg-danger">${product.proName}</td>
                <td class="bg-warning">${product.proPrice}</td>
                <td class="bg-secondary">${product.proBrand}</td>
                <td class="bg-success">${product.proMadeIn}</td>
                <td class="bg-info">${product.manfactureDate}</td>
                <td class="bg-warning">${product.expireDate}</td>           
                <td class="bg-dark"><img src="data:image/jpeg;base64,${Base64.getEncoder().encodeToString(product.proImage)}" alt="Product Image" style="max-width:100px;max-height:100px;"> 
                </td>
                <td class="bg-info">
                 <a class="btn btn-primary" href="./DeleteProductSertvlet?proId=${product.proId}">Delete</a>
                </td>
       </tr>
    </c:forEach>
    </tbody>
   </table>
</body>
</html>