package Atividades.Atividade_ingresso;

public class Vip extends Ingresso {

    private double valorAdicional = 15;

    public Vip() {
        //
    }

    public double getValor() {
        return super.getValor() + valorAdicional;
    }

    @Override
    public void imprime() {
        System.out.println("Ingresso  VIP");

    }
}
