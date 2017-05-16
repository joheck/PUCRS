package Business;



public class PessoaFisica {
	private String nome, cpf;
	int idade, numeroDependentes;
	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public int getNumeroDependentes() {
		return numeroDependentes;
	}

	public static CalculoIRPF getDeclaracao() {
		return declaracao;
	}

	static CalculoIRPF declaracao;
	
	/*Simples*/
	public PessoaFisica( String nome, String cpf, int idade, double totalRendimentos, double contribuicao){
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
		this.declaracao = new CalculoIRPF(new Simplificada(totalRendimentos, contribuicao));
	}
	
	/*Simples*/
	public PessoaFisica( String nome, String cpf, int idade,  double totalRendimentos, double contribuicao, int numeroDependentes){
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
		this.numeroDependentes = numeroDependentes;
		this.declaracao = new CalculoIRPF(new Composta(totalRendimentos, contribuicao, idade , numeroDependentes));
	}
	
	@Override
	public String toString() {
		return "PessoaFisica [nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", numeroDependentes="
				+ numeroDependentes + "]";
	}	
}