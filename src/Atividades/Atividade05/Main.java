package Atividades.Atividade05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceCarro carro;

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

        System.out.println("Digite 1 ou 2");
        int aux = new Scanner(System.in).nextInt();

        // exemplo de polimorfismo onde um objeto pode assumir outras formas
        
        if (aux == 1){
            carro = bmw;
        }
        else 
            carro = fusca;

        System.out.println(((ModeloCarro) carro).getVelocidade());


    }
}