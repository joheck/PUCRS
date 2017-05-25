package gui;

	
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
	
	public void getTelefonePorNome(){
		controller.getTelefonePorNome(this.pFieldNome.getText());
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}