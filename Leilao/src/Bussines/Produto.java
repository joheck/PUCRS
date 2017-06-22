package Bussines;
/**
*
* @author João França
*/
public class Produto {
	
	private final int id;
	private String descSimples;
	private String descCompleta;
	private CategoriaProd categoria;	
	
	public Produto(int id, String descSimples, String descCompleta,CategoriaProd categoria){
		this.id = id;
		this.setDescSimples(descSimples);
		this.setDescCompleta(descCompleta);
		this.setCategoria(categoria);
	}

	public int getId() {
		return id;
	}

	public String getDescSimples() {
		return descSimples;
	}

	public void setDescSimples(String descSimples) {
		this.descSimples = descSimples;
	}

	public String getDescCompleta() {
		return descCompleta;
	}

	public void setDescCompleta(String descCompleta) {
		this.descCompleta = descCompleta;
	}

	public CategoriaProd getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaProd categoria) {
		this.categoria = categoria;
	}
	
}
