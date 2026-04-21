
public class DirectorSandwich {
	
	private SandwichBuilder sandB;

	public DirectorSandwich() {
		this.sandB =new BuilderClasico();
	}
	public Sandwich construirSandwich () {
	  sandB.construirPan();
	  sandB.construirAderezo();
	  sandB.construirPrincipal();
	  sandB.construirAdicional();
	  Sandwich s=sandB.getSandwich();
	  sandB.reset();
	  return s;
	}
	public void setBuilder(SandwichBuilder b) {
		this.sandB=b;
	}

}
