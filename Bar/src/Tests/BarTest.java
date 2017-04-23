package Tests;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import Business.Bar;
import Business.Clientes;
import Persistence.BarPersistence;

public class BarTest {

	@Test
	public void testGravarNaLista() {
		BarPersistence bp = new BarPersistence();
		ArrayList<Clientes> clientes = new ArrayList<Clientes>();

		clientes.add(new Clientes("João", "42", 11111, 'M',0));
		clientes.add(new Clientes("Ana", "22", 22, 'F', 0));
		System.out.println(bp.atualizarArquivoClientesNobar(clientes));
		assert(bp.atualizarArquivoClientesNobar(clientes));
	}

	@Test
	public void testEntradaClientes(){
		Bar bar = new Bar();
		Clientes cliente = new Clientes("Ana", "22", 22, 'F', 0);
		assert(bar.entradaClientes(cliente));	
	}

	@Test
	public void testRegistraMovimentacaoDoBar(){
		BarPersistence bar = new BarPersistence();
		Clientes cliente = new Clientes("Ana", "22", 22, 'F', 0);
		assert(bar.registraMovimentacaoDoBar(cliente));			
	}

	@Test
	public void testsaidaDeCliente(){
		Bar bar = new Bar();
		Clientes cliente = new Clientes("a", "2543", 22, 'F', 0);
		Clientes cliente2 = new Clientes("fewfew", "22", 22, 'F', 0);
		Clientes cliente3 = new Clientes("fewfdfdsew", "334", 22, 'F', 0);
		
		bar.entradaClientes(cliente);
		bar.entradaClientes(cliente2);
		bar.entradaClientes(cliente3);

		bar.saidaDeCliente("22");
		bar.saidaDeCliente("2543");
		
		Assert.assertEquals(1, bar.getClientesNoBar().size());
	}
	
	@Test
	public void testPesquisaPorCpf(){
		Bar bar = new Bar();
		Clientes cliente = new Clientes("a", "2543", 22, 'F', 0);
		bar.entradaClientes(cliente);
		Assert.assertEquals("2543", bar.getClientePorCpf("2543").getCpf());
	}
}
