package Bussines;
/**
*
* @author João França
*/
public class Produto {
	
	private Categoria categ;
	private String descBreve;
	private String descCompleta;
	
	public Produto(Categoria categ, String descBreve, String descCompleta) {
		this.categ = categ;
		this.descBreve = descBreve;
		this.descCompleta = descCompleta;
	}
	
	public Categoria getCateg() {
		return categ;
	}
	
	public void setCateg(Categoria categ) {
		this.categ = categ;
	}
	
	public String getDescBreve() {
		return descBreve;
	}
	
	public void setDescBreve(String descBreve) {
		this.descBreve = descBreve;
	}
	
	public String getDescCompleta() {
		return descCompleta;
	}
	
	public void setDescCompleta(String descCompleta) {
		this.descCompleta = descCompleta;
	}
}
