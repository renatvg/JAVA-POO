package SistemaBancario;

public class Conta {
    Cliente titular;
    int numeroconta;
    private double saldo;

    void imprimirSaldo (){
        System.out.println("Seu saldo até o momento é de: "+ this.saldo);
    }

    public void setSaldo(double saldo) {
        if (saldo >=  0) {
        this.saldo = saldo;
        }else {
            System.out.println("O saldo não foi alterado, valor negativo. ");
        }
    }

    public double getSaldo() {
        return this.saldo;
    }


    Conta (Cliente titular, int numeroconta, double saldo) {
        this.titular = titular;
        this.numeroconta = numeroconta;
        if (saldo >= 0){
            this.saldo = saldo;
         }
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getNumeroconta() {
        return numeroconta;
    }

    public void setNumeroconta(int numeroconta) {
        this.numeroconta = numeroconta;
    }
}

