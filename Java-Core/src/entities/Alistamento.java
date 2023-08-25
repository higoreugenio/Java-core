package entities;

public class Alistamento {
	
	private String dados[] = new String[8];
	
	private double multa;

	 
	public Alistamento(String nome, int anoNascimento, String nomeMae, String nomePai, int telefone, String email,
			double altura, double peso, double multa) {
	dados[0] = nome;
	dados[1] = Integer.toString(anoNascimento);
	dados[2] = nomeMae;
	dados[3] = nomePai;
	dados[4] = Integer.toString(telefone);
	dados[5] = email;
	dados[6] = Double.toString(altura);
	dados[7] = Double.toString( peso);
	 
	}
	
	public void VerificarData() {
		int idade = 2023 - Integer.parseInt(dados[1]);
		if (idade < 18 && idade > 45) {
			System.out.println("Você não pode se cadastrar");
		}
	}

	public void CalcularMulta() {
		int idade = 2023 - Integer.parseInt(dados[1]);
		if (idade >= 20) {
			multa = (idade - 20) * 5;
		}
	
	}
	
	public void AttTelefone(String novoTelefone) {
		dados[4] = novoTelefone;
		
		
	}
	
	public void mostraDados () {
		System.out.println("---Programa de alistamento militar---");
		System.out.println("Nome: " + dados[0]);
		System.out.println("Ano de nascimento: " + dados[1]);
		System.out.println("Nome da mãe: " + dados[2]);
		System.out.println("Nome do pai: " + dados[3]);
		System.out.println("Telefone: " + dados[4]);
		System.out.println("E-mail: " + dados[5]);
		System.out.println("altura: " + dados[6]);
		System.out.println("Peso: " + dados[7]);
		if (multa < 0) {
			System.out.print("ATENÇÃO: Multa de R$" + multa);
		}
		return;
		
	}

}
