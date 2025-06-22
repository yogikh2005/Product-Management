<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>About</title>
</head>
<body>


<%
		
String name=(String)request.getAttribute("name");
String city=(String)request.getAttribute("city");
String mono=(String)request.getAttribute("mono");
List<String>fd=(List<String>)request.getAttribute("fd");


%>

<h1>my name is <%=name %></h1>
<h1>my city is <%=city %></h1>
<h1>my mobile number is <%=mono %></h1>

<h1>My friends are:</h1>
<%

for(String s:fd)
{%>


<h1><%=s %></h1>


<%
}
%>

</html>