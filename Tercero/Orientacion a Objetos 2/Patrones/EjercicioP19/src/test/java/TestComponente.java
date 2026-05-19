import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestComponente {

	 private Componente archivo;

	    @BeforeEach
	    public void setUp() {

	        archivo = new FileOO2(
	                "foto",
	                "jpg",
	                200,
	                LocalDate.of(2024, 5, 10),
	                LocalDate.of(2024, 6, 1),
	                "rw-r--r--"
	        );
	    }

	    @Test
	    public void testNombreYExtension() {

	        Componente config =
	                new ExtensionDecorator(archivo);

	        assertEquals(
	                "foto-jpg",
	                config.prettyPrint()
	        );
	    }

	    @Test
	    public void testNombreFechaCreacionYExtension() {

	        Componente config =
	                new ExtensionDecorator(
	                        new FechaCreacionDecorator(
	                                archivo
	                        )
	                );

	        assertEquals(
	                "foto-2024-05-10-jpg",
	                config.prettyPrint()
	        );
	    }

	    @Test
	    public void testNombreTamanioPermisosYExtension() {

	        Componente config =
	                new ExtensionDecorator(
	                        new PermisosDecorator(
	                                new TamanioDecorator(
	                                        archivo
	                                )
	                        )
	                );

	        assertEquals(
	                "foto-200-rw-r--r---jpg",
	                config.prettyPrint()
	        );
	    }

}
