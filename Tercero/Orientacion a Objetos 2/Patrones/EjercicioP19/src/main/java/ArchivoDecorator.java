import java.time.LocalDate;

public abstract class ArchivoDecorator implements Componente{
	
	protected Componente componente;
	
	
    public ArchivoDecorator(Componente componente) {
		this.componente = componente;
	}
	public String prettyPrint() {
		return this.componente.prettyPrint();
	}
	public String getExtension() {
		return this.componente.getExtension();
	}

	public int getTamanio() {
		return this.componente.getTamanio();
	}

	public LocalDate getFechaCreacion() {
		return this.componente.getFechaCreacion();
	}

	public LocalDate getFechaModificacion() {
		return this.componente.getFechaModificacion();
	}
	
	public String getPermisos() {
		return this.componente.getPermisos();
	}
}
