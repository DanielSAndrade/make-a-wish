$(document).ready(function() {
	HomeController.Init();
});

var HomeController = {
	Init : function() {
		HomeController.Bind();
	},

	Bind : function() {
		$(".bind-btn-iniciar").first().click(HomeController.ButtonIniciarClick);
	},

	ButtonIniciarClick : function(e) {
		e.preventDefault();
		
		var numeroMesa = $(".bind-textbox-mesa").first().val();
		if (!numeroMesa) {
			alert('Informe o número da mesa');
			return false;
		}
		window.document.location = "/Mesa/" + numeroMesa;
	}
}