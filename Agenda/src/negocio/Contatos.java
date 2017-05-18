package negocio;

public class Contatos {
	
	
	
	private String nome;
	private String numeroTelefone;
	
	public Contatos(String nome, String numeroTelefone){
		this.nome = nome.toUpperCase();
		this.numeroTelefone = numeroTelefone;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	public String getTelefone(){
		return this.numeroTelefone;		
	}
	
	public String getNome(){
		return this.nome;
	}	  
	
}
