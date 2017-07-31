package br.com.lpo.starwars.dao;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.lpo.starwars.entidade.Tripulacao;
@Repository
public interface ITripulacaoDAO extends CrudRepository<Tripulacao, Integer> {
	@Query(value="Select tri from Tripulacao tri"
			+ " join tri.usuario user"
			+ " where user.id=:idUsuario ")			
	public Collection<Tripulacao> pesquisar(@Param("idUsuario")Integer idUsuario);
}
