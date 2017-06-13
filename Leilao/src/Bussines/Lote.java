package Bussines;
/**
*
* @author João França
*/
public class Lote {
	
	private double preco;
	private Produto[] produtos;
	
	public Lote(double preco, Produto[] produtos) {
		this.preco = preco;
		this.produtos = produtos;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public Produto[] getProdutos() {
		return produtos;
	}
	
	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}
		
}
