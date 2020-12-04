package Ava2;
import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Mae {
// --- Attributes ---
	protected int capacidadeTanque;
	protected int numeroPassageiros;
	protected double preco;
	
// --- Set and Get ---
	public void setCapacidadeTanque(int capT) {
		this.capacidadeTanque = capT;
	}
	public void setNumeroPassageiros(int numP) {
		this.numeroPassageiros = numP;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getCapacidadeTanque() {
		return capacidadeTanque;
	}
	public int getNumeroPassageiros() {
		return numeroPassageiros;
	}
	public double getPreco() {
		return preco;
	}
	
// --- Builders ---	
	public Mae() {
	}
	public Mae(double preco) {
		this.preco = preco;
	}
	public Mae(double preco, int numP) {
		this.preco = preco;
		this.numeroPassageiros = numP;
	}
	public Mae(double preco, int numP, int capT) {
		this.preco = preco;
		this.numeroPassageiros = numP;
		this.capacidadeTanque = capT;
	}
	public Mae(int numP, int capT) {
		this.numeroPassageiros = numP;
		this.capacidadeTanque = capT;
	}
	public Mae(int numP) {
		this.numeroPassageiros = numP;
	}
	
// --- Input ---
	public void setar() {
		setCapacidadeTanque(capacidadeTanque);
		setNumeroPassageiros(numeroPassageiros);
		setPreco(preco);
	}
	int i=0;
	public void entradaDados() {
		Scanner sc = new Scanner(System.in);
		
		while(i==0) {
			try {
				System.out.println("Qual a capacidade do tanque? ");
				
				setCapacidadeTanque(sc.nextInt());
				i=1;
			} catch(Exception erro) {
				System.out.println("Capacidade digitada incorreta! " + erro);
				entradaDados();
			}
		}
		
		while(i==1) {
			try {
				System.out.println("Qual a capacidade de passageiros? ");
				setNumeroPassageiros(sc.nextInt());
				i=2;
			} catch(Exception erro) {
				System.out.println("Capacidade digitada incorreta! " + erro);
				i=1;
				entradaDados();
			}
		}
		
		while(i==2) {
			try {
				System.out.println("Qual o preço? ");
				setPreco(sc.nextDouble());
				i=3;
			} catch(Exception erro) {
				System.out.println("Valor digitado incorreto!");
				i=2;
				entradaDados();
			}
		}
	}
	
// --- Output ---
	public void saidaDados() {
		System.out.println("----------------------------------------------");
		System.out.println("Capacidade do tanque..: " + getCapacidadeTanque() + "L");
		System.out.println("Numero de passageiros.: " + getNumeroPassageiros());
		DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
		decimalFormat.setRoundingMode(RoundingMode.DOWN);
		System.out.println("Preco.................: $" + decimalFormat.format(getPreco()));
	}
	
	
}
