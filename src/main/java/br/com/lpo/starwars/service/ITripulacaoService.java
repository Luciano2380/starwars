package br.com.lpo.starwars.service;



import java.util.Collection;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.lpo.starwars.entidade.Tripulacao;



public interface ITripulacaoService extends IService<Tripulacao> {
	ResponseEntity<Collection<Tripulacao>>pesquisar(Integer idUsuario);

}
