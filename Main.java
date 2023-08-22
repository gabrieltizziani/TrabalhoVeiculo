package TrabalhoRicardo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = 1;
        int opcao2 = 1;
        int opcao3 = 1;
        int opcao4 = 1;
        int opcao5 = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, bem vindo ao cadastro de veículos!");
        System.out.print("Digite o seu nome: ");
        String nome = scanner.next();
        System.out.print("Olá, " + nome + "! Digite o seu CPF: ");
        String Cpf = scanner.next();

        System.out.println("Escolha o tipo de veículo: \n 1 - Carro \n 2 - Moto \n 3 - Caminhão   \n 0 - Sair.");
        opcao = scanner.nextInt();
        switch(opcao) {
            case 0:
                System.out.println("Finalizando...");
                break;
            case 1:
                System.out.print("Placa do Carro: ");
                String placa = scanner.next();
                System.out.print("FIPE: R$");
                double tabelaFipe = scanner.nextDouble();
                System.out.print("Capacidade do Tanque(l): ");
                double capacidadeTanque = scanner.nextDouble();
                System.out.print("Velocidade Atual: ");
                double velocidadeAtual = scanner.nextDouble();
                System.out.print("Combustível: ");
                String combustivel = scanner.next();
                System.out.print("Modelo: ");
                String modelo = scanner.next();
                System.out.print("Marca: ");
                String marca = scanner.next();
                System.out.print("Qual a quilometragem: ");
                double quilometragem = scanner.nextDouble();
                System.out.print("Capacidade do Porta Malas (l): ");
                int capacidadePortaMalas = scanner.nextInt();

                Carro carro = new Carro(placa, tabelaFipe, capacidadeTanque, velocidadeAtual, combustivel, modelo, marca, capacidadePortaMalas, quilometragem);

                do {
                    System.out.println("Menu de Seleção de funcionalidades do Carro");
                    System.out.println("1. Acelerar o carro");
                    System.out.println("2. Adicionar quilometragem");
                    System.out.println("3. Inserir itens no porta malas");
                    System.out.println("0. Sair");
                    System.out.print("Digite o valor referente a opção: ");
                    opcao2 = scanner.nextInt();

                    switch (opcao2) {
                        case 1:
                            System.out.print("Em km/h, digite o valor da aceleracao: ");
                            carro.aceleracao = scanner.nextDouble();
                            carro.AcelerarCarro();
                            break;
                        case 2:
                            System.out.println("Quantos KM:");
                            carro.addKm = scanner.nextDouble();
                            carro.AddKm();
                            break;
                        case 3:
                            carro.PreencherPortaMalas();
                            break;
                        case 0:
                            System.out.println("Finalizando...");
                            break;
                        default:
                            System.out.println("Opção inválida");
                    }

                } while (opcao2 != 0);

                break;
            case 2:
                System.out.print("Placa da moto: ");
                String placa2 = scanner.next();
                System.out.print("FIPE: R$");
                double tabelaFipe2 = scanner.nextDouble();
                System.out.print("Capacidade do Tanque(l): ");
                double capacidadeDoTaque = scanner.nextDouble();
                System.out.print("Velocidade Atual: ");
                double velocidade = scanner.nextDouble();
                System.out.print("Combustível: ");
                String combustivel2 = scanner.next();
                System.out.print("Modelo: ");
                String modelo2 = scanner.next();
                System.out.print("Marca: ");
                String marca2 = scanner.next();
                System.out.print("Qual a quilometragem: ");
                double quilometragem2 = scanner.nextDouble();
                System.out.print("Quantas cilindradas: ");
                int cilindradas = scanner.nextInt();

                Moto moto = new Moto(placa2, tabelaFipe2, capacidadeDoTaque, velocidade, combustivel2, modelo2, marca2, cilindradas,quilometragem2);

                do {
                    System.out.println("Menu de Seleção de funcionalidades da Moto");
                    System.out.println("1. Acelerar a moto");
                    System.out.println("2. Adicionar quilometragem");
                    System.out.println("3. Barulho");
                    System.out.println("0. Sair");
                    System.out.print("Digite o valor referente a opção: ");
                    opcao3 = scanner.nextInt();

                    switch (opcao3) {
                        case 1:
                            System.out.print("Em km/h, digite o valor da aceleracao: ");
                            moto.aceleracao = scanner.nextDouble();
                            moto.AcelerarCarro();
                            break;
                        case 2:
                            System.out.println("Quantos KM:");
                            moto.addKm = scanner.nextDouble();
                            moto.AddKm();
                            break;
                        case 3:

                        case 0:
                            System.out.println("Finalizando...");
                            break;
                        default:
                            System.out.println("Opção inválida");
                    }

                } while (opcao3 != 0);
                break;
            case 3:
                System.out.print("Placa do Caminhão: ");
                String placa3 = scanner.next();
                System.out.print("FIPE: R$");
                double tabelaFipe3 = scanner.nextDouble();
                System.out.print("Capacidade do Tanque(l): ");
                double capacidadeDoTaque2 = scanner.nextDouble();
                System.out.print("Velocidade Atual: ");
                double velocidade2 = scanner.nextDouble();
                System.out.print("Combustível: ");
                String combustivel3 = scanner.next();
                System.out.print("Modelo: ");
                String modelo3 = scanner.next();
                System.out.print("Marca: ");
                String marca3 = scanner.next();
                System.out.print("Qual a quilometragem: ");
                double quilometragem3 = scanner.nextDouble();
                System.out.print("Qual o tipo de Carga: ");
                String tipoDeCarga = scanner.next();
                System.out.print("Qual capacidade máxima de carga:");
                double carga = scanner.nextDouble();
                System.out.print("Quantos eixos: ");
                int eixos = scanner.nextInt();

                Caminhao caminhao = new Caminhao(placa3, tabelaFipe3, capacidadeDoTaque2, velocidade2, combustivel3, modelo3, marca3, tipoDeCarga, eixos, quilometragem3, carga);

                do {
                    System.out.println("Menu de Seleção de funcionalidades do Caminhão");
                    System.out.println("1. Acelerar o caminhão");
                    System.out.println("2. Adicionar quilometragem");
                    System.out.println("3. Carga e Descarga");
                    System.out.println("0. Sair");
                    System.out.print("Digite o valor referente a opção: ");
                    opcao4 = scanner.nextInt();

                    switch (opcao4) {
                        case 1:
                            System.out.print("Em km/h, digite o valor da aceleracao: ");
                            caminhao.aceleracao = scanner.nextDouble();
                            caminhao.AcelerarCarro();
                            break;
                        case 2:
                            System.out.println("Quantos KM:");
                            caminhao.addKm = scanner.nextDouble();
                            caminhao.AddKm();
                            break;
                        case 3:
                            caminhao.CargaeDescarga();
                        case 0:
                            System.out.println("Finalizando...");
                            break;
                        default:
                            System.out.println("Opção inválida");
                    }

                } while (opcao4 != 0);

            default:
                System.out.println("Opção inválida!");
        }
    }
}