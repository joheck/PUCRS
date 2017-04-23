package Business;

import java.util.ArrayList;

import Persistence.BarPersistence;

public class Bar {
	public static ArrayList<Clientes> clientesNoBar = new ArrayList<Clientes>();
	public BarPersistence bp = new BarPersistence();
	private static String cpfCons;
	public String getcpfCons(){
		return this.cpfCons;
	}

	public void setCpfCons(String parm){
		this.cpfCons = parm;
	}


	private int teste = 22;
	public int getTeste(){
		return this.teste;
	}

	public boolean entradaClientes(Clientes clientes){		
		this.clientesNoBar.add(clientes);
		this.clientesNoBar.get(0).getCpf();
		bp.registraMovimentacaoDoBar(clientes);
		bp.atualizarArquivoClientesNobar(this.getClientesNoBar());
		return true;
	}

	public String saidaDeCliente(String cpf){
		for(Clientes c: this.clientesNoBar){
			if(c.getCpf().equals(cpf)){
				this.clientesNoBar.remove(this.clientesNoBar.indexOf(c));
				bp.atualizarArquivoClientesNobar(this.getClientesNoBar());
				return c.getCpf();
			}			
		}		
		return "CPF nao encontrado.";
	}

	public ArrayList<Clientes> getClientesNoBar(){
		return this.clientesNoBar;
	}

	/*Metodos para atender as consultas, as tabelas das paginas**/	
	public Clientes getClientePorCpf(String cpf){
		Clientes cliente = null;
		for(Clientes c: this.clientesNoBar){

			if(c.getCpf().equals(cpf)){

				cliente = c;
				System.out.println(c.getCpf());
				System.out.println(cpf);
				return cliente;
			}	
		}		
		return null;		
	}

	public int[] getParamQtde(){
		int[] parametros = new int[5];

		parametros[0] = this.clientesNoBar.size(); //quantidade total de clientes no bar
	
		int param2 = 0;
		int param3 = 0;
		for(Clientes c: this.clientesNoBar){
			if(c.getGenero() == 'M' && c.getNumeroSocio() !=0){
				param2++; //homens socios
			}else if(c.getGenero() == 'M' && c.getNumeroSocio() ==0){
				param3++;	
			}
		}parametros[1] = param2; //homens  socios
		parametros[2] = param3;
		
		int param4 = 0;
		int param5 = 0;
		for(Clientes c: this.clientesNoBar){
			if(c.getGenero() == 'F' && c.getNumeroSocio() !=0){
				param4++; //homens socios
			}else if(c.getGenero() == 'F' && c.getNumeroSocio() ==0){
				param5++;	
			}
		}parametros[3] = param4; //mulheres  socias
		parametros[4] = param5; //mulheres não socias		
		
	return parametros;
}
}