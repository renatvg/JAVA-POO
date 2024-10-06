package br.com.xpto.concessionaria;

public class Pessoas {
    public Pessoas(){}
    Pessoas(String cpf, String nome){

    }
    private String rg;
    private  String nome;

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
