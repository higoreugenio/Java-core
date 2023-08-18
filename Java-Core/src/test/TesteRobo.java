package test;

import java.util.Scanner;

import entities.ExploradorRobor;

public class TesteRobo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ExploradorRobor beta = new ExploradorRobor();
		ExploradorRobor omega = new ExploradorRobor();
		
		System.out.print("Informe o nome do robô: ");
		beta.name = sc.next();
		
		System.out.print("Informe o status do robô: ");
		beta.status = sc.next();
		
		System.out.print("Informe a velocidade do robô: ");
		beta.velocidade = sc.nextInt();
		
		System.out.print("Informe a temperatura do robô: ");
		beta.temperatura = sc.nextDouble();
		
		beta.verificarTemperatura();
		beta.exibirAtributos();
		
		
		sc.close();
	}

}
