<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Insert title here</title>
</head>
<body bgcolor="aqua">
    <c:if test="${saveResult eq 1}">
        Data inserted successfully... ${saveResult}
    </c:if>
    <c:if test="${saveResult eq 0}">
        Data insertion failed... ${saveResult }
    </c:if>
</body>
</html>

    