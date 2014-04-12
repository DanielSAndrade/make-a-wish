<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<html>

  <head>
    <link type="text/css" rel="stylesheet" href="/stylesheets/main.css" />
  </head>

  <body>



<c:if test="${rankSize > 0}">
	<c:forEach var="rank" items="${rankMesa}">
			<p><b>  ${rank.posicao} - Mesa: ${rank.mesa.nome}  -  Pontos  ${rank.mesa.pontos} </b></p>
		    
	</c:forEach>
</c:if>

  </body>
</html>