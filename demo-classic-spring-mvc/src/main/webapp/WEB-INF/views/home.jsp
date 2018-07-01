<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
	<div style="align-content: center">
		<h1>Hello Spring MVC</h1>
		<h3>
			<c:if test="${not empty msg}">
				${msg}
		</c:if>
			<form:form action="addUser" method="post" modelAttribute="user">
				<input type="text" name="name" placeholder="Enter Name" path="name" />
				<br/>
				<input type="text" name="age" placeholder="Enter age" path="age"/>
				</br>
				<input type="submit" value="Add User" />&nbsp;
				<input type="reset" value="Clear" />
			</form:form>
		</h3>
	</div>
</body>
</html>