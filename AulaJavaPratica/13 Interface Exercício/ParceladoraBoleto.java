public class ParceladoraBoleto implements Parceladora {
	
	private int qtdParcelas = 6;
	private double juros = 0.01;

	@Override
	public PlanoDePagamento parcela(Produto produto) {
		double valorParcelas = produto.getPreco()/qtdParcelas * (1+juros);
		PlanoDePagamento planoBoleto = new PlanoDePagamento("Boleto", qtdParcelas, valorParcelas);
		return planoBoleto;
	}
}
