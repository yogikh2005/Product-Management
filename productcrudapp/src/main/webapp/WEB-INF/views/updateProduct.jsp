<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./base.jsp"%>
<style>

</style>
</head>
<body>
<div class="container mt-3">
		
		<div class="row">
			
			<div class="col-md-6 offset-md-3">
				
				<h1 class="text-center mb-3">Update the product detail</h1>
				
				<form action="${pageContext.request.contextPath}/handle-product" method="post">
					<div class="form-group">
				
					<input type="hidden" name="id" value="<c:out value='${product.id}'/>">

					</div>
					<div class="form-group">
						<label for="name">Product Name</label> 
						<input type="text" value="<c:out value='${product.name}'/>"
       					class="form-control" id="name" required  
      					 name="name" placeholder="Enter the product name here">

					</div>

					<div class="form-group">
						<label for="description">Product Description</label>
						<textarea class="form-control" required  name="description" id="description"
						 rows="5" placeholder="Enter the product description"><c:out value='${product.description}'/></textarea>
					</div>

					<div class="form-group">
						<label for="price">Product Price</label>
						 <input type="text"
						 value="<c:out value='${product.price}'/>"
							placeholder="Enter Product Price" required  name="price"
							class="form-control" id="price">
					</div>
					
					<div class="container text-center">
						<a href="${pageContext.request.contextPath }/"
							class="btn btn-outline-danger">Back</a>
						<button type="submit" class="btn btn-primary">Update</button>
					</div>
					
				</form>
				
					
			</div>
		</div>
	</div>
</body>
</html>