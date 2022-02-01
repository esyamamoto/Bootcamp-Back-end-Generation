package Herança;

public class Pessoa {

	//ATRIBUTOS
	
	private String Nome;
	private int idade;
	private double altura;
	
	public void aniversário ()
	{
		idade++;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String Nome) {
		this.Nome = Nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
