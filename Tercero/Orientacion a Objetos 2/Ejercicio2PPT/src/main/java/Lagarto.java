
public class Lagarto extends Opcion {
    public Lagarto( String n) {
    	super(n);
    }
	
	public int jugar (Opcion o) {
		return o.jugarContraLagarto();
	}
	public int jugarContraTijera () {
		return -1;
	}
	public int jugarContraPapel () {
		return 1;
	}
	public int jugarContraPiedra () {
		return 1;
	}
	public int jugarContraLagarto () {
		return 0;
	}
	public int jugarContraSpock() {
		return 1;
	}
}
