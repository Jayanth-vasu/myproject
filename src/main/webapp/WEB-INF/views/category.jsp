<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JV Smartwatches</title>
</head>
<body>
	<c:url var="addAction" value="/category/add"></c:url>

	<form:form action="${addAction}" method="POST"
		modelAttribute="category">
		<table>


			<tr>

				<form:label path="category_id" />
				<c:choose>
					<c:when test="${!empty category.category_id }">
						<td><form:label path="category_id">
								<spring:message text="Category ID" />
							</form:label></td>
						<td><form:input path="category_id" readonly="true"
								 /></td>
					</c:when>
					<c:otherwise>
						<td><form:label path="category_id">
								<spring:message text="Category ID" />
							</form:label></td>
						<td><form:input path="category_id" /></td>
					</c:otherwise>

				</c:choose>


			</tr>



			<tr>
				<td><form:label path="category_name">
						<spring:message text="Category name" />
					</form:label>
				<td><form:input path="category_name" /></td>
			</tr>


			<tr>
				<td colspan="2"><c:if test="${!empty category.category_name}">

						<input type="submit" value="<spring:message text="Edit Product"/>" />
					</c:if> <c:if test="${empty category.category_name}">

						<input type="submit" value="<spring:message text="Add Product"/>" />
					</c:if></td>
			</tr>

		</table>

		<h3>Category List</h3>
		<c:if test="${!empty listCategory}">
			<table class="tg">
				<tr>

					<th width="80">Category ID</th>
					<th width="120">Category Name</th>
					<th width="60">Edit</th>
					<th width="60">Delete</th>
				</tr>
				<c:forEach items="${listCategory}" var="pd">
					<tr>
						<td><a></a></td>

						<td>${pd.category_id}</td>
						<td>${pd.category_name}</td>

						<td><a href="<c:url value='/edit/category/${pd.category_id}' />">Edit</a></td>
						<td><a href="<c:url value='/remove/category/${pd.category_id}' />">Delete</a></td>
					</tr>
				</c:forEach>
			</table>
		</c:if>
	</form:form>
</body>
</html>