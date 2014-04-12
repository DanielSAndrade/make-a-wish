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
				
				<div class="topbar-right">
					<ul class="topbar-nav-main">
						<li id="home-nav"><a href="/mesa">Mesas</a></li>
						<li id="stream-nav"><a href="/recompensa">Ranking</a></li>
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


		<div class="row">
			<div class="col-sm-8">

				<c:forEach var="sonho" items="${sonhos}">

					<div class="col-sm-6 col-md-6">
						<div class="thumbnail">
							<div class="caption">
								<h3>${sonho.descricao}</h3>
								<p>${sonho.crianca.nome}</p>
							</div>
						</div>
					</div>

				</c:forEach>

			</div>
			<div class="col-sm-4">

				<div class="box-colored white">
					<h2>
						Ranking da Mesa
					</h2>
					<div class="sidebar-progress" style="">


						<ul class="sidebar-stats">
							<li><span class="icon icon-lingot-small"></span> <strong>Doações</strong></li>
							<li><span class="icon icon-words-small">p</span><strong><span id="word-count">10</span></strong> Pontos</li>
						</ul>
						<ul class="sidebar-stats">
							<li><span class="icon icon-heart-medium"></span> <strong>Baloes</strong></li>
							<li><span class="icon icon-words-small">p</span><strong><span id="word-count">93</span></strong> Pontos</li>
						</ul>
						<ul class="sidebar-stats">
							<li><span class="icon icon-streak-small"></span> <strong>Livros</strong></li>
							<li><span class="icon icon-words-small">p</span><strong><span id="word-count">1</span></strong> Pontos</li>
						</ul>
					</div>
					
					
					
					<div class="strenghten-skills-container">
						<a href="/practice" class="btn btn-primary btn-block btn-strengthen-skills">
						<span
							class="strength">
							<span
								class="icon icon-practice-small-white"></span></span><span
							class="skill-icon-strength skill-icon-strength-micro strength-5"></span>
							Desafios</a>
					</div>
				</div>

				<div class="box-gray">
					<div id="ranking" class="stream-leaderboard">
						<h2>Parcipantes</h2>
						
						
						<div id="points-ranking" class="board" style="position: relative;">
							<ul class="list-leaderboard list-leaderboard-empty">
							
							<c:forEach var="participante" items="${participantes}">
								<li class="list-leaderboard-item">
										<a href="/caio.olive6" class="avatar avatar-small " title="caio.olive6">
										<img
										class="lazy"
										src="https://s3.amazonaws.com/duolingo-images/avatar/default_2/large"
										data-original="https://duolingo-images.s3.amazonaws.com/avatars/21476613/eH5bTgNub8/large"
										width="50" height="50"><span class="ring"></span></a>
									<h5 style="margin-bottom: 5px;">${participante.nome}</h5>
								</li>					
							</c:forEach>
		
							</ul>
						</div>
						
						
					</div>
				</div>
			</div>
		</div>

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

