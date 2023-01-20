package Atividades.Atividade_tres_carros;

/**
 * Carro
 */
public abstract class Carro {
    
    private int velocidade = 0;    
    private int velocidade_maxima;
    
    //construtor com parâmetro da velocidade máxima
    public Carro(int velocidade_maxima) {
        super();
        velocidadeMaxima(velocidade_maxima);
    }
    // método a ser implementado pelas classes derivadas
    public abstract Void acelerar();
    public abstract Void acelerar(int n);

    // Método velocidade máxima
    private void velocidadeMaxima(int velocidade_maxima)
        {this.velocidade_maxima = velocidade_maxima;}

    // Set e Get de velocidade
    public int getVelocidade() {return velocidade;}
    public void setVelocidade(int velocidade)
        {this.velocidade += velocidade;}
    // Obter velocidade Máxima
    public int getVelocidadeMaxima()
        {return velocidade_maxima;}


}