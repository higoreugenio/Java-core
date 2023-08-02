package EstruturaDecisao;

import java.util.Scanner;

public class Se {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valor1;
		double valor2;
		double valor3;
		double valor4;
		double valor5;
		double contador = 0.00;
		double soma = 0.00;
		
		System.out.println("Insira um valor");
		valor1 = sc.nextDouble();
		
		if (valor1 == 0) {
			System.out.printf("Voce digitou zero, o programa parou!!%n");
		}else {
			contador++;
			soma += valor1;
		
			System.out.println("Insira um novo valor");
			valor2 = sc.nextDouble();
		
			
			if (valor2 == 0) {
				System.out.printf("Voce digitou zero, o programa parou!!%n");
			}else {
				contador++;
				soma += valor2;
				
				System.out.println("Insira um novo valor");
				valor3 = sc.nextDouble();
			
				if (valor3 == 0) {
					System.out.printf("Voce digitou zero, o programa parou!!%n");
				}else {
					contador++;
					soma += valor3;
				
					System.out.println("Insira um novo valor");
					valor4 = sc.nextDouble();
					
					if (valor4 == 0) {
						System.out.printf("Voce digitou zero, o programa parou!!%n");
					}else {
						contador++;
						soma += valor4;
						
						System.out.println("Insira um novo valor");
						valor5 = sc.nextDouble();
					
						if (valor5 == 0) {
							System.out.printf("Voce digitou zero, o programa parou!!%n");
						}else {
							contador++;
							soma += valor5;
						}
					}
				}
			}
		}
						
		System.out.printf("Numeros armazenados = %.0f%n", contador);
		System.out.printf("A soma dos números armazenados = %.2f", soma);
		

		sc.close();
	}

}
