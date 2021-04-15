<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
<form action="routebook" method="post">

		<table style="with: 80%">
			<tr>
				<td>Source</td>
				<td>Destination</td>
				<td>Duration</td>
				<th>Actions</th>
			</tr>
		
			<c:forEach items="${rList}" var="route">
				<tr>
				 
					<td>${route.source}</td>
					<td>${route.destination}</td>
					<td>${route.duration}</td>
					<td><a href="edit?id=<c:out value='${route.routeId}' />">Book</a></td>
							
					 <td><input value="Book" type="submit" /></td>
				</tr>
				
			</c:forEach>

		</table>
</form>

</body>
</html>