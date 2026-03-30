import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CharRingTest {

	private CharRing c;
	@BeforeEach
	void setUp()  {
		c=new CharRing("hola");
	}

	@Test
	void next() {
		assertEquals('h', c.next());
		assertEquals('o', c.next());
		assertEquals('l', c.next());
		assertEquals('a', c.next());
		assertEquals('h', c.next());
		assertEquals('o', c.next());
	}

}
