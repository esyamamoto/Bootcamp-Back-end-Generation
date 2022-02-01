package org.generation.BlogPessoal.Repository;


import java.util.List;
import java.util.Optional;

import org.generation.BlogPessoal.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	//busca email
public Optional<Usuario> findByUsuario(String usuario);
	//pode retornar nulo  

public List <Usuario> findAllByNomeCompletoContainingIgnoreCase(String nomeCompleto);
}
	

