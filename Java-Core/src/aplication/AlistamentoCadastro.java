package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Alistamento;

public class AlistamentoCadastro {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Informe sua data de nascimento: ");
		int anoDeNascimento = sc.nextInt();
		
		Alistamento alistamento = new Alistamento(null, anoDeNascimento, null, null, 0, null, 0, 0, 0);
		
		alistamento.mostraDados();
		
		sc.close();
	}

}
