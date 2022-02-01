package org.generation.BlogPessoal.Model;



/*Ela serve de apoio no processo de recebimento de dados da API, mas ela não vai
armazenar nada no banco de dados (por isso que ela não tem anotação)*/


public class UsuarioLogin {
			
		private long id;
		
		private String nomeCompleto;
		
		private String usuario;
		
		private String senha;

		private String token;
		
		private String foto;

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

		public String getToken() {
			return token;
		}

		public void setToken(String token) {
			this.token = token;
		}

		public String getFoto() {
			return foto;
		}

		public void setFoto(String foto) {
			this.foto = foto;
		}
		
}
