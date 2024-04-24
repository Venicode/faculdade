public class ExemploCastUpCastDown{
	public static void main(String[] args){	

	System.out.println("\tCast Up");
	// crie um objeto ProdutoDigital
	ProdutoDigital produtoDigital = new ProdutoDigital("celular");
	// atribua o produtoDigital criado a varaiavel produto
	Produto produto = produtoDigital;
	System.out.println("\timprime() sobreescrito em ...");
	produto.imprime();
	// atribua o produtoDigital criado a varaiavel object
	Object object = produtoDigital;
	System.out.println("\ttoString() herdado de ...");
	System.out.println(object.toString());

	String texto = "Uma String qualquer";
	//object = texto;
	//verifica se object aponta para um objeto do tipo Produto
	if(object instanceof Produto){
		System.out.println("\tCast Down");
		//casting de objetos
		produto = (Produto) object;
		produto.imprime();
	}else{
		System.out.println("N�o � poss�vel converter "+ object.getClass()+" para Produto");
	}

	}
}
