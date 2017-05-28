package gui;

import javafx.beans.property.SimpleStringProperty;

public class ContatosView {

	private final SimpleStringProperty nome = new SimpleStringProperty("");
	private final SimpleStringProperty telefone = new SimpleStringProperty("");
	
		public ContatosView(String nome, String telefone){
			setNome(nome);
			setTelefone(telefone);			
		}
		
		public void setNome(String nome){
			this.nome.set(nome);
		}
		
		public void setTelefone(String telefone){
			this.telefone.set(telefone);
		}

		public String getNome() {
			return nome.get();
		}

		public String getTelefone() {
			return telefone.get();
		}
}