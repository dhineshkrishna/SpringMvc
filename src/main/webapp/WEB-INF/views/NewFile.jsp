<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Dhinesh friends naveen jaga gowtham anand</h2>
	<table border="1">
		<tr>
			<th>Employee Id</th>
			<th>First Name</th>
			<th>Last Name</th>
		</tr>
		<tr>
			<td>${employeeId}</td>
			<td>${employeeName}</td>
			<td>${employeeSurname}</td>
		<tr>
	</table>
</body>
</html>