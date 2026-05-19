
public class ExtensionDecorator extends ArchivoDecorator{

	public ExtensionDecorator(Componente componente) {
		super(componente);
	}

	
	public String prettyPrint() {
		return this.componente.prettyPrint() + "-" + this.componente.getExtension();
	}
	
}
