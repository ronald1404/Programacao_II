package Atividade_tres_carros;

public class Fusca extends Carro{

    private final int potencia = 20;

    public Fusca(int velocidade_maxima) {
        super(velocidade_maxima);
    }

    @Override
    public Void acelerar() {
        if (getVelocidade() >= getVelocidadeMaxima()){
            System.out.println("Velocidade Máxima Alcançada");
            System.out.println("Velocidade Fusca = "+ getVelocidade());
            return null;
        }
        this.setVelocidade(potencia);
        return null;
    }

    @Override
    public Void acelerar(int n) {
        if (getVelocidade() >= getVelocidadeMaxima()){
            System.out.println("Velocidade Máxima Alcançada");
            System.out.println("Velocidade Fusca = "+ getVelocidade());
            return null;
        }
        this.setVelocidade(potencia * n);
        return null;
    }
}