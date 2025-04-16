package entidades;

public class livro {

	//Atributos
	public String livro;
	public String autor;
	public int quantidade;
	public double valorUnit;
	
	
	//Metodos
	public String exibeInfo() {
		
		return "livro: " + livro +
				"\nAutor: " + autor +
				"\nQuantidade: " + quantidade +
				"\nValor Unitario: " + valorUnit +
		        "\n valorTotal:"  + valorTotal();
	}
 
	public void emprestaLivro(int quantidade) {
		this.quantidade -= quantidade;
		
	}
	
	public void devolveLivro(int quantidade) {
		this.quantidade += quantidade;
		
	}
	
	public double valorTotal() {
		double valorTotalLivros = quantidade * valorUnit;
		return valorTotalLivros;
	}
	
}
