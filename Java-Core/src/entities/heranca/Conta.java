package entities.heranca;

/**
 * Esta classe representa uma conta bancária.
 * 
 * @author Higor Eugenio
 * @since 04/09/2023
 * @
 * 
 */

public class Conta {
	
	private Integer numeroConta; //numero da conta
	private String titularConta; //O titular da conta
	private Double saldoConta; //O saldo da conta
	
	public Conta() {
		this.numeroConta = null;
		this.titularConta = null;
		this.saldoConta = 0.0;
		
		/**
		 * 
		 * cria uma conta com os valores padrões para os atributos "numeroConta" 
		 * e "titularConta"
		 */
		
		/** Construtor da classe que recebe os valores para os atributos prsonalizados:
		 * 'numeroConta', 'titularConta', 'saldoConta'.
		 *
		 * @param numeroConta
		 * @param titularConta
		 * @param saldoConta
		 * 
		 */
	}

	public Conta(Integer numeroConta, String titularConta, Double saldoConta) {
		super();
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
		this.saldoConta = saldoConta;
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}

	public Double getSaldoConta() {
		return saldoConta;
	}
	
	
	
}
