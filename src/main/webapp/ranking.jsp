<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
  <body>

    <h1 style="text-align:center">Ranking</h1>

    
	<table align="center" style="width:300px; border:1px solid gray;">
	<tr style="background-color:blue;color:white">
	  <th>Mesa</th>
	  <th>Status</th> 
	  <th>Pontuação</th>
	</tr>
    <c:forEach items="${tables}" var="table">
    <tr style ="border:1px solid gray; text-align:center">
        <td>${table.number}</td>
        <td>${table.level}</td>
        <td>${table.score}</td>
    </tr>
</c:forEach>
	</table>
  </body>
</html>