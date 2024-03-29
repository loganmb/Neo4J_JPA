package br.com.fiap.repository;

import org.springframework.data.repository.CrudRepository; 
import br.com.fiap.entity.Pessoa;

public interface IPessoaRepository extends CrudRepository<Pessoa, Long> {
	Pessoa findByNome(String nome);

}
