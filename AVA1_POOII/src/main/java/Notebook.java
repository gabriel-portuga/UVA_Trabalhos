public class Notebook extends Computador{
// Atributos
    Memoria memoria = new Memoria();
    Hd hd = new Hd();
    Monitor monitor = new Monitor();
    Fonte fonte = new Fonte();
// Fim Atributos

// Set Get

    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    public Hd getHd() {
        return hd;
    }

    public void setHd(Hd hd) {
        this.hd = hd;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Fonte getFonte() {
        return fonte;
    }

    public void setFonte(Fonte fonte) {
        this.fonte = fonte;
    }

// Fim Set Get

// Constructor
    public Notebook(){}//01

    public Notebook(String marca, Double preco, Integer quantidade) {
        super(marca, preco, quantidade);
    }//02

    public Notebook(Memoria memoria, Hd hd, Monitor monitor, Fonte fonte){
        setMemoria(memoria);
        setHd(hd);
        setMonitor(monitor);
        setFonte(fonte);
    }//03

    public Notebook(String marca, Double preco, Integer quantidade, Memoria memoria, Hd hd, Monitor monitor, Fonte fonte){
        super(marca, preco, quantidade);
        setMemoria(memoria);
        setHd(hd);
        setMonitor(monitor);
        setFonte(fonte);
    }//04

    public Notebook(String marca, Double preco, Integer quantidade, Memoria memoria){
        super(marca, preco, quantidade);
        setMemoria(memoria);
    }//05
// Fim Constructor

// Metodos

    public void Imprimir(){
        System.out.println("\n --- Notebook ---");
        super.Imprimir();
        memoria.ImprimirN();
        hd.Imprimir();
        monitor.Imprimir();
        fonte.Imprimir();
    }

    public void LeitorDados(){
        super.setModelo("notebook");
        super.Leitor();
        memoria.LeitorDadosN();
        hd.LeitorDados();
        monitor.LeitorDados();
        fonte.LeitorDados();
    }

    public void Resetar(){
        super.Resetar();
        memoria.Resetar();
        hd.Resetar();
        monitor.Resetar();
        fonte.Resetar();
    }

// Fim Metodos
}
