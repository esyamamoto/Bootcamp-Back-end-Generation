package org.generation.BlogPessoal.Controller;

import java.util.List;

import javax.validation.Valid;

import org.generation.BlogPessoal.Model.Postagem;
import org.generation.BlogPessoal.Repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//responsável pela comunicação com o client , angular, insominiA

@RestController
@RequestMapping("/postagem") // que vai mapear até onde vai rodar
@CrossOrigin(origins = "*", allowedHeaders = "*")  //essa classe aceita requisições de qualquer origem
public class PostagemController {

	@Autowired // injeção de dependência e é private
	private PostagemRepository postagemrepository; //cahamndo interface repository 

	@GetMapping  // responde todas as requisições do tipo get que foram enviadas ao end point
	public ResponseEntity<List<Postagem>> getAll() {  //busca/postagem
		return ResponseEntity.ok(postagemrepository.findAll());

	}
	//busca por um ID
	@GetMapping("/{id}") // vamos recebr a resposta do recurso da nossa API do objeto referente ao ID que inserimos
	public ResponseEntity<Postagem> getById (@PathVariable long id) //getbyid metodo que busca esse ID que responde essa requisição do cliente, do http
	{ //o valor que vai entrar nessa variavel ID vai vir como uma variavel do caminho da URI/URL
		return postagemrepository.findById(id)
				.map(resposta -> ResponseEntity.ok(resposta)) //essa função : se existir essa resposta, ela aplica no obnjeto tipo postagem pelo retorno do metodo findById
				.orElse(ResponseEntity.notFound().build()); //se nao existir , ela retorna um NotFound 404
	}
	//metodo de titulo
	@GetMapping("/titulo/{titulo}") //atributo+escrita do usuario
	public ResponseEntity<List<Postagem>> getByTitulo(@PathVariable String titulo){ //lista de postagens
		//qdo usa esse metodo findAllByTituloContainingIgnoreCase ja executa e retorna ok
		//se usuario colocar titulo com letra maiuscula , ela ignora
		return ResponseEntity.ok(postagemrepository.findAllByTituloContainingIgnoreCase(titulo));
	}
	//cria uma nova postagem //criar novo perfil 
	@PostMapping
	public ResponseEntity<Postagem> postPostagem(@Valid @RequestBody Postagem postagem) {
		return ResponseEntity.status(HttpStatus.CREATED).body(postagemrepository.save(postagem));
	}
	//atualizar postagem
		//responde todas os metodos, http status
	@PutMapping
	public ResponseEntity<Postagem> putPostagem(@Valid @RequestBody Postagem postagem) {
		return postagemrepository.findById(postagem.getId())
				.map(resposta -> ResponseEntity.ok().body(postagemrepository.save(postagem)))
				.orElse(ResponseEntity.notFound().build());
	}
	//deleta postagem
	//vai responder da requisição do postman ou front do http response
	//o verbo delete nao retorna nada entao nós passamos esse caractere como "tipo" do response entity
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deletePostagem(@PathVariable long id) {
		return postagemrepository.findById(id).map(resposta -> {
			postagemrepository.deleteById(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build(); 
			//se não encontrar , retonra o not found
		}).orElse(ResponseEntity.notFound().build());
	}
}
