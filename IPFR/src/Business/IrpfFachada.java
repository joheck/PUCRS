package Business;

import java.util.ArrayList;

import Persistence.Dados;

public class IrpfFachada {

	 public static Dados dados = new Dados();

	public boolean inserir(PessoaFisica pessoa){
		if(pessoa == null){
			return false;
		}
		else{
			this.dados.inserirPessoa(pessoa);
			return true;
		}		
	}
	
	public ArrayList<PessoaFisica> listarPessoas(){		
		return this.dados.listarPessoas();
	}
}
