package collection;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ImplementantoArrays {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Exemplo 01 array notas aluno.
		double notasAlunoA[] = new double [3];
		
		//Atribuição
		notasAlunoA[0] = 5.5;
		notasAlunoA[1] = 4.8;
		notasAlunoA[2] = 8.5;
		
		//Exibição
		System.out.println(notasAlunoA);
		
		//Exibição por meio do método de classe Arrays
		System.out.println(Arrays.toString(notasAlunoA));
		
		//Formas de percorrer um array
		double notas = 0;
		for (int i = 0; i < 3; i++) {
			notas = notasAlunoA[i];
			System.out.println(notas);
			
			//calcular a média das notas
			
			notas += notasAlunoA[i];
			
		}
		
		System.out.printf("A média das notas é: %.2f", notas / 3);
	
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
