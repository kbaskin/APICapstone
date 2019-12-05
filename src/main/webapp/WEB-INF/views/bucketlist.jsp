<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/sketchy/bootstrap.min.css" rel="stylesheet" integrity="sha384-N8DsABZCqc1XWbg/bAlIDk7AS/yNzT5fcKzg/TwfmTuUqZhGquVmpb5VvfmLcMzp" crossorigin="anonymous">
</head>
<body>

<table>
  <tr>
    <th>Event</th>
    <th>Event Type</th>
    <th>Event Date</th>
    <th>Remove</th>
  </tr>
  <c:forEach var = "e" items = "${savedEvent }">
  <tr>

    <td><a href="${e.url }">${e.name }</a></td>
    
    <td><c:forEach var ="t" items="${e.classifications }">
    ${t.segment.name }
    </c:forEach></td>
    
	<td> ${e.dates.start.localDate }</td>
	
  <td><a href="bucketlist">Remove Event</a></td>
  
  </tr>
  </c:forEach>
</table>


</body>
</html>