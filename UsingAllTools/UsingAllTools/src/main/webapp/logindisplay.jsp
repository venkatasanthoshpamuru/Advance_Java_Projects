<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Insert title here</title>
</head>
<body bgcolor="green">

    <c:if test="${status == 1}">
        <c:redirect url="http://www.satyatech.com"/>
    </c:if>

    <c:if test="${status == 0}">
       Invalid Credentials.....${status} 
        <jsp:include page = "/user-register.html"/>
    </c:if>

</body>
</html>
