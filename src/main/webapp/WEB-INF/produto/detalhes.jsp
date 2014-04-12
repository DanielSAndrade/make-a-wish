<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>

	<head>
	   <link type="text/css" rel="stylesheet" href="/stylesheets/main.css" />
	</head>

	<body>
		<form action="comprar" name="form" id="form">
			<input type="hidden" value="${produto.nome}" id="idProduto"
				name="idProduto" />
			<p>
				<b>${produto.nome}</b>
			</p>
			<p>
				<img alt="${produto.nome}" src="${produto.imagem}">
			</p>
			Mesa: ${produto.descricao} - Pontos ${produto.pontos} - Pre&ccedil;o <fmt:formatNumber value="${produto.preco}" type="currency" />
			</b>
			</p>
			<a href="javascript:form.submit()">Comprar</a>
		</form>
	</body>
</html>