<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="resources/css/bootstrap.css">
<link rel="stylesheet" href="resources/css/font-awesome.css">
<link rel="stylesheet" href="resources/css/ProductList.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script src="resources/js/bootstrap.js"></script>
<script src="resources/js/jquery.sieve.js"></script>
<title>Product List</title>
<script type="text/javascript">
	$(document).ready(function() {
		$("table.meatlist").sieve();
	});
</script>
</head>
<body>
	<jsp:include page="Header.jsp"></jsp:include>
	<div class="container">
		<h2>
			<center>
				<b>Product List</b>
			</center>
		</h2>
		<br /> <br />
		<div class="product">
			<table class="meatlist">
				<!-- 				<tr colspan="4">
					<th>Product List</th>
				</tr> -->
				<div class="col-md-6">
					<tr>
						<td><img
							src="resources/Images/Chicken/Chicken-Whole-Skin-Off.jpg"
							alt="ChickenWhole"></td>
					<tr>
						<div class="col-md-6 col-sm-6">
							<button class="btn btn-success right">ADD ITEM</button>
					</tr>
				</div>
				<br>
				<br>
				<p class="price">Price:300.00/kg</p>
				</td>
				<td><img src="resources/Images/Chicken/Chicken_Whole.jpg"
					alt="ChickenWholeWithSkin"></td>

				<div class="col-md-6 col-sm-6">
					<button class="btn btn-success right">ADD ITEM</button>
				</div>
				<br>
				<br>
				<div class="col-md-6 col-sm-6">
					<p class="price">Price:275.00</p>
				</div>
				</td>
				</tr>

			</table>
		</div>
	</div>
</body>
</html>