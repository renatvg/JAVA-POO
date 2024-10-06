package br.com.xpto.sistemabancario;

public class Main {
    public static void main(String[] args) {
        br.com.xpto.concessionaria.Pessoas pessoaConcessionaria = new br.com.xpto.concessionaria.Pessoas();
        String nome = pessoaConcessionaria.getNome();

        br.com.xpto.sistemabancario.Pessoa pessoaSisBan = new br.com.xpto.sistemabancario.Pessoa();
        String cpf = pessoaSisBan.getCpf();
    }
}
