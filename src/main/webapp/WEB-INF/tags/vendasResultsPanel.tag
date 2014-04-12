<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ attribute name="searchVOList" required="true" type="java.util.List" %>
<%@ attribute name="panelTitle" required="true" type="java.lang.String" %>
<c:set var="panelContext" value="${pageContext.request.contextPath}"/>
<div class="panel panel-default">
   	<div class="panel-heading"><b>${panelTitle}</b></div>
	<c:if test="${searchVOList.isEmpty()}">
		<div class="panel-body">
			<p>No file(s) found...</p>
		</div>
	</c:if>
	<c:if test="${!searchVOList.isEmpty()}">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>#</th>
					<th>Nome</th>
					<th>Preço</th>
					<th>Mesa</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${searchVOList}" var="item" varStatus="num">
					<tr>
						<td>${num.index + 1}</td>
						<td>${item.produto.descricao}</td>
						<td>${item.produto.preco}</td>
						<td>${item.numeroMesa}</td>
						<td>
							<button type="button" class="btn btn-xs btn-danger" onclick="window.location.href='${panelContext}${item.link}';"><span class="glyphicon glyphicon-download-alt"></span></button>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</c:if>
</div>