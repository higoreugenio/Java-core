package entities;

public class Triangulo {
	
	//Atributos da classe	
	public double ladoA;
	public double ladoB;
	public double ladoC;
	public String Name;
	//metodo area
	public Triangulo (String name) {
		this.Name = name;
	}
	
	
	public void tipo() {
		if (ladoA == 0 || ladoB == 0 || ladoC == 0) {
			System.out.println("Informe numeros sem ser o zero");
		}
		else if (ladoA == ladoB && ladoA == ladoC) {
			System.out.println("Triângulo" + Name + "tipo: Equilatero");
		}else if(ladoA == ladoB || ladoA == ladoC) {
			System.out.println("Triângulo" + Name + "Tipo: Isosceles");
		}else {
			System.out.println("Triângulo" + Name + "Tipo: Escaleno");
		}
	}
	
	public double area() {
	double pX = (ladoA + ladoB + ladoC)/2;
	return Math.sqrt(pX * (pX - ladoA) * (pX - ladoB) * (pX - ladoC));
	
	
	}
}