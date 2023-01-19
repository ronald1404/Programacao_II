package Atividade_Banco;

public class Conta {

    Correntista correntista;
    private double saldo;

    public Conta(Correntista correntista){
        this.correntista = correntista;
    }

    public void setSaldo(double valor){
        saldo +=valor;
    }
    public double getSaldo(){
        return saldo;
    }

    public void deposito(double valor){
        saldo+=valor;
    }

    public double saque(double valor){
        if (valor > saldo) {
            System.out.println("Saldo Insuficiente");
        }
        else{
            saldo -=valor;
        }
        // saldo = (valor > saldo) ? saldo :saldo-valor; 
        return saldo;
    }

    public void tranferir(double valor, Conta para){
        saque(valor);
        para.saldo += valor;
    }

}
