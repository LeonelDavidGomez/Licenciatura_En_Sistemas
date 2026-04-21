
public class Tierra extends Topografia{
	
	private double agua;
	private double tierra;
	
  public Tierra() {
		super();
		this.agua = 0;
		this.tierra = 1;
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
		return otro.igualTierra();
	}
	public boolean igualAgua() {
		
	   return false;
	}
	public boolean igualTierra() {
		return true;
	}
	public boolean igualMixta(Mixta t) {
		return false;
	}
	public boolean igualPantano() {
		return false;
	}
}
