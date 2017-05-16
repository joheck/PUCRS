package Persistence;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Business.IrpfFachada;
import Business.PessoaFisica;

public class Dados {	
	IrpfFachada fachada = new IrpfFachada();
	ArrayList<PessoaFisica> pessoas = new ArrayList<>();	
	
	public void inserirPessoa(PessoaFisica pessoa){
		if(pessoa != null){
			this.pessoas.add(pessoa);
			JOptionPane.showMessageDialog(null, "Pessoa cadastrada!");
		}else{
			JOptionPane.showMessageDialog(null, "Não cadastrado!");
		}
	}
	
	public ArrayList<PessoaFisica> listarPessoas(){		
		if(this.pessoas.size() == 0){
			JOptionPane.showMessageDialog(null,"Não há pessoas cadastradas.");
			return null;
		}else{
			return this.pessoas;
		}		
	}

}
