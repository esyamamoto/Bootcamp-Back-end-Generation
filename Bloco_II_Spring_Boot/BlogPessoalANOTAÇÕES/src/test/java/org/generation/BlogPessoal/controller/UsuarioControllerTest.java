package org.generation.BlogPessoal.controller;
//annotation
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.generation.BlogPessoal.Model.Usuario;
import org.generation.BlogPessoal.Service.UsuarioService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UsuarioControllerTest {

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Autowired
	private UsuarioService usuarioService;

	@Test
	@Order(1)//indica que o metodo será o primeiro a ser executado
	@DisplayName("Cadastrar Um Usuário")//configura mesnagem que será exibida ao inves do nome do metodo
	public void deveCriarUmUsuario() {
		
		//recebdno um objeto classe usuario, equivalente a requisição POST
		HttpEntity<Usuario> requisicao = new HttpEntity<Usuario>(new Usuario(0L, "Paulo Antunes", "paulo_antunes@email.com.br", "13465278"));
		
		/* a Requisição HTTP será enviada através do método exchange() da Classe
		TestRestTemplate e a Resposta da Requisição (Response) será recebida pelo objeto
		resposta do tipo responseentity
		
		PARA ENVIAR A REQUISIÇÃO, SERÁ NECESSÁRIO PASSAR 4 PARAMETROS:
		 * A URI: Endereço do endpoint (/usuarios/cadastrar);
		 * O Método HTTP: Neste exemplo o método POST;
		 * O Objeto HttpEntity: neste exemplo o objeto requisição, que contem o objeto da classe usuario
		 * O conteúdo esperado no Corpo da Resposta (Response Body): Neste exemplo será do tipo usuario (usuario.class)
		 */ 
		
		ResponseEntity<Usuario> resposta = testRestTemplate
			.exchange("/usuarios/cadastrar", HttpMethod.POST, requisicao, Usuario.class);

		//checaremos se a resposta da requisição (Response), é a resposta esperada (CREATED -->201)
		assertEquals(HttpStatus.CREATED, resposta.getStatusCode());
		assertEquals(requisicao.getBody().getNomeCompleto(), resposta.getBody().getNomeCompleto());
		assertEquals(requisicao.getBody().getUsuario(), resposta.getBody().getUsuario());
	}

	@Test
	@Order(2)
	@DisplayName("Não deve permitir duplicação do Usuário")
	public void naoDeveDuplicarUsuario() {
		//VAMOS TESTAR O ERRO

		usuarioService.cadastrarUsuario(new Usuario(0L, 
			"Maria da Silva", "maria_silva@email.com.br", "13465278"));

		HttpEntity<Usuario> requisicao = new HttpEntity<Usuario>(new Usuario(0L, 
			"Maria da Silva", "maria_silva@email.com.br", "13465278"));

		ResponseEntity<Usuario> resposta = testRestTemplate
			.exchange("/usuarios/cadastrar", HttpMethod.POST, requisicao, Usuario.class);
		//checaremos se a resposta da requisição (Response), é a resposta esperada (BAD_REQUEST -->400)
		assertEquals(HttpStatus.BAD_REQUEST, resposta.getStatusCode());
	}

	/* a Requisição HTTP será enviada através do método exchange() da Classe
	TestRestTemplate e a Resposta da Requisição (Response) será recebida pelo objeto
	resposta do  tipo ResponseEntity. Para enviar a requisição, será necessário passar por 4 parametros
	  
	 		*A URI: Endereço do endpoint (/usuarios/atualizar);
			*O Método HTTP: Neste exemplo o método PUT;
			*O Objeto o HttpEntity: neste exemplo o objeto requisição, que contem o objeto da classe usuario
	  		*O conteúdo esperado no Corpo da Resposta (Response Body): Neste exemplo será do tipo usuario (usuario.class)
	 */
			
			
			
			
	@Test
	@Order(3)
	@DisplayName("Alterar um Usuário")
	public void deveAtualizarUmUsuario() {

		Optional<Usuario> usuarioCreate = usuarioService.cadastrarUsuario(new Usuario(0L, 
			"Juliana Andrews", "juliana_andrews@email.com.br", "juliana123"));
		//recebdno um objeto classe usuario, equivalente a requisição PUT
		Usuario usuarioUpdate = new Usuario(usuarioCreate.get().getId(), "Juliana Andrews Ramos", "juliana_ramos@email.com.br", "juliana123");
		
		HttpEntity<Usuario> requisicao = new HttpEntity<Usuario>(usuarioUpdate);

		
		ResponseEntity<Usuario> resposta = testRestTemplate
				//Spring Security habilitado com autenticação do tipo Http Basic, o objeto testRestTemplate dos endpoints, exigem autenticação
				//para autenticar o usuario, usa o metodo withBasicAuth(user,password)
			.withBasicAuth("root", "root")
			.exchange("/usuarios/atualizar", HttpMethod.PUT, requisicao, Usuario.class); 
		//a resposta esperada (OK 🡪 200)
		assertEquals(HttpStatus.OK, resposta.getStatusCode());
		assertEquals(usuarioUpdate.getNomeCompleto(), resposta.getBody().getNomeCompleto());
		assertEquals(usuarioUpdate.getUsuario(), resposta.getBody().getUsuario());
	}

	@Test
	@Order(4)
	@DisplayName("Listar todos os Usuários")
	public void deveMostrarTodosUsuarios() {
		/* Para enviar a requisição, o será necessário passar 4	parâmetros:
			*A URI: Endereço do endpoint (/usuarios/all);
			*O Método HTTP: Neste exemplo o método GET;
			*O Objeto HttpEntity: o objeto será null. Requisições do tipo GET nao enviam objeto no corpo da requisição
			*O conteúdo esperado no Corpo da Resposta (Response Body): 
			*/
		usuarioService.cadastrarUsuario(new Usuario(0L,"Sabrina Sanches", "sabrina_sanches@email.com.br", "sabrina123"));
		
		usuarioService.cadastrarUsuario(new Usuario(0L,"Ricardo Marques", "ricardo_marques@email.com.br", "ricardo123"));

		ResponseEntity<String> resposta = testRestTemplate
			
			.withBasicAuth("root", "root")
			.exchange("/usuarios/all", HttpMethod.GET, null, String.class);
		
		assertEquals(HttpStatus.OK, resposta.getStatusCode());
	}

}
