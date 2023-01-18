package Aula2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JOptionPane;

public class Carro{
    private int velocidade;
    private int potencia;
    private int gasolina;
    private String musica;

    public Carro(int potencia){
        this.potencia = potencia;
        velocidade = 0;
        gasolina = 0;
    }
    public int getVelocidade(){
        return velocidade;
    }
    public void acelerar(){
        velocidade += potencia;
    }
    public void frear(){
        velocidade *= 0.5;
    }
    public int getGasolina(){
        return gasolina;
    }
    void abastecer(int valor){
        gasolina += valor;
    }
    public void tocar_musica(String nome_musica){
        musica = nome_musica;
        System.out.println("Tocando "+ nome_musica);
    }
    
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


