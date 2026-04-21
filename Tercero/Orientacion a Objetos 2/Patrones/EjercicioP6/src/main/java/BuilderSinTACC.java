
public class BuilderSinTACC extends SandwichBuilder {
	

	public  void construirPan() {
		this.s.AgregarI(new Ingrediente("Pan de chipa",150));
	};
	public void construirAderezo() {
		this.s.AgregarI(new Ingrediente("aderezo de salsa tartara",18));
	};
	public  void construirPrincipal() {
		this.s.AgregarI(new Ingrediente("principal de carne de pollo",250));
	};
	public void construirAdicional() {
		this.s.AgregarI(new Ingrediente("adicional de verduras grilladas",150));
	};
}
