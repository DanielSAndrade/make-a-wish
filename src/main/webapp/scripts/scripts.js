$(document).ready(function() {

	var jsonMesas ="";
	
	$.ajax({
        type: 'GET',
        url: 'http://localhost:8080/api/listmesas',
        ontentType: 'application/json; charset=utf-8',
        data: '{}',
        dataType: 'json',
        success: function(data) { alert(data); }
    });
	
	var divExemplo = "<div class='row'><div class='columns large-1'><img src='http://placehold.it/80x80&text=[img]' /></div><div class='columns large-9 '><div class='panel'><label style='float: left; padding-top: 5px; font-size: 25px; padding-right: 25px;'>#000</label><img alt='' src='D:\\make_a_wish\\make-a-wish\\src\\main\\webapp\\images\\king-icon.png' style='height: 45px;'></div></div><div class='columns large-1' style='text-align: center;'><span style='font-weight: bold; font-size: 50px;'>00</span></div><div class='columns large-1' style='text-align: center;'><span style='font-weight: bold; font-size: 50px;'>00</span></div></div>";
	var divExemplo1 = "<div class='row'><div class='columns large-1'><img src='http://placehold.it/80x80&text=[img]' /></div><div class='columns large-9 '><div class='panel'><label style='float: left; margin-top: -8px;'>#000</label></div></div><div class='columns large-1' style='text-align: center;'><span>00</span></div><div class='columns large-1' style='text-align: center;'><span>00</span></div></div>";

	for (var i = 0; i <= 3; i++) {
		if(i==0)
		{
			$("#principal").append(divExemplo);	
		}
		else
		{
			$("#principal").append(divExemplo1);
		}
	}

	
	$("#popAquisicao").click(function(){
		$(this).slideToggle( "slow" );
	})
	
	/*setInterval(function() {
		exibePopAquisicao();
	}, 2000);
	
	setInterval(function() {
		exibePopAquisicao1();
	}, 3000);
	*/
})

function exibePopAquisicao() {

	var divAquisicao = "<div class='columns large-9'><div><label style='font-size: 25px; padding: 20px;'><b>#000</b> Fez <b>+00</b> pontos por adquirir um <b>Sonho</b></label></div></div>";
	$("#popAquisicao").find("div").html(divAquisicao);
	
	
	$("#popAquisicao").trigger("click");
}

function exibePopAquisicao1() {

	var divAquisicao = "<div class='columns large-9'><div><label style='font-size: 25px; padding: 20px;'><b>#000</b>Conquistou a medalha: <img alt='' src='D:\\make_a_wish\\make-a-wish\\src\\main\\webapp\\images\\diamond.png' style='height: 45px;'> </label></div></div>";
	$("#popAquisicao").find("div").html(divAquisicao);
	
	
	$("#popAquisicao").trigger("click");
}