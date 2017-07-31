package br.com.lpo.starwars.service;



import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.springframework.http.ResponseEntity;

public interface IService<T extends Serializable> {

	void salvar(T t);
	void alterar(T t);
	void excluir(T t);
	

}
