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
	
	<form>
		Enter a <i>zip code</i>: <input type = "text" placeholder="i.e. 48236"><input type = "submit">
	</form>
	<br></br>
	<form>
		Enter a <i>date range</i> for the event: Between <input type = "text" placeholder= "ie. 02-24-19"> and <input type = "text" placeholder = "ie. 03-01-19"><input type = "submit">
	</form>
	</div>
	
	<br></br>
	
	<div class="container">
	
	</div>

</body>
</html>