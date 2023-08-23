package aplication;

import java.util.Locale;

import javax.swing.JOptionPane;

import entities.Conta;

public class Start_conta {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Conta conta;

		int numeroDaConta = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número da conta",
				"Abertura da conta", JOptionPane.PLAIN_MESSAGE));
		String donoConta = JOptionPane.showInputDialog(null, "Informe o nome do dono da conta", "Abertura da conta",
				JOptionPane.PLAIN_MESSAGE);
		String seraQuevaiTerDeposito = JOptionPane.showInputDialog(null, "Terá depósito inicital ? Y/y ou N/n", "",
				JOptionPane.PLAIN_MESSAGE);
		seraQuevaiTerDeposito = seraQuevaiTerDeposito.toUpperCase();
		char temDepositoSimNao = seraQuevaiTerDeposito.charAt(0);

		if (temDepositoSimNao == 'Y') {
			double depositoInicial = Double.parseDouble(JOptionPane.showInputDialog(null,
					"informe o valor para o deposito", "Abertura de conta", JOptionPane.PLAIN_MESSAGE));
			conta = new Conta(numeroDaConta, donoConta, depositoInicial);
		} else {
			conta = new Conta(numeroDaConta, donoConta);
		}

// Mostrar os dados da conta
		JOptionPane.showMessageDialog(null, conta, "Dados da conta", JOptionPane.INFORMATION_MESSAGE);

// Solicitar um deposito
		double deposito = Double.parseDouble(JOptionPane.showInputDialog(null, "informe o valor para o deposito",
				"Deposito em conta ", JOptionPane.PLAIN_MESSAGE));
		conta.deposito(deposito);
		JOptionPane.showMessageDialog(null, conta, "Dados da conta", JOptionPane.INFORMATION_MESSAGE);
// Solicitar um Saque
		double Saque = Double.parseDouble(JOptionPane.showInputDialog(null, "informe o valor para saque",
				"Saque em conta  ", JOptionPane.PLAIN_MESSAGE));
		conta.saque(Saque);
		JOptionPane.showMessageDialog(null, conta, "Dados da conta", JOptionPane.INFORMATION_MESSAGE);
	}

}
