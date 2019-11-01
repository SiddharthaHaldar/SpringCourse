<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
	<head></head>
	<body>
		<form:form action="processForm" modelAttribute="student">
			
			FirstName : <form:input path="firstName"/>
			
			<br><br>
			
			LastName : <form:input path="lastName"/>
			
			<br><br>
			
			<!--<form:select path="country">
				<form:option value="India">India</form:option>
				<form:option value="Canada">Canada</form:option>
				<form:option value="USA">USA</form:option>
				<form:option value="Germany">Germany</form:option>
			</form:select>-->
			
			<form:select path="country">
				<form:options items="${student.countryOptions}"/>
			</form:select>
			
			<br><br>
			
			<input type="submit" value="Submit"/>
		</form:form>
	</body>
</html>