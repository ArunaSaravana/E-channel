<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Category Page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet"
	href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<%@include file="Header.jsp"%>


	<div class="container">
		<div class="row">
			<div class="col-sm-4">
				<div class="product-form">
					<!--sign up form-->
					<h2>Product Form</h2>
					<br>
					<form:form action="InsertProduct" modelAttribute="product"
						enctype="multipart/form-data">
						<table align="center">
							<tr>
								<td colspan="2"><center>Product Details</center></td>
							</tr>
							<tr>
								<td>Product ID</td>
								<td><form:input path="prodid" /></td>
							</tr>
							<tr>
								<td>Product Name</td>
								<td><form:input path="proname" /></td>
							</tr>
							<tr>
								<td>Category</td>
								<td><form:select path="catid">
										<form:option value="0" label="------Select----" />
										<form:options items="${catlist}" />
									</form:select></td>
							</tr>
							 <%-- <tr>
							 	<td>Supplier</td>
								<td><form:input path="sid" /></td>
							</tr> --%> 
							<tr>
								<td>Price</td>
								<td><form:input path="price" /></td>
							</tr>
							<tr>
								<td>Stock</td>
								<td><form:input path="stock" /></td>
							</tr>
							<tr>
								<td>Product Desc</td>
								<td><form:textarea path="desc" /></td>
							</tr>
							<%-- <tr>
								<td>Product Image</td>
								<td><form:input type="file" path="pimage" /></td>
							</tr> --%>
							<tr>
								<td colspan="2"><center>
										<input type="submit" />
									</center></td>
							</tr>

						</table>
					</form:form>

					<table align="center" border="5">
						<tr >
							<td>Product ID</td>
							<td>Product Name</td>
							<td>Category ID</td>
							<td>Supplier ID</td>
							<td>Price</td>
							<td>Stock</td>
							<td>Operation</td>
						</tr>

						<c:forEach items="${proddet}" var="prod">
							<tr>
								<td>${prod.prodid}</td>
								<td>${prod.proname}</td>
								<td>${prod.catid}</td>
								<td>${prod.sid}</td>
								<td>${prod.price}</td>
								<td>${prod.stock}</td>
								<td><a href="<c:url value="deleteProduct/${prod.prodid}"">Delete||</a>
									<a href="<c:url value="updateProduct/${prod.prodid}"">Update</a>
								</td>
							</tr>
						</c:forEach>

					</table>



				</div>
			</div>
		</div>
	</div>
	<%@include file="Footer.jsp"%>
</body>
</html>
