package model;

import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;
    public Banco(String nome) {
        this.nome = nome;
    }
}
