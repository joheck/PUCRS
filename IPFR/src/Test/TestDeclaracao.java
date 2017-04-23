package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Business.Declaracao;
import Business.Simplificada;

public class TestDeclaracao {

	
	/*Testes Declaracao Simples*/
	@Test
	public void test() {
		Declaracao decSimples = new Simplificada(2);		
		assertEquals(95.0, decSimples.getBaseDeCalculo(1000, 900), 0.01);
	}

}
