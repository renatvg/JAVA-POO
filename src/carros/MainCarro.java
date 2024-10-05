package carros;

import java.util.Scanner;

public class MainCarro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Carro civic = new Carro();
        civic.cavalos = 100;
        civic.cor = "Azul";
        civic.fabricante = "Honda";
        civic.cambio = "Automatico";
        civic.tanque = 50;
        civic.combustivel = 12;
        civic.kmPorLitro = 12;

        Carro corolla = new Carro();
        corolla.cavalos = 30;
        corolla.cor = "Prata";
        corolla.fabricante = "Toyota";
        corolla.cambio = "Automatico";
        corolla.tanque = 60;
        corolla.kmPorLitro = 10;
        corolla.combustivel = 47;


        System.out.println("Dados do civic: Cavalos: " + civic.cavalos);

        System.out.println("O civic tem atualmente: " + civic.combustivel + " litros de combustivel.");
        System.out.println("A sua autonomia é de: " + civic.autonimiaCombustivel() + "km");

        System.out.println("Digite quanto você quer abastecer: ");

        int abastecer = teclado.nextInt();
        civic.abastecer(abastecer);

        System.out.println("Após o abastecimento, o civic agora tem: " + civic.combustivel +" litros, e uma autonomia de: " + civic.autonimiaCombustivel() + "km"  ) ;

        System.out.println("O corolla tem atualmente: " + corolla.combustivel + " litros de combustivel.");
        System.out.println("A sua autonomia é de: " + corolla.autonimiaCombustivel() + "km");

        System.out.println("Digite quanto você quer abastecer: ");

        abastecer = teclado.nextInt();
        corolla.abastecer(abastecer);
        System.out.println("Após o abastecimento, o corolla agora tem: " + corolla.combustivel +" litros, e uma autonomia de: " + corolla.autonimiaCombustivel() + "km"  ) ;


        teclado.close();
    }
}
