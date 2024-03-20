package model;

public class Cliente extends Pessoa {
	public String realizarPagamento(String nomeProduto, double valor) {
		return super.getNome() + " comprou o produto: "+ nomeProduto + " que custou: " + valor;
	}
}
