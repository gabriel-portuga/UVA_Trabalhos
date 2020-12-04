package Ava2;
import java.util.Scanner;

public class Aviao extends Mae {
// --- Attributes ---
	private String prefixo;
	private String dataRevisao;
 
// --- Set and Get ---
	public void setPrefixo(String pref) {
		this.prefixo = pref;
	}
	public void setDataRevisao(String dataR) {
		this.dataRevisao = dataR;
	}
	
	public String getPrefixo() {
		return prefixo;
	}
	public String getDataRevisao() {
		return dataRevisao;
	}
	
//--- Builders ---
	public Aviao() {
	}
	public Aviao(String prefixo) {
		this.prefixo = prefixo;
	}
	public Aviao(String prefixo, String dataR) {
		this.prefixo = prefixo;
		this.dataRevisao = dataR;
	}
	public Aviao(double preco) {
		super(preco);
	}
	public Aviao(double preco, int numP, int capT) {
		super(preco, numP, capT);
	}
	
// --- Input ---
	public void setar(int capT, int numP, double preco, String prefixo, String dataR) {
		super.setar();
		setPrefixo(prefixo);
		setDataRevisao(dataRevisao);
	}
	
	@Override
	public void entradaDados() {
		Scanner sc = new Scanner(System.in);
		super.entradaDados();
		
		System.out.println("Qual sera o prefixo? ");
		setPrefixo(sc.nextLine());
		System.out.println("Qual a data da revisao? ");
		setDataRevisao(sc.nextLine());
	}
	
	public void reajustePreco(double percentual) {
		setPreco(getPreco() + (getPreco() * (percentual / 100)));
	}
	
	
// --- Output ---
	public void saidaDados() {
		super.saidaDados();
		System.out.println("Prefixo: " + getPrefixo());
		System.out.println("Data da revisao: " + getDataRevisao());
		System.out.println("----------------------------------------------");
	}
}
