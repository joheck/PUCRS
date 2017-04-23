package Persistence;


import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import Business.Clientes;

public class BarPersistence {
	private final String diretorioArqClientesNoBar = "C:/Users/JOO_F/git/PUCRS/Bar/src/Persistence/Dados/clientesNoBar.txt";
	private final String diretorioMovimentacaoDoBar = "C:/Users/JOO_F/git/PUCRS/Bar/src/Persistence/Dados/movimentacaoBar.txt";
	
	/*Grava no arquivo de texto os arquivos que estao no ArrayList*/
	public boolean atualizarArquivoClientesNobar(ArrayList<Clientes> clientes){
		try{			
			FileWriter localfile = new FileWriter(diretorioArqClientesNoBar);
			PrintWriter pw = new PrintWriter(localfile);			

			for(Clientes c : clientes){
				if(c != null){
					pw.println(c.toString());
				}
			}			
			localfile.close();
			pw.close();	
		}catch(Exception e){ 
			System.out.println("Não foi possível salvar. Descrição do erro: ");
			e.printStackTrace();
			return false;
		}		
		return true;
	}

	/*Grava eu um txt com toda a movimentacao do bar*/
	public boolean registraMovimentacaoDoBar(Clientes cliente){
		try{			
			FileWriter file = new FileWriter(diretorioMovimentacaoDoBar, true);
			PrintWriter pw = new PrintWriter(file);			

			if(cliente != null){
				pw.println(cliente.toString());
			}
			file.close();
			pw.close();	
		}catch(Exception e){ 
			System.out.println("Não foi possível salvar. Descrição do erro: ");
			e.printStackTrace();
			return false;
		}		
		return true;
	}



}
