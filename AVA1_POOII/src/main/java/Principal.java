// Programa para gerenciamento de vendas de computadores (Servidor, Notebook e Desktop)
// Aluno: Gabriel de Souza da Silva | Matricula: 20193300349

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws InterruptedException {
        // Declaração dos controladores
        int quantidadeComputadores, escolhaComputador;
        boolean countserv = false, countdek = false, countnote = false;
        // fim declaração dos controladores

        Scanner leitor = new Scanner(System.in);

        System.out.println("\n--- Bem vindo ao gerenciador de vendas de computadores! ---\n");

        // Estrutura de repetição para os instanciamento de todos os computadores ou para sair do programa
        while (true){
            System.out.println("Qual computador você quer montar hojê:\n" +
                    "[1] - Servidor\n[2] - Desktop\n[3] - Notebook\n[4] - Sair");
            System.out.print("...: ");

            escolhaComputador = leitor.nextInt(); // recebe a escolha de criar um computador ou sair

            // Estrutura para limitar a criação de cada tipo de computador
            if (escolhaComputador == 1 && countserv == true){
                System.out.println("Limite de servidor atingido!");
            }else if (escolhaComputador == 2 && countdek == true){
                System.out.println("Limite de desktops atingido!");
            }else if (escolhaComputador == 3 && countnote == true){
                System.out.println("Limite de notebooks atingido");
            }
            // Fim da estrutura para limitação

            // Cria um vetor de Computador - Servidor
            if (escolhaComputador == 1 && countserv == false){
                System.out.print("Quantos servidores você quer comprar hojê: ");
                quantidadeComputadores = leitor.nextInt();

                Servidor serv[] = new Servidor[quantidadeComputadores];
                for(int i = 0; i < quantidadeComputadores; i++){
                    serv[i] = new Servidor();
                    serv[i].LeitorDados();
                    serv[i].Imprimir();
                    countserv = true;
                }
            } // Fim do vetor Computador - Servidor

            // Cria um vetor de Computador - Desktop
            else if (escolhaComputador == 2 && countdek == false) {
                System.out.print("Quantos desktops você quer comprar hojê: ");
                quantidadeComputadores = leitor.nextInt();

                Desktop desk[] = new Desktop[quantidadeComputadores];
                for (int i = 0; i < quantidadeComputadores; i++) {
                    desk[i] = new Desktop();
                    desk[i].LeitorDados();
                    desk[i].Imprimir();
                    countdek = true;
                }
            } // Fim do vetor Computador - Desktop

            // Cria um vetor de Computador - Notebook
            else if (escolhaComputador == 3 && countnote == false) {
                System.out.print("Quantos notebooks você quer comprar hojê: ");
                quantidadeComputadores = leitor.nextInt();

                Notebook note[] = new Notebook[quantidadeComputadores];
                for (int i = 0; i < quantidadeComputadores; i++) {
                    note[i] = new Notebook();
                    note[i].LeitorDados();
                    note[i].Imprimir();
                    countnote = true;
                }
            } // Fim do vetor Computador - Notebook

            // Para sair do programa
            else if (escolhaComputador == 4){
                break;
            }
            // Caso escolha uma opção invalida
            else if (escolhaComputador > 4){
                System.out.print("Opção invalida...\nCarregando o menu novamente");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.println(".\n\n");
                Thread.sleep(500);
            } // Fimd a opção invalida

            // Caso todos os tipos de computadores já tenham sido criados, o sistema encerra
            if (countserv == true && countdek == true && countnote == true){
                break;
            }

        } // Fim da estrutura de repetição para o instanciamento dos computadores

        System.out.println("Obrigado por utilizar um Software:\n   Go!\n   Sys");

    } // Fim Main
} // Fim do pragrama