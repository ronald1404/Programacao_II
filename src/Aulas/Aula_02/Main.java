package Aulas.Aula_02;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
    	
    	Carro fusca = new Carro(10);

        System.out.print("Velocidade Inicial: ");
        System.out.println(fusca.getVelocidade());
        JOptionPane.showMessageDialog(null, "Velocidade inicial = 0");

        System.out.println("Acelerando...");
        JOptionPane.showMessageDialog(null, "Acelerando...");

        fusca.acelerar();
        System.out.print("Velocidade Atual: ");
        System.out.println(fusca.getVelocidade());
        JOptionPane.showMessageDialog(null,"Velocidade atual: "+fusca.getVelocidade());

        System.out.println("freando...");
        JOptionPane.showMessageDialog(null,"Freando...");

        fusca.frear();
        System.out.print("Velocidade Atual: ");
        System.out.println(fusca.getVelocidade());
        JOptionPane.showMessageDialog(null,"Velocidade atual: "+fusca.getVelocidade());

        System.out.println("Reabastecendo tanque");

        fusca.abastecer(5);
        System.out.println("Gasolina no tanque: "+ fusca.getGasolina());
        fusca.tocar_musica("Radioactive");
	}
}
