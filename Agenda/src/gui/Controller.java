package gui;

import negocio.Agenda;

public class Controller {
	
	



	protected Agenda agenda = new Agenda();

	public void gravar(String nome, String telefone){
		if(!nome.equals("") && !telefone.equals("")){
			agenda.armazenarContato(agenda.getIdContatos(), nome, telefone);

		}
	}
}
