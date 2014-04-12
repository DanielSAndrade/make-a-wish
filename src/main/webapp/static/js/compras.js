var Compras = (function($){
    var app, _private;

    app = {
        listarProdutos: function($form) {
            var produtos = [{
                "nome": "produto 1",
                "preco": "1",
                "imagem" : "https://lh3.ggpht.com/-t9-Xcbo1iuc/TeVHx46GOTI/AAAAAAAAB7o/_2rHHpPZB2c/s1600/baloes-personalizados.jpg"
            },
            {
                "nome": "produto 2",
                "preco": "2",
                "imagem" : "https://lh3.ggpht.com/-t9-Xcbo1iuc/TeVHx46GOTI/AAAAAAAAB7o/_2rHHpPZB2c/s1600/baloes-personalizados.jpg"
            },
            {
                "nome": "produto 3",
                "preco": "3",
                "imagem" : "https://lh3.ggpht.com/-t9-Xcbo1iuc/TeVHx46GOTI/AAAAAAAAB7o/_2rHHpPZB2c/s1600/baloes-personalizados.jpg"
            },
            {
                "nome": "produto 4",
                "preco": "4",
                "imagem" : "https://lh3.ggpht.com/-t9-Xcbo1iuc/TeVHx46GOTI/AAAAAAAAB7o/_2rHHpPZB2c/s1600/baloes-personalizados.jpg"
            },
            {
                "nome": "produto 5",
                "preco": "5",
                "imagem" : "https://lh3.ggpht.com/-t9-Xcbo1iuc/TeVHx46GOTI/AAAAAAAAB7o/_2rHHpPZB2c/s1600/baloes-personalizados.jpg"
            },
            {
                "nome": "produto 6",
                "preco": "6",
                "imagem" : "https://lh3.ggpht.com/-t9-Xcbo1iuc/TeVHx46GOTI/AAAAAAAAB7o/_2rHHpPZB2c/s1600/baloes-personalizados.jpg"
            },
            {
                "nome": "produto 7",
                "preco": "7",
                "imagem" : "https://lh3.ggpht.com/-t9-Xcbo1iuc/TeVHx46GOTI/AAAAAAAAB7o/_2rHHpPZB2c/s1600/baloes-personalizados.jpg"
            },
            {
                "nome": "produto 8",
                "preco": "8",
                "imagem" : "https://lh3.ggpht.com/-t9-Xcbo1iuc/TeVHx46GOTI/AAAAAAAAB7o/_2rHHpPZB2c/s1600/baloes-personalizados.jpg"
            }];
           
            var $carrossel = $("#carouselInner");
            console.log("Antes do for");
            var limiteCarrossel = 3;
            for(var i = 0; i < limiteCarrossel && i < produtos.length; i++) {
                var $itemCarrossel = $("<div />", {'class':'item'});
                var $imagemProduto = $("<img />", {
                        'class':'featurette-image img-responsive',
                        'src' : produtos[i].imagem,
                        'alt' : 'Generic'
                    });
                var $container = $("<div />", {'class' : 'container'});
                var $rotuloCarrossel = $("<div />", {'class' : 'carousel-caption'});
                var $tituloProduto = $("<h1 />", {'class':'h1'});
                var $containerBotao = $("<p />", {'class' : 'p'});
                var $descricaoProduto = $("<p />", {'class' : 'p'});
                var $botaoComprar = $("<a />", {
                        'class' : 'btn btn-lg btn-primary',
                        'data-toggle' : 'modal',
                        'data-target' : '#myModal',
                        'href' : '#',
                        'role' : 'button',
                        'text' : 'Comprar'
                    });

                $containerBotao.append($botaoComprar)
                $container.append($tituloProduto);
                $container.append($descricaoProduto);
                $container.append($containerBotao);
                $itemCarrossel.append($imagemProduto);
                $itemCarrossel.append($container);
                $carrossel.append($itemCarrossel);
                console.log($itemCarrossel);
            }
            console.log("Depois do for");
            $carrossel.carousel();

            for(var i = limiteCarrossel; i < produtos.length; i++) {
                var $divRowProdutoMenor = $("#containerMarketing");
                var $divProdutoMenor = $("<div />", {"class": "col-lg-4"});
                var $imgProdutoMenor = $("<img />", {
                    "class":"",
                    "src":produtos[i].imagem,
                    "alt":"",
                    "style":"width: 140px; height: 140px;"
                });
                var $btnProdutoMenor = $("<a />", {
                    "data-toggle": "modal",
                    "data-target": "#myModal",
                    "class": "btn btn-default",
                    "href": "#",
                    "role": "button",
                    "data-mesa": "",
                    "data-produto": "",
                });

                $divProdutoMenor.append($imgProdutoMenor);
                $divProdutoMenor.append("<h2>Heading</h2>");
                $divProdutoMenor.append("<p>bla bla bla </p>");
                $divProdutoMenor.append($btnProdutoMenor);
                $divRowProdutoMenor.append($divProdutoMenor);
            }

        },
        comprar: function($form, $btn) {
            var produto = {'codProduto': $btn.data('produto'), 
                            'numeroDaMesa': $btn.data('mesa')};
            $filmeVotado.val($($btn).data('mesa'));
            $.ajax({
                type: 'POST',
                url: '/services/comprar',
                data: produto,
                success: function(json) {
                    _private.mostrarMensagemDePedidoEnviado();
                },
                error: function (erro){
                    _private.mostrarMensagemDeErroPedido();
                },
                dataType: 'json'
            });
        }
    };

    _private = {
        mostrarMensagemDePedidoEnviado: function(){
            $('#idNovoUsuarioModal').modal('show');
        },

        mostrarMensagemDeErroPedido: function(){
            $('#idNovoUsuarioModal').modal('show');
        },
    }

    return app;

})(jQuery);
