package aplication;

import entities.ExploradorRobor;

public class robozinho {

	public static void main(String[] args) {
		ExploradorRobor alfa = new ExploradorRobor();
		String name = "Alfa";
		alfa.status = "Explorando";
		alfa.velocidade = 7;
		alfa.temperatura = 20;
		System.out.println(name);
		alfa.exibirAtributos();
		System.out.println("Aumetando a velocidade para 8");
		alfa.velocidade = 8;
		alfa.exibirAtributos();
		System.out.println("Alterar temperatura para 47");
		alfa.temperatura = 47;
		alfa.verificarTemperatura();
		alfa.exibirAtributos();
		
		
		
	}

}
