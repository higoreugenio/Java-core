package entities;

public class Triangulo {
	
	//Atributos da classe	
	public double ladoA;
	public double ladoB;
	public double ladoC;
	
	//metodo area
	public double area() {
	
	double pX = (ladoB + ladoB + ladoC)/2;
	return Math.sqrt(pX * (pX - ladoA) * (pX - ladoB) * (pX - ladoC));
	}
}