import javax.swing.JOptionPane;

public class Pessoa {
	//Encapsulamento: limitando o acesso ao atributo
	private String nome;
	private int idade;
	
	//Construtor
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	//Método vazio para retornar um print
	public void falar() {
		System.out.println("A pessoa emitiu som!");
	}
	//Setters e Getters
	//set:inserir um valor
	//get:pegar/retornar um valor
	public void setNome(String nome) {
		if (nome.substring(0,1).matches("[0-9]")) {
			JOptionPane.showMessageDialog(null,"Nome inválido");
		}else {
		this.nome = nome;
		}
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
}
