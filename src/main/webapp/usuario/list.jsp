<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Make-A-Wish</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/estilo.css" rel="stylesheet">
</head>
<body>

	<div class="container-fluid fundo_cabecalho">
		<div class="container">
			<div class="row" id="cabecalho">
				<div class="span5 div_logomarca">
					<a href="index.html" title="Página Inicial"> <img
						src="static/img/make-a-wish-logo.png" width="237" height="57">
					</a>
				</div>
				<div class="span7 div_menu">
					<div class="btn-group pull-right">
						<a href="index.html" class="btn btn-large">Página Inicial</a> <a
							href="catalogo.jsp" class="btn btn-large btn-primary">Catálogo</a>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div class="container-fluid">
		<div class="span12">
			<h1>Cadastro de voluntários:</h1>
			<div class="row-fluid">
				<div class="span12">
					<a href="/usuario?action=novo" class="btn btn-default">Novo</a>
				</div>

			</div>
			<table width="100%" class="table table-bordered">
				<thead>
					<tr>
						<th>User ID</th>
						<th>Nome</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>dardis</td>
						<td>Daniel</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>

	<div class="container-fluid">
		<div class="container">
			<div class="row">
				<div class="span12 fundo_branco">
					<p align="center">
						<strong>Todos os direitos reservados</strong>
					</p>
					<p align="center">Make-A-Wish</p>
				</div>
			</div>
		</div>
	</div>

</body>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.7/jquery.min.js"
	type="text/javascript"></script>
<script src="static/js/bootstrap.min.js"></script>
</html>