package SistemaBancario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Cliente cliente01 = new Cliente("01234556778", "Renato Gameiro");
        Conta contaCleinte01 = new Conta(cliente01, 1000, 50d);

        Cliente fulano = new Cliente();
        fulano.setNome("JOao da Silva");
        cliente01.setCpf("12341234542");

        Conta contaFulando = new Conta(fulano, 1001, 0);
        contaFulando.titular = cliente01;
        contaFulando.numeroconta = 1001;
        contaFulando.setSaldo(30);

        Banco sistemaBancario = new Banco();

        System.out.println("O nome do dono da conta 1000 é "  + cliente01.getNome());
        System.out.println("O saldo da conta " + contaCleinte01.numeroconta + " é de: R$" + contaFulando.getSaldo()) ;
        System.out.println("Por favor digite o valor que quer depositar: ");
        sistemaBancario.depositar(contaCleinte01, teclado.nextDouble());

        System.out.println("Agora digite o valor que quer sacar: ");
        sistemaBancario.sacar(contaCleinte01, teclado.nextDouble());

        System.out.println("Agora digite o número da conta que deseja transferir e o valor");
        sistemaBancario.transferir(contaCleinte01, contaFulando, teclado.nextDouble());
        teclado.close();

        contaFulando.imprimirSaldo();
        contaCleinte01.imprimirSaldo();
        System.out.println("A quantidade de clientes é: " + Cliente.quantidadeClientes);
    }
}
