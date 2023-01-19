package Atividade_Banco;
public class ContaCorrente extends Conta{
    
    protected double cheque_especial = 200;

    public ContaCorrente(Correntista correntista) {
        super(correntista);
    }
    
    @Override
    public double saque(double valor){
        if ((valor > cheque_especial+getSaldo())){
            System.out.println("Erro, Saldo insuficiente");
            return getSaldo();
        }
        setSaldo(valor*-1);
        return getSaldo();
    }
}