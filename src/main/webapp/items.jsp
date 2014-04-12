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
    
	  <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
	      <div class="container">
	        <div class="navbar-header">
	          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
	            <span class="sr-only">Toggle navigation</span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	          </button>
	          <a class="navbar-brand" href="#">Festa de Aniversário</a>
	        </div>
	        <div class="collapse navbar-collapse">
	          <ul class="nav navbar-nav">
	            <li class="active"><a href="#">Home</a></li>
	            <li><a href="#about">About</a></li>
	            <li><a href="#contact">Contact</a></li>
	          </ul>
	        </div><!--/.nav-collapse -->
	      </div>
	    </div>
	
	    <div class="container">
	    
	    	<div class="col-md-12 col-xs-12">
	    	
	    		<div class="col-md-6 col-xs-6">
	    			<h2>
	    				Sonhos
	    			</h2>
	    		</div>
	    		<div class="col-md-6 col-xs-6">
	    			<h2>
	    				Balões
	    			</h2>
	    		</div>
	    			
				<c:if test="${itemsSize == 0}">
				<p>Nenhum item encontrado.</p>
				</c:if>
				
				<c:if test="${itemsSize > 0}">
					<c:forEach var="item" items="${items}">
					
						<div class="col-sm-4 col-xs-4">
							<h2>
								${item.name}
							</h2>
							<br>
							<h4>
								${item.value}
							</h4>
						</div>
										
					</c:forEach>
				</c:if>				      
			</div>
	    </div><!-- /.container -->
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <script src="static/js/bootstrap.min.js"></script>
    
  </body>
</html>