package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Start_produto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Produto produto = new Produto();
		
		System.out.println("Informe as infomações do produto: " + produto);
		System.out.print("Nome: ");
		produto.nome = sc.nextLine();
		
		System.out.print("Preço: ");
		produto.preco = sc.nextDouble();
		System.out.println();
		
		System.out.println("Quantidade em estoque: "+ produto);
		System.out.print("Nome: ");
	}
}
