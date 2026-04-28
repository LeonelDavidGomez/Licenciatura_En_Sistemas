import java.time.LocalDate;
import java.util.List;

public abstract class Elemento {

	protected String nombre;
	protected LocalDate fechaC;
	public Elemento(String nombre, LocalDate fechaC) {
		this.nombre = nombre;
		this.fechaC = fechaC;
	}
	public abstract int tamano () ;
	public abstract Archivo archivoMasGrande();
	public abstract Archivo archivoMasNuevo();
	public abstract Elemento buscar (String n);
	public abstract void buscarTodos(String n,List<Elemento> res);
	public abstract String listadoDeContenido (String n) ;
	public LocalDate getFechaC() {
		return fechaC;
	}
	public String getNombre() {return this.getNombre();}

}
