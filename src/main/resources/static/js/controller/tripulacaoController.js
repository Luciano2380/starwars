angular.module('app').controller('tripulacaoController',function($scope,$http,$rootScope,$location){
$scope.tripulacao ={};
$scope.tripulacoes = [];
$scope.naves=[];
$scope.persons=[];




$scope.listaNaves = function() {
	$http.get('https://swapi.co/api/starships/?page=2')
	.then(function(response) {		
		$scope.naves = response.data.results;
		console.log(response.data.results);
	},function(response) {
		console.log(response.data.results); 
			
	});
}

$scope.listaPassageiros = function() {
	$http.get('https://swapi.co/api/people/?page=2')
	.then(function(response) {
		console.log(response.data.results); 
		$scope.persons = response.data.results;
	},function(response) {
		console.log(response.data.results); 
			
	});
}

$scope.listaNaves();
$scope.listaPassageiros();

$scope.listatripulacao = function() {	 
	console.log($rootScope.usuarioLogado);
	$http.get('/pesquisarTripulacao',{params:{"idUsuario": $rootScope.usuarioLogado.id}})
	.then(function(response) {
		console.log(response.data); 
		$scope.tripulacoes = response.data;
	},function(response) {
		console.log(response.data); 
			
	});
}
$scope.listatripulacao();


$scope.cadastrar = function() {	
	$scope.tripulacao.idUsuario=$rootScope.usuarioLogado.id;	
	$http.post("/salvartripulacao",$scope.tripulacao)
	.success(function(data){
		alert('Sucesso');
		$location.path("/pesquisarTripulacao");
	})
	.error(function() {
		alert('Erro');
	});
}

$scope.excluir = function(t) {	
	console.log(t);
	$http.delete("/deletarTripulacao",{params:{"id":t.id}})
	.then(function(response) {
		alert('Sucesso');
		$scope.listatripulacao();
	},function(response) {
		console.log(response.data); 
			
	});
}

	
	
});