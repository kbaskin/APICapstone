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
    <th></th>
  </tr>
  <c:forEach var="e" items="${eventResults }">
  <tr>
    <td><a href="${e.url }">${e.name }</a></td>
    
    <td><c:forEach var ="t" items="${e.classifications }">
    ${t.segment.name }
    </c:forEach></td>
    
	<td> ${e.dates.start.localDate }</td>
  </tr>
  </c:forEach>
</table>


	
	</div> 


</body>
</html>