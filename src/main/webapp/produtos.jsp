<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<t:template>
	<jsp:body>
    	<div class="row">
	   		<div class="col-lg-12">
				<h1><strong>Cat&aacute;logo de Produtos</strong></h1>
				<br />
				
				
				
				<div class="row" id="row2">
					<div class="col-lg-6">
						<form id="vendasForm" action="${bodyContext}/api/insertVenda" enctype="multipart/form-data" method="post">
							<div class="form-group">
								<label>IdProd</label>
								<input type="text" id="idProd" name="idProd" class="form-control" placeholder="Id Produto" />
							</div>
							<div class="form-group">
								<label>Pre&ccedil;o</label>
								<input type="text" id="precoProd" name="precoProd" class="form-control" placeholder="Preco Produto" />
							</div>
							<div class="form-group">
								<label>Tipo</label>
								<input type="text" id="tipoProd" name="tipoProd" class="form-control" placeholder="Tipo Produto" />
							</div>
							<div class="form-group">
								<label>Mesa</label>
								<input type="text" id="numMesa" name="numMesa" class="form-control" placeholder="Mesa" />
							</div>
							<div class="form-group">
								<label>Tablet</label>
								<input type="text" id="codComp" name="codComp" class="form-control" placeholder="Tablet" />
							</div>
							<div class="form-group">
								<div class="input-group">
									<span class="input-group-addon">m@il</span>
									<input id="userMail" type="email" name="userMail" class="form-control" placeholder="Your eMail" required data-validation-required-message="Please enter your eMail" />
								</div>
							</div>
							<button id="nextRow2" class="btn btn-danger" type="button">Send it!</button>
						</form>
					</div>
				</div>
	        </div>
    	</div>
	</jsp:body>
</t:template>