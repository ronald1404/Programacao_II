package Atividades.Atividade05;

public class Main {
    public static void main(String[] args) {

        BMW bmw = new BMW(10);

        bmw.acelerar();
        bmw.frear();
        System.out.println("Velocidade atual do carro = "+ bmw.getVelocidade());
        bmw.calcularVelocidade(999, 10);
    }
}