package Business;

public class Clientes{
	private String nome, cpf;
	private int idade, numeroSocio;
	private char genero;
	
	public Clientes(String nome, String cpf, int idade, char genero, int numeroSocio) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.genero = genero;
		this.numeroSocio = numeroSocio;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public int getNumeroSocio() {
		return numeroSocio;
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
		
		return "-"+this.nome+"|"+this.cpf+"|"+this.idade+
			   "|"+this.numeroSocio+"|"+this.genero+"|"+this.numeroSocio+"-";
	}

}