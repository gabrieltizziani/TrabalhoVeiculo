package TrabalhoRicardo;

import java.util.Scanner;

public class Carro extends Veiculo {
    private int CapacidadePortaMalas;
    Scanner scanner = new Scanner(System.in);

    public Carro(String placa, double tabelaFipe, double capacidadeDoTaque, double velocidade, String combustivel, String modelo, String marca, int capacidadePortaMalas, double quilometragem) {
        super(placa, tabelaFipe, capacidadeDoTaque, velocidade, combustivel, modelo, marca,quilometragem);
        CapacidadePortaMalas = capacidadePortaMalas;
    }

    public double getCapacidadePortaMalas() {
        return CapacidadePortaMalas;
    }

    public void setCapacidadePortaMalas(int capacidadePortaMalas) {
        CapacidadePortaMalas = capacidadePortaMalas;
    }

    public void PreencherPortaMalas(){
        int opcao = 1;
        int maletaDeFerramentas = 0;
        int malaDeViagensG = 0;
        int malaDeViagensM = 0;
        int malaDeViagensP = 0;
        int coolerDeBebidas = 0;
        int bolaDeFutebol = 0;

        while (opcao != 0 && CapacidadePortaMalas >= 6){
            System.out.println("Seu porta malas possui " + getCapacidadePortaMalas() + "L de capacidade restante");
            System.out.println("Menu de itens para inserir no porta malas");
            System.out.println("1. Maleta de ferramentas");
            System.out.println("2. Mala de viagens (G)");
            System.out.println("3. Mala de viagens (M)");
            System.out.println("4. Mala de viagens (P)");
            System.out.println("5. Cooler de bebidas");
            System.out.println("6. Bola de futebol");
            System.out.println("7. Mostrar itens que estão no porta malas.");
            System.out.println("0. Voltar");
            System.out.print("Digite o valor referente a opção desejada: ");
            opcao = scanner.nextInt();


            switch (opcao){
                case 0:
                    System.out.println("Voltando ao menu anterior...");
                    break;
                case 1:
                    if (CapacidadePortaMalas >= 25) {
                        maletaDeFerramentas++;
                        CapacidadePortaMalas -= 25;
                    } else {
                        System.out.println("Este item não cabe!");
                    }
                    break;
                case 2:
                    if (CapacidadePortaMalas >= 150) {
                        malaDeViagensG++;
                        CapacidadePortaMalas -= 150;
                    } else {
                        System.out.println("Este item não cabe!");
                    }
                    break;
                case 3:
                    if (CapacidadePortaMalas >= 120) {
                        malaDeViagensM++;
                        CapacidadePortaMalas -= 120;
                    } else {
                        System.out.println("Este item não cabe!");
                    }
                    break;
                case 4:
                    if (CapacidadePortaMalas >= 90) {
                        malaDeViagensP++;
                        CapacidadePortaMalas -= 90;
                    } else {
                        System.out.println("Este item não cabe!");
                    }
                    break;
                case 5:
                    if (CapacidadePortaMalas >= 70) {
                        coolerDeBebidas++;
                        CapacidadePortaMalas -= 70;
                    } else {
                        System.out.println("Este item não cabe!");
                    }
                    break;
                case 6:
                    if (CapacidadePortaMalas >= 8) {
                        bolaDeFutebol++;
                        CapacidadePortaMalas -= 8;
                    } else {
                        System.out.println("Este item não cabe!");
                    }
                    break;
                case 7:
                    boolean estaNoPortaMalas = false;

                    System.out.println("Itens presentes no porta malas: ");

                    if (maletaDeFerramentas > 0) {
                        System.out.println(maletaDeFerramentas + "x - Maleta de ferramentas");
                        estaNoPortaMalas = true;
                    }

                    if (malaDeViagensG > 0) {
                        System.out.println(malaDeViagensG + "x - Mala de viagens (G)");
                        estaNoPortaMalas = true;
                    }

                    if (malaDeViagensM > 0) {
                        System.out.println(malaDeViagensM + "x - Mala de viagens (M)");
                        estaNoPortaMalas = true;
                    }

                    if (malaDeViagensP > 0) {
                        System.out.println(malaDeViagensP + "x - Mala de viagens (P)");
                        estaNoPortaMalas = true;
                    }

                    if (coolerDeBebidas > 0) {
                        System.out.println(coolerDeBebidas + "x - Cooler de bebidas");
                        estaNoPortaMalas = true;
                    }

                    if (bolaDeFutebol > 0) {
                        System.out.println(bolaDeFutebol + "x - Bola de futebol");
                        estaNoPortaMalas = true;
                    }

                    if (!estaNoPortaMalas) {
                        System.out.println("Nenhum item presente no porta malas.");
                    }

                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        }
        System.out.println("Seu porta malas está cheio!");
        System.out.println("Voltando ao menu anterior...");
    }


}