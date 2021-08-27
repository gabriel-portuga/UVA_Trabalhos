import java.util.Scanner;

public class Fonte {

// Atributos
    String tipo, marca;
    Integer potencia;
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

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

// Constructor
    public Fonte(){}

    public Fonte(String tipo, String marca, Integer potencia) {
        setTipo(tipo);
        setMarca(marca);
        setPotencia(potencia);
    }
// Fim Constructor

// Metodos
    public void Cadastrar(String tipo, String marca, Integer potencia){
        setTipo(tipo);
        setMarca(marca);
        setPotencia(potencia);
    }

    public void Imprimir(){
        System.out.println("--- Fonte ---");
        System.out.printf("Marca: %s\n" +
                          "Tipo: %s\n" +
                          "Potencia: %d\n", getMarca(), getTipo(), getPotencia());
    }

    public void LeitorDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual a marca da fonte: ");
        setMarca(leitor.nextLine());
        System.out.print("Qual o tipo da fonte: ");
        setTipo(leitor.nextLine());
        System.out.print("Qual a potencia da fonte em Wats: ");
        setPotencia(Integer.parseInt(leitor.nextLine()));
    }

    public void Resetar(){
        setMarca(null);
        setPotencia(null);
        setTipo(null);
    }

// Fim Metodos
}
