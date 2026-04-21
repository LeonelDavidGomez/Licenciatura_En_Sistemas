
public class Pantano extends Topografia{
	
	private double agua;
	private double tierra;
	
	
	public Pantano() {
		super();
		this.agua = 0.7;
		this.tierra = 0.3;
	}

	public double proporcion () {
		return this.agua+this.tierra;
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
		return true;
	}
}
