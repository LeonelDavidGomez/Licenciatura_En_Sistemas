package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

public class BibliotecaTest {
	// Para completar
	 Biblioteca biblioteca;
	  @BeforeEach
	    void setUp() {
	        biblioteca = new Biblioteca();
	  
	    }
	  
	  
	   void testAgregarSocio() {
	        Socio socio = new Socio("Juan Perez", "juan@mail.com", "123");
	        biblioteca.agregarSocio(socio);
	        assertEquals(1, biblioteca.cantElementos());       
	      
	      
	    }

}
