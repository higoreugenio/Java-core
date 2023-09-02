package collection;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ImplementandoArrays {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		// Exemplo 01 Array Notas de um aluno.
		
		double notasAlunoA[] = new double[3];
		
		
		//Atribuição do array.
		
		
		notasAlunoA[0] = 5.5;
		notasAlunoA[1] = 4.8;
		notasAlunoA[2] = 8.5;
		
		
		//Exibição.
		
		System.out.println(notasAlunoA); // Como o array é um objeto, ele retorna um endereço de memória (alocação) RAM.
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA[1]);
		System.out.println(notasAlunoA[2]);
				
		//Exibição por meio de método da classe Arrays.
		System.out.println(Arrays.toString(notasAlunoA));
		
		//Formas de percorrer um array
		System.out.println("Exibição com uso da estrutura For---------");
		double notas = 0;
		for (int i = 0; i < 3; i++) {
			 notas = notasAlunoA[i];
			System.out.println("\n" + i + ":" + notas);
			System.out.println("\n");
			// Calcular a média das notas.
			 notas += notasAlunoA[i]  ;
		}
		System.out.printf("Média das notas é: %.2f\n", notas/3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
