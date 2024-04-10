package controller;

import java.util.Scanner;
import model.Cliente;
import model.Produto;
import view.View;

public class Controller {
	public static void main(String args[]) {

		ProdutoController acoesProdutos = new ProdutoController();
		ClienteController acoesClientes = new ClienteController();

		View novatela = new View();
		novatela.BoasVindas();
		Scanner opcaoUsuario = new Scanner(System.in);

		// Loop do Menu até o usuário selecionar a opção para sair
		while (true) {
			novatela.Menu();
			String resposta = opcaoUsuario.nextLine();
			// Verificando opcao
			if (resposta.equals("1")) {
				System.out.println("Informe o produto");
				String nomeProduto = opcaoUsuario.nextLine();
				if (acoesProdutos.existeProdutoCadastrado(nomeProduto) == true) {
					System.out.println("Informe o cliente");
					String nomeCliente = opcaoUsuario.nextLine();
					if (acoesClientes.existeClienteCadastrado(nomeCliente) == true) {
						
					} else{
						System.out.println("Cliente não cadastrado");
					}
				} else{
					System.out.println("Produto não cadastrado");
				}
				
				continue;
			}
			if (resposta.equals("2")) {
				// Criando produtos
				Produto novoProduto = new Produto();
				System.out.println("Informe o nome do produto");
				String nomeProduto = opcaoUsuario.nextLine();
				novoProduto.setNomeProduto(nomeProduto);
				System.out.println("Informe o valor do produto");
				double valorProduto = Double.parseDouble(opcaoUsuario.nextLine());
				novoProduto.setValor(valorProduto);
				acoesProdutos.cadastrarProduto(novoProduto);
				continue;
			}
			if (resposta.equals("3")) {
				// Criando um novo cliente
				Cliente novoCliente = new Cliente();
				System.out.println("Informe o nome do cliente");
				String nomeCliente = opcaoUsuario.nextLine();
				novoCliente.setNome(nomeCliente);
				acoesClientes.cadastrarCliente(novoCliente);
				continue;
			}
			if (resposta.equals("4")) {
				// Listando os produtos cadastrados
				acoesProdutos.listarProduto();
				continue;
			}
			if (resposta.equals("5")) {
				// Listando os clientes cadastrados
				acoesClientes.listarClientes();
				continue;
			}
			if (resposta.equals("6")) {
				novatela.despedida();
				break;
			} else {
				System.out.println("Opção inválida");
				continue;
			}

		}
		opcaoUsuario.close();
	}
}
