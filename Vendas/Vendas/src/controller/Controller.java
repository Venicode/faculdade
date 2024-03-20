package controller;

import javax.swing.JOptionPane;

import model.Cliente;
import model.Produto;

public class Controller {
	public static void main(String args[]) {
		Cliente novoCliente = new Cliente();
		novoCliente.setNome("Nayana");
		
		Produto novoProduto = new Produto();
		novoProduto.setNomeProduto("Macarrão Adria");
		novoProduto.setValor(5.60);
		
		String resposta = novoCliente.realizarPagamento(novoProduto.getNomeProduto(), novoProduto.getValor());
		JOptionPane.showMessageDialog(null, resposta);
	}
}
