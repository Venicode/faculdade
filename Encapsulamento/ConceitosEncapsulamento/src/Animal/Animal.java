package Animal;

public class Animal {
	private String nome;
	private int idade;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public void comer() {
		System.out.println(nome +" está comendo...");
	}
	public void dormir() {
		System.out.println(nome + " está dormindo...");
	}
	
}
