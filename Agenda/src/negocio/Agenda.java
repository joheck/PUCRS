package negocio;

import java.util.ArrayList;

import gui.ContatosView;
import persistencia.ContatosDAO;
import persistencia.ContatosDAOoracle;

public class  Agenda implements ContatosDAO{

	public static ArrayList <Contatos> contatos = new ArrayList<>();
	ContatosDAOoracle co;

	public Agenda(){
		try {
			this.co =  new ContatosDAOoracle();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void armazenarContato(String nome, String numeroTelefone) {
		co.armazenarContato(nome, numeroTelefone);		

	}
	
	@Override
	public String getTelefonePorNome(String nome) {		
		return co.getTelefonePorNome(nome);
	}
	
	@Override
	public ArrayList<ContatosView> getContatosOrdemAlfabetica() {
		return co.getContatosOrdemAlfabetica();
	}
}