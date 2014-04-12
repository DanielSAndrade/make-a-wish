<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Make a wish - Leilão</title>

   
    <!-- Bootstrap -->
    <link href="/page/bootstrap/css/bootstrap.min.css" rel="stylesheet">
       <link href="/page/css/main.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>

    <div class="container">
        <h1 class="page-header page-top">
            <img src="/page/images/MAW.jpg"></img>
            <span>Gala - Leilão</span>
        </h1>
        <div class="col-md-10">
            <ul class="list-group">
                <c:forEach var="product" items="${products}">
                <!-- PRODUTO -->
                <li class="list-group-item product-item">
                    <div class="row">
                        <div class="col-md-2">
                            <img src="${product.imageURL}"></img>
                        </div>
                        <div class="col-md-10 product-info">
                            <span class="product-id">${product.id}</span>
                            <h3>${product.description}</h3>
                            Quantidade: 
                            <span class="glyphicon glyphicon-plus qtd-control"></span>
                            <input type="text" class="form-control input-sm product-qtd" value="0">
                            <span class="glyphicon glyphicon-minus qtd-control"></span>
                        </div>
                    </div>
                </li>
                <!-- PRODUTO -->
                </c:forEach>
            </ul>
            <button type="button" class="btn btn-primary btn-lg" id="bt-comprar">Comprar!</button>
        </div>
        <div class="col-md-2">
            <div class="row">
                <h3>Rank</h3>
                <table class="table table-hover">
                    <tr>
                        <th>#</th>
                        <th>Mesa</th>
                        <th>Pontos</th>
                    </tr>
                    <tr>
                        <td>
                           <span class="label label-info"> 1 </span>
                        </td>
                        <td>
                            Mesa 53
                        </td>
                        <td>
                            35
                        </td>
                    </tr>
                    <tr>
                        <td>
                           <span class="label label-info"> 2 </span>
                        </td>
                        <td>
                            Mesa 20
                        </td>
                        <td>
                            20
                        </td>
                    </tr>
                    <tr>
                        <td>
                           <span class="label label-info"> 3 </span>
                        </td>
                        <td>
                            Mesa 59
                        </td>
                        <td>
                            19
                        </td>
                    </tr>
                    <tr>
                        <td>
                           <span class="label label-info"> 4 </span>
                        </td>
                        <td>
                            Mesa 10
                        </td>
                        <td>
                            10
                        </td>
                    </tr>
                    <tr>
                        <td>
                           <span class="label label-info"> 5 </span>
                        </td>
                        <td>
                            Mesa 11
                        </td>
                        <td>
                            3
                        </td>
                    </tr>
                </table>
            </div>
            <div class="row">
                <h3>Últimas compras</h3>
                <ul class="list-group">
                    <li class="list-group-item product-item">
                        <span class="label label-default">53</span> comprou um Balão surpresa
                    </li>
                    <li class="list-group-item product-item">
                        <span class="label label-default">53</span> irá realizar um sonho
                    </li>
                    <li class="list-group-item product-item">
                        <span class="label label-default">53</span> comprou um livro
                    </li>
                </ul>
            </div>
        </div>
    </div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="/page/bootstrap/js/bootstrap.min.js"></script>

    <script src="/page/js/controller.js"></script>
  </body>
</html>