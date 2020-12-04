import java.util.Scanner;

public class appComputador {
	public static void main(String[] args) {
		Computador c0 = new Computador();
		Computador c1 = new Computador();
		Computador c2 = new Computador();
		Computador c3 = new Computador();
		Computador c4 = new Computador();
		Computador c5 = new Computador();
		Computador c6 = new Computador();
		Computador c7 = new Computador();
		Computador c8 = new Computador();
		Computador c9 = new Computador();
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=0;i<6;i++) {
		System.out.println("Escolha um fabricante para montar seu computador:");
		System.out.println("0 - Dell      1 - Vaio      2 - Samsung");
		System.out.println("3 - Acer      4 - Positivo  5 - HP");
		System.out.println("6 - Lenovo    7 - Asus      8 - Apple");
		System.out.println("9 - Razer ");
		System.out.println("Digite apenas o numero referente a marca.");
		int teste;
		teste = sc.nextInt();
		
		switch(teste) {
		case 0:
			c0.dell();
			c0.imprimir();
			break;
		case 1:
			c1.vaio();
			c1.imprimir();
			break;
		case 2:
			c2.samsung();
			c2.imprimir();
			break;
		case 3:
			c3.acer();
			c3.imprimir();
			break;
		case 4:
			c4.positivo();
			c4.imprimir();
			break;
		case 5:
			c5.hp();
			c5.imprimir();
			break;
		case 6:
			c6.lenovo();
			c6.imprimir();
			break;
		case 7:
			c7.asus();
			c7.imprimir();
			break;
		case 8:
			c8.apple();
			c8.imprimir();
			break;
		case 9:
			c9.razer();
			c9.imprimir();
			break;
		default:
			System.out.println("Digite SOMENTE numeros entre 0 e 9");
		}
		
		}
		sc.close();
		
	}
}
