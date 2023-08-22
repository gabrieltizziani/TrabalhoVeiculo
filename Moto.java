package TrabalhoRicardo;

public class Moto extends Veiculo {
    private int Cilindradas;

    public Moto(int cilindradas) {
        Cilindradas = cilindradas;
    }

    public Moto(String placa2, double tabelaFipe2, double capacidadeDoTaque, double velocidade, String combustivel2, String modelo2, String marca2, int cilindradas, double quilometragem2) {
        super(placa2, tabelaFipe2, capacidadeDoTaque, velocidade, combustivel2, modelo2, marca2, quilometragem2);
        Cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return Cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        Cilindradas = cilindradas;
    }
}
