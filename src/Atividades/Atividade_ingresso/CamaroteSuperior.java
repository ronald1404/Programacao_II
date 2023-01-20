package Atividades.Atividade_ingresso;

public class CamaroteSuperior extends Vip{

    public double valorExtra = 10;

    @Override
    public double getValor() {
        return super.getValor()+valorExtra;
    }
}
