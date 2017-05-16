package Business;

public class Composta extends Declaracao{
	private int idade, numDependentes;

	
	public Composta(double totalRendimentos, double contribuicao, int idade, int numDependentes) {
		super(totalRendimentos, contribuicao);
		this.idade = idade;
		this.numDependentes = numDependentes;
	}
	
	 public void setNumDependentes(int numDependentes) {
		this.numDependentes = numDependentes;
	}
	
	@Override
	public double obterValorDescontoBaseCalculo() {
		double desconto = 0;
		if(this.idade < 65){			
			if(this.numDependentes <= 2){
				desconto = .02;
			}else
				if(this.numDependentes <= 5){
					desconto = .035;
				}else{
					desconto = 0.05;
				}			
		}	//65 years or more
			else{
			 if(this.numDependentes <= 2){
				desconto = .03;
			}else
				if(this.numDependentes <= 5){
					desconto = .045;
			}else{
				desconto = .06;
			}				
		}return obterBaseDeCalculo() * desconto;
	}

	
	@Override
	public double obterImposto() {
		double tetoPrimeiraFaixa = 12000.00;
		double tetoSegundaFaixa = 24000.00;
		double valorImposto = 0;
		
		if(obterBaseDeCalculo() <= tetoPrimeiraFaixa){
				valorImposto = 0;
			}else{
				if(obterBaseDeCalculo() < 24000.00){
					valorImposto = (obterBaseDeCalculo() - tetoPrimeiraFaixa) * 0.15;
				}else{
					valorImposto = (obterBaseDeCalculo() - tetoSegundaFaixa) * .275;
				}
			}		
		return valorImposto;
	}
	
	
}
