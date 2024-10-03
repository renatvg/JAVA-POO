public class Carro {
    int cavalos;
    String cor;
    String fabricante;
    String cambio;
    int tanque;
    int combustivel;
    int kmPorLitro;

    void abastecer(int litros) {
        combustivel += litros;
    }
    int autonimiaCombustivel(){
        int autonomia = kmPorLitro * combustivel;
        return autonomia;
    }
}
