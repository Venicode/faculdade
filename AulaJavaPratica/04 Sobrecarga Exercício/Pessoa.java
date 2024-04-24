public class Pessoa{
	private String nome;
	private int idade = 18;
	private int idadeMinima = 18;

	public String getNome(){
		return this.nome;	
	}
	
	public void setNome(String nome){
		this.nome = nome;	
	}

	public int getIdade(){
		return this.idade;
	}

	public void setIdade(int idade){
		if(idade<idadeMinima){
			System.out.println("Idade invalida " + idade);
		}else{
			this.idade = idade;	
		}
	}
	
	public void inicializaPessoa(String nome, int idade){
		this.nome = nome;
		this.setIdade(idade);
		inicializaPessoa(nome);
	}
	
	public void inicializaPessoa(String nome) {
		this.nome = nome;
	}

	public void imprime(){
		System.out.println("Pessoa: " + this.nome + " tem " + this.idade + " anos");
	}

}