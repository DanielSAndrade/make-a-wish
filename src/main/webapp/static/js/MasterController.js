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


if (!Array.prototype.forEach)
{
  Array.prototype.forEach = function(fun /*, thisArg */)
  {
    "use strict";

    if (this === void 0 || this === null)
      throw new TypeError();

    var t = Object(this);
    var len = t.length >>> 0;
    if (typeof fun !== "function")
      throw new TypeError();

    var thisArg = arguments.length >= 2 ? arguments[1] : void 0;
    for (var i = 0; i < len; i++)
    {
      if (i in t)
        fun.call(thisArg, t[i], i, t);
    }
  };
}

if (!Array.prototype.pushRange)
{
  Array.prototype.pushRange = function(coll)
  {
	  for(var i = 0; i < coll.length; i++){
		  this.push(coll[i]);
	  }
  };
}