import java.util.Scanner;

public class Computador {

// Atributos
    private String marca, modelo;
    private Double preco;
    private Integer quantidade;
// Fim Atributos

// Set Get

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
// Fim Set Get

// Constructor
    public Computador(String marca, Double preco, Integer quantidade) {
        setMarca(marca);
        setPreco(preco);
        setQuantidade(quantidade);
    } // 01

    public Computador(){} //02

    public Computador(String marca){
        this.marca = marca;
    } //03

    public Computador(String marca, Double preco){
        this.marca = marca;
        this.preco = preco;
    } //04

    public Computador(Double preco, Integer quantidade){
        this.preco = preco;
        this.quantidade = quantidade;
    } //05
// Fim Constructor

// Metodos
    public void Cadastrar(String marca, Double preco, Integer quantidade){
        setMarca(marca);
        setPreco(preco);
        setQuantidade(quantidade);

    }

    public void Imprimir(){
        System.out.printf("Marca:      %s\n" +
                          "Preço:      R$%.2f\n" +
                          "Quantidade deste modelo: %d\n", getMarca(), getPreco(), getQuantidade());
    }

    public void Leitor(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual a marca do " + getModelo() + ":");
        marca = leitor.nextLine();
        System.out.print("Qual o valor do " + getModelo() + ":");
        preco = leitor.nextDouble();
        System.out.print("Quantidade deste modelo de " + getModelo() + ":");
        quantidade = leitor.nextInt();
    }

    public void Resetar(){
        setMarca(null);
        setPreco(null);
        setQuantidade(null);
    }
// Fim Metodos
}
