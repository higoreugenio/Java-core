package oop;

import java.util.Scanner;

public class Triangulo {
	
		public double ladoA;
		public double ladoB;
		public double ladoC;
		
		

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		Triangulo X = new Triangulo();
		
		System.out.println("Insira o valor lado A");
		X.ladoA = sc.nextDouble();
		
		System.out.println(X.ladoA);
		
		
		
		
	}

}
