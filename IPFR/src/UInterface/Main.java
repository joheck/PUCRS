package UInterface;

import javax.swing.JOptionPane;

import Business.IrpfFachada;
import Business.PessoaFisica;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

	@FXML private TextField fieldName;
	@FXML private TextField fieldCpf;
	@FXML private TextField fieldAge;
	@FXML private TextField fieldNumDep;
	@FXML private RadioButton radioComp = new  RadioButton();	
	@FXML private RadioButton radioSimp = new RadioButton();
	@FXML private Button buttonGenerate;
	@FXML private Button buttonClear;
	@FXML private TextField rendimentos;
	@FXML private TextField contribuicao;
	String declaracao = "simplificada";
	IrpfFachada fachada = new IrpfFachada();
	private int contador = 0;

	@Override
	public void start(Stage primaryStage){
		try{		
			Parent root = FXMLLoader.load(getClass().getResource("Window.fxml"));			
			Scene scene = new Scene(root, 250, 350);
			primaryStage.setResizable(false);
			primaryStage.setTitle("Register");
			primaryStage.setScene(scene);
			primaryStage.show();
		}catch(Exception e){e.printStackTrace();
		}
	}	

	public void mostrarTabela(){
		String nome = fieldName.getText();
		String cpf = fieldCpf.getText();
		String idade = fieldAge.getText();
		String dependentes = fieldNumDep.getText();	
		double baseCalculoDesconto = fachada.dados.listarPessoas().get(0).getDeclaracao().obterBaseCalculoComDesconto();
		double imposto = fachada.dados.listarPessoas().get(0).getDeclaracao().obterImposto();	

		JOptionPane.showMessageDialog(null, "Nome: "+nome+"  "
				+"    CPF:"+cpf+""
				+"    Idade: "+idade+""
				+"    n° dependentes:"+dependentes 
				+"    Tipo declaração:"+this.declaracao
				+"    Base de cálculo com desconto: R$"+baseCalculoDesconto
				+"    Imposto a pagar: R$"+imposto, "Informações", 1);
	}

	public void limpar(){		
		this.fieldName.setText("");
		this.fieldCpf.setText("");
		this.fieldAge.setText("");
		this.fieldNumDep.setText("");
		this.rendimentos.setText("");
		this.contribuicao.setText("");		
	}

	public void gerarDeclaracao(){
		PessoaFisica pessoa = null;		
			String nome = (String)this.fieldName.getText();
			String cpf = (String)this.fieldCpf.getText();
			int idade = Integer.valueOf(this.fieldAge.getText());
			double rendimentos = Double.valueOf(this.rendimentos.getText());
			double contribuicao = Double.valueOf(this.contribuicao.getText());		
			int dependentes = Integer.valueOf(this.fieldNumDep.getText());

			if(this.declaracao.equals("simplificada")){
			pessoa = new PessoaFisica(nome,cpf, idade, rendimentos, contribuicao);
				
			}else{
				pessoa = new PessoaFisica(nome, cpf, idade, rendimentos, contribuicao, dependentes);
			}
			
			this.fachada.dados.inserirPessoa(pessoa);
			this.contador++;
			mostrarTabela();
			limpar();
	}

	public static void main (String args[]){
		launch(args);
	}

	public void setDeclaracaoSimp(){
		this.declaracao = "simplificada";
		System.out.println(this.declaracao);
	}

	public void setDeclaracaoComp(){
		this.declaracao = "composta";
		System.out.println(this.declaracao);
	}




}