angular.module('app').factory('Usuario', function() {
	var Usuario = function() {
		this.id = -1;
		this.login = "";
		this.senha = "";		
	}
	return Usuario;
});