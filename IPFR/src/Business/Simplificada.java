package Business;
public class Simplificada extends Declaracao {

	public Simplificada(double contribuicao, double totalRendimentos) {
		super(contribuicao, totalRendimentos);
	}
	
	/*Valor de 5% de desconto estatico para o metodo*/
	public double obterValorDescontoBaseCalculo(double baseCalculo) {
		return super.obterValorDescontoBaseCalculo(baseCalculo, 5);
	}
	
	@Override
	public double obterPorCentImposto(double baseCalculoComDesconto) {
		double imposto = 0;
		if(baseCalculoComDesconto <= 12.0000){
			imposto = 0;
		}else 
			if(baseCalculoComDesconto){
			
		}
		return imposto;
	}
		
	
	
	
	

}
