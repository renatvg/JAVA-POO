package SistemaBancario;

public class Cliente {

    public static int quantidadeClientes;

    private String cpf;
    private String nome;

    Cliente(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
        Cliente.incrementarClientes();
    }

    public void setCpf (String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    Cliente(){
        Cliente.incrementarClientes();
    }

    public static void incrementarClientes() {
        Cliente.quantidadeClientes ++;
    }

}
