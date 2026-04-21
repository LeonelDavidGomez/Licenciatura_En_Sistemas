import java.util.List;

public class Sandwich {

	private List<Ingrediente> ingredientes;
	public void AgregarI(Ingrediente i) {
		ingredientes.add(i);
	}
	public double calcularPrecio() {
		return ingredientes.stream().mapToDouble(i->i.getPrecio()).sum();
		
	}
}
