
public class Agua extends Topografia{

	private double agua;
	private double tierra;
	
	public Agua() {
		super();
		this.agua = 1;
		this.tierra = 0;
	}
	public double proporcionAgua () {
		return agua;
	}
	public double proporcionTierra() {
		return tierra;
	}
	public double proporcion () {
		return this.proporcionAgua()+this.proporcionTierra();
	}
	public boolean sonIguales(Topografia otro) {
		return otro.igualAgua();
	}
	public boolean igualAgua() {
		
	   return true;
	}
	public boolean igualTierra() {
		return false;
	}
	public boolean igualMixta(Mixta t) {
		return false;
	}
	public boolean igualPantano () {
		return false;
	}
}
