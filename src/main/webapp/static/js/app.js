angular.module('make-a-wish-quarto-tematico', [])

function RankingController($http, $scope) {
}

function GlobalTablesController($http, $scope) {
    $http.get("../api/rankingMesaGeral").then(
        function(response) { $scope.tables = response.data },
        function(response) { console.log(response.status); }
    );
}


function GlobalUsersController($http, $scope) {
    $http.get("../api/rankingParticipante").then(
        function(response) { $scope.participants = response.data; $scope.compras = $http.get("../api/comprasPorParticipante?id=" + $scope.participants[0].id); },
        function(response) { console.log(response.status); }
    );
    
    
}

function CompraController( $http, $scope ) {

    $scope.page = 'comprador';

    $scope.selecionaComprador = function() {
        $scope.page = 'valor';
    }
    
    $scope.selecionaOutroValor = function() {
        $scope.page = 'valorVariavel';
    }
    
    $scope.resetaModal = function() {
    	$scope.page = 'comprador';
    }
    
    $scope.comprar = function() {
    	$http.get("../api/get-idmesa").then(function(response){
    		$http.post("../api/compra?idParticipante=99999&idProduto=9999&valor=999.999&idMesa=" + response.data);
    	});    	
    }

}