package Business;

import java.util.Date;

public class PessoaFisica {
	private String cpf, nome;
	int idade;
	Declaracao declaracao;
	
	public PessoaFisica(String cpf, String nome, int idade, Declaracao declaracao){
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
		this.declaracao = declaracao;
	}
	
}
