package Aula_03;

public class Gerente extends Empregado{
	
	private double bonus;
	
	public Gerente(String nome, double salario) {
		super(nome, salario);
	}
	@Override
	public double calculaSalario() {
		return salario * 0.85 + bonus;
	}
}