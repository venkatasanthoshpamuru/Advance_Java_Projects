<%@ page language="java" contentType="text/html;"%>
<%@ page import="com.tcs.UserDao"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>List of Users</title>
</head>
<body bgcolor="navyblue"  style="text-align: center">
<table border="5">
<thead>
      <tr>
        <th>UserId</th>
         <th>UserName</th>
         <th>UserEmail</th>
         <th>UserMobile</th>
         <th>UserLocation</th>
         </tr>
         </thead>
        <tbody>
        <c:forEach items="<%=new UserDao().findAll()%>" var="user">
        <tr>
        <td>${user.userId}</td>
        <td>${user.userName}</td>
        <td>${user.userEmail}</td>
        <td>${user.userMobile}</td>
        <td>${user.userLocation}</td>
        </tr>
        </c:forEach>
           </tbody>

</table>
</body>
</html>