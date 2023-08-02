package Exercicios;

public class Exercicio06 {

	public static void main(String[] args) {
		double valorA = 0;
		double valorB = 0;
		double valorC = 0;
		
		double triangulo = valorA * valorC/2;
		final double circulo =  3.14159 * (valorC * valorC);
		double trapezio = ((valorA + valorB) * valorC) /2;
		double quadrado = valorB * valorB;
		double retangulo = valorA * valorB;
		
		System.out.printf("TRIANGULO: %.3f", triangulo );
		System.out.printf("%nCIRCULO: %.3f", circulo);
		System.out.printf("%nTRAPEZIO: %.3f", trapezio);
		System.out.printf("%nQUADRADO: %.3f", quadrado);
		System.out.printf("%nRETANGULO: %.3f", retangulo);
	}

}
