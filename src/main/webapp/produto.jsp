<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<t:template>
	<jsp:body>
    	<div class="row">
	   		<div class="col-lg-12">
				<h1><strong>Lista de Vendas</strong></h1>
				<br />
				<table class="table table-striped">
					<thead>
						<tr>
							<th>#</th>
							<th>Produto</th>
							<th>Valor</th>
							<th>Mesa</th>
						</tr>
					</thead>
				</table>
	        </div>
    	</div>
    	<script src="/static/js/jquery-2.0.2.min.js"></script>
	    <script src="/static/js/additional-methods.min.js"></script>
		<script src="/static/js/bootstrap.min.js"></script>
		<script>
			$(document).ready(function() {
				$.getJSON( "/vendas/listVendas", function( data ) {
					var items = [];
					$.each( data, function( key, val ) {
						items.push("<tr><td>" + (key + 1) + "</td><td>" + val.produto.descricao + "</td><td>" + val.produto.preco + "</td><td>" + val.numeroMesa + "</td></tr>");
					});
					$( "<tbody/>", {
						"class": "vendas-list", html: items.join( "" )
					}).appendTo("table");
					
				});
			});
		</script>
	</jsp:body>
</t:template>