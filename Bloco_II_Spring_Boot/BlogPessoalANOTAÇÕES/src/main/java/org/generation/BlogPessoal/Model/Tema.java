package org.generation.BlogPessoal.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity  //essa classe vai ser uma entidade do JPA
@Table(name = "tb_temas")  //essa entidade dentro do banco de dados, vai ser uma tabela
public class Tema {

	@Id  // gera o id automaticamente obs: dependência validation → primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //semelhante ao auto_increment
	private long id;

	@NotBlank(message = "O atributo título é obrigatório, sem espaços em branco")
	@Size(min = 5, message = "O atributo texto deve conter no mínimo 5 e no máximo 1000 caracteres")
	private String descricao;

	//1 para muitos
	@OneToMany(mappedBy = "tema", cascade = CascadeType.ALL) //tema=id //qlqr mudança efetuada na classe propagará a postagens
	@JsonIgnoreProperties("tema") //qdo puxar lista de postagens ele ignora o tema e nao puxa ele junto , se não fica um looping infinito //evitar recursividade
	//obs:one to many model<->repository
	private List<Postagem> postagem;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}

}
