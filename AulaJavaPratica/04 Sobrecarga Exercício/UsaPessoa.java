class UsaPessoa{

	public static void main(String[] args){
		Pessoa marcelo = new Pessoa();
		marcelo.inicializaPessoa("Marcelo",44);
		marcelo.imprime();

		Pessoa daniel = new Pessoa();
		daniel.inicializaPessoa("Daniel");
		System.out.println("Lendo a idade: " + daniel.getIdade());
		daniel.inicializaPessoa("Daniel",-20);
		System.out.println("Lendo a idade: " + daniel.getIdade());
		daniel.setIdade(-20);
		daniel.imprime();
	}

}