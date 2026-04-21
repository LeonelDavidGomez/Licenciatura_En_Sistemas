
public class BuilderVegetariano extends SandwichBuilder{

	public  void construirPan() {
		this.s.AgregarI(new Ingrediente("pan con semillas",120));
	};
	public void construirAderezo() {
		this.s.AgregarI(new Ingrediente("sin aderezo",0));
	};
	public  void construirPrincipal() {
		this.s.AgregarI(new Ingrediente("principal de provoleta grillada",200));
	};
	public void construirAdicional() {
		this.s.AgregarI(new Ingrediente("adicional de berenjenas al escabeche",100));
	};

}
