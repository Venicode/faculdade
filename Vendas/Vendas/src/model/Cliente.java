package model;

public class Cliente extends Pessoa {
	public String realizarPagamento(Produto produto) {
		return super.getNome() + " comprou o produto: " + produto.getNomeProduto() + " na quantidade: "
				+ produto.getQuantProduto() + " que custou: " + produto.getValor();
	}
}
