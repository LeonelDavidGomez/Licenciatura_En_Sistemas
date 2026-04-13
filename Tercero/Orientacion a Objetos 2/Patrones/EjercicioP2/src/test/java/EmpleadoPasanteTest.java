import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoPasanteTest {
	private Empleado empSinExamenes;
    private Empleado empConUnExamen;
    private Empleado empConDosExamenes;
	@BeforeEach
	void setUp() {
		
		empSinExamenes = new EmpleadoPasante (0);   
        empConUnExamen = new EmpleadoPasante(1);   
        empConDosExamenes = new EmpleadoPasante(2);
	}


	@Test
    public void testSueldoBasico() {
        assertEquals(20000, empSinExamenes.basico());
        assertEquals(20000, empConUnExamen.basico());
        assertEquals(20000, empConDosExamenes.basico());
    }	@Test
	public void testCalcularAdicionales() {
        assertEquals(0, empSinExamenes.adicional());   
        assertEquals(2000, empConUnExamen.adicional());
        assertEquals(4000, empConDosExamenes.adicional()); 
    }
	@Test
    public void testCalcularDescuentos() {
        assertEquals(2600, empSinExamenes.descuento());   
        assertEquals(2700, empConUnExamen.descuento());  
        assertEquals(2800, empConDosExamenes.descuento());
    }
	@Test
    public void testSueldo() {
        assertEquals(17400, empSinExamenes.sueldo());   
        assertEquals(19300, empConUnExamen.sueldo());    
        assertEquals(21200, empConDosExamenes.sueldo()); 
    }
}
