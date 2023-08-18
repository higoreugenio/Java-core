package entities;

public class Produto {

	// Parâmentros-----------------------------------------------------------

	private String nome;

	private double preco;

	private int quantidade;

	// Construtores----------------------------------------------------------

	public Produto(String nome, double preco, int quantidade) {

		this.nome = nome;

		this.preco = preco;

		this.quantidade = quantidade;

	}
	
	public Produto(String nome, double preco) {

		this.nome = nome;

		this.preco = preco;
	}

	// Gets e Sets

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	// Métodos----------------------------------------------------------------
	public double valorTotalEmEstoque() {

		return preco * quantidade;

	}

	public void addProduto(int quantidade) {

		this.quantidade += quantidade;

	}

	public void removeProduto(int quantidade) {

		this.quantidade -= quantidade;

	}

	public String toString() {

		return nome + ", R$" + String.format("%.2f", preco) + ", " + quantidade + " unidades, total: R$"
				+ String.format("%.2f", valorTotalEmEstoque());

	}

}
