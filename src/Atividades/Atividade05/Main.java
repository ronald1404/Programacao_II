package Atividades.Atividade05;

public class Main {
    public static void main(String[] args) {

        BMW bmw = new BMW(50);

        bmw.acelerar();
        bmw.acelerar();
        bmw.frear();
        System.out.println("Velocidade atual da BMW = "+ bmw.getVelocidade());

        bmw.calcularVelocidade(1000, 10);


        Fusca fusca = new  Fusca(20);

        fusca.acelerar();
        fusca.acelerar();
        fusca.frear();
        System.out.println("\nVelocidade atual do Fusca = "+ bmw.getVelocidade());

        fusca.calcularVelocidade(1000, 30);
    }
}