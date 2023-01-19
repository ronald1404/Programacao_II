package Atividade_Banco;

public class Conta {
    Correntista correntista;
    protected double saldo;
    protected double cheque_especial;

    public Conta(Correntista correntista){
        super();
        this.correntista = correntista;
    }
    public double getSaldo(){
        return saldo;
    }
    public double saque(double valor){
        return saldo-valor;
    }
    public void tranferir(double valor, double correntista_para){

    }
}
