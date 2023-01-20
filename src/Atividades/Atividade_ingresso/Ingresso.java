package Atividades.Atividade_ingresso;

public abstract class Ingresso {
    private double valor = 10;

    public void imrimeValor(){
        System.out.println("valor do ingresso: "+ getValor());
    }

    public abstract void imprime();

    public double getValor(){
        return valor;
    }
}
