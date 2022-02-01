package org.generation.BlogPessoal.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull (message = "O nome é obrigatório.")
	private String nomeCompleto;
	
	@ApiModelProperty(example = "email@email.com.br")
	@NotNull (message = "O atributo e-mail é obrigatório!")
	@Email(message = "O campo deve ser preenchido com um e-mail válido.")
	private String usuario;

	//SEM SIZE MAXIMO DE SENHA -- PQ ELA VAI FICAR CRIPTOGRAFADA
	@NotNull (message = "Senha obrigatória!")
	@Size(min = 8, message = "O campo deve conter no minimo 8 caracteres.")
	private String senha;
		
	//link da foto
	private String foto;
	
	/**
	 * CascadeType.REMOVE -> Ele propaga a operação de remoção de um objeto Pai para um 
	 * objeto Filho. 
	 * Apenas quando remover a Entidade Usuario, também será removida todas as entidades 
	 * Postagens associadas. Nas demais operações não haverá a propagação.
	 * 
	 * CascadeType.ALL -> Ele propaga todas a operações (Inserir, Listar, Atualizar e Apagar)
	 * de um objeto Pai para um objeto Filho. 
	 */
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("usuario")
	private List<Postagem> postagem;

	
	
	//metodo construtor - com atributos
	public Usuario(long id, String nomeCompleto, String usuario, String senha) {
		
		this.id = id;
		this.nomeCompleto = nomeCompleto;
		this.usuario = usuario;
		this.senha = senha;
		
	}
	
	//metodo construtor using fields sem os atributps e omit call to default construtor super()
	public Usuario() {
	}



	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNomeCompleto() {
		return nomeCompleto;
	}


	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getFoto() {
		return foto;
	}


	public void setFoto(String foto) {
		this.foto = foto;
	}


	public List<Postagem> getPostagem() {
		return postagem;
	}


	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}

		
}
