package persistencia;

import java.util.ArrayList;

import negocio.Contatos;

public interface ContatosDAO {
	public void armazenarContato(String nome, String numeroTelefone);
	public String getTelefonePorNome(String nome);
	public  ArrayList<Contatos> getContatosOrdemAlfabetica();	
}
