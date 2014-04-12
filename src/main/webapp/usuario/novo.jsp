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
			<h1>Novo Voluntário:</h1>
			<div class="row-fluid">
				<form class="form-horizontal">

					<input type="hidden" name="action" value="criar">

					<div class="control-group">
						<label class="control-label" for="userId">ID:</label>
						<div class="controls">
							<input type="text" name="userId" id="userId"
								placeholder="Identificador">
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="nome">Nome:</label>
						<div class="controls">
							<input type="text" name="nome" id="nome"
								placeholder="Identificador">
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="password">Password</label>
						<div class="controls">
							<input type="password" name="password" id="password"
								placeholder="Password">
						</div>
					</div>
					<div class="control-group">
						<div class="controls">
							<button type="submit" class="btn">Criar</button>
							<a href="/usuario" class="btn btn-default">Cancelar</a>
						</div>
					</div>
				</form>
			</div>
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