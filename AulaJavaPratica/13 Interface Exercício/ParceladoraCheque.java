public class ParceladoraCheque implements Parceladora{
	
	private int qtdParcelas = 3;
	private double juros = 0.02;
	
	public PlanoDePagamento parcela(Produto produto) {
		double valorParcelas = produto.getPreco()/qtdParcelas * (1+juros);
		PlanoDePagamento planoCheque = new PlanoDePagamento ("Cheque", qtdParcelas, valorParcelas);
		return planoCheque;
	}
}
