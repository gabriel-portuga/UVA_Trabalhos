import java.util.Scanner;

public class Monitor {

// Atributos
    private String tipo, marca;
    private Integer resolucao;
// Fim Atributos

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

    public Integer getResolucao() {
        return resolucao;
    }

    public void setResolucao(Integer resolucao) {
        this.resolucao = resolucao;
    }

// Constructor for Notebook and Desktop
    public Monitor(){}

    public Monitor(String tipo, String marca, Integer resolucao) {
        setTipo(tipo);
        setMarca(marca);
        setResolucao(resolucao);
    }
// Fim Constructor

// Metodos
    public void Cadastrar(String tipo, String marca, Integer resolucao){
        setTipo(tipo);
        setMarca(marca);
        setResolucao(resolucao);
    }

    public void Imprimir(){
        System.out.println("--- Monitor ---");
        System.out.printf("Marca: %s\n" +
                "Tipo: %s\n" +
                "Resolução: %d\n", getMarca(), getTipo(), getResolucao());
    }

    public void LeitorDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual a marca do monitor: ");
        setMarca(leitor.nextLine());
        System.out.print("Qual o tipo do monitor: ");
        setTipo(leitor.nextLine());
        System.out.print("Qual a resolução do monitor em polegadas: ");
        setResolucao(Integer.parseInt(leitor.nextLine()));
    }

    public void Resetar(){
        setMarca(null);
        setResolucao(null);
        setTipo(null);
    }

// Fim Metodos
}
