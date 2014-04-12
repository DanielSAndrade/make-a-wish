<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<!DOCTYPE html>
<html class="no-js">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title></title>
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="../static/css/bootstrap.min.css">
<style>
body {
	padding-top: 50px;
	padding-bottom: 20px;
}
</style>
<link rel="stylesheet" href="../static/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="../static/css/main.css">

<script src="Ã§js/vendor/modernizr-2.6.2-respond-1.1.0.min.js"></script>
</head>
<body>

	<!-- Single button -->
	<div class="btn-group">
		<button type="button" class="btn btn-default dropdown-toggle"
			data-toggle="dropdown">
			Mesas: <span class="caret"></span>
		</button>
		<ul class="dropdown-menu" role="menu">
			<c:foreach var="${mesa}" items="${mesas}">
				<li><a href="#">${mesa.nome}</a></li>	
			</c:foreach>
		</ul>
	</div>
	
	<div class="btn-group">
		<button type="button" class="btn btn-default dropdown-toggle"
			data-toggle="dropdown" onselect="/carregaParticipantes">
			Participantes: <span class="caret"></span>
		</button>
		<ul class="dropdown-menu" role="menu">
			<c:foreach var="${part}" items="${mesa.participantes}">
				<li><a href="#">${part.nome}</a></li>	
			</c:foreach>
		</ul>
	</div>
	
	<div class="btn-group">
		<button type="button" class="btn btn-default dropdown-toggle"
			data-toggle="dropdown" onselect="/carregaParticipantes">
			Catálogo: <span class="caret"></span>
		</button>
		<ul class="dropdown-menu" role="menu">
			<c:foreach var="${sonho}" items="${sonhos}">
				<li><a href="#">${sonho.descricao}</a></li>
			</c:foreach>
		</ul>
	</div>

	<hr>

	<footer>
		<p>&copy; Make a Wish 2014</p>
	</footer>
	</div>
	<!-- /container -->

	<script
		src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	<script>
		window.jQuery
				|| document
						.write('<script src="../static/js/vendor/jquery-1.11.0.min.js"><\/script>')
	</script>

	<script src="../static/js/vendor/bootstrap.min.js"></script>

	<script src="../static/js/main.js"></script>
</body>
</html>
