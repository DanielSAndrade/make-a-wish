<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Festa de Aniversário</title>

    <!-- Bootstrap -->
    <link href="static/css/bootstrap.min.css" rel="stylesheet">
    <link href="static/css/custom.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
    
	  <div class="col-md-12 col-xs-12">	    	
    	<div class="pull-right">
    		<img alt="Make A Wish" src="static/img/make-a-wish-logo.jpg" style="width: 200px;">
    	</div>    	
   	  </div>
	
	    <div class="container">	    
	    	<div class="col-md-12 col-xs-12 text-center">
	    		<img alt="" src="static/img/avatars/spidertocat.png" style="width: 300px;">
	    		<h2>Total de Pontos: 128</h2>
	    	</div>
	    
	    	<div class="col-md-12 col-xs-12">	    			
				<c:if test="${itemsSize == 0}">
				<p>Nenhum item encontrado.</p>
				</c:if>
				
				<c:if test="${itemsSize > 0}">				
					<div class="col-md-12 col-xs-12">						
			        <c:forEach var="item" items="${items}">
						<div class="col-md-4 col-xs-4">
					      	<h3>${item.name}</h3> 
					      	R$ ${item.value}
					    </div>										
					</c:forEach>					      					
					</div>				
				</c:if>	 	      
			</div>
			
	    </div><!-- /.container -->
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <script src="static/js/bootstrap.min.js"></script>
    
  </body>
</html>