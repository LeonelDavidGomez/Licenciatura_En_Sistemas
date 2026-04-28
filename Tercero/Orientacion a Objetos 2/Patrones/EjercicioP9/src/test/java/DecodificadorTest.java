import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DecodificadorTest {
    private Decodificador d;
    private List<Pelicula> peliculasG;
    private List<Pelicula> peliculasR;
	@BeforeEach
	void setUp() {
		    peliculasG = new LinkedList<>();
		    peliculasR = new LinkedList<>();

		    Pelicula thor = new Pelicula("Thor", 2007, 7.9);
		    Pelicula capitan = new Pelicula("Capitan America", 2016, 7.8);
		    Pelicula iron = new Pelicula("Iron Man", 2010, 9.9);
		    Pelicula dunkirk = new Pelicula("Dunkirk", 2017, 7.9);
		    Pelicula rocky = new Pelicula("Rocky", 1976, 8.1);
		    Pelicula rambo = new Pelicula("Rambo", 1979, 7.8);

		    // similares (recíproco)
		    thor.agregarSimilar(capitan);
		    thor.agregarSimilar(iron);

		    capitan.agregarSimilar(thor);
		    capitan.agregarSimilar(iron);

		    iron.agregarSimilar(thor);
		    iron.agregarSimilar(capitan);

		    rocky.agregarSimilar(rambo);
		    rambo.agregarSimilar(rocky);

		    peliculasG.add(thor);
		    peliculasG.add(capitan);
		    peliculasG.add(iron);
		    peliculasG.add(dunkirk);
		    peliculasG.add(rocky);
		    peliculasG.add(rambo);

		    peliculasR.add(thor);
		    peliculasR.add(rocky);

		    d = new Decodificador(peliculasG, peliculasR);
	}

	@Test
	void testCambioDeEstrategia() {

		    // (ii) Similaridad
		    d.setConfiguracion(new Similaridad());
		    List<Pelicula> s1 = d.sugerir();

		    System.out.println("Similaridad:");
		    s1.forEach(p -> System.out.println(p.getTitulo()));

		    assertNotNull(s1);
		    assertTrue(s1.size() <= 3);

		    // (iii) Puntaje
		    d.setConfiguracion(new Puntaje());
		    List<Pelicula> s2 = d.sugerir();

		    System.out.println("\nPuntaje:");
		    s2.forEach(p -> System.out.println(p.getTitulo()));

		    assertNotNull(s2);
		    assertTrue(s2.size() <= 3);
	
	}

}
