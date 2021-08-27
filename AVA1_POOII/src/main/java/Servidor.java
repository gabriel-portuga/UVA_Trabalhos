import java.util.Scanner;

public class Servidor extends Computador {

    // Atributos
    Integer numeroHD, capacidadeMemoria;
    String tipoGabinete, marcaGabinete;
    Hd hd = new Hd();
    Memoria memoria = new Memoria();
    Fonte fonte = new Fonte();
    // Fim atributos

    // Set and Get

        public Integer getNumeroHD() {
            return numeroHD;
        }

        public void setNumeroHD(Integer numeroHD) {
            this.numeroHD = numeroHD;
        }

        public Integer getCapacidadeMemoria() {
            return capacidadeMemoria;
        }

        public void setCapacidadeMemoria(Integer capacidadeMemoria) {
            this.capacidadeMemoria = capacidadeMemoria;
        }

        public String getTipoGabinete() {
            return tipoGabinete;
        }

        public void setTipoGabinete(String tipoGabinete) {
            this.tipoGabinete = tipoGabinete;
        }

        public String getMarcaGabinete() {
            return marcaGabinete;
        }

        public void setMarcaGabinete(String marcaGabinete) {
            this.marcaGabinete = marcaGabinete;
        }

    // Fim Get e Set

    // Constructor

        public Servidor(String marca, Double preco, Integer quantidade, Integer numeroHD, Integer capacidadeMemoria, String tipoGabinete, String marcaGabinete) {
            super(marca, preco, quantidade);
            setNumeroHD(numeroHD);
            setCapacidadeMemoria(capacidadeMemoria);
            setTipoGabinete(tipoGabinete);
            setMarcaGabinete(marcaGabinete);
        } //01

        public Servidor(Integer numeroHD, Integer capacidadeMemoria, String tipoGabinete, String marcaGabinete){
            setNumeroHD(numeroHD);
            setCapacidadeMemoria(capacidadeMemoria);
            setTipoGabinete(tipoGabinete);
            setMarcaGabinete(marcaGabinete);
        } // 02

        public Servidor(String marca, Double preco, Integer quantidade) {
        super(marca, preco, quantidade);
    } //03

        public Servidor(String tipoGabinete, String marcaGabinete){
            setTipoGabinete(tipoGabinete);
            setMarcaGabinete(marcaGabinete);
        } //04

        public Servidor(){} //05

    // Fim constructor

    // Metodos
    public void Cadastrar(String marca, Double preco, Integer quantidade, Integer numeroHD, Integer capacidadeMemoria, String tipoGabinete, String marcaGabinete){
        super.Cadastrar(marca, preco, quantidade);
        setNumeroHD(numeroHD);
        setCapacidadeMemoria(capacidadeMemoria);
        setTipoGabinete(tipoGabinete);
        setMarcaGabinete(marcaGabinete);
    }

    public void Imprimir(){
        System.out.println("\n --- Servidor ---");
        super.Imprimir();
        hd.Imprimir();
        System.out.printf("Quantidade de HD's: %d\n", getNumeroHD());
        memoria.ImprimirS();
        System.out.println("Capacidade: " + getCapacidadeMemoria());
        System.out.println("--- Gabinete ---");
        System.out.printf("Marca do gabinete: %s\n" +
                          "Tipo do gabinete:  %s\n", getMarcaGabinete(), getTipoGabinete());
        fonte.Imprimir();
    }

    Scanner leitor = new Scanner(System.in);

        public void LeitorDados(){
            super.setModelo("servidor");
            super.Leitor();
            LeitorA();
            hd.LeitorDados();
            LeitorB();
            memoria.LeitorDadosS();
            LeitorC();
            fonte.LeitorDados();
        }

        public void LeitorA(){
            System.out.print("Qual a marca do Gabinte:");
            setMarcaGabinete(leitor.nextLine());
            System.out.print("Qual o tipo do gabinete:");
            setTipoGabinete(leitor.nextLine());
        }
        public void LeitorB(){
            System.out.print("Qual a quantidade de HD's:");
            setNumeroHD(leitor.nextInt());
        }
        public void LeitorC(){
            System.out.print("Qual a capacidade da memoria:");
            setCapacidadeMemoria(leitor.nextInt());
        }

    public void Resetar(){
        super.Resetar();
        setNumeroHD(null);
        setCapacidadeMemoria(null);
        setMarcaGabinete(null);
        setTipoGabinete(null);
        memoria.Resetar();
        hd.Resetar();
        fonte.Resetar();
    }

    // Fim dos metodos
    }
