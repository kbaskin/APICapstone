<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LANDING-ZONE</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.4.1/lux/bootstrap.min.css" rel="stylesheet" integrity="sha384-oOs/gFavzADqv3i5nCM+9CzXe3e5vXLXZ5LZ7PplpsWpTCufB7kqkTlC9FtZ5nJo" crossorigin="anonymous">



</head>
<body>

	<div class="container">
	
	<table style = "width:100%">
  <tr>
    <th>Event</th>
    <th>Event Type</th>
    <th>Event Date</th>
    <th>Save Event</th>
    <th></th>
  </tr>
  <c:forEach var="eR" items="${eventResults }">
  <tr>
    <td><a href="${eR.url }">${eR.name }</a></td>
    
    <td><c:forEach var ="t" items="${eR.classifications }">
    ${t.segment.name }
    </c:forEach></td>
    
	<td> ${eR.dates.start.localDate }</td>
	
  <td><a href="add-event?${eR }">Add Event</a></td>
  
  </tr>
  </c:forEach>
  
</table>

<a class="btn btn-primary" href="bucketlist">Saved Event List</a>
	</div> 
	



</body>
</html>