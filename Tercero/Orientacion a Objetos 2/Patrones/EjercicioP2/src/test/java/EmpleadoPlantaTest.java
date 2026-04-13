import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoPlantaTest {
	private Empleado empCasadoSinHijos;
    private Empleado empCasadoConHijos;
    private Empleado empSolteroSinHijos;
    private Empleado empSolteroConHijos;
	@BeforeEach
	void setUp()  {
		empCasadoSinHijos = new EmpleadoPlanta(true, 0, 1); 
        empCasadoConHijos = new EmpleadoPlanta(true, 1, 1);  
        empSolteroSinHijos = new EmpleadoPlanta(false, 0, 1);
        empSolteroConHijos = new EmpleadoPlanta(false, 1, 1);
		
	}

	@Test
	public void testSueldoBasico() {
        assertEquals(50000, empCasadoSinHijos.basico());
        assertEquals(50000, empCasadoConHijos.basico());
        assertEquals(50000, empSolteroSinHijos.basico());
        assertEquals(50000, empSolteroConHijos.basico());
    }
	@Test
	public void testCalcularAdicionales() {
        assertEquals(7000, empCasadoSinHijos.adicional()); 
        assertEquals(9000, empCasadoConHijos.adicional());
        assertEquals(2000, empSolteroSinHijos.adicional());
        assertEquals(4000, empSolteroConHijos.adicional());
    }
	@Test
	public void testCalcularDescuentos() {
        assertEquals(6850, empCasadoSinHijos.descuento()); 
        assertEquals(6950, empCasadoConHijos.descuento());  
        assertEquals(6600, empSolteroSinHijos.descuento());
        assertEquals(6700, empSolteroConHijos.descuento()); 
    }
	@Test
    public void testSueldo() {
        assertEquals(50150, empCasadoSinHijos.sueldo());  
        assertEquals(52050, empCasadoConHijos.sueldo());  
        assertEquals(45400, empSolteroSinHijos.sueldo()); 
        assertEquals(47300, empSolteroConHijos.sueldo());
    }
}
