package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ControllerLista implements Initializable{

	@FXML private TableView<ContatosView> contatos;
	@FXML private TableColumn<ContatosView, String> listNome;
	@FXML private TableColumn<ContatosView, String> listTelefone;

	public ObservableList<ContatosView> list = FXCollections.observableArrayList(
			new ContatosView("João", "985368933"),
			new ContatosView("Jose", "5"),
			new ContatosView("Otavio", "3"),
			new ContatosView("Joaquim", "23")
			);

	@Override
	public void initialize(URL location, ResourceBundle resources) {		
		this.listNome.setCellValueFactory(new PropertyValueFactory<ContatosView, String>("listNome"));		
		this.listTelefone.setCellValueFactory(new PropertyValueFactory<ContatosView, String>("listTelefone"));
		System.out.println(list.get(1).getNome());
		contatos.setItems(list);
		System.out.println(contatos.getItems().get(0).getNome());
	
	}
}