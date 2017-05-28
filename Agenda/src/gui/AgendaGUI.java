package gui;


import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;




public class AgendaGUI extends Application {

	@FXML private TextField nome;
	@FXML private TextField telefone;
	@FXML private Button gravar;
	@FXML private Label pLabelnome;
	@FXML private Label pLabeltelefone;
	@FXML private TextField pFieldNome;
	@FXML private TextField pFieldTelefone;
	@FXML private Button pButtonPesquisar;
	@FXML private RadioButton pesqPorNome;
	@FXML private RadioButton pesqTodos;
	

	Controller controller = new Controller();

	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Agenda.fxml"));
			Scene scene = new Scene(root,330,200);
			primaryStage.setTitle("Agenda");
			primaryStage.setIconified(false);
			primaryStage.setScene(scene);
			primaryStage.show();			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void lista(Stage primaryStage){
		try{
			Parent parent = FXMLLoader.load(getClass().getResource("ListaContatos.fxml"));
			Scene scene = new Scene(parent);
			primaryStage.setTitle("Agenda - Lista de contatos");
			primaryStage.setScene(scene);
			primaryStage.show();
		}catch(Exception e ){
			e.printStackTrace();
		}
		
		

	}

	public void gravar(){
		controller.gravar(this.nome.getText(), this.telefone.getText());		
		this.nome.requestFocus();
		limpar();
	}

	public void limpar(){
		this.nome.setText("");
		this.telefone.setText("");
		this.pFieldNome.setText("");
		this.pFieldTelefone.setText("");
	}

	public void radios(){
		if(this.pesqPorNome.isSelected()){
			this.pFieldNome.setVisible(true);
			this.pLabelnome.setVisible(true);
			this.pFieldNome.setDisable(false);
			this.pLabelnome.setDisable(false);
			this.pFieldTelefone.setVisible(false);
			this.pLabeltelefone.setVisible(false);
			limpar();
		}else
			if(this.pesqTodos.isSelected()){
				this.pFieldNome.setVisible(false);
				this.pLabelnome.setVisible(false);
				this.pFieldTelefone.setVisible(false);
				this.pLabeltelefone.setVisible(false);
				limpar();
			}
	}

	public void pesquisar(){
		if(this.pesqPorNome.isSelected()){
			getTelefonePorNome();
		}else{
			listarTodos();
		}
	}

	public void listarTodos(){
		lista(new Stage());
	}

	public void getTelefonePorNome(){

		try{
			if(this.pFieldTelefone.isVisible()){
				radios();
			}
			else
				if(this.pFieldNome.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Preencher nome para pesquisa.", "View", 0);
					this.pFieldNome.requestFocus();
				}else
					if(!this.pFieldNome.getText().equals("")){
						this.pFieldTelefone.setText(controller.getTelefonePorNome(this.pFieldNome.getText()));
						this.pFieldTelefone.setVisible(true);
						this.pFieldTelefone.setDisable(true);
						this.pLabeltelefone.setVisible(false);
						this.pLabelnome.setDisable(true);
						this.pFieldNome.setDisable(true);
					}
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Nome não está na agenda.", "View", 0);
			limpar();
			this.pFieldNome.requestFocus();
		}

	}

	public static void main(String[] args) {
		launch(args);
	}
}