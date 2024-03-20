//A classe Aluna herda a classa mãe/super Pessoa
public class Aluna extends Pessoa{
	private int registroMatricula;
	//Construtor herdando os atributos da classe super
	public Aluna(String nome, int idade) {
		super(nome, idade);
	}
	public void setRegistroMatricula(String registroMatricula) {
		if (registroMatricula == "G415HH0") {
			System.out.println("Aluno válido!");
		}
	}
	public int getRegistroMatricula() {
		return registroMatricula;
	}
	//Sobreescrevendo o método falar() da classe Pessoa
	@override
	public void falar() {
		System.out.println("Olá sou uma aluna");
	}
}
