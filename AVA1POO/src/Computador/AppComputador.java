package Computador;

public class AppComputador {

	public static void main(String[] args) {
		Computador computador1 = new Computador("Dell", false);
		System.out.println("Computador 1: ");
		computador1.inputConfig();
		computador1.inputUsuarioSenha();
		computador1.inputPreco();
		computador1.ligar();
		computador1.imprimir();

		Computador computador2 = new Computador("Dell", true, "Admin", "Admin", 3000.15);
		System.out.println("Computador 2: ");
		computador2.inputUsuarioSenha();
		computador2.inputConfig();
		computador2.desligar();
		computador2.imprimir();

		Computador computador3 = new Computador("Acer", "Admin", "Admin", false);
		System.out.println("Computador 3: ");
		computador3.inputConfig();
		computador3.inputPreco();
		computador3.ligar();
		computador3.imprimir();

		Computador computador4 = new Computador("Vaio", false, "Admin", "Admin");
		System.out.println("Computador 4: ");
		computador4.inputConfig();
		computador4.ligar();
		computador4.imprimir();

		Computador computador5 = new Computador("Admin", "Admin", false);
		System.out.println("Computador 5: ");
		computador5.inputFabricante();
		computador5.inputConfig();
		computador5.inputPreco();
		computador5.ligar();
		computador5.imprimir();

		Computador computador6 = new Computador(true, "Admin", "Admin");
		System.out.println("Computador 6: ");
		computador6.inputFabricante();
		computador6.inputConfig();
		computador6.inputUsuarioSenha();
		computador6.desligar();
		computador6.imprimir();

	}

}
