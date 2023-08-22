package TrabalhoRicardo;

import java.util.Scanner;


public class Caminhao extends Veiculo {
    private String TipoDeCarga;
    private int Eixos;
    private double Carga;


    public Caminhao(String tipoDeCarga) {
        TipoDeCarga = tipoDeCarga;
    }

    public Caminhao(String placa3, double tabelaFipe3, double capacidadeDoTaque2, double velocidade2, String combustivel3, String modelo3, String marca3, String tipoDeCarga, int eixos, double quilometragem3, double carga) {
        super(placa3, tabelaFipe3, capacidadeDoTaque2, velocidade2, combustivel3, modelo3, marca3, quilometragem3);
        Eixos = eixos;
        TipoDeCarga = tipoDeCarga;
        Carga = carga;

    }

    public String getTipoDeCarga() {
        return TipoDeCarga;
    }

    public void setTipoDeCarga(String tipoDeCarga) {
        TipoDeCarga = tipoDeCarga;
    }

    public double getCarga() {
        return Carga;
    }

    public void setCarga(double carga) {
        this.Carga = carga;
    }


    public void CargaeDescarga(){
        Scanner scanner = new Scanner(System.in);
        int opcao = 1;
        System.out.println("A capacidade máxima de carga é: " + getCarga() + "!");
        System.out.println("Você deseja \n 1- Carregar  \n 2- Descarregar: \n 0- Voltar");
        opcao = scanner.nextInt();

        switch (opcao){
            case 0:
                System.out.println("Voltando ao menu anterior...");
                break;

            case 1:
                System.out.println("Digite a quantidade a ser carregada:");
                double quantidadeCarregada = scanner.nextDouble();
                if (quantidadeCarregada <= Carga) {
                    Carga += quantidadeCarregada;
                    System.out.println("Carga carregada com sucesso. Carga atual: " + Carga);
                } else {
                    System.out.println("Não é possível carregar essa quantidade, excede a capacidade máxima.");
                }
                break;
            case 2:
                System.out.println("Digite a quantidade a ser descarregada:");
                double quantidadeDescarregada = scanner.nextDouble();
                if (quantidadeDescarregada <= Carga) {
                    Carga -= quantidadeDescarregada;
                    System.out.println("Carga descarregada com sucesso. Carga atual: " + Carga);
                } else {
                    System.out.println("Não é possível descarregar essa quantidade, não há carga suficiente.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }




}



