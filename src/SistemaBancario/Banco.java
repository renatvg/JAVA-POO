package SistemaBancario;

public class Banco {

    void depositar(Conta conta, double valor) {
        double novoSaldo = conta.mostrarSaldo() + valor;
        conta.modificarSaldo(novoSaldo);
        System.out.println("Você fez um deposito no valor de: R$"+ valor + " agora o seu saldo é: R$" + conta.mostrarSaldo() + ".");
    }

    void sacar(Conta conta, double valor) {
        double novoSaldo = conta.mostrarSaldo() - valor;
        if (novoSaldo < 0){
            System.out.println("Não foi possível realizar a sua operação, pois o valor do saque é maior do que o saldo da conta. Seu saldo é de: R$" + conta.mostrarSaldo() );
        }else {
            conta.modificarSaldo(novoSaldo);
            System.out.println("Você sacou R$" + valor + " da  sua conta, seu saldo agora é de: R$" + conta.mostrarSaldo());
        }
    }

    void transferir(Conta origem, Conta destino, double valor){
            double saldoDaContaOrigem = origem.mostrarSaldo() - valor;
            if (saldoDaContaOrigem < 0){
            System.out.println("Não foi possível realizar a sua transferência, pois o valor da transferência é maior do que o saldo da conta. ");

            }else {
            origem.modificarSaldo(saldoDaContaOrigem);

            double novoSaldoDestino = destino.mostrarSaldo() + valor;
            destino.modificarSaldo(novoSaldoDestino);

            System.out.println("O saldo da conta de origem agora é de: R$" + origem.mostrarSaldo() + "O da conta de destino é de: R$" + destino.mostrarSaldo());
        }
    }
}
