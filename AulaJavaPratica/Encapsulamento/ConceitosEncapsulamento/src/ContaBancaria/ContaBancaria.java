package ContaBancaria;

public class ContaBancaria {
	private double saldo;
	public void depositar(double valor) {
		saldo +=valor;
	}
	public void sacar(double valor) {
		if(valor>saldo) {
			throw new IllegalArgumentException("Saldo insuficiente");
		}
		saldo -=valor;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double novoSaldo) {
		saldo = novoSaldo;
	}
}
