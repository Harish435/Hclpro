<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="false"%>
<html>
<head>
<title>BOOKING HOME</title>
</head>
<body>

	<h1 style="pitch: medium;">Your Ride has been booked successfully</h1>

	<table style="width: 80%;border: 2px">
		<tr>
			<td><b>Id</b></td>
			<td><b>UserId</b></td>
			<td><b>RouteId</b></td>
			<td><b>Date</b></td>
		</tr>

		<tr>
			<td>${ride.rideId}</td>
			<td>${ride.userId}</td>
			<td>${ride.routeId}</td>
			<td>${ride.dateTime}</td>
		</tr>


	</table>
</body>
</html>
