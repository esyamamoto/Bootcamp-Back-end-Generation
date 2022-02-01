package org.generation.BlogPessoal.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.generation.BlogPessoal.Model.Usuario;
import org.generation.BlogPessoal.Repository.UsuarioRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT) //t indica que a Classe UsuarioRepositoryTest é uma Classe Spring Boot Tes
@TestInstance(TestInstance.Lifecycle.PER_CLASS) // indica que o Ciclo de vida da Classe de Teste será por Classe.
public class UsuarioRepositoryTest {
    
	@Autowired //um objeto da Interface UsuarioRepository para persistir os objetos no banco de dados de testes
	private UsuarioRepository usuarioRepository;
	
	@BeforeAll 
	//inicializa 4 objetos do tipo usuario e insere no banco de dados de testes atraves do metodo .save() um aunica vez
	void start(){

		usuarioRepository.save(new Usuario(0L, "João da Silva", "joao@email.com.br", "13465278"));
		
		usuarioRepository.save(new Usuario(0L, "Manuela da Silva", "manuela@email.com.br", "13465278"));
		
		usuarioRepository.save(new Usuario(0L, "Adriana da Silva", "adriana@email.com.br", "13465278"));

        usuarioRepository.save(new Usuario(0L, "Paulo Antunes", "paulo@email.com.br", "13465278"));

	}

	@Test
	@DisplayName("Retorna 1 usuario") //mensagem que será exibida ao inves do nome do metodo
	public void deveRetornarUmUsuario() {

		Optional<Usuario> usuario = usuarioRepository.findByUsuario("joao@email.com.br");
		assertTrue(usuario.get().getUsuario().equals("joao@email.com.br")); //verifica se o email foi encontrado
	}

	@Test
	@DisplayName("Retorna 3 usuarios")
	public void deveRetornarTresUsuarios() {

		List<Usuario> listaDeUsuarios = usuarioRepository.findAllByNomeCompletoContainingIgnoreCase("Silva");
		assertEquals(3, listaDeUsuarios.size());  //verifica se o tamanho da list for igual a 3, o primeiro teste será aprovado
		
	//atraves do metodo asserTrue, verifica em cada posição da collection lista lista de usuarios se os usuarios, que foram inseridos no banco de dados atrasves do metodo start, foram gravadps na mesma sequencia
		assertTrue(listaDeUsuarios.get(0).getNomeCompleto().equals("João da Silva"));
		assertTrue(listaDeUsuarios.get(1).getNomeCompleto().equals("Manuela da Silva"));
		assertTrue(listaDeUsuarios.get(2).getNomeCompleto().equals("Adriana da Silva"));
		//tem que ser gravado na mesma sequencia do metodo start para os 3 testes serem aprovados
	}

}

