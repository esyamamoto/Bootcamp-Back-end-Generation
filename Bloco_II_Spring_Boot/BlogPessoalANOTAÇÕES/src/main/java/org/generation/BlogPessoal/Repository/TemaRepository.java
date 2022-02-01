package org.generation.BlogPessoal.Repository;

import java.util.List;

import org.generation.BlogPessoal.Model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long> {
	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);
	// pega tudo o que contem aquela palavra, ignora maiusculo, minusculo

}
