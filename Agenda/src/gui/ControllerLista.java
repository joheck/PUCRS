package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import persistencia.ContatosDAOoracle;

public class ControllerLista implements Initializable{

	@FXML private TableView<ContatosView> contatos;
	@FXML private TableColumn<ContatosView, String> listNome;
	@FXML private TableColumn<ContatosView, String> listTelefone;
	public ObservableList<ContatosView> list;
	public ContatosDAOoracle co;
	
	public void updateList(){
		ArrayList<ContatosView> array = new ArrayList<>();
		
		for(ContatosView c : co.getContatosOrdemAlfabetica()){
			array.add(new ContatosView(c.getNome(), c.getTelefone()));
		}
		list = FXCollections.observableArrayList(array);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {	
		try {
			co = new ContatosDAOoracle();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.listNome.setCellValueFactory(new PropertyValueFactory<ContatosView, String>("nome"));		
		this.listTelefone.setCellValueFactory(new PropertyValueFactory<ContatosView, String>("telefone"));
		
		//ArrayList<ContatosView> arr = new ArrayList<>();
		//arr.add(new ContatosView("JO", "k"));
		//list = FXCollections.observableArrayList(arr);
		updateList();
		
		contatos.getItems().addAll(list);	
	}
}