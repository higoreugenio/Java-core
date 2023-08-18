package aplication;

import java.util.Scanner;

import entities.Caminhao;

public class Start_caminhao {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Qual a marca do caminhão? ");
	
	String marca = sc.next();
	
	System.out.println("Informe a quantidade de eixos do caminhão? ");
	int eixo = sc.nextInt();
	
	System.out.println("Informe quantas toneladas o caminhão suporta? ");
	int tonelada = sc.nextInt();
	
	Caminhao caminhao = new Caminhao(marca, eixo, tonelada);
	
	System.out.println(marca + " - " + eixo + " - " + tonelada);
	
	sc.close();
	}

}