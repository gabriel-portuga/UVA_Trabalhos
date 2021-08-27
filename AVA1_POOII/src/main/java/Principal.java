// Programa para gerenciamento de vendas de computadores (Servidor, Notebook e Desktop)
// Aluno: Gabriel de Souza da Silva | Matricula: 20193300349

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws InterruptedException {
        int quantidadeComputadores, escolhaComputador;
        boolean countserv = false, countdek = false, countnote = false;
        Scanner leitor = new Scanner(System.in);
        System.out.println("\n--- Bem vindo ao gerenciador de vendas de computadores! ---\n");

        while (true){
            System.out.println("Qual computador você quer montar hojê:\n" +
                    "[1] - Servidor\n[2] - Desktop\n[3] - Notebook\n[4] - Sair");
            System.out.print("...: ");
            escolhaComputador = leitor.nextInt();

            if (escolhaComputador == 1 && countserv == true){
                System.out.println("Limite de servidor atingido!");
            }else if (escolhaComputador == 2 && countdek == true){
                System.out.println("Limite de desktops atingido!");
            }else if (escolhaComputador == 3 && countnote == true){
                System.out.println("Limite de notebooks atingido");
            }

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
            } else if (escolhaComputador == 2 && countdek == false) {
                System.out.print("Quantos desktops você quer comprar hojê: ");
                quantidadeComputadores = leitor.nextInt();

                Desktop desk[] = new Desktop[quantidadeComputadores];
                for (int i = 0; i < quantidadeComputadores; i++) {
                    desk[i] = new Desktop();
                    desk[i].LeitorDados();
                    desk[i].Imprimir();
                    countdek = true;
                }
            } else if (escolhaComputador == 3 && countnote == false) {
                System.out.print("Quantos notebooks você quer comprar hojê: ");
                quantidadeComputadores = leitor.nextInt();

                Notebook note[] = new Notebook[quantidadeComputadores];
                for (int i = 0; i < quantidadeComputadores; i++) {
                    note[i] = new Notebook();
                    note[i].LeitorDados();
                    note[i].Imprimir();
                    countnote = true;
                }
            } else if (escolhaComputador == 4){
                break;
            } else if (escolhaComputador > 4){
                System.out.print("Opção invalida...\nCarregando o menu novamente");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.println(".\n\n");
                Thread.sleep(500);
            }

            if (countserv == true && countdek == true && countnote == true){
                break;
            }
        }
        System.out.println("Obrigado por utilizar um Software:\n   Go!\n   Sys");
    }
}