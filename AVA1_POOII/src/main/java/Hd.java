import java.util.Scanner;

public class Hd {
    private String tipo, marca;
    private Integer capacidade;

    // Set and Get
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

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    // Constructor

    public Hd() {
    }

    public Hd(String tipo, String marca, Integer capacidade) {
        setTipo(tipo);
        setMarca(marca);
        setCapacidade(capacidade);
    }

    // Fim do constructor

    // Metodos
    public void Cadastrar(String tipo, String marca, Integer capacidade){
        setTipo(tipo);
        setMarca(marca);
        setCapacidade(capacidade);
    }

    Scanner leitor = new Scanner(System.in);

    public void LeitorDados(){
        System.out.print("Qual a marca do HDD: ");
        setMarca(leitor.nextLine());
        System.out.print("Qual o tipo (HDD / SSD): ");
        setTipo(leitor.nextLine());
        System.out.print("Qual a capacidade de armazenamento em Gb: ");
        setCapacidade(leitor.nextInt());
    }

    public void Imprimir(){
        System.out.printf("--- HD ---\n" +
                "Marca: %s\n" +
                "Tipo: %s\n" +
                "Capacidade: %d\n", getMarca(), getTipo(), getCapacidade());
    }

    public void Resetar(){
        setCapacidade(null);
        setTipo(null);
        setMarca(null);
    }

    // Fim dos metodos

}
