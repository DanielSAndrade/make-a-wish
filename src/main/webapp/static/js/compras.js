var Compras = (function($){
    var app, _private;

    app = {
        listar: function($form) {
            var produtos = [{
                "nome": "produto 1",
                "preco": "1"
            },
            {
                "nome": "produto 2",
                "preco": "2"
            },
            {
                "nome": "produto 3",
                "preco": "3"
            }];
            
            for(int i = 0; i < produtos.length; i++) {
                
            }
        },
        comprar: function($form, $btn) {
            var produto = {'id': 0, mesa: 0};
            $filmeVotado.val($($btn).data('mesa'));
            $.ajax({
                type: 'POST',
                url: '/comprar',
                data: {'id': 0, mesa: 0},
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
