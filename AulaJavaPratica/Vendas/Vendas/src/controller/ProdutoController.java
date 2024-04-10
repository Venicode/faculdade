package controller;

import java.util.ArrayList;

import model.Produto;

public class ProdutoController {
	private ArrayList<Produto> listaProdutos = new ArrayList<>();

	public boolean existeProdutoCadastrado(String nomeProduto){
		boolean existeProduto = false;
		for (Produto produto : listaProdutos){
			if(nomeProduto.equals(produto.getNomeProduto())){
				existeProduto = true;
			}
		}
		return existeProduto;
	}

	public void cadastrarProduto(Produto novoproduto) {
		listaProdutos.add(novoproduto);
		System.out.println("Produto: " + novoproduto.getNomeProduto() + " cadastrado com sucesso!");
	}

	public void listarProduto() {
		System.out.println("Lista de produtos");
		for (Produto produto : listaProdutos) {
			System.out.println(produto.getNomeProduto());
		}
		System.out.println();
	}
}
