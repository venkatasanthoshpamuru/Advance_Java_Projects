<%@ page language="java" contentType="text/html; charset=ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
   <title>deletedisplay</title>
</head>
<body bgcolor="red">
   <c:if test="${result == 1}">
      data deleted successfully.......
   </c:if>

   <c:if test="${result == 0}">
      data is not included
      <%@include file="userdelete.html" %>
   </c:if>
</body>
</html>
