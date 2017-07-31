package br.com.lpo.starwars.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.lpo.starwars.entidade.Usuario;
@Repository
public interface IUsuarioDAO extends JpaRepository<Usuario, Integer> {

	@Query(value="Select user from Usuario user where user.login=:login "
			+ "and user.senha=:nome")
	public Usuario logar(@Param("login") String login,
			@Param("nome") String nome);
}
