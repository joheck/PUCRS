package Business;

public abstract class Declaracao {
	private double contribuicao, totalRendimentos;

	public Declaracao(double totalRendimentos, double contribuicao){
		this.contribuicao = contribuicao;
		this.totalRendimentos = totalRendimentos;
	}

	public double obterBaseDeCalculo(){
		double baseCalculo = this.totalRendimentos - this.contribuicao;
		return baseCalculo;
	}

	/*Metodo fornece o valor a ser subtraido da base de calculo*/
	public double obterValorDescontoBaseCalculo(double baseCalculo, double porCentDesconto){
		double porcentagem =  (porCentDesconto/100);
		return baseCalculo * porcentagem;
	}

	/*Metodo fornece base de calculo considerando o desconto*/
	public double obterBaseCalculoComDesconto(double baseCalculo, double desconto){
		double baseCalculoComDesconto = baseCalculo - desconto;
		return baseCalculoComDesconto;
	}

	public double obterPorCentImposto(double baseCalculoComDesconto){
		double porCentImp = 0;
		return porCentImp;
	}
	
	public double obterValorImposto(double baseCaluloComDesconto, double porCentImposto){
		double valorImposto = baseCaluloComDesconto * (porCentImposto/100);
		return valorImposto;
	}
}