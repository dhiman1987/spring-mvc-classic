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
                <form:label path="name" cssClass="input-label">Name</form:label>
                <form:input path="name" cssClass="input-text" placeholder="Enter Name" />

                <form:label path="age" cssClass="input-label">Age</form:label>
                <form:input path="age" cssClass="input-text" placeholder="Enter age" />

                <form:label path="doj" cssClass="input-label">Date of Joining</form:label>
                <form:input path="doj" cssClass="input-text" placeholder="Enter date of joining" />

				<input type="submit" class="btn-primary"value="Add User" />
				<input type="reset" class="btn-secondary"value="Reset" />
			</form:form>

	</div>
</body>
</html>