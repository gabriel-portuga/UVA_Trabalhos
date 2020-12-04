package Ava2;
import java.util.Scanner;

public class Navio extends Mae {
// --- Attributes ---
	private String nome;
	private int numeroTripulantes;
	private String dataLancamento;

// --- Set and Get ---
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setNumeroTripulantes(int numT) {
		this.numeroTripulantes = numT;
	}
	public void setDataLancamento(String dataL) {
		this.dataLancamento = dataL;
	}
	
	public String getNome() {
		return nome;
	}
	public int getNumeroTripulantes() {
		return numeroTripulantes;
	}
	public String getDataLancamento() {
		return dataLancamento;
	}
	
// --- Builders ---	
	public Navio() {
		}
	public Navio(String nome) {
		this.nome = nome;
	}
	public Navio(String nome, int numT) {
		this.nome = nome;
		this.numeroTripulantes = numT;
	}
	public Navio(String nome, int numT, String dataL) {
		this.nome = nome;
		this.numeroTripulantes = numT;
		this.dataLancamento = dataL;
	}
	public Navio(int numT, String dataL) {
		this.numeroTripulantes = numT;
		this.dataLancamento = dataL;
	}
	
// --- Input ---
	public void setar(int capT, int numP, double preco, String nome, int numT, String dataL) {
		super.setar();
		setNome(nome);
		setNumeroTripulantes(numeroTripulantes);
		setDataLancamento(dataLancamento);
	}
	
	@Override
	public void entradaDados() {
		Scanner sc = new Scanner(System.in);
		super.entradaDados();
		
		while(i==3) {
			try {
				System.out.println("Qual o nome? ");
				setNome(sc.nextLine());
				i=4;
			} catch(Exception erro) {
				System.out.println("Nome invalido! " + erro);
				i=3;
				entradaDados();
			}
		}
		
		while(i==4) {
			try {
				System.out.println("Qual a data do lancamento? ");
				setDataLancamento(sc.nextLine());
				i=5;
			} catch(Exception erro) {
				System.out.println("Data digitada invalida! " + erro);
				i=4;
				entradaDados();
			}
		}
		while(i==5) {
			try {
				System.out.println("Qual o numero de tripulantes? ");
				setNumeroTripulantes(sc.nextInt());
				if (this.getNumeroTripulantes() > 0 ) {
					i=0;
				} else {
					System.out.println("Numero de tripulantes menor que 1(um)! ");
					i=5;
					this.entradaDados();
				}
			}catch (Exception erro) {
				System.out.println("Numero de tripulantes digitado invalido! " + erro);
				i=5;
				this.entradaDados();
			}
		}
	}
	
	public float passageirosPorTripulantes() {
		return getNumeroPassageiros() / getNumeroTripulantes();
	}
	
// --- Output ---
	public void saidaDados() {
		super.saidaDados();
		System.out.println("Nome.................: " + getNome());
		System.out.println("Numero de tripulantes: " + getNumeroTripulantes());
		System.out.println("Data do lancamento...: " + getDataLancamento());
		System.out.println("----------------------------------------------");
	}
}
