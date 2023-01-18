package Aula_03;

public class Empregado {
	
	private String nome;
	private int idade;
	protected double salario;
	
	
	public Empregado() {
		super();
	}
 
	public Empregado(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	public double calculaSalario() {
		return salario * 0.85;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
