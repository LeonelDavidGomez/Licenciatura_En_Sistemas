import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	private Calculadora c;
	 @BeforeEach
	    public void setUp() {
	        c = new Calculadora();
	    }
	 @Test
	    public void testSumaBasica() {
	        Calculadora c = new Calculadora();

	        c.setValor(5);
	        c.mas();
	        c.setValor(3);

	        assertEquals("8.0", c.getResultado());
	    }

	    @Test
	    public void testRestaBasica() {
	        Calculadora c = new Calculadora();

	        c.setValor(10);
	        c.menos();
	        c.setValor(4);

	        assertEquals("6.0", c.getResultado());
	    }

	    @Test
	    public void testMultiplicacion() {
	        Calculadora c = new Calculadora();

	        c.setValor(6);
	        c.por();
	        c.setValor(3);

	        assertEquals("18.0", c.getResultado());
	    }

	    @Test
	    public void testDivision() {
	        Calculadora c = new Calculadora();

	        c.setValor(10);
	        c.dividido();
	        c.setValor(2);

	        assertEquals("5.0", c.getResultado());
	    }

	    @Test
	    public void testDivisionPorCeroEntraEnError() {
	        Calculadora c = new Calculadora();

	        c.setValor(10);
	        c.dividido();
	        c.setValor(0);

	        assertEquals("Error", c.getResultado());
	    }

	    @Test
	    public void testOperacionSinSetValorEntraEnError() {
	        Calculadora c = new Calculadora();

	        c.setValor(5);
	        c.mas();

	        // no mando setValor -> error
	        c.por();

	        assertEquals("Error", c.getResultado());
	    }

	    @Test
	    public void testErrorSeMantieneHastaBorrar() {
	        Calculadora c = new Calculadora();

	        c.setValor(10);
	        c.dividido();
	        c.setValor(0); // error

	        assertEquals("Error", c.getResultado());

	        c.borrar();

	        c.setValor(7);
	        assertEquals("7.0", c.getResultado());
	    }

	    @Test
	    public void testBorrarReiniciaTodo() {
	        Calculadora c = new Calculadora();

	        c.setValor(8);
	        c.mas();
	        c.setValor(2);

	        assertEquals("10.0", c.getResultado());

	        c.borrar();

	        c.setValor(5);
	        assertEquals("5.0", c.getResultado());
	    }
}
