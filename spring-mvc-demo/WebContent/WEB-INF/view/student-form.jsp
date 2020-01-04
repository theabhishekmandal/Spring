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
		
		<!--
			not using the hardcoded value in jsp using the values present in java class
			  	
			<form:option value="Brazil" label="Brazil" />
			<form:option value="India" label="India" />
			<form:option value="France" label="France" />
			<form:option value="Germany" label="Germany" />
		-->
		
		<form:options items="${student.countryOptions}" />
		
		</form:select>
		
		<br><br>	

		Favorite Language:
		<!-- on call spring will call the student.setFavoriteLanguage method -->	
		Java<form:radiobutton path="favoriteLanguage" value="Java"/>
		C#<form:radiobutton path="favoriteLanguage" value="C#"/>
		PHP<form:radiobutton path="favoriteLanguage" value="PHP"/>
		RUBY<form:radiobutton path="favoriteLanguage" value="RUBY"/>
		
		<br><br>	

		Gender:
		<form:radiobuttons path="gender" items="${student.genderOptions}"/>	
		
		<br><br>

		Operating Systems:
		
		Linux<form:checkbox path="operatingSystems" value="Linux"/>
		Mac OS<form:checkbox path="operatingSystems" value="Mac OS"/>
		MS Windows<form:checkbox path="operatingSystems" value="MS Windows"/>

		<br><br>

		<input type="submit" value="Submit" />

	</form:form>
	

</body>
</html>