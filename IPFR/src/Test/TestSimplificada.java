package Test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import Business.Simplificada;

public class TestSimplificada {

	@Test
	public void testValorDescontoBaseDeCalculo(){
		Simplificada simp = new Simplificada(200, 100);
		assertEquals(5, simp.obterValorDescontoBaseCalculo(), 0.01);
	}

	@Test
	public void testobterValorDescontoBaseCalculo() {		
		Simplificada simp = new Simplificada(200, 100);
		System.out.println(simp.obterValorDescontoBaseCalculo());
		assertEquals(5.0 , simp.obterValorDescontoBaseCalculo(), 0.01);
	}
	
	@Test
	public void testObterValorImposto(){
		Simplificada simp = new Simplificada(200, 100);
		assertEquals(95.00, simp.obterBaseCalculoComDesconto(), 0.01);
	}

}
