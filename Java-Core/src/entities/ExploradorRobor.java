package entities;

public class ExploradorRobor {
	public String status;
	public int velocidade;
	public double temperatura;
	public String name;
	
	public void verificarTemperatura() {
		if (temperatura > 45){
			System.out.println("Robô: "+ name);
			status = "RETORNE PARA BASE IMEDIATAMENTE!";
			velocidade = 5;
			
		}
	}
	
	public void exibirAtributos() {
		System.out.println("Status: "+ status);
		System.out.println("Velocidade: "+ velocidade);
		System.out.println("Temperatura: "+ temperatura);
	}
	
}
