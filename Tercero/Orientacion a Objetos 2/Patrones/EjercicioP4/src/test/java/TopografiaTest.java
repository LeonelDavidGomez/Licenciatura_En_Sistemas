import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TopografiaTest {

    Topografia a1;
    Topografia a2;
    Topografia t1;
    Topografia t2;
    Topografia p1;
    Topografia p2;
	Mixta m1;
	Mixta m2;
	Mixta m3;
	@BeforeEach
	void setUp() {
		 // Agua iguales
	    a1 = new Agua();
	    a2 = new Agua();
	    t1 = new Tierra();
	    t2 = new Tierra();
	    m1 = new Mixta();
	    m1.add(new Agua());
	    m1.add(new Tierra());
	    m1.add(new Tierra());
	    m1.add(new Agua());
	    m2 = new Mixta();
	    m2.add(new Agua());
	    m2.add(new Tierra());
	    m2.add(new Tierra());
	    m2.add(new Agua());
	    m3 = new Mixta();
	    m3.add(new Tierra());
	    m3.add(new Agua());
	    m3.add(new Agua());
	    m3.add(new Tierra());
	    p1=new Pantano();
	    p2=new Pantano();
	}
	
	@Test
	void testIgualdad() {
		
		assertTrue(a1.sonIguales(a2));
		assertTrue(t1.sonIguales(t2));
		assertTrue(p1.sonIguales(p2));
		assertTrue(m1.sonIguales(m2));
		assertFalse(m1.sonIguales(m3));
		assertFalse(m1.sonIguales(a1));
		

		
	}
}
