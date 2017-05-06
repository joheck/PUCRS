package Business;
public class Simplificada extends Declaracao {

	public Simplificada(double contribuicao, double totalRendimentos) {
		super(contribuicao, totalRendimentos);
	}
	
	/*Valor de 5% de desconto estatico para o metodo dessa classe*/
	public double obterValorDescontoBaseCalculo(double baseCalculo) {
		return super.obterValorDescontoBaseCalculo(baseCalculo, 5);
	}
	
	/*Valores absolutos para porcentagem. (5, 10, 20) correspondente a %*/
	@Override
	public double obterPorCentImposto(double baseCalculoComDesconto) {
		double imposto = 0;
		if(baseCalculoComDesconto <= 12000){
			imposto = 0;
		}else 
			if(baseCalculoComDesconto > 12000 && baseCalculoComDesconto < 24000){
			imposto = 15;
		}else{
			imposto = 27.5;
		}
		return imposto; 
	}
		
	
	
	
	

}
