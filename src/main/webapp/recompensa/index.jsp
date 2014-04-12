<%@page import="com.ciandt.hackathon.entity.TipoDoacao"%>
<%@page import="java.util.Hashtable"%>
<%@page import="com.ciandt.hackathon.entity.Mesa"%>
<%@page import="java.util.List"%>
<%@page import="com.ciandt.hackathon.dao.MesaDAO"%>
<%@page import="com.ciandt.hackathon.dao.ObjectifyMesaDAO"%>
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

<script src="../static/js/vendor/modernizr-2.6.2-respond-1.1.0.min.js"></script>
</head>
<body>
		<!-- NAV BAR START -->
	<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Evento Gala [Time Playstation]</a>
        </div>
        <div class="collapse navbar-collapse navbar-right">
          <ul class="nav navbar-nav">
            <li><a href="#">Sonhos</a></li>
	        <li class="dropdown">
	          <a href="#" class="dropdown-toggle" data-toggle="dropdown">Recompensas <b class="caret"></b></a>
	          <ul class="dropdown-menu">
	            <li><a href="#">Recompensas Conquistadas</a></li>
	            <li><a href="#">Desafios</a></li>
	          </ul>
	        </li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </div>	
	<!-- NAV BAR END -->
	
	
	<!-- SCORE LIST START -->
	<div class="container" style="padding-top: 20px; font-size: 20px">
	
	<div class="row">
		<div class="col-lg-8 col-lg-offset-2">
			
		<!-- LINHA DA MESA START -->
		<style>
			.rank img {
				margin-right: 10px;
				margin-left: 10px;
			}
		</style>
		
		<%
		MesaDAO mesaDAO = new ObjectifyMesaDAO();
		List<Mesa> mesas = mesaDAO.findMesas();
		
	
			
		for(Mesa mesa: mesas){
	
			Hashtable<TipoDoacao, Integer> pontuacao = mesaDAO.getDoacoes(mesa);
			%>
			<div class="row well rank">
				<div class="col-lg-4 col-md-4 col-sm-4"><%= mesa.getNome() %></div>
				<div class="col-lg-4 col-md-4 col-sm-4">100 pontos</div>
				<div class="col-lg-4 col-md-4 col-sm-4"  style="text-align: center">
					<span style="text-align: center">
					<img src="../static/images/balao.png" style="width: 26px; height: 26px;"> 20
					<img src="../static/images/coracao.png" style="width: 26px; height: 26px"> 5
					<img src="../static/images/martelo.png" style="width: 26px; height: 26px"> 9
					</span>
				</div>
			</div>
			<%
		}
		
		%>
		
		<div class="row well rank">
			<div class="col-lg-4 col-md-4 col-sm-4">Mesa Amor</div>
			<div class="col-lg-4 col-md-4 col-sm-4">100 pontos</div>
			<div class="col-lg-4 col-md-4 col-sm-4"  style="text-align: center">
				<span style="text-align: center">
				<img src="../static/images/balao.png" style="width: 26px; height: 26px;"> 20
				<img src="../static/images/coracao.png" style="width: 26px; height: 26px"> 5
				<img src="../static/images/martelo.png" style="width: 26px; height: 26px"> 9
				</span>
			</div>
		</div>
		
		<div class="row well rank">
			<div class="col-lg-4 col-md-4 col-sm-4">Mesa Esperanca</div>
			<div class="col-lg-4 col-md-4 col-sm-4">80 pontos</div>
			<div class="col-lg-4 col-md-4 col-sm-4"  style="text-align: center">
				<span style="text-align: center">
				<img src="../static/images/balao_black.png" style="width: 26px; height: 26px;"> 2
				<img src="../static/images/coracao.png" style="width: 26px; height: 26px"> 6
				<img src="../static/images/martelo.png" style="width: 26px; height: 26px"> 3
				</span>
			</div>
		</div>
		
		<div class="row well rank">
			<div class="col-lg-4 col-md-4 col-sm-4">Mesa Saude</div>
			<div class="col-lg-4 col-md-4 col-sm-4">70 pontos</div>
			<div class="col-lg-4 col-md-4 col-sm-4"  style="text-align: center">
				<span style="text-align: center">
				<img src="../static/images/balao.png" style="width: 26px; height: 26px;"> 15
				<img src="../static/images/coracao.png" style="width: 26px; height: 26px"> 7
				<img src="../static/images/martelo_black.png" style="width: 26px; height: 26px"> 5
				</span>
			</div>
		</div>
		
		<div class="row well rank">
			<div class="col-lg-4 col-md-4 col-sm-4">Mesa Fe</div>
			<div class="col-lg-4 col-md-4 col-sm-4">50 pontos</div>
			<div class="col-lg-4 col-md-4 col-sm-4"  style="text-align: center">
				<span style="text-align: center">
				<img src="../static/images/balao.png" style="width: 26px; height: 26px;"> 10
				<img src="../static/images/coracao_black.png" style="width: 26px; height: 26px"> 3
				<img src="../static/images/martelo_black.png" style="width: 26px; height: 26px"> 1
				</span>
			</div>
		</div>
		<!-- LINHA DA MESA END -->
		
		</div>
	</div>
		
	</div>
	<!-- SCORE LIST END -->
	
	
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
