package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.Deslocamento;

public class Start_deslocamento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Deslocamento deslocamento = new Deslocamento(0,0,0,0,0);
		
		System.out.println("Informe o valor de x1: ");
		double x1 = sc.nextDouble();
		deslocamento.setX1(x1);
		System.out.println(deslocamento.getX1());
		
		System.out.println("Informe o valor de y1: ");
		double y1 = sc.nextDouble();
		deslocamento.setY1(y1);
		System.out.println(deslocamento.getY1());
		
		System.out.println("Informe o valor de x2: ");
		double x2 = sc.nextDouble();
		deslocamento.setX2(x2);
		System.out.println(deslocamento.getX2());
		
		System.out.println("Informe o valor de x1: ");
		double y2 = sc.nextDouble();
		deslocamento.setY2(y2);
		System.out.println(deslocamento.getY2());
		
		System.out.println("Informe a velocidade: ");
		double velocidade = sc.nextDouble();
		deslocamento.setVelocidade(velocidade);
		System.out.println(deslocamento.getVelocidade());
		
		System.out.println("A distanância é: " + deslocamento.calcularDistancia());
		System.out.println("O tempo é: " + deslocamento.calcularTempoDeslocamento());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

	private static String calcularDistancia() {
		// TODO Auto-generated method stub
		return null;
	}

}
