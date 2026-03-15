
public class Papel extends Opcion {

	public Papel(String n) {
		super(n);
	}
	public int jugar(Opcion o) {
		return o.jugarContraPapel();
	}
	
	public int jugarContraTijera() {
		
		return -1;
	}
	public int jugarContraPapel() {
		return 0;
		
	}
	public int jugarContraPiedra() {
		return 1;
	}
	public int jugarContraLagarto() {
		return 2;
	}
	public int jugarContraSpock() {
		return -1;
	}
	
}
