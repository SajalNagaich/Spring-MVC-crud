<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix= "form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 	<h4>Welcome to Register</h4>

 	<form:form action ="empRegister" method="post" modelAttribute="employee">
 	
 		<form:label path="id">EmpId</form:label>
 		<form:input path="id" placeholder="enter emp Id"/><br>
 		
 		<form:label path="name">EmpName</form:label>
 		<form:input path="name" placeholder="enter emp name"/><br>
 		
 		<form:label path="email">EmpEmail</form:label>
 		<form:input path="email" placeholder="enter emp email"/><br>
 		
 		<button type="submit">REGISTER</button>
 		
 	</form:form>
</body>
</html>