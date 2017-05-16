package Business;

public  class Declaracao {
	private double totalRendimentos, contribuicao ;

	public Declaracao(double totalRendimentos, double contribuicao){
		this.contribuicao = contribuicao;
		this.totalRendimentos = totalRendimentos;
	}

	public double obterBaseDeCalculo(){
		double baseCalculo = this.totalRendimentos - this.contribuicao;
		return baseCalculo;
	}

	/*Metodo fornece o valor a ser subtraido da base de calculo*/
	public double obterValorDescontoBaseCalculo(){
		double porCentDesconto = 0;
		double porcentagem =  (porCentDesconto/100);
		return obterBaseDeCalculo() * porcentagem;
	}

	/*Metodo fornece base de calculo considerando o desconto*/
	public double obterBaseCalculoComDesconto(){
		double baseCalculoComDesconto = obterBaseDeCalculo() - obterValorDescontoBaseCalculo();
		return baseCalculoComDesconto;
	}

	public double obterImposto(){
		double valor = 0;
		return valor;
	}
	
}