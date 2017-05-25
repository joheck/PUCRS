package negocio;

import java.util.ArrayList;
import java.util.Set;

import javax.swing.JOptionPane;

import persistencia.ContatosDAO;
import persistencia.ContatosDAOoracle;

public class  Agenda implements ContatosDAO{

	public static ArrayList <Contatos> contatos = new ArrayList<>();
	ContatosDAOoracle co;
	int idContatos = 0;
	
	public int getIdContatos(){
		return this.idContatos;
	}
	@Override
	public boolean armazenarContato(int id_contatos, String nome, String numeroTelefone) {
		this.idContatos++;
		return co.armazenarContato(id_contatos, nome, numeroTelefone);		
	}
	@Override
	public String getTelefonePorNome(String nome) {
		
		return co.getTelefonePorNome(nome);
	}
	@Override
	public ArrayList<Contatos> getContatosOrdemAlfabetica() {
		return co.getContatosOrdemAlfabetica();
	}
	
	
	
	

	


}