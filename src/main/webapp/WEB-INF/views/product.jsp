<%@include file="/WEB-INF/views/header.jsp"%>

<style>
.container{
padding-bottom: 25px;
}

</style>
<div class="container" id="wrap">
	
	<div class="row">
		<div class="col-md-6 col-md-offset-3">
			<c:url var="addAction" value="/product/add"></c:url>
			<form:form action="${addAction}" method="POST"
				modelAttribute="smartproducts" accept-charset="utf-8" class="form"
				role="form">

				<h1>Add Products</h1>
				<p></p>
				<div class="row">
					<div class="col-xs-6">
						<form:input path="product_id" class="form-control input-lg"
							readonly="true" disabled="true" />
						<br>

					</div>
					<div class="col-xs-6">
						<form:input path="product_name" class="form-control input-lg"
							placeholder="Product name" />

						<br>
					</div>
				</div>
				<form:input path="product_category" class="form-control input-lg"
					placeholder="Product Category" />

				<br>


				<form:input path="product_description" required="true"
					class="form-control input-lg" placeholder="Product Description" />

				<br>

				<form:input path="product_price" required="true"
					class="form-control input-lg" placeholder="Product price" />


				<br>


				<div class="row">
					<div class="col-xs-6">

						<button class="btn btn-lg btn-success btn-block signup-btn"
							type="submit" value="submit">Add Product</button>
					</div>


				</div>
			</form:form>
			<br>
			<div class="row">
				<div class="col-xs-6">
					<a href="viewall"><button
							class="btn btn-lg btn-primary btn-block signup-btn">View
							all</button></a>


				</div>
			</div>
		</div>
	</div>
</div>



</body>
</html>