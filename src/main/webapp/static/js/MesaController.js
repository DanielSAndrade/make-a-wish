$(document).ready(function() {
	var mesa = new MesaController();
	mesa.init();
});

function MesaController() {
	var self = this;

	self.mesa = ko.observable('0'),

	self.init = function() {
		self.mesa(GetQueryString('numero'));
		self.loadMesas();
	}

	self.loadMesas = function() {
		var url = Servico.UrlListaMesa();
		Helpers.Ajax(url, self.loadMesasCallback, {});
	},

	self.loadMesasCallback = function(jsonResponse) {
		alert('retorno');
		for(var i = 0; i < jsonResponse.length; i++){
			self.mesas().push(jsonResponse[i]);
		}
	},
	
	self.produtos = ko.observableArray([]);
	
	self.loadProdutos = function(){
		var produto1 = {
			id : 1,
			peso : 50,
			valor : 50
		};
		
		var produto2 = {
				id : 1,
				peso : 50,
				valor : 50
			};
		
		var produto3 = {
				id : 1,
				peso : 50,
				valor : 50
			};
	},
	
	self.loadProdutosCallback = function(jsonResponse){
		
	}
	
	self.mesas = ko.observableArray([]);
}

function GetQueryString(name, defaultValue) {
	name = name.replace(/[\[]/, "\\[").replace(/[\]]/, "\\]");
	var regex = new RegExp("[\\?&]" + name + "=([^&#]*)"), results = regex
			.exec(location.search);
	return results == null ? defaultValue ? defaultValue : ''
			: decodeURIComponent(results[1].replace(/\+/g, " "));
}