package Atividade_Banco;/**
 * Main
 */
public class Main {
    public static void main(String[] args) {

        Correntista ronald = new Correntista("Ronald", "007.054.124-44");
        
        ContaCorrente cCorrente =   new ContaCorrente(ronald);
        ContaPoupanca cPoupanca = new ContaPoupanca(ronald);

        System.out.println("Depositando 300");
        cCorrente.deposito(300);

        System.out.println("Transferindo 100 para Poupança");
        cCorrente.tranferir(100, cPoupanca);

        System.out.println("Saldo da conta corrente");
        System.out.println(cCorrente.getSaldo());

        // System.out.println(cCorrente.saldo);

        System.out.println("Saldo da conta poupança");
        System.out.println(cPoupanca.getSaldo());

        System.out.println("Sacando 200 Reais");
        cCorrente.saque(200);
        System.out.println(cCorrente.getSaldo());

        System.out.println("Sacando 200 Reais");
        cCorrente.saque(200);
        System.out.println(cCorrente.getSaldo());

        cCorrente.deposito(199);
        System.out.println(cCorrente.getSaldo());
    }
}