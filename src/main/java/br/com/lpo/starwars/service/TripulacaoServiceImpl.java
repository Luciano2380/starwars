package br.com.lpo.starwars.service;



import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.lpo.starwars.dao.ITripulacaoDAO;
import br.com.lpo.starwars.entidade.Tripulacao;
import br.com.lpo.starwars.entidade.Usuario;


@Service("iTripulacaoService")
public class TripulacaoServiceImpl implements ITripulacaoService {
	@Autowired
	ITripulacaoDAO dao;

	@Override
	public void salvar(Tripulacao t) {
		Integer idUser = t.getIdUsuario();
		t.setUsuario(new Usuario(idUser));		
		dao.save(t);
		
	}

	@Override
	public void alterar(Tripulacao t) {
		
		
	}

	@Override
	public void excluir(Tripulacao t) {
		dao.delete(t);
		
	}

	@Override
	public ResponseEntity<Collection<Tripulacao>> pesquisar(Integer idUsuario) {
		Collection<Tripulacao> tris = dao.pesquisar(idUsuario);	
				
		return new ResponseEntity<Collection<Tripulacao>>(tris,HttpStatus.ACCEPTED) ;
	}

	

	

}
