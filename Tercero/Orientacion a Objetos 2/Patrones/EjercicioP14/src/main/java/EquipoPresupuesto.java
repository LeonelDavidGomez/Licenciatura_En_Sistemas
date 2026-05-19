import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class EquipoPresupuesto {
	
	private String nombre;
	private String nombreP;
	private LocalDate fecha;
	private List<Componente> componentes;
	public EquipoPresupuesto() {
		this.componentes=new LinkedList<>();
	}
	public void agregarC(Componente c) {
		this.componentes.add(c);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public double costo () {
		return this.componentes.stream().mapToDouble(c->c.getConsumo()).sum();
	}
	
	public double precio() {
		double precioFinal= this.componentes.stream().mapToDouble(c->c.getPrecio()).sum();
        precioFinal=precioFinal + precioFinal*0.21;
        return precioFinal;
	}
	

}
