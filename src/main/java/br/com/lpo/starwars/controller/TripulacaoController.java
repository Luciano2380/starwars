package br.com.lpo.starwars.controller;



import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.lpo.starwars.entidade.Tripulacao;
import br.com.lpo.starwars.entidade.Usuario;
import br.com.lpo.starwars.service.ITripulacaoService;


@RestController
public class TripulacaoController {
	@Autowired
	ITripulacaoService service;
	
	
	@RequestMapping(method=RequestMethod.GET,value="/pesquisarTripulacao")
	public ResponseEntity<Collection<Tripulacao>> pesquisar(@RequestParam(value="idUsuario")Integer idUsuario){		
		return service.pesquisar(idUsuario);
	}
	@RequestMapping(method=RequestMethod.POST,value="/salvartripulacao",consumes=MediaType.APPLICATION_JSON_VALUE)
	public void cadastrar(@RequestBody Tripulacao tripulacao){
		service.salvar(tripulacao);
		
	}
	@RequestMapping(method=RequestMethod.PUT,value="/editarTripulacao",consumes=MediaType.APPLICATION_JSON_VALUE)
	public void editar(@RequestBody Tripulacao tripulacao){
		service.salvar(tripulacao);
		
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/deletarTripulacao")
	public void excluir(@RequestParam(value="id")Integer id){
		service.excluir(new Tripulacao(id));
		
	}
}
