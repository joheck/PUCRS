package Persistence;

import java.io.FileWriter;
import java.io.PrintWriter;

import Business.Clientes;

public abstract class Bar_Persistence {
	Clientes[] clientesNoBar;
	Clientes[] socios;
	int contSocios;

	/*Construtor*/
	public Bar_Persistence(){
		this.clientesNoBar = new Clientes[100];
		this.socios = new Clientes[100];
	}

	public boolean cadastrarSocio(Clientes cliente){

		if(cliente != null){
			this.socios[contSocios] = cliente;
			contSocios++;	
			return true;
		}else
		{
			return false;
		}
	}

	public boolean entradaCliente(Clientes cliente){
		int cont = 0 ;
		while(cont < 100){
			if(this.clientesNoBar[cont] == null){
				this.clientesNoBar[cont] = cliente;
				System.out.println("Cliente inserido!");return true;
			}			
			cont++;
		}
		System.out.println("Bar lotado!");
		return false;
	}

	public Clientes[] listarTodosClientesNoBar(){		
		Clientes[] retorno = this.clientesNoBar.clone();		
		return retorno;		
	}

	public Clientes[] listarTodosSociosNoBar(){
		return this.socios; 
	}

	public boolean pesquisaCpfNoBar(String cpf){
		for(Clientes c : this.clientesNoBar){
			if(c != null && c.getCpf().equals(cpf)){
				return true;
			}
		}
		return false;
	}

	public double porcentagemMulheres(){
		int cont = 0, fem = 0;
		for(Clientes c : this.clientesNoBar){
			if(c!= null)cont++;	
			if(c!= null && c.getGenero() == 'F'){
				fem++;
			}
		}return (double)fem/cont/.01;
	}

	public double porcentagemHomens(){
		int cont = 0, mas = 0;
		for(Clientes c : this.clientesNoBar){
			if(c!= null)cont++;	
			if(c!= null && c.getGenero() == 'M'){
				mas++;
			}
		}return (double)mas/cont/.01;
	}

	public boolean saidaDeCliente(String cpf){
		for(int c = 0 ; c < this.clientesNoBar.length ; c++){
			if(this.clientesNoBar[c] != null && this.clientesNoBar[c].getCpf().equals(cpf)){this.clientesNoBar[c]= null; return true;
			}
		}System.out.println("Cpf não está no bar"); return false;
	}

	public boolean gravaClientesDoDia(){
		try{
			FileWriter fw = new FileWriter("src/Persistence/Clientes do dia.txt");
			PrintWriter pw = new PrintWriter(fw);
			for(Clientes c : this.clientesNoBar){
				if(c != null){
					System.out.println(c.toString());
					pw.println(c.toString());
				}
			}
			pw.close();
		}catch(Exception e){e.printStackTrace();}
		return true;
	}
}