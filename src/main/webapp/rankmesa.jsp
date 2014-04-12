<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<html>

  <head>
    <link type="text/css" rel="stylesheet" href="/stylesheets/main.css" />
  </head>

  <body>


<c:if test="${rankSize == 0}">
<p>Sem compras.</p>
</c:if>

<c:if test="${rankSize > 0}">
	<c:forEach var="mesa" items="${rankMesa}">
			<p><b>Mesa: ${mesa.nome}  pontos  ${mesa.pontos} </b></p>
		    
	</c:forEach>
</c:if>

  </body>
</html>