package br.com.lpo.starwars.controller;



import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.lpo.starwars.entidade.Usuario;
import br.com.lpo.starwars.service.IUsuarioService;

@RestController
public class UsuarioController {
	@Autowired
	IUsuarioService service;	
	@RequestMapping(method=RequestMethod.POST,value="/autenticarUsuario",consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Usuario> logar(@RequestBody Usuario usuario) throws ServletException{
	
		ResponseEntity<Usuario> user = service.logar(usuario.getLogin(), usuario.getSenha());
		
		return user;
	}
	@RequestMapping(method=RequestMethod.POST,value="/salvarUsuario",consumes=MediaType.APPLICATION_JSON_VALUE)
	public void cadastrar(@RequestBody Usuario usuario){
		service.salvar(usuario);		
		
	}
	

}
