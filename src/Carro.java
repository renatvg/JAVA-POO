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
        if (combustivel > tanque) {
            int excesso = combustivel - tanque;
            combustivel = tanque;
            int quantoFoiAbastecido = litros - excesso;
            System.out.println("Foi abastecido apenas " + quantoFoiAbastecido + " litros");
        }
    }
    int autonimiaCombustivel(){
        int autonomia = kmPorLitro * combustivel;
        return autonomia;
    }
}
