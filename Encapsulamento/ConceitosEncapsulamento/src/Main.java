import Animal.Animal;
import ContaBancaria.ContaBancaria;

public class Main {
	public static void main (String args[]) {
		ContaBancaria novaconta = new ContaBancaria();
		novaconta.setSaldo(2000);
		novaconta.depositar(1000);
		novaconta.sacar(100);
		System.out.println("O saldo da conta é " + novaconta.getSaldo());
		
		Animal gato = new Animal();
		gato.setNome("Fofinha");
		gato.setIdade(3);
		gato.comer();
		gato.dormir();
	}
}
