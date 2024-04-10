package controller;

import java.util.ArrayList;

import model.Cliente;

public class ClienteController {
private ArrayList<Cliente> listaClientes = new ArrayList<>();

	public boolean existeClienteCadastrado(String nomeCliente){
		boolean existeCliente = false;
		for (Cliente cliente : listaClientes){
			if(nomeCliente.equals(cliente.getNome())){
				existeCliente = true;
			}
		}
		return existeCliente;
	}
	public void cadastrarCliente(Cliente novoCliente) {
		listaClientes.add(novoCliente);
		System.out.println("Cliente cadastrado");
	}
	
	public void listarClientes() {
		System.out.println("Lista de clientes");
		for (Cliente cliente : listaClientes) {
			System.out.println(cliente.getNome());
		}
		System.out.println();
	}
}
