package Atividade_Banco;/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Correntista ronald = new Correntista("Ronald", "007.054.124-44");
        ContaCorrente cCorrente =   new ContaCorrente(ronald);
        ContaPoupanca cPoupanca = new ContaPoupanca(ronald);

        cCorrente.deposito(300);
        cCorrente.tranferir(100, cPoupanca);

        System.out.println(cCorrente.getSaldo());
        // System.out.println(cCorrente.saldo);
        System.out.println(cPoupanca.getSaldo());
    }
}