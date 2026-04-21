
public class BuilderClasico extends SandwichBuilder{
	

	public  void construirPan() {
		this.s.AgregarI(new Ingrediente("Pan de brioche",100));
	};
	public void construirAderezo() {
		this.s.AgregarI(new Ingrediente("aderezo a base de mayonesa",20));
	};
	public  void construirPrincipal() {
		this.s.AgregarI(new Ingrediente("principal de carne de ternera",300));
	};
	public void construirAdicional() {
		this.s.AgregarI(new Ingrediente("adicional de tomate",80));
	};
}

