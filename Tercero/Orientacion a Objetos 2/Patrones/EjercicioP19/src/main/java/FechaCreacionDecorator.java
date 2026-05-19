
public class FechaCreacionDecorator extends ArchivoDecorator{

	public FechaCreacionDecorator(Componente componente) {
		super(componente);
	}

	
	public String prettyPrint() {
		return this.componente.prettyPrint() + "-" + this.componente.getFechaCreacion();
	}
	
}

