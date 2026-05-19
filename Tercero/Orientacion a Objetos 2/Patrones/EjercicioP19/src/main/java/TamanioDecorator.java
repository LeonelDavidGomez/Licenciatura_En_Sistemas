
public class TamanioDecorator extends ArchivoDecorator{

	public TamanioDecorator(Componente componente) {
		super(componente);
	}
	
	public String prettyPrint() {
		return this.componente.prettyPrint() + "-" + this.componente.getTamanio();
	}
}
