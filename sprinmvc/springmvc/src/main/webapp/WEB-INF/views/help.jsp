<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help</title>
</head>
<body>
<%

//String email =(String)request.getAttribute("email");
//LocalDateTime time=(LocalDateTime)request.getAttribute("time");



%>

<h1>Contact to email : ${email}</h1>


<h1>Time : ${time} </h1>


<%-- <h1><%=email %></h1> --%>

<%-- <h1>Time :<%=time.toString() %></h1> --%>










<hr>
${mark }



<c:forEach var="item" items="${mark}">

<h1>${item }</h1>



</c:forEach>


</body>
</html>