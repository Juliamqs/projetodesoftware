package estoque;

public class Roupas {
    private String marca;
    private String tipo;
    private String tamanho;
    private int quantidade;
    private double valor;

    public Roupas(String marca, String tipo, String tamanho, int quantidade, double valor) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public double ValorEstoque() {
        return quantidade * valor;
    }

    public void adicionarEstoque(int quantidadeAdicionada) {
        if (quantidadeAdicionada > 0) {
            this.quantidade += quantidadeAdicionada;
        }
    }

    public boolean removerEstoque(int quantidadeRemovida) {
        if (quantidadeRemovida > 0 && quantidadeRemovida <= this.quantidade) {
            this.quantidade -= quantidadeRemovida;
            return true;
        } else {
            System.out.println("Quantidade inválida para remoção!");
            return false;
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValor() {
        return valor;
    }

    public String toString() {
        return tipo + " - Marca: " + marca +
               " Tamanho: " + tamanho +
               " Quantidade: " + quantidade +
               " Valor Unitário: R$" + valor +
               "  Valor Total em Estoque: R$" + ValorEstoque();
    }
}
