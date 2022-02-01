package org.generation.LojaDeGames.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_produto;
	
	 @NotNull(message = "O atributo nome é obrigatório.")
	 @Size(min = 5, max = 100,  message = "O nome deve conter no mínimo 5 e no máximo 100 caracteres")
	 private String titulo;

	 @NotNull(message = "O atributo descricao é obrigatório.")
	 @Size(min = 5, max = 100, message = "A descrição deve conter no mínimo 5 e no máximo 100 caracteres")
	 private String descricao;
	 
	 @UpdateTimestamp 
	 private LocalDateTime date;
	
	 @ManyToOne
	 @JsonIgnoreProperties ("produto")
	 private Categoria categoria;
	 
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Usuario usuario;

	public long getId_produto() {
		return id_produto;
	}

	public void setId_produto(long id_produto) {
		this.id_produto = id_produto;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	 
	 
}
	 

	