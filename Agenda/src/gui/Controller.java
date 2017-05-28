package gui;

import javax.swing.JOptionPane;

import negocio.Agenda;

public class Controller {
	
	protected Agenda agenda = new Agenda();
	
	public void gravar(String nome, String telefone){
		if(!nome.equals("") && !telefone.equals("")){
			agenda.armazenarContato(nome, telefone);
		}else{
			JOptionPane.showMessageDialog(null, "Preencher todos os campos", "View", 0);
		}
	}

	public String getTelefonePorNome(String nome){
		String telefone;		
		telefone = agenda.getTelefonePorNome(nome);
		return telefone;
	}

}