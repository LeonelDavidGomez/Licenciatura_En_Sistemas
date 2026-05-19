
public class PermisosDecorator extends ArchivoDecorator{

	public PermisosDecorator(Componente componente) {
		super(componente);
	}
	public String prettyPrint() {
		return this.componente.prettyPrint() + "-" + this.componente.getPermisos();
	}
}
