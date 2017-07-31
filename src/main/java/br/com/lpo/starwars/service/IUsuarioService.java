package br.com.lpo.starwars.service;



import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.lpo.starwars.entidade.Usuario;


public interface IUsuarioService extends IService<Usuario> {
	ResponseEntity<Usuario> logar(String login, String nome);

}
