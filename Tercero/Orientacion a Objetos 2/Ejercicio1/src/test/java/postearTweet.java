import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class postearTweet {
    private Usuario u;
	@BeforeEach
	void setUp() {
		u=new Usuario(new String("Pedro"));
		u.postearTweet(new String("Hola mundo"));
	}

	@Test 
	void agregarTweet () {
		assertEquals("Hola mundo",
			    ((Normal) u.leerMensajes().stream()
			        .filter(t -> t instanceof Normal)
			        .findFirst()
			        .get()).getTexto()
			);
	}

}
