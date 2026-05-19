
public class FechaModificacionDecorator extends ArchivoDecorator{

	public FechaModificacionDecorator(Componente componente) {
		super(componente);
	}
	public String prettyPrint() {
		return this.componente.prettyPrint() + "-" + this.componente.getFechaModificacion();
	}
	
	
}
