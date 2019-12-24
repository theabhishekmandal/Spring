<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<title>Student Registration Form</title> 
</head>
<body>

	<!-- modelAttribute should match with the name in the Controller (StudentController.java)-->
	<form:form action="processForm" modelAttribute="student">
	
								  <!-- When form is loaded getter methods are called, 
								  When form is submitted setter methods are called-->
								  <!--properties of Student class-->
		First name: <form:input path="firstName" /> 
	
		<br><br>
		
		Last name: <form:input path="lastName" /> 
	
		<br><br>

		Country: 

		<form:select path="country">
		
			<form:option value="Brazil" label="Brazil" />
			<form:option value="India" label="India" />
			<form:option value="France" label="France" />
			<form:option value="Germany" label="Germany" />
		
		</form:select>
		
		<br><br>	

		<input type="submit" value="Submit" />

	</form:form>
	

</body>
</html>