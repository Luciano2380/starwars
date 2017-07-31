angular.module('app').controller('usuarioController',function($scope,$http,$location,$rootScope){

    $scope.usuario={};  

       $scope.cadastrar = function() {
    		console.log("Passou aqui");
           	console.log($scope.usuario.login);
           	console.log($scope.usuario.senha);
           	$http.post("/salvarUsuario",$scope.usuario)
           	.success(function(data){
           		alert('Sucesso');
           		$location.path("/");
           	})
           	.error(function() {
           		alert('Erro');
           	});
       	
       }  
       
       $scope.efetuarLogin = function() {
           if ($scope.usuario.login == "" || $scope.usuario.senha == "") {
                  alert("Informe usuário e senha!");
                  return;
           }

           $http.post("/autenticarUsuario", $scope.usuario)
           .success(function(data) {
                 
                 if (data!="") {
                	 $location.path("/pesquisarTripulacao");
                	 $rootScope.usuarioLogado = data;
                	 
                  } else {
                	  alert('Usuário/Senha inválidos');                       
                  }
           });
    }
   });