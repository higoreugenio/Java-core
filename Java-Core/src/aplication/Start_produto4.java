package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Start_produto4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Produto produto = new Produto(null, 0);
		
		System.out.println("Informe as informações do produto!");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		produto.setNome(nome);
		System.out.println(produto.getNome());

		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		produto.setPreco(preco);
		System.out.println(produto.getPreco());

		System.out.print("Quantidade: ");
		int quantidade = sc.nextInt();
		produto.addProduto(quantidade);
		
		System.out.println("Informações do produto: " + produto.getNome() + " - " + " R$" + produto.getPreco() + " - " + produto.getQuantidade());
		
		System.out.println("Valor total em estoque: R$" + produto.valorTotalEmEstoque());
		System.out.println("Informe a quantidade que será removida");
		quantidade = sc.nextInt();
		produto.removeProduto(quantidade);
		
		System.out.println("Valor total em estoque: R$" + produto.valorTotalEmEstoque());
		
		sc.close();
	}

}
