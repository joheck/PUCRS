package Test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import Business.Simplificada;

public class TestSimplificada {


	/*Testes Declaracao Simples*/
	@Test
	public void testobterValorDescontoBaseCalculo() {		
		Simplificada simp = new Simplificada(100, 100);
		assertEquals(5.0 , simp.obterValorDescontoBaseCalculo(100.0), 0.01);
	}

}
