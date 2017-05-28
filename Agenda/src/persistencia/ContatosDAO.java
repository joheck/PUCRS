package persistencia;

import java.util.ArrayList;

import gui.ContatosView;
import javafx.collections.ObservableList;
import negocio.Contatos;

public interface ContatosDAO {
	public void armazenarContato(String nome, String numeroTelefone);
	public String getTelefonePorNome(String nome);
	public ArrayList<ContatosView> getContatosOrdemAlfabetica();	
}