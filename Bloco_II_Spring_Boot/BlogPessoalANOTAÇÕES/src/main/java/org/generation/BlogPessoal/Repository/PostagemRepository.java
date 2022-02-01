package org.generation.BlogPessoal.Repository;

import java.util.List;

import org.generation.BlogPessoal.Model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//extends JPA e recebe 2 parâmetros  por herança < qual tipo de entidade estamos trabalhando(mesmo nome do model que fizemos ,IDprimary key como tipo >
public interface PostagemRepository extends JpaRepository<Postagem, Long> {

	//buscar todos pelo titulo (atributo da entidade)
	//select *FROM tb_postagens where titulo like "%"
	//query
	public List<Postagem> findAllByTituloContainingIgnoreCase(String titulo);

}
