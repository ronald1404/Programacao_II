package Atividades.Atividade_ingresso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int aux;

        System.out.println("Digite 1 para Normal, 2 para VIP");

        aux = in.nextInt();

        Ingresso ingresso = null;

        if (aux == 1) {
            ingresso = new Normal();

        } else if (aux == 2) {
            System.out.println("Digite 1 para Camarote Inferior, 2 para Camarote Superior");
            aux = in.nextInt();

            if (aux == 1)
                ingresso = new CamaroteInferior();
            else if (aux == 2)
                ingresso = new CamaroteSuperior();
            else
                System.out.println("Opção Inválida");
        } else
            System.out.println("Opção Inválida");

        ingresso.imprime();
        System.out.printf("Valor do Ingresso: %.2f\n", ingresso.getValor());
        in.close();
    }
}
