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
			Scene scene = new Scene(root,300,200);
			primaryStage.setTitle("Agenda");
			primaryStage.setIconified(false);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
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
	}

	public void radios(){
		if(this.pesqPorNome.isSelected()){
			this.pFieldNome.setVisible(true);
			this.pLabelnome.setVisible(true);
		}else
			if(this.pesqTodos.isSelected()){
				this.pFieldNome.setVisible(false);
				this.pLabelnome.setVisible(false);
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

	}
	
	public void getTelefonePorNome(){

		try{
			if(this.pFieldNome.getText().equals("")){
				JOptionPane.showMessageDialog(null, "Preencher nome para pesquisa.", "View", 0);
				this.pFieldNome.requestFocus();
			}else
				if(!this.pFieldNome.getText().equals("")){
					this.pFieldTelefone.setText(controller.getTelefonePorNome(this.pFieldNome.getText()));
					this.pFieldTelefone.setVisible(true);
					this.pLabeltelefone.setVisible(false);
					this.pLabelnome.setDisable(true);
				}
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Nome não está na agenda.", "View", 0);
			this.pFieldNome.setText("");
			this.pFieldNome.requestFocus();
		}

	}

	public static void main(String[] args) {
		launch(args);
	}
}