package Atividades.Atividade05;

public abstract class ModeloCarro {
    // Velocidade medida em Km/h
    private int velocidade = 0;
    private int potencia;

    public ModeloCarro(int potencia) {
        this.potencia = potencia;
    }    

    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade += velocidade;
    }
    public int getPotencia() {
        return potencia;
    }  
}
