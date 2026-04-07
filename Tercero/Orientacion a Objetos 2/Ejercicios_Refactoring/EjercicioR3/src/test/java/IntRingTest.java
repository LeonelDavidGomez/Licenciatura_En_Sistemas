import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IntRingTest {

	private IntRing c;
	private Integer [] vector;
	@BeforeEach
	void setUp()  {
		Integer[] v = {1, 2, 3, 4};
		c=new IntRing (v);
	}

	@Test
	void test() {
		assertEquals(1, c.next());
		assertEquals(2, c.next());
		assertEquals(3, c.next());
		assertEquals(4, c.next());
		assertEquals(1, c.next());
		assertEquals(2, c.next());
	}

}
