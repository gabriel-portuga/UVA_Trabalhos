import java.util.Scanner;
/* Gabriel de Souza da Silva
 * 20193300349
 */
public class Computador {
// Atributos
	private String fabricante;
	String processador;
	String placaMae;
	String modeloArmazenamento;
	int tamanhoArmazenamento;
	String placaVideo; 
	int memoriaRam;
	int tamanhoTela;
	String fonteAlimentacao;
	String sysOperacional;
		
	// Metodos
	
	// Set e Get
	public void setFabricante(String f) {
		fabricante = f;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setProcessador(String p) {
		processador = p;
	}
	public String getProcessador() {
		return processador;
	}
	public void setPlacaMae(String pm) {
		placaMae = pm;
	}
	public String getPlacaMae() {
		return placaMae;
	}
	public void setModeloArmazenamento(String ma) {
		modeloArmazenamento = ma;
	}
	public String getModeloArmazenamento() {
		return modeloArmazenamento;
	}
	public void setTamanhoArmazenamento(int ta) {
		tamanhoArmazenamento = ta;
	}
	public int getTamanhoArmazenamento() {
		return tamanhoArmazenamento;
	}
	public void setPlacaVideo(String pv) {
		placaVideo = pv;
	}
	public String getPlacaVideo() {
		return placaVideo;
	}
	public void setMemoriaRam(int mr) {
		memoriaRam = mr;
	}
	public int getMemoriaRam() {
		return memoriaRam;
	}
	public void setTamanhoTela(int tm) {
		tamanhoTela = tm;
	}
	public int getTamanhoTela() {
		return tamanhoTela;
	}
	public void setFonteAlimentacao(String fa) {
		fonteAlimentacao = fa;
	}
	public String getFonteAlimentacao() {
		return fonteAlimentacao;
	}
	public void setSysOperacional(String so) {
		sysOperacional = so;
	}
	public String getSysOperacional() {
		return sysOperacional;
	} 
	
	// Especial / Construtor
	public void dell() {
		Scanner sc = new Scanner(System.in);
		this.setFabricante("Dell");
		this.setFonteAlimentacao("Bivolte");
		this.setSysOperacional("Linux");
		System.out.println("Qual processador?");
		setProcessador(sc.nextLine());
		this.setPlacaMae("Asus");
		System.out.println("HDD ou SSD?");
		setModeloArmazenamento(sc.nextLine());
		System.out.println("Quantos gigas de armazenamento?");
		setTamanhoArmazenamento(Integer.parseInt(sc.nextLine()));
		System.out.println("Qual placa de video off-board?");
		setPlacaVideo(sc.nextLine());
		System.out.println("Qual tamanho da memoria RAM? ");
		setMemoriaRam(Integer.parseInt(sc.nextLine()));
		System.out.println("Qual tamanho do monitor?");
		setTamanhoTela(Integer.parseInt(sc.nextLine()));
		
	}	
	public void vaio() {
		Scanner sc = new Scanner(System.in);
		this.setFabricante("Vaio");
		System.out.println("Qual processador?");
		setProcessador(sc.nextLine());
		this.setPlacaMae("MicroStar");
		System.out.println("HDD ou SSD?");
		setModeloArmazenamento(sc.nextLine());
		System.out.println("Quantos gigas de armazenamento?");
		setTamanhoArmazenamento(Integer.parseInt(sc.nextLine()));
		System.out.println("Qual placa de video off-board?");
		setPlacaVideo(sc.nextLine());
		System.out.println("Qual tamanho da memoria RAM? ");
		setMemoriaRam(Integer.parseInt(sc.nextLine()));
		this.setTamanhoTela(17);
		this.setFonteAlimentacao("Bivolte");
		this.setSysOperacional("Windows");
		
	}	
	public void samsung() {
		Scanner sc = new Scanner(System.in);
		this.setFabricante("Samsung");
		System.out.println("Qual processador?");
		setProcessador(sc.nextLine());
		this.setPlacaMae("Gigabyte");
		System.out.println("HDD ou SSD?");
		setModeloArmazenamento(sc.nextLine());
		System.out.println("Quantos gigas de armazenamento?");
		setTamanhoArmazenamento(Integer.parseInt(sc.nextLine()));
		System.out.println("Qual placa de video off-board?");
		setPlacaVideo(sc.nextLine());
		System.out.println("Qual tamanho da memoria RAM? ");
		setMemoriaRam(Integer.parseInt(sc.nextLine()));
		this.setTamanhoTela(14);
		this.setFonteAlimentacao("Bivolte");
		this.setSysOperacional("Linux");
		
	}	
	public void acer() {
		Scanner sc = new Scanner(System.in);
		this.setFabricante("Acer");
		System.out.println("Qual processador?");
		setProcessador(sc.nextLine());
		this.setPlacaMae("ASRock");
		System.out.println("HDD ou SSD?");
		setModeloArmazenamento(sc.nextLine());
		System.out.println("Quantos gigas de armazenamento?");
		setTamanhoArmazenamento(Integer.parseInt(sc.nextLine()));
		System.out.println("Qual placa de video off-board?");
		setPlacaVideo(sc.nextLine());
		System.out.println("Qual tamanho da memoria RAM? ");
		setMemoriaRam(Integer.parseInt(sc.nextLine()));
		this.setTamanhoTela(15);
		this.setFonteAlimentacao("Bivolte");
		this.setSysOperacional("Linux");
		
	}	
	public void positivo() {
		Scanner sc = new Scanner(System.in);
		this.setFabricante("Positivo");
		System.out.println("Qual processador?");
		setProcessador(sc.nextLine());
		this.setPlacaMae("Tomahawk");
		System.out.println("HDD ou SSD?");
		setModeloArmazenamento(sc.nextLine());
		System.out.println("Quantos gigas de armazenamento?");
		setTamanhoArmazenamento(Integer.parseInt(sc.nextLine()));
		System.out.println("Qual placa de video off-board?");
		setPlacaVideo(sc.nextLine());
		System.out.println("Qual tamanho da memoria RAM? ");
		setMemoriaRam(Integer.parseInt(sc.nextLine()));
		this.setTamanhoTela(17);
		this.setFonteAlimentacao("Bivolte");
		this.setSysOperacional("Windows");
		
	}	
	public void hp() {
		Scanner sc = new Scanner(System.in);
		this.setFabricante("HP");
		System.out.println("Qual processador?");
		setProcessador(sc.nextLine());
		this.setPlacaMae("BioStar");
		System.out.println("HDD ou SSD?");
		setModeloArmazenamento(sc.nextLine());
		System.out.println("Quantos gigas de armazenamento?");
		setTamanhoArmazenamento(Integer.parseInt(sc.nextLine()));
		System.out.println("Qual placa de video off-board?");
		setPlacaVideo(sc.nextLine());
		System.out.println("Qual tamanho da memoria RAM? ");
		setMemoriaRam(Integer.parseInt(sc.nextLine()));
		this.setTamanhoTela(17);
		this.setFonteAlimentacao("Bivolte");
		System.out.println("Qual sistema operacional?");
		setSysOperacional(sc.nextLine());
		
	}
	public void lenovo() {
		Scanner sc = new Scanner(System.in);
		this.setFabricante("Lenovo");
		System.out.println("Qual processador?");
		setProcessador(sc.nextLine());
		this.setPlacaMae("PCWare");
		System.out.println("HDD ou SSD?");
		setModeloArmazenamento(sc.nextLine());
		System.out.println("Quantos gigas de armazenamento?");
		setTamanhoArmazenamento(Integer.parseInt(sc.nextLine()));
		System.out.println("Qual placa de video off-board?");
		setPlacaVideo(sc.nextLine());
		System.out.println("Qual tamanho da memoria RAM? ");
		setMemoriaRam(Integer.parseInt(sc.nextLine()));
		this.setTamanhoTela(14);
		this.setFonteAlimentacao("Bivolte");
		this.setSysOperacional("Linux");
		
	}
	public void asus() {
		Scanner sc = new Scanner(System.in);
		this.setFabricante("Asus");
		System.out.println("Qual processador?");
		setProcessador(sc.nextLine());
		this.setPlacaMae("Asus");
		System.out.println("HDD ou SSD?");
		setModeloArmazenamento(sc.nextLine());
		System.out.println("Quantos gigas de armazenamento?");
		setTamanhoArmazenamento(Integer.parseInt(sc.nextLine()));
		System.out.println("Qual placa de video off-board?");
		setPlacaVideo(sc.nextLine());
		System.out.println("Qual tamanho da memoria RAM? ");
		setMemoriaRam(Integer.parseInt(sc.nextLine()));
		this.setTamanhoTela(15);
		this.setFonteAlimentacao("Bivolte");
		this.setSysOperacional("Linux");
		
	}
	public void apple() {
		Scanner sc = new Scanner(System.in);
		this.setFabricante("Apple");
		System.out.println("Qual processador?");
		setProcessador(sc.nextLine());
		this.setPlacaMae("Apple");
		System.out.println("HDD ou SSD?");
		setModeloArmazenamento(sc.nextLine());
		System.out.println("Quantos gigas de armazenamento?");
		setTamanhoArmazenamento(Integer.parseInt(sc.nextLine()));
		System.out.println("Qual placa de video off-board?");
		setPlacaVideo(sc.nextLine());
		System.out.println("Qual tamanho da memoria RAM? ");
		setMemoriaRam(Integer.parseInt(sc.nextLine()));
		this.setTamanhoTela(15);
		this.setFonteAlimentacao("Bivolte");
		this.setSysOperacional("macOS");
		
	}
	public void razer() {
		Scanner sc = new Scanner(System.in);
		this.setFabricante("Razer");
		System.out.println("Qual processador?");
		setProcessador(sc.nextLine());
		this.setPlacaMae("Asus");
		System.out.println("HDD ou SSD?");
		setModeloArmazenamento(sc.nextLine());
		System.out.println("Quantos gigas de armazenamento?");
		setTamanhoArmazenamento(Integer.parseInt(sc.nextLine()));
		System.out.println("Qual placa de video off-board?");
		setPlacaVideo(sc.nextLine());
		System.out.println("Qual tamanho da memoria RAM? ");
		setMemoriaRam(Integer.parseInt(sc.nextLine()));
		this.setTamanhoTela(21);
		this.setFonteAlimentacao("Bivolte");
		this.setSysOperacional("Linux");
		
	}
	
	// Saida, Imprimir
	public void imprimir() {
	System.out.println("-------------------------");
	System.out.println("Configuracoes do computador escolhido: ");
	System.out.println("Fabricante..............: " + getFabricante());
	System.out.println("Processador.............: " + getProcessador());
	System.out.println("Placa mae...............: " + getPlacaMae());
	System.out.println("Modelo armazenamento....: " + getModeloArmazenamento());
	System.out.println("Tamanho do armazenamento: " + getTamanhoArmazenamento() + "Gb");
	System.out.println("Placa de video..........: " + getPlacaVideo());
	System.out.println("Memoria RAM.............: " + getMemoriaRam() + "Gb");
	System.out.println("Tamanho da tela.........: " + getTamanhoTela() + " Polegadas");
	System.out.println("Fonte alimentacao.......: " + getFonteAlimentacao());
	System.out.println("Sistema operacional.....: " + getSysOperacional());
	
	}
	
}
