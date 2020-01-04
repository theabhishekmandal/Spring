<!-- for looping over the operating system datatype we need jstl tag's foreach loop-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
	<title>Student Confirmation</title>
</head>

<body>
	<!-- This calls the getter methods -->
	The student is confirmed: ${student.firstName} ${student.lastName} 
	
	<br><br>
	
	Country: ${student.country}

	<br><br>
	
	Favorite Language: ${student.favoriteLanguage}
	
	<br><br>
	
	Gender : ${student.gender}

	<br><br>
	
	Operating Systems:
	<ul>
		<c:forEach var="temp" items="${student.operatingSystems}">
			<li>${temp}</li>
		</c:forEach>
	</ul>
	
</body>

</html>