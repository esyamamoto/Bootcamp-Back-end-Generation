package Herança;

public class Aluno {

	String nome;
	private int mat;
	private String curso;
	private double media;
	
	
	public void entregarAtividade()
	
	{
		System.out.println("Atividade entregue com sucesso!!!!");
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	
	
	
	
	
}
