package Aulas.Aula_06;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            lista.add(i);
        }

        Aluno a = new Aluno("João", "Linux");
        Aluno b = new Aluno("Pedro", "OpenOffice");
        Aluno c = new Aluno("Lúcia", "Internet");

        List<Aluno> lista2 = new ArrayList<>();

        lista2.add(a);
        lista2.add(b);
        lista2.add(c);
        System.out.println(lista2);

        // List<List<Aluno>> listaDupla = new ArrayList<>();
        List<List> listaDupla = new ArrayList<>();
        listaDupla.add(lista2);

        System.out.println(listaDupla);

        List<Integer> inteiros = new ArrayList<>();

        inteiros.add(1);
        inteiros.add(2);
        inteiros.add(3);

        listaDupla.add(inteiros);

        System.out.println(listaDupla);

    }
}

class Aluno {
    private String nome;
    private String hobby;

    public Aluno(String nome, String hobby) {
        this.nome = nome;
        this.hobby = hobby;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

}