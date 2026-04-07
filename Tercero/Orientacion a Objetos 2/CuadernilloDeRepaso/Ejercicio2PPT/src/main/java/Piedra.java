
public class Piedra extends Opcion {
	
	public Piedra(String n) {
		super(n);
	}
	
	public int jugar(Opcion o) {
		return o.jugarContraPiedra();
	}
	
	public int jugarContraTijera() {
		
		return 1;
	}
	public int jugarContraPapel() {
		return -1;
		
	}
	public int jugarContraPiedra() {
		return 0;
	}
	public int jugarContraLagarto() {
		return 1;
	}
	public int jugarContraSpock() {
		return -1;
	}

}
