package Bussines;
/**
*
* @author João França 
*/
public class Lote {
	
	private int id;
	private Produto[] produtos;
	
	public Lote(Produto[] produtos) {
		this.produtos = produtos;
	}
	
	public Produto[] getProdutos() {
		return produtos;
	}
	
	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
		
}
