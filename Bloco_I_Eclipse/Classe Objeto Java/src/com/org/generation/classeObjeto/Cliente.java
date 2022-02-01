package com.org.generation.classeObjeto;

public class Cliente {
	  private String nome;
	    private String genero;
	    private String endereco;
	    private String telefone;
	    private String idade;
	    private String doc;

	    public Cliente (String nome, String genero, String endereco, String i, String idade, String doc)
	    {
	        this.nome = nome;
	        this.genero = genero;
	        this.endereco = endereco;
	        this.telefone = i;
	        this.idade = idade;
	        this.doc = doc;
	    }

	    public void imprimirInfo()
	    {
	        System.out.println("\nO cliente "+nome+" (genero  "+genero+"), residente na "+endereco+".\n Telefone de contato "+telefone+", idade "+idade+" anos, documento pessoal nº "+doc);
	    }

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		public String getIdade() {
			return idade;
		}

		public void setIdade(String idade) {
			this.idade = idade;
		}

		public String getDoc() {
			return doc;
		}

		public void setDoc(String doc) {
			this.doc = doc;
		}

}
