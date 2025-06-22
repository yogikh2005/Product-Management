<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>success</title>
</head>
<body>
<h1>Student Inforation</h1>
<h2>Name :${student.name}</h2>
<h2>ID :${student.id}</h2>
<h2>Date :${student.date}</h2>
<h2>Courses:${student.courses}</h2>
<h2>Gender :${student.gender}</h2>
<h2>Type :${student.type}</h2>
<h2>Address</h2>
<h2>Street :${student.address.street}</h2>
<h2>Type :${student.address.city}</h2>
</body>
</html>