package Atividades.Atividade05;

public class Fusca extends ModeloCarro implements InterfaceCarro{

    public Fusca(int potencia) {
        super(potencia);
    }

    @Override
    public void acelerar() {
        this.setVelocidade(this.getPotencia());
    }

    @Override
    public void frear() {
        this.setVelocidade(-this.getPotencia());
    }

    @Override
    public double calcularVelocidade(int m, int s) {
        double v = m/s;
        System.out.printf("Velocidade média em %d/%d",m,s);
        System.out.printf("\n%.0fm/s",v);
        return v;   
    }
}
