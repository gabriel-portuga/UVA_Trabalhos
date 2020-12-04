package Computador;

import java.util.Scanner;

public class Computador {
// ------ Attributes ------
	String fabricante;
	String tipoArmazenamento;
	int tamanhoArmazenamento;
	int memoriaRam;
	String placaVideo;
	Boolean status;
	int tamanhoMonitor;
	String usuario;
	String senha;
	Double preco;

// ------ Get e Set ------
	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getTipoArmazenamento() {
		return tipoArmazenamento;
	}

	public void setTipoArmazenamento(String tipoArmazenamento) {
		this.tipoArmazenamento = tipoArmazenamento;
	}

	public int getTamanhoArmazenamento() {
		return tamanhoArmazenamento;
	}

	public void setTamanhoArmazenamento(int tamanhoArmazenamento) {
		this.tamanhoArmazenamento = tamanhoArmazenamento;
	}

	public int getMemoriaRam() {
		return memoriaRam;
	}

	public void setMemoriaRam(int memoriaRam) {
		this.memoriaRam = memoriaRam;
	}

	public String getPlacaVideo() {
		return placaVideo;
	}

	public void setPlacaVideo(String placaVideo) {
		this.placaVideo = placaVideo;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public int getTamanhoMonitor() {
		return tamanhoMonitor;
	}

	public void setTamanhoMonitor(int tamanhoMonitor) {
		this.tamanhoMonitor = tamanhoMonitor;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

// ------ Builders ------
	public Computador() {
		super();
	}

	public Computador(String fabricante, String usuario, String senha, Boolean status) {
		super();
		this.fabricante = fabricante;
		this.usuario = usuario;
		this.senha = senha;
		this.status = status;
	}

	public Computador(String fabricante, Boolean status, String usuario, String senha, Double preco) {
		super();
		this.fabricante = fabricante;
		this.status = status;
		this.usuario = usuario;
		this.senha = senha;
		this.preco = preco;
	}

	public Computador(String fabricante, Boolean status, String usuario, String senha) {
		super();
		this.fabricante = fabricante;
		this.status = status;
		this.usuario = usuario;
		this.senha = senha;
	}

	public Computador(String fabricante, String tipoArmazenamento, int tamanhoArmazenamento, int memoriaRam,
			String placaVideo, Boolean status, int tamanhoMonitor, String usuario, String senha, Double preco) {
		super();
		this.fabricante = fabricante;
		this.tipoArmazenamento = tipoArmazenamento;
		this.tamanhoArmazenamento = tamanhoArmazenamento;
		this.memoriaRam = memoriaRam;
		this.placaVideo = placaVideo;
		this.status = status;
		this.tamanhoMonitor = tamanhoMonitor;
		this.usuario = usuario;
		this.senha = senha;
		this.preco = preco;
	}

	public Computador(String fabricante, String tipoArmazenamento, int tamanhoArmazenamento, int memoriaRam,
			Boolean status, String usuario, String senha, Double preco) {
		super();
		this.fabricante = fabricante;
		this.tipoArmazenamento = tipoArmazenamento;
		this.tamanhoArmazenamento = tamanhoArmazenamento;
		this.memoriaRam = memoriaRam;
		this.status = status;
		this.usuario = usuario;
		this.senha = senha;
		this.preco = preco;
	}

	public Computador(String fabricante, Boolean status) {
		super();
		this.fabricante = fabricante;
		this.status = status;
	}

	public Computador(String usuario, String senha, Boolean status) {
		super();
		this.usuario = usuario;
		this.senha = senha;
		this.status = status;
	}

	public Computador(int tamanhoArmazenamento, int memoriaRam, Boolean status, int tamanhoMonitor) {
		super();
		this.tamanhoArmazenamento = tamanhoArmazenamento;
		this.memoriaRam = memoriaRam;
		this.status = status;
		this.tamanhoMonitor = tamanhoMonitor;
	}

	public Computador(Boolean status) {
		super();
		this.status = status;
	}

	public Computador(Boolean status, String usuario, String senha) {
		super();
		this.status = status;
		this.usuario = usuario;
		this.senha = senha;
	}

// ------ Data input ------
	public void inputConfig() {
		Scanner sc = new Scanner(System.in);
		System.out.println("HDD ou SSD? ");
		setTipoArmazenamento(sc.nextLine());
		System.out.println("Quantos gigas de armazenamento? ");
		setTamanhoArmazenamento(Integer.parseInt(sc.nextLine()));
		System.out.println("Quantos gigas de memoria RAM? ");
		setMemoriaRam(Integer.parseInt(sc.nextLine()));
		System.out.println("Digite o nome de uma placa de video: ");
		setPlacaVideo(sc.nextLine());
		System.out.println("Qual o tamanho do monitor? ");
		setTamanhoMonitor(Integer.parseInt(sc.nextLine()));
		// sc.close();
	}

	public void inputFabricante() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o fabricante: ");
		setFabricante(sc.nextLine());
		// sc.close();
	}

	public void inputUsuarioSenha() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um usuario: ");
		setUsuario(sc.nextLine());
		System.out.println("Digite uma senha: ");
		setSenha(sc.nextLine());
		// sc.close();
	}

	public void inputPreco() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o preco do computador? ");
		setPreco(Double.parseDouble(sc.nextLine()));
		// sc.close();
	}

	public void desligar() {

		if (getStatus() == false) {
			System.out.println("O computador já está desligado!");
		} else {
			setStatus(false);
		}
	}

	public void ligar() {
		if (getStatus() == true) {
			System.out.println("O computador já está ligado!");
		} else {
			setStatus(true);
		}
	}

// ------ Output ------	
	public void imprimir() {
		System.out.println("------------------------------------------------");
		System.out.println("Fabricante...........: " + getFabricante());
		System.out.print(getTipoArmazenamento());
		System.out.println(" com " + getTamanhoArmazenamento() + "Gb de espaço");
		System.out.println(getMemoriaRam() + "Gb de memoria RAM");
		System.out.println("Placa de video.......:" + getPlacaVideo());
		System.out.println("O computador está ligado? " + getStatus());
		System.out.println("Monitor de " + getTamanhoMonitor() + " polegadas");
		System.out.println("Usuario..............: " + getUsuario());
		System.out.println("Senha................: " + getSenha());
		System.out.println("Preço................: R$" + getPreco());
		System.out.println("------------------------------------------------");

	}
}
