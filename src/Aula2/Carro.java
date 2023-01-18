package Aula2;

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
    public String getMusica() {
    	return musica;
    }
    public void setMusica(String musica) {
    	this.musica = musica;
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
        setMusica(nome_musica);
        System.out.println("Tocando "+ nome_musica);
    }
    
    
}


