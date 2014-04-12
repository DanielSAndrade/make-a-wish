var Servico = {
	UrlListaMesa: function(){
		return Helpers.GetUrlDefault() + "/api_1/listMesas";
	}
}

var Helpers = {
	GetUrlDefault: function(){
		return window.location.protocol + "//" + window.location.host;
	},
	
	Ajax: function(url, callback, data){
		$.ajax({
			  type: "GET",
			  url: url,
			  data: data
		}).done(function( msg ) {
		    callback(msg);
	  });
	}
}
