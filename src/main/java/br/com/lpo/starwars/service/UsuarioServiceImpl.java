package br.com.lpo.starwars.service;



import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.lpo.starwars.dao.IUsuarioDAO;
import br.com.lpo.starwars.entidade.Usuario;


@Service("iUsuarioService")
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	IUsuarioDAO dao;

	@Override
	public void salvar(Usuario t) {
		 dao.save(t);
		
	}

	@Override
	public void alterar(Usuario t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Usuario t) {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public ResponseEntity<Usuario> logar(String login, String nome) {
		Usuario usuario = dao.logar(login, nome);		
		return new ResponseEntity<Usuario>(usuario,HttpStatus.OK);
	}

	
}
