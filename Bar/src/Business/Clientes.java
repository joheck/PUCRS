package Business;

import Persistence.Clientes_Persistence;

public class Clientes extends Clientes_Persistence{
	private String nome, cpf;
	private int idade, numeroSocio;
	private char genero;
	
	public Clientes(String nome, String cpf, int idade, char genero) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.genero = genero;
	}

	public char getGenero() {
		return genero;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setNumeroSocio(int numeroSocio){
		this.numeroSocio = numeroSocio;
	}
	
	public String toString(){
		
		return "Nome: "+this.nome+" CPF: "+this.cpf+" Idade: "+this.idade+
			   " Numero Socio: "+this.numeroSocio+" Gener: "+this.genero;
	}

}