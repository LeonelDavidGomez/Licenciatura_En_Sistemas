import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTemporarioTest {


	private Empleado empCasadoSinHijos;
	private Empleado empCasadoConHijos;
	private Empleado empSolteroSinHijos;
	private Empleado empSolteroConHijos;

	@BeforeEach
	public void setUp() {
		empCasadoSinHijos = new EmpleadoTemporario(1, true, 0);
		empCasadoConHijos = new EmpleadoTemporario(1, true, 1);
		empSolteroSinHijos = new EmpleadoTemporario(1, false,0);
		empSolteroConHijos = new EmpleadoTemporario(1, false,1);
	}

	@Test
	public void testSueldoBasico() {
		assertEquals(20300, empCasadoSinHijos.basico());
		assertEquals(20300, empCasadoConHijos.basico());
		assertEquals(20300, empSolteroSinHijos.basico());
		assertEquals(20300, empSolteroConHijos.basico());
	}
	@Test
	public void testCalcularAdicionales() {
		assertEquals(5000, empCasadoSinHijos.adicional());
		assertEquals(7000, empCasadoConHijos.adicional());
		assertEquals(0, empSolteroSinHijos.adicional());
		assertEquals(2000, empSolteroConHijos.adicional());
	}
	@Test
	public void testCalcularDescuentos() {
	    assertEquals(2889, empCasadoSinHijos.descuento());
	    assertEquals(2989, empCasadoConHijos.descuento());
	    assertEquals(2639, empSolteroSinHijos.descuento());
	    assertEquals(2739, empSolteroConHijos.descuento());
	}
	@Test
	public void sueldo() {
	    assertEquals(22411, empCasadoSinHijos.sueldo());
	    assertEquals(24311, empCasadoConHijos.sueldo());
	    assertEquals(17661, empSolteroSinHijos.sueldo());
	    assertEquals(19561, empSolteroConHijos.sueldo());
	}
}
