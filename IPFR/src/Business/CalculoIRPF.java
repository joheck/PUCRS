package Business;

public class CalculoIRPF {
		
	private Declaracao declaracaoStrategy;
	
	public CalculoIRPF(Declaracao dec){
		this.declaracaoStrategy = dec;
	}
	
	public void setStrategy(Declaracao declaracaoStrategy){
		this.declaracaoStrategy = declaracaoStrategy;
	}
	
	public double obterBaseDeCalculo(){
		return this.declaracaoStrategy.obterBaseDeCalculo();
	}

	/*Metodo fornece o valor a ser subtraido da base de calculo*/
	public double obterValorDescontoBaseCalculo(){
		return this.declaracaoStrategy.obterValorDescontoBaseCalculo();
	}

	/*Metodo fornece base de calculo considerando o desconto*/
	public double obterBaseCalculoComDesconto(){
		return this.declaracaoStrategy.obterBaseCalculoComDesconto();
		}

	public double obterImposto(){		
		return this.declaracaoStrategy.obterImposto();
	}

}
