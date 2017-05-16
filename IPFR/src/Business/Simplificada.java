package Business;
public class Simplificada extends Declaracao {

	public Simplificada(double contribuicao, double totalRendimentos) {
		super(contribuicao, totalRendimentos);
	}
	
	/*Valor de 5% de desconto estatico para o metodo dessa classe*/
	@Override
	 public double obterValorDescontoBaseCalculo() {
		double desconto = 5.0;
		return (obterBaseDeCalculo() * (desconto/100));		 
	};
	
	/*Retorna o valor a ser descontado do imposto %*/
	@Override
	public double obterImposto() {
		double tetoPrimeiraFaixa = 1200;
		double porcentagemPrimeiraFaixa = .15;
		double tetoSegundaFaixa = 2400;
		double porcentagemSegundaFaixa = .275;		
		double valorImposto = 0;
		
		
		if(obterBaseCalculoComDesconto() <= tetoPrimeiraFaixa){
			valorImposto = 0;
		}else 
			if(obterBaseCalculoComDesconto() > 12000 && obterBaseCalculoComDesconto() < tetoSegundaFaixa){
				valorImposto = (obterBaseCalculoComDesconto() - tetoPrimeiraFaixa) * porcentagemPrimeiraFaixa;
		}else{
			valorImposto = (obterBaseCalculoComDesconto() - tetoSegundaFaixa) * porcentagemSegundaFaixa;
		}
		return valorImposto; 
	}

	
}