package Variaveis;

import java.util.Scanner;

public class Contatos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome;
		String email;
		long telefone;
		
		System.out.println("Insira o seu nome: ");
		nome = sc.next();
		System.out.println("Insira o seu e-mail: ");
		email = sc.next();
		System.out.println("Insira o seu telefone: ");
		telefone = sc.nextLong();
		
		System.out.printf("Dados: %nNome: %s %nemail: %s %nTelefone: %d", nome, email, telefone);
		
		sc.close();
		
		
		
		

	}

}
