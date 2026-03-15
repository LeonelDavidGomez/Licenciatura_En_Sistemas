

public class Spock extends Opcion {
    public Spock( String n) {
    	super(n);
    }
	
	public int jugar (Opcion o) {
		return o.jugarContraSpock();
	}
	public int jugarContraTijera () {
		return 1;
	}
	public int jugarContraPapel () {
		return -1;
	}
	public int jugarContraPiedra () {
		return 1;
	}
	public int jugarContraLagarto () {
		return -1;
	}
	public int jugarContraSpock() {
		return 0;
	}
}

	


