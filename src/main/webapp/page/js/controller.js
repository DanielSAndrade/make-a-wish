(function($) {
    $(document).ready(function() {
        // Plus and minus controls
        $(".qtd-control").click(function() {
            var input = $(this).parent().children("input");
            var value = new Number(input.val()) + ($(this).is(".glyphicon-plus") ? 1 : -1);
            input.val(Math.max(value, 0));
        });
        

        $("#bt-comprar").click(function() {
            var value = [];
            var ids = $(".product-id").each(function() {
                var me = $(this);
                var thisId = me.text();
                var thisQtd = me.parent().children(".product-qtd").val();
                if (thisQtd > 0)
                    value.push([thisId, thisQtd].join(","));
            });
            
            if (value.length) {
                var result = value.join(";");
                $.post("purchase").done(function() {
                    alert("Obrigado pela sua compra e por nos ajudar a realizar sonhos pelo mundo!");
                    $("#purchase").slideUp();
                    $("#login").slideDown();
                    $(".product-qtd").val("0");
                });
            }
        });
        
        $("#bt-logar").click(function() {
            $("#login").slideUp();
            $("#purchase").slideDown();
        });
            
    });
})(jQuery);