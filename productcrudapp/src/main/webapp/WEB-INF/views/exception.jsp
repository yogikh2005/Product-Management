<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <%@include file="./base.jsp"%>
    <title>Error</title>
    <!-- Bootstrap CSS CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container mt-5">
    <div class="alert alert-danger text-center shadow p-4 rounded" role="alert">
    		<h1>Oops! Sorry</h1>
        <h4 class="alert-heading">${msg}</h4>
        <p>We're sorry, but an unexpected error occurred. Please try again later.</p>
        <hr>
        <p class="mb-0">If the problem persists, contact support.</p>
    </div>
</div>

<!-- Bootstrap JS CDN -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
