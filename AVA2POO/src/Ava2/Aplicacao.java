package Ava2;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		Aviao av[] = new Aviao[10];
		Navio nav[] = new Navio[10];
		
		System.out.println(" ---------------");
		System.out.println("|----Aviões---- |");
		System.out.println(" ---------------");
		
		for(int i=0; i<av.length; i++) {
			av[i] = new Aviao();
			Scanner sc = new Scanner(System.in);
			
			try {
				System.out.println("Percentual para reajuste: ");
				Double percentual = sc.nextDouble();
				av[i].entradaDados();
				av[i].reajustePreco(percentual);
				av[i].saidaDados();
			} catch(Exception erro) {
				System.out.println("Perncentual invalido, reajuste de percntual para 5%");
				Double percentual = 5.0;
				av[i].entradaDados();
				av[i].reajustePreco(percentual);
				av[i].saidaDados();
			}

		}
		
		System.out.println(" ---------------");
		System.out.println("|----Navios---- |");
		System.out.println(" ---------------");
		
		for(int i=0; i<nav.length; i++) {
			nav[i] = new Navio();
			nav[i].entradaDados();
			nav[i].saidaDados();
			System.out.println("Relacao passageiros por tripulante: " + nav[i].passageirosPorTripulantes());
		}
		
	}

}
