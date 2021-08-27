import java.util.Scanner;

public class Memoria {

// Atributos
    String tipo, marca;
    Integer numeroSlots, slots;
// Fim Atributos

// Set and Get for ALL
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getNumeroSlots() {
        return numeroSlots;
    }

    public void setNumeroSlots(Integer numeroSlots) {
        this.numeroSlots = numeroSlots;
    }

    public Integer getSlots() {
        return slots;
    }

    public void setSlots(Integer slots) {
        this.slots = slots;
    }

// Constructor for Servidor
    public Memoria(String tipo, String marca) {
        setTipo(tipo);
        setMarca(marca);
    }

// Constructor for Notebook and Desktop
    public Memoria(){}

    public Memoria(String tipo, String marca, Integer numeroSlots, Integer slots) {
        setTipo(tipo);
        setMarca(marca);
        setNumeroSlots(numeroSlots);
        setSlots(slots);
    }
// Metodos
    public void Cadastrar(String tipo, String marca, Integer numeroSlots, Integer slots){
        setTipo(tipo);
        setMarca(marca);
        setNumeroSlots(numeroSlots);
        setSlots(slots);
    }

    Scanner leitor = new Scanner(System.in);

    public void LeitorDadosS(){
        System.out.print("Qual o tipo de memoria(DDR): ");
        setTipo(leitor.nextLine());
        System.out.print("Qual a marca da memoria: ");
        setMarca(leitor.nextLine());
        System.out.print("Quantos slots tem: ");
        setSlots(leitor.nextInt());
    }

    public void LeitorDadosN(){
        System.out.print("Qual o tipo de memoria(DDR): ");
        setTipo(leitor.nextLine());
        System.out.print("Qual a marca da memoria: ");
        setMarca(leitor.nextLine());
        System.out.print("Quantos slots tem: ");
        setSlots(leitor.nextInt());
        System.out.print("Quantos slots tem: ");
        setNumeroSlots(leitor.nextInt());
    }

    public void LeitorDadosD(){
        System.out.print("Qual o tipo de memoria(DDR): ");
        setTipo(leitor.nextLine());
        System.out.print("Qual a marca da memoria: ");
        setMarca(leitor.nextLine());
        System.out.print("Quantos slots tem: ");
        setNumeroSlots(leitor.nextInt());
    }

    public void ImprimirS(){
        System.out.printf("--- Memoria ---\n" +
                "Tipo:   %s\n" +
                "Marca:  %s\n" +
                "Slots:  %d\n", getTipo(), getMarca(), getSlots());
    }

    public void ImprimirN(){
        System.out.printf("--- Memoria ---\n" +
                "Tipo: %s\n" +
                "Marca: %s\n" +
                "Slots: %d\n" +
                "Numero Slots: %d\n", getTipo(), getMarca(), getSlots(), getNumeroSlots());
    }

    public void ImprimirD(){
        System.out.printf("--- Memoria ---\n" +
                "Tipo: %s\n" +
                "Marca: %s\n" +
                "Numero Slots: %d\n", getTipo(), getMarca(), getNumeroSlots());
    }

    public void Resetar(){
        setTipo(null);
        setMarca(null);
        setNumeroSlots(null);
        setSlots(null);
    }

// Fim Metodos
}
