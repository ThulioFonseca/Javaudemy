package aplication;

public class Conta {

	private String titular;
	private double saldo;
	private double conta;

	public Conta(String titular, double conta) {
		super();
		this.titular = titular;
		// this.saldo = saldo;
		this.conta = conta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	/*
	 * public void setSaldo( saldo) {
	 * 
	 * this.saldo = saldo; }
	 */

	public double getSaldo() {
		return saldo;
	}

	public double saque(double value) {

		return this.saldo -= value;
	}

	public double deposito(double value) {

		return this.saldo += value;
	}

	public double conta(double conta) {

		return this.conta = conta;
	}

	public String nome(String titular) {

		return this.titular = titular;

	}

	public String toString() {

		return "Dados da conta:\n\nTitular: " + titular + "\nConta: " + String.format("%.0f", conta) + "\nSaldo: R$"
				+ String.format("%.2f", saldo);

	}

}
