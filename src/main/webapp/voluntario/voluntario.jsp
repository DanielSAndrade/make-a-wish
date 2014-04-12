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
<link rel="stylesheet" href="https://d7mj4aqfscim2.cloudfront.net/proxy/css2/1432716e7692f2d96877ff8f486cdfe7_mv_1432716e7692f2d96877ff8f486cdfe7.min.css">
<link rel="stylesheet" href="../static/css/main.css">


<script src="../static/js/vendor/modernizr-2.6.2-respond-1.1.0.min.js"></script>
</head>
<body>


	<div id="topbar">
		<header class="topbar  topbar-blue">
			<div class="container">
				<div class="topbar-nav">
					<ul class="topbar-nav-main">
						<li id="home-nav" ><a style="font-size: 45px;" href="/">Evento Gala</a></li>
					</ul>
				</div>
			
			</div>
		</header>
	</div>

	<br>
	<br>
	<br>
	<br>
	<div class="container">

		<form role="form">
			<div class="form-group">
				<label for="exampleInputEmail1">Mesa</label> 
				<select class="form-control">
					<option value="">Selecione</option>
				    <option value="1">1 - Mesa Amor</option>
				    <option value="2">2 - Mesa Esperanca</option>
				    <option value="3">3 - Mesa Saude</option>
				    <option value="4">4 - Mesa Fe</option>
				</select>
			</div>
			
			<div class="form-group">
				<label for="exampleInputEmail1">Participantes</label> 
				<select class="form-control">
					<option value="">Selecione</option>
				    <option value="1">Jose</option>
				    <option value="2">Maria</option>
				    <option value="3">Joao</option>
				</select>
			</div>
			
			<div class="form-group">
				<label for="exampleInputEmail1">Produto</label> 
				<select class="form-control">
					<option value="">Selecione</option>
				    <option value="1">Balao</option>
				    <option value="2">Sonho</option>
				    <option value="3">Leilao</option>
				</select>
			</div>
			
			<button type="submit" class="btn btn-default">Comprar</button>
		</form>

		<hr>

		<footer>
			<p>&copy; Company 2014</p>
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

