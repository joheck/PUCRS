package UIInterface;
import java.text.DecimalFormat;
import	Business.*;
import Persistence.*;

public class View_Bar extends Bar_Persistence{

	public String listarTodosClientesNoBar(Clientes[] clientes){
		String result = "";
		for(int i = 0 ; i < clientes.length ; i++){
			if(clientes[i] != null){
				result += clientes[i].toString()+"\n";
			}
		}
		return result;
	}

	public String listarTodosSociosNoBar(Clientes[] clientes, Clientes[] socios){
		String result = "";
		int cont = 0;
		int contSocio = 0;
		for(Clientes i : socios){
			if(i != null){contSocio++;}
			for(Clientes j : clientes){

				if(i == j && i!= null && j!=null){
					if(j != null){cont++;}
					result += i.toString()+"\n"; 
					
				}
			}result = "Total de clientes no bar: "+cont+" \n Total de socios: "+contSocio+" \n Não socios: "+(cont-contSocio);
		}return result;
	}

	public boolean pesquisaPorCpf(String cpf) throws NullPointerException{ 
		return pesquisaCpfNoBar(cpf);
	}

	public String mulheresNoBar(){
		return "Mulheres: "+porcentagemMulheres()+"%";
	}
	
	public String homensNoBar(){
		return "Homens: "+porcentagemHomens()+"%";
	}
}