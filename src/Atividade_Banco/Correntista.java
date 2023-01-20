package Atividade_Banco;

public class Correntista{
    private String nome;
    private String cpf;

    public Correntista(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return cpf;
    }
}