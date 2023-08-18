package aplication;

import java.util.Scanner;

import entities.Triangulo;

public class Apricativo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangulo X = new Triangulo(" X ");
		Triangulo Y = new Triangulo(" Y ");

		System.out.print("Insira o valor lado A de X: ");
		X.ladoA = sc.nextDouble();
		System.out.print("Insira o valor lado B de X: ");
		X.ladoB = sc.nextDouble();
		System.out.print("Insira o valor lado C de X: ");
		X.ladoC = sc.nextDouble();
		
		System.out.print("Insira o valor lado A de Y: ");
		Y.ladoA = sc.nextDouble();
		System.out.print("Insira o valor lado B de Y: ");
		Y.ladoB = sc.nextDouble();
		System.out.print("Insira o valor lado C de Y: ");
		Y.ladoC = sc.nextDouble();
		
		double areaDeX = X.area();
		double areaDeY = Y.area();
		
		System.out.printf("Área de X: %.2f %n", areaDeX);
		System.out.printf("Área de Y: %.2f%n", areaDeY);
		X.tipo();
		Y.tipo();
		
		
		sc.close();
	}

}
