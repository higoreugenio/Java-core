package Variaveis;

import java.util.Scanner;

public class CalcularTriangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valorAX = 0.00;
		double valorBX = 0.00;
		double valorCX = 0.00;
		double valorAY = 0.00;
		double valorBY = 0.00;
		double valorCY = 0.00;
		double AreaX;
		double AreaY;
		
		System.out.println("Entre com os valores do trinagulo X");
		
		System.out.println("Insira o primeiro valor do triângulo: ");
		valorAX = sc.nextDouble();
		
		System.out.println("Insira o segundo valor do triângulo: ");
		valorBX = sc.nextDouble();
		
		System.out.println("Insira o terceiro valor do triângulo: ");
		valorCX = sc.nextDouble();
		
		AreaX = (valorAX + valorBX + valorCX) / 2;
		
		System.out.println("Entre com os valores do trinagulo Y");
		
		System.out.println("Insira o primeiro valor do triângulo: ");
		valorAY = sc.nextDouble();
		
		System.out.println("Insira o segundo valor do triângulo: ");
		valorBY = sc.nextDouble();
		
		System.out.println("Insira o terceiro valor do triângulo: ");
		valorCY = sc.nextDouble();
		
		AreaY = (valorAY + valorBY + valorCY) / 2;
		
		System.out.printf("Área do trinagulo X: %.4f %n%n", AreaX);
		
		System.out.printf("Área do trinagulo Y: %.4f", AreaY);
		
		sc.close();
		
		
		
		

	}

}
