<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<html>
<head>
	<meta charset="UTF-8">
    <title>Make a Wish - GALA</title>
    <link rel="Stylesheet" type="text/css" href="static/css/banner.css" /> 
    <link rel="Stylesheet" type="text/css" href="http://gbscripts.webs.com/SmoothDivScroll-1.2/css/smoothDivScroll.css"/> 
    
    <script language="JavaScript">
    	function detalhar(idProduto) {
        	document.getElementById("idProduto").value=idProduto;
        	document.produtos.action="/produto/detalhe";
        	document.produtos.submit();
        }
    </script>
    
</head>

 
<body>
<div id="main">
	<div id="topo">
		<h1 id="titulo">Adote um Sonho</h1>
	</div>
	<div id="makeMeScrollable"> 
    	<a href="" ><img src="static/assets/sonho1.jpg" height="300px" border="0"/></a>
    	<a href="" ><img src="static/assets/sonho2.jpg" height="300px" border="0"/></a> 
    </div>
    <div id="topo">
		<h2>Adquira nossos produtos e colabore!</h2>
	</div>
	<div style="height:50px; overflow-y: scroll;">
	<form name="produtos" id="produtos">
		<input type="hidden" name="idProduto" id="idProduto" />
		<table id="catalogo" cols="3">
			<tr>
			<th width=33%/>
			<th width=33%/>
			<th />
			</tr>
			<tr>
				<c:forEach var="produto" items="${produtos}" varStatus="posicao">
						<td>
							<a href="javascript:detalhar('${produto.nome}');">
							<div class="produto">
								<p>${produto.nome}</p>
								<img class="produto" src="${produto.foto}">
							</div>
							</a>
						</td>
					<c:if test="${posicao.index%3 == 2}">
						</tr>
						<tr>
					</c:if>
				</c:forEach>
			</tr>
		</table>
	</form>
	</div>
</div>
<div id="menu">
	<img id=logo src="static/assets/logo.png">
	<div style="background: #FFF" >
		<c:if test="${mesa == null}">
			<p class="text" style="font-size: 30px;">Informe uma mesa</p>
		</c:if>
		<c:if test="${mesa != null}">
			<p class="text" style="font-size: 30px;">Mesa: ${mesa.nome}<br>Pontuação: ${mesa.pontos}</p>
		</c:if>
	</div>
	
	<div class="button_big">
		<p>Dispute a lideraça do Ranking </p>
	</div>
	
	<div class="button_big" >
		<p>Conquiste Medalhas</p>
		<img src="static/assets/medalha.jpeg">
	</div>
</div>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script> 
<script src="http://gbscripts.webs.com/SmoothDivScroll-1.2/js/jquery-ui-1.8.18.custom.min.js" type="text/javascript"></script> 
<script src="http://gbscripts.webs.com/SmoothDivScroll-1.2/js/jquery.mousewheel.min.js" type="text/javascript"></script> 
<script src="http://gbscripts.webs.com/SmoothDivScroll-1.2/js/jquery.smoothdivscroll-1.2-min.js" type="text/javascript"></script> 
<script type="text/javascript"> 
    $(document).ready(function () {
		console.log("test");
        $("div#makeMeScrollable").smoothDivScroll({  
        	mousewheelScrolling: true, manualContinuousScrolling: true,            
            visibleHotSpotBackgrounds: "always", 
            autoScrollingMode: "onStart"
   		});
	});    
</script> 
</body>
</html>
