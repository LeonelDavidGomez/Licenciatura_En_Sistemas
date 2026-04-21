
public class SandwichScript {
	public static void main(String[] args) {
	DirectorSandwich di=new DirectorSandwich();
	Sandwich clasico=di.construirSandwich();
	System.out.println("Sandwich clasico" + clasico.calcularPrecio());
	di.setBuilder(new BuilderVegano());
	Sandwich vegano=di.construirSandwich();
	System.out.println("Sandwich vegano" + vegano.calcularPrecio());
	di.setBuilder(new BuilderSinTACC());
	Sandwich sinTacc=di.construirSandwich();
	System.out.println("Sandwich sinTacc" + sinTacc.calcularPrecio());
	Sandwich vegetariano=di.construirSandwich();
	System.out.println("Sandwich vegetariano" + vegetariano.calcularPrecio());
	
	}
	
	
	
	
	
}
