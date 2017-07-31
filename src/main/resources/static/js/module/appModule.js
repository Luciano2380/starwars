angular.module('app', ['ngRoute']).config(function($routeProvider, $locationProvider) {

	$locationProvider.html5Mode(true);

	$routeProvider.when('/login', {
		templateUrl: 'pages/login.html',
		controller: 'usuarioController'
	});

	$routeProvider.when('/cadastroUsuario', {
		templateUrl: 'pages/cadastroUsuario.html',
		controller: 'usuarioController'
	});	
	$routeProvider.when('/cadastroTripulacao', {
		templateUrl: 'pages/cadastroTripulacao.html',
		controller: 'tripulacaoController'
	});	
	$routeProvider.when('/pesquisarTripulacao', {
		templateUrl: 'pages/pesquisarTripulacao.html',
		controller: 'tripulacaoController'
	});


	$routeProvider.otherwise({redirectTo: '/login'});
});