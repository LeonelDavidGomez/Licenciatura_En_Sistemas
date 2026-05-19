import java.time.LocalDate;

public class FileOO2 implements Componente{
	private String nombre;
	private String extension;
	private int tamanio;
	private LocalDate fechaCreacion;
	private LocalDate fechaModificacion;
	private String permisos;
	
	public FileOO2(String nombre, String extension, int tamanio, LocalDate fechaCreacion, LocalDate fechaModificacion,
			String permisos) {
		this.nombre = nombre;
		this.extension = extension;
		this.tamanio = tamanio;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.permisos = permisos;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String prettyPrint() {
		return this.nombre;
	}
	public String getExtension() {
		return extension;
	}

	public int getTamanio() {
		return tamanio;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public LocalDate getFechaModificacion() {
		return fechaModificacion;
	}
	
	public String getPermisos() {
		return permisos;
	}

	
	

}
