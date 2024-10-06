package SistemaBancario;

public class Banco {

    void depositar(Conta conta, double valor) {
        double novoSaldo = conta.getSaldo() + valor;
        conta.setSaldo(novoSaldo);
        System.out.println("Você fez um deposito no valor de: R$"+ valor + " agora o seu saldo é: R$" + conta.getSaldo() + ".");
    }

    void sacar(Conta conta, double valor) {
        double novoSaldo = conta.getSaldo() - valor;
        if (novoSaldo < 0){
            System.out.println("Não foi possível realizar a sua operação, pois o valor do saque é maior do que o saldo da conta. Seu saldo é de: R$" + conta.getSaldo() );
        }else {
            conta.setSaldo(novoSaldo);
            System.out.println("Você sacou R$" + valor + " da  sua conta, seu saldo agora é de: R$" + conta.getSaldo());
        }
    }

    void transferir(Conta origem, Conta destino, double valor){
            double saldoDaContaOrigem = origem.getSaldo() - valor;
            if (saldoDaContaOrigem < 0){
            System.out.println("Não foi possível realizar a sua transferência, pois o valor da transferência é maior do que o saldo da conta. ");

            }else {
            origem.setSaldo(saldoDaContaOrigem);

            double novoSaldoDestino = destino.getSaldo() + valor;
            destino.setSaldo(novoSaldoDestino);

            System.out.println("O saldo da conta de origem agora é de: R$" + origem.getSaldo() + "O da conta de destino é de: R$" + destino.getSaldo());
        }
    }
}
