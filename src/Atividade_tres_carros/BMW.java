package Atividade_tres_carros;

public class BMW extends Carro{

    private final int potencia = 70;

    public BMW(int velocidade_maxima) {
        super(velocidade_maxima);
    }

    @Override
    public Void acelerar() {
        if (getVelocidade() >= getVelocidadeMaxima()){
            System.out.println("Velocidade Máxima Alcançada");
            System.out.println("Velocidade BMW = "+ getVelocidade());
            return null;
        }
        this.setVelocidade(potencia);
        return null;
    }
    
    @Override
    public Void acelerar(int n) {
        if (getVelocidade() >= getVelocidadeMaxima()){
            System.out.println("Velocidade Máxima Alcançada");
            System.out.println("Velocidade BMW = "+ getVelocidade());
            return null;
        }
        this.setVelocidade(potencia * n);
        return null;
    }

}
