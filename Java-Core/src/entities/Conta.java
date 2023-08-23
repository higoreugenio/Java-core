package entities;



public class Conta {



	private int numeroConta;

	private String Dono;

	private double Saldo;

	

	// Construtores

	public Conta(int numeroConta, String dono) {

		this.numeroConta = numeroConta;

		this.Dono = dono;

	}



	public Conta(int numeroConta, String dono, double saldo) {

		this.numeroConta = numeroConta;

		this.Dono = dono;

		this.Saldo = saldo;

	}

	//------------------------------------------------------------------------------------------------------

	//Métodos gets e sets

	

	public int getNumeroConta() {

		return numeroConta;

	}

	public void setDono(String dono) {

		this.Dono = dono;

	}

	public String getDono() {

		return Dono;

	}

	public double getSaldo() {

		return Saldo;

	}

	//----------------------------------------------------------------------------------------

	// Método deposito

	public void deposito(double valorDeposito) {

		Saldo += valorDeposito;

	}

	//Metodo saque

	public void saque(double valorDeposito) {

		Saldo -= valorDeposito + 5.00;

	}

	// Método toString sobrecarregado.

	public String toString() {

		return "Conta: " + numeroConta + "\nProprietário: " + Dono +  String.format("\nSaldo da conta: R$ %.2f", Saldo); 

	}

	

	

}