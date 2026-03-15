
public class Tijera extends Opcion {
     
	public Tijera(String n) {
		super(n);
	}
	public int jugar(Opcion o) {
		return o.jugarContraTijera();
	}
	
	public int jugarContraTijera() {
		return 0;
	}
	public int jugarContraPapel() {
		return 1;
		
	}
	public int jugarContraPiedra() {
		return -1;
	}
	public int jugarContraLagarto() {
		return 1;
	}
	public int jugarContraSpock() {
		return -1;
	}
}
