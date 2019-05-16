package aplication;

import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {

		int option1 = 0;
		int option3 = 1;
		String option2;

		option1 = JOptionPane.showConfirmDialog(

				null, "Deseja criar uma conta no NOBANCO?", "NOBANCO", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE);

		if (option1 == 0) {

			String nome = JOptionPane.showInputDialog(null, "Informe o nome do titular:", "Titular",
					JOptionPane.YES_NO_CANCEL_OPTION);
			if (nome == null)
				System.exit(0);
			if (Double.parseDouble(nome) / 1 == Double.parseDouble(nome))

				nome = null;
			String conta = JOptionPane.showInputDialog(null, "Crie um número para a sua conta: ", "Conta",
					JOptionPane.YES_NO_CANCEL_OPTION);
			if (conta == null)
				System.exit(0);
			Conta conta1 = null;
			try {
				conta1 = new Conta(nome, Double.parseDouble(conta));
			} catch (Exception a) {

				JOptionPane.showMessageDialog(

						null, "Dados inválidos, tente novamente!", "NOBANCO", JOptionPane.ERROR_MESSAGE);

				System.exit(0);
			}

			do {

				String[] options = { "Saque", "Depósito" };

				int choice = JOptionPane.showOptionDialog(null, "O que deseja fazer? ", "NOBANCO",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);

				option2 = options[choice];

				switch (option2) {

				case "Saque": {

					conta1.saque(Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do Saque: ")));
					JOptionPane.showMessageDialog(null, conta1.toString(), "Resumo", JOptionPane.INFORMATION_MESSAGE);
					break;
				}

				case "Depósito": {

					conta1.deposito(Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do Deposito: ")));
					JOptionPane.showMessageDialog(null, conta1.toString(), "Resumo", JOptionPane.INFORMATION_MESSAGE);
					break;
				}

				}

				option3 = JOptionPane.showConfirmDialog(null, "Deseja repetir alguma operação?", "Repetir",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

			} while (option3 == 0);

		}
	}
}
