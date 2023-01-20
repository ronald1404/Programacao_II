package Atividades.Atividade_tres_carros;

public class Main {
    public static void main(String[] args) {


        
        BMW carroBmw = new BMW(350);
        Fusca carroFusca = new Fusca(80);
        
        
        System.out.println("\nVelocidade máxima BMW = "+carroBmw.getVelocidadeMaxima());
        System.out.println("Velocidade máxima Fusca = " + carroFusca.getVelocidadeMaxima());
        
        System.out.println("\nVelocidade BMW = "+ carroBmw.getVelocidade());
        System.out.println("Acelerando até o máximo...");
        carroBmw.acelerar(5);
        carroBmw.acelerar();

        System.out.println("\nVelocidade Fusca = "+ carroFusca.getVelocidade());
        System.out.println("Acelerando até o máximo...");
        carroFusca.acelerar(4);
        carroFusca.acelerar();
    }
}
