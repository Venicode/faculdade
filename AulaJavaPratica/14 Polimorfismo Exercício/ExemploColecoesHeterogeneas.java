public class ExemploColecoesHeterogeneas{
	public static void imprimeOpcoesDeParcelamento
				(Produto produto, Parceladora[] parceladoras){
		for(Parceladora parceladora: parceladoras){
		    System.out.
			println("============================================");
		    PlanoDePagamento plano = parceladora.parcela(produto); 
		    plano.imprime();
		}
		System.out.println("============================================");
		
	}
	public static void main(String[] args){	

		Produto tv = new Produto("Tv", 3500.0);
		tv.imprime();
		//crie uma parceladora de cada tipo
		ParceladoraBoleto parceladoraBoleto = new ParceladoraBoleto();
		ParceladoraCheque parceladoraCheque = new ParceladoraCheque();
		ParceladoraCartao parceladoraCartao = new ParceladoraCartao();
		Parceladora parc1 = parceladoraBoleto;
		Parceladora parc2 = parceladoraCheque;
		Parceladora parc3 = parceladoraCartao;
		//colecao heterogenea 
		Parceladora[] parcs = {parc1, parc2, parc3};
		imprimeOpcoesDeParcelamento(tv, parcs);
	}
}



