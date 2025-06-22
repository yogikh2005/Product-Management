<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="./base.jsp"%>
   


</head>
<body>
<div class="container mt-3">
    <div class="row">
        <div class="col-md-12">
            <h1 class="text-center mb-3">Welcome To Product App</h1>

            <table class="table table-bordered table-hover">
                <thead class="table-dark">
                    <tr>
                        <th scope="col">Id</th>
                        <th scope="col">Product</th>
                        <th scope="col">Description</th>
                        <th scope="col">Price</th>
                        <th scope="col">Action</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${products}" var="p">
                        <tr>
                            <td scope="row">${p.id}</td>
                            <td>${p.name}</td>
                            <td>${p.description}</td>
                            <td><strong>&#8377; ${p.price}</strong></td>
                            <td>
                            <a href="delete-product/${p.id}"><i class="fas fa-trash text-danger" style="font-size:25px;"></i></a>
               			   <a href="update-product/${p.id}"><i class="fa-solid fa-file-pen"></i></a> 
               			   </td> 
                
                        </tr>
                    </c:forEach>
                </tbody>
            </table>

        </div>
    </div>

    <div class="container text-center mt-3">
        <a href="add-product" class="btn btn-outline-success">Add Product</a>
    </div>
</div>
</body>
</html>
