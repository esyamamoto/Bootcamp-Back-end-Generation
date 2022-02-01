package Herança;

public class Professor extends Pessoa {
	private String modulo;
	private double salario;
	
	public void corrigirProva()
	
	{
		System.out.println("Está corrigindo as provas dos alunos");
	}

	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}
