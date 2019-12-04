<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.4.1/lux/bootstrap.min.css" rel="stylesheet" integrity="sha384-oOs/gFavzADqv3i5nCM+9CzXe3e5vXLXZ5LZ7PplpsWpTCufB7kqkTlC9FtZ5nJo" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>

<div class = "container">
<div class = "jumbotron"><h1>E v e n t s t e r</h1><p> <i>Your personal event manager!</i></p></div>
</div>

	<div class = "container">
	
	Select an <i>event type</i>:
	<select>
	<option></option>
	<option>Sports</option>
	<option>Concerts</option>
	<option>Arts & Theatre</option>
	<option>Family</option>
	</select>
	
	<br></br>
	<br></br>
	
	<form>
		Enter a <i>zip code</i>: <input type = "text" placeholder="i.e. 48236">
	</form>
	<br></br>
	<form>
		Enter a <i>date range</i> for the event: Between <input type = "text" placeholder = "yyyy-mm-dd"> and <input type = "text" placeholder = "yyyy-mm-dd">
	</form>
	<br>
	</div>
	<div class = "container">
	 <input type = "submit" class = "btn btn-primary">
	 </div>
	
	<br></br>
	
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
    <td>${e.name }</td>
    <td>${e.type }</td>
    <td>${e. }
  </tr>
  </c:forEach>
</table>


	
	</div> 

</body>
</html>