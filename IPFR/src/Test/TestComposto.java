package Test;

import org.junit.Assert;
import org.junit.Test;

import Business.Composta;

public class TestComposto {

	@Test
	public void testObterValorDescontoBaseCalculo() {
		Composta comp60 = new Composta(200, 100, 60, 1);
		
		Assert.assertEquals(98.00, comp60.obterBaseCalculoComDesconto(), 0.01);
		comp60.setNumDependentes(4);
		Assert.assertEquals(96.5, comp60.obterBaseCalculoComDesconto(), 0.01);
		comp60.setNumDependentes(15);
		Assert.assertEquals(95.0, comp60.obterBaseCalculoComDesconto(), 0.01);
		
		
		Composta comp65 = new Composta(200, 100, 65, 1);

		Assert.assertEquals(97.00, comp65.obterBaseCalculoComDesconto(), 0.01);
		comp65.setNumDependentes(4);
		Assert.assertEquals(95.5, comp65.obterBaseCalculoComDesconto(), 0.01);
		comp65.setNumDependentes(15);
		Assert.assertEquals(94.0, comp65.obterBaseCalculoComDesconto(), 0.01);
		
	}

	public void testObterValorImposto(){
		Composta com = new Composta(200, 100, 60, 0);		
		Assert.assertEquals(0, com.obterImposto(), 0.01);
		

		Composta com1 = new Composta(13100.00, 1000.00, 60, 0);		
		Assert.assertEquals(85.00, com1.obterImposto(), 0.01);
		
		Composta com2 = new Composta(25100.00, 1000.00, 60, 0);		
		Assert.assertEquals(83.50, com2.obterImposto(), 0.01);		
	}
}
