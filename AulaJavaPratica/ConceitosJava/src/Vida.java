import javax.swing.JOptionPane;

public class Vida {
	//Método por onde inicializa o programa
	public static void main(String [] args) {
		Pessoa novaPessoa = new Pessoa("Vitoria", 19);
		novaPessoa.setNome("Vitoria Aparecida");
		novaPessoa.setIdade(20);
		//JOptionPane: caixa de diálogo visual
		JOptionPane.showMessageDialog(null,"Meu nome é: "+novaPessoa.getNome());
		JOptionPane.showMessageDialog(null,"Minha idade é: "+novaPessoa.getIdade());
		novaPessoa.falar();
		Aluna novaAluna = new Aluna("Vitoria", 20);
		novaAluna.falar();
		String resposta = JOptionPane.showInputDialog("Qual seu RA?");
		System.out.println(resposta);
	}
}