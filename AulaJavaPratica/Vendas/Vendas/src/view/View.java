package view;

public class View {
	
	public void BoasVindas() {
		System.out.println("Bem vindo(a) ao sistema de Vendas");
		System.out.println("O que deseja fazer?");
		System.out.println('\n');
	}
	public void Menu() {
		
		//OPÇÕES DO MENU
		System.out.println("1- Realizar venda");
		System.out.println("2- Cadastrar produto");
		System.out.println("3- Cadastrar cliente");
		System.out.println("4- Listar produtos");
		System.out.println("5- Listar clientes");
		System.out.println("6- Sair do programa");
		System.out.println('\n');
	}
	
	public void despedida() {
		System.out.println("Tchau! Até logo!");
	}
}
