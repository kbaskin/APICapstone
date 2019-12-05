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
	
	
	<br></br>
	<br></br>
	
	<form action = "/landing-zone">
	
	Select an <i>event type</i>:
	<select name = "segmentName">
	<option value="Sports">Sports</option>
	<option value="Music">Music</option>
	<option value="Miscellaneous">Miscellaneous</option>
	</select>
	
		Enter a <i>zip code</i>: <input name = "postalCode" type = "text" placeholder="i.e. 48236">
	
	<br></br>
	
	Enter a <i>date range</i> for the event: <input name = "localDate" type = "text" placeholder = "yyyy-mm-dd"> 
	
	<br>
	<div class = "container">
	 <input type = "submit" class = "btn btn-primary">
	 </div>
	</form>
	</div>
	
	<br></br>
	

</body>
</html>