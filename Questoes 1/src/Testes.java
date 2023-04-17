import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class Testes {
	
	private int op0;
	private int opR;
	private int opN;
	private int rstEspNesimo;
	private int rstEspSoma;
	
	private Calculadora c;
	
	@Before
	public void setup() {
		c = new Calculadora();
	}
	
	@Parameters
	public static Iterable<Object[]> getParameters() {
		Object[][] parametros = new Object[][] {
			{2, 3, 5, 14, 40},
			{3, 4, 5, 19, 55}, 
			{5, -3, 6, -10, -15}, 

		};
		return Arrays.asList(parametros);
	}
	
	public Testes(int op0, int opR, int opN, int rstEspNesimo, int rstEspSoma) {
		this.op0 = op0; 
		this.opR = opR;
		this.opN = opN;
		this.rstEspNesimo = rstEspNesimo;
		this.rstEspSoma = rstEspSoma;
	}
		
	@Test
	public void testNesimo() {
		assertEquals(rstEspNesimo, c.nesimo(op0, opR, opN));
	}
	
	@Test
	public void testSoma() {
		assertEquals(rstEspSoma, c.soma(op0, opR, opN));
	}
	

}
