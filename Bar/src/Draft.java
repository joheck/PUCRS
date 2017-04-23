import java.util.ArrayList;

import Business.Bar;
import Business.Clientes;
import Persistence.BarPersistence;


public class Draft {

	public static void main(String[] args) {
		Bar bar = new Bar();
		BarPersistence bp = new BarPersistence();
		Clientes c = new Clientes("", "11", 0, 'M',0);
		bar.entradaClientes(c);
		
		bp.registraMovimentacaoDoBar(c);
		bp.atualizarArquivoClientesNobar(bar.getClientesNoBar());
	
		
	
		
	}
}
