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
        function(response) { $scope.participants = response.data },
        function(response) { console.log(response.status); }
    );
}