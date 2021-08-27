import java.util.Scanner;

public class Desktop extends Computador{
// Atributos
    String marcaPlacaVideo;
    Integer placasVideos;
    Hd hd = new Hd();
    Memoria memoria = new Memoria();
    Fonte fonte = new Fonte();
    Monitor monitor = new Monitor();
// Fim Atributos


    public String getMarcaPlacaVideo() {
        return marcaPlacaVideo;
    }

    public void setMarcaPlacaVideo(String marcaPlacaVideo) {
        this.marcaPlacaVideo = marcaPlacaVideo;
    }

    public Integer getPlacasVideos() {
        return placasVideos;
    }

    public void setPlacasVideos(Integer placasVideos) {
        this.placasVideos = placasVideos;
    }

    public Hd getHd() {
        return hd;
    }

    public void setHd(Hd hd) {
        this.hd = hd;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    public Fonte getFonte() {
        return fonte;
    }

    public void setFonte(Fonte fonte) {
        this.fonte = fonte;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    // Constructor
    public Desktop(){}//01

    public Desktop(String marca, Double preco, Integer quantidade) {
        super(marca, preco, quantidade);
    }//02

    public Desktop(String marcaPlacaVideo, Integer placasVideos){
        setMarcaPlacaVideo(marcaPlacaVideo);
        setPlacasVideos(placasVideos);
    }//03

    public Desktop(Hd hd, Memoria memoria, Fonte fonte, Monitor monitor){
        setHd(hd);
        setMemoria(memoria);
        setFonte(fonte);
        setMonitor(monitor);
    }//04

    public Desktop(Monitor monitor, String marcaPlacaVideo, Integer placasVideos){
        setMonitor(monitor);
        setMarcaPlacaVideo(marcaPlacaVideo);
        setPlacasVideos(placasVideos);
    }//05
// Fim Constructor

// Metodos

    public void Imprimir(){
        System.out.println("\n --- Desktop ---");
        super.Imprimir();
        System.out.println(" --- Placa de video --- ");
        System.out.printf("Quantidade: %d\n", getPlacasVideos());
        System.out.printf("Marca: %s\n", getMarcaPlacaVideo());
        memoria.ImprimirD();
        hd.Imprimir();
        monitor.Imprimir();
        fonte.Imprimir();
}
    Scanner leitor = new Scanner(System.in);

    public void LeitorDados(){
        super.setModelo("desktop");
        super.Leitor();
        LeitorPlacaVideo();
        memoria.LeitorDadosD();
        hd.LeitorDados();
        monitor.LeitorDados();
        fonte.LeitorDados();

    }

    public void LeitorPlacaVideo(){
        System.out.print("Quantas placas de video: ");
        setPlacasVideos(Integer.parseInt(leitor.nextLine()));
        System.out.print("Qual a marca da placa de video: ");
        setMarcaPlacaVideo(leitor.nextLine());
    }

    public void Resetar(){
        super.Resetar();
        setPlacasVideos(null);
        setMarcaPlacaVideo(null);
        memoria.Resetar();
        hd.Resetar();
        monitor.Resetar();
        fonte.Resetar();
    }

// Fim Metodos
}
