<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.google.appengine.api.datastore.DatastoreService" %>
<%@ page import="com.google.appengine.api.datastore.DatastoreServiceFactory" %>
<%@ page import="com.google.appengine.api.datastore.Entity" %>
<%@ page import="com.google.appengine.api.datastore.FetchOptions" %>
<%@ page import="com.google.appengine.api.datastore.Key" %>
<%@ page import="com.google.appengine.api.datastore.KeyFactory" %>
<%@ page import="com.google.appengine.api.datastore.Query" %>
<%@ page import="com.google.appengine.api.users.User" %>
<%@ page import="com.google.appengine.api.users.UserService" %>
<%@ page import="com.google.appengine.api.users.UserServiceFactory" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
    <link type="text/css" rel="stylesheet" href="/stylesheets/main.css"/>
</head>

<body>
	<form action="/vendas/insertVenda" method="post">
	    <div>
		<p>Codigo do produto: <input type="text" name="codProd"/>
		<p>Preço do produto: <input type="text" name="precoProd"/>
		<p>Tipo produto: <input type="text" name="tipoProd"/>
		<p>Número da mesa: <input type="text" name="numMesa"/>
		<p>Tipo produto: <input type="text" name="codComp"/>
	    <input type="submit" value="Enviar venda"/></div>
	</form>
</body>
</html>
