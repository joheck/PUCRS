package negocio;

import java.util.ArrayList;
import java.util.Set;

import javax.swing.JOptionPane;

public class Agenda {

	ArrayList <Contatos> contatos = new ArrayList<>();

	public boolean armazenarContato(String nome, String numeroTelefone){

		if(nome != null && numeroTelefone != null){
			this.contatos.add(new Contatos(nome, numeroTelefone));		
			JOptionPane.showMessageDialog(null, "Contato inserido com sucesso!");
			return true;
		}
		else{
			return false;
		}
	}

	public String getTelefone(String nome){

		String numeroTelefone = "";

		for(int i = 0 ; i< this.contatos.size() ; i++){
			if(this.contatos.get(i).getNome().equals(nome)){
				numeroTelefone = this.contatos.get(i).getTelefone();
				return numeroTelefone;
			}
		}
		JOptionPane.showMessageDialog(null, "Contato "+nome+" não encontrado.");
		return null;
	}

	public  void getContatosOrdemAlfabetica(){
		
		ArrayList<Contatos> contatosOrdem = (ArrayList<Contatos>) this.contatos.clone();
		
		Contatos aux = new Contatos("", "");
		
		for(int i = 0 ; i < contatosOrdem.size() ; i++){
			
			aux = (Contatos) contatosOrdem.get(i); //corrente
			
			for(int j = i ; j < contatosOrdem.size() ; j++){
				
				//identifica que é maior que o posterior
				if(aux.getNome().length() > contatosOrdem.get(j).getNome().length()){					
					Contatos aux2 = contatosOrdem.get(j); // copia o posterior					
					contatosOrdem.set(j, aux); // adiciona o corrente (i) na posição do posterior (j) menor encontrado
					contatosOrdem.set(i, aux2); // seta a posição corrente (i) com o valor do posterir (j) encontrado					
										
				}				
			}			
		}
	}
	

}