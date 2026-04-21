
public class BuilderVegano extends SandwichBuilder{
	
	
	
	
	public  void construirPan() {
		this.s.AgregarI(new Ingrediente("Pan de integral",100));
	};
	public void construirAderezo() {
		this.s.AgregarI(new Ingrediente("aderezo de salsa de criolla",20));
	};
	public  void construirPrincipal() {
		this.s.AgregarI(new Ingrediente("principal de milanesad de girgolas",500));
	};
	public void construirAdicional() {
		this.s.AgregarI(new Ingrediente("sin adicional",0));
	};
}

