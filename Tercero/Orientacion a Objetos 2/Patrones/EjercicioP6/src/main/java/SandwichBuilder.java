
public abstract class SandwichBuilder {
    protected Sandwich s;

	public void reset() {
		s=new Sandwich();
	}
	public Sandwich getSandwich () {
		return s;
	}
	public abstract void construirPan();
	public abstract void construirAderezo();
	public abstract void construirPrincipal();
	public abstract void construirAdicional();
	
	
}
