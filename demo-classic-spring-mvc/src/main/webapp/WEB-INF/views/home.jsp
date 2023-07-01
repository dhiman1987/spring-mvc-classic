<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<link rel="stylesheet" href="resources/css/main.css">
</head>
<body>
	<div class="container">
		<h1>Hello Spring MVC</h1>

			<c:if test="${not empty msg}">
			<div class="message">
				${msg}
			</div>
		    </c:if>

			<c:if test="${not empty error}">
			<div class="error">
				${error}
			</div>
		    </c:if>


			<form:form action="addUser" method="post" modelAttribute="user">
				<input type="text" class="input-text" name="name" placeholder="Enter Name" path="name" />
				<input type="text" class="input-text" name="age" placeholder="Enter age" path="age"/>
				<input type="submit" class="btn-primary"value="Add User" />
				<input type="reset" class="btn-secondary"value="Clear" />
			</form:form>

	</div>
</body>
</html>