public class ImpressoraProdutoXml  extends ImpressoraProduto{

	public void imprimeProduto(){
		if(valida()){
			System.out.println("<? xml>");
			System.out.print("\t<pessoa descricao:\"" + produto.getDescricao());
			System.out.println("\" preco: "+ produto.getPreco()+ "/>");
		}
	}

}