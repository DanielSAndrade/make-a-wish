function efetuarCompra() {
	var retorno = false;
	var inputs = document.getElementsByTagName("input");
	for (var i = 0; i < inputs.length; i++) {
		if (inputs[i].type == "checkbox" && inputs[i].checked == true) {
			var codigo = inputs[i].value;
			var quantidade = document.getElementById("quantidade_" + inputs[i].value).value;
			$.post("EfetuarCompraServlet", {'codigo' : codigo, 'quantidade' : quantidade}, function() {
				retorno = true;
			});
		}
	}
	if (retorno) {
		alert("Compra realizada com sucesso!");
	}
}