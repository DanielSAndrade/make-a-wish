<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<html>

  <head>
    <link type="text/css" rel="stylesheet" href="/stylesheets/main.css" />
  </head>

  <body>


<c:if test="${userAuthenticated == 'true'}">
<p>Hello, ${nickname}! (You can <a href="${logoutURL}">sign out</a>.)</p>
</c:if>

<c:if test="${userAuthenticated == 'false'}">
<p>Hello! <a href="${loginURL}">Sign in</a> to include your name with compras you post.</p>
</c:if>

<c:if test="${comprasSize == 0}">
<p>The guestbook has no messages.</p>
</c:if>

<c:if test="${comprasSize > 0}">
	<c:forEach var="compra" items="${compras}">
		<c:if test="${compra.mesa == null}">
			<p>An anonymous person wrote:</p>
		</c:if>
		<c:if test="${compra.mesa != null}">
			<p><b>${compra.mesa.nickname}</b> wrote:</p>
		</c:if>
		<blockquote>${compra.produto}</blockquote>
	</c:forEach>
</c:if>

<c:if test="${topMesasSize > 0}">
	<c:forEach var="mesa" items="${topMesas}">
	<ul>
	
		<li>${mesa.name}</li>
		<li>${mesa.valor}</li>
		<li>${mesa.poder}</li>
		<li>${mesa.pontos}</li>
	</ul>
	</c:forEach>
</c:if>



  <form action="/sign" method="post">
    <div><textarea name="produto" rows="3" cols="60"></textarea></div>
    <div><textarea name="valor" rows="3" cols="60"></textarea></div>
    <div><textarea name="comprador" rows="3" cols="60"></textarea></div>
    
    <div><input type="submit" value="Post Greeting" /></div>
  </form>

  </body>
</html>