import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion {
	private String nombre;
	private double costo;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String puntoEncuentro;
	private int cupoMaximo;
	private int cupoMinimo;
	private Estado estado;
	private List<Usuario> usuarios;
	private List<Usuario> espera;
	public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin,
            String puntoEncuentro, double costo, int cupoMinimo, int cupoMaximo) {
		this.nombre= nombre;
		this.fechaInicio= fechaInicio;
		this.fechaFin= fechaFin;
		this.puntoEncuentro=puntoEncuentro;
		this.costo=costo;
		this.cupoMinimo=cupoMinimo;
		this.cupoMaximo=cupoMaximo;
		this.usuarios=new ArrayList<>();
		this.espera=new ArrayList<>();
		this.estado=new Provisorio();
}
	public void agregarUsuario (Usuario u) {
		estado.agregarUsuario(this,u);
	}
	public int cantidadUsuariosInscriptos( ) {
		return this.usuarios.size();
	}
	public String obtenerInformacion  () {
		return estado.obtenerInformacion (this);
	}
	public String getNombre() {
		return nombre;
	}
	public String fechas () {
		
		return "Fecha inicio " + this.fechaInicio + " Fecha fin " + this.fechaFin;
		
	}
	public double getCosto() {return this.costo;}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public LocalDate getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
	public String getPuntoEncuentro() {
		return puntoEncuentro;
	}
	public void setPuntoEncuentro(String puntoEncuentro) {
		this.puntoEncuentro = puntoEncuentro;
	}
	public int getCupoMaximo() {
		return cupoMaximo;
	}
	public void setCupoMaximo(int cupoMaximo) {
		this.cupoMaximo = cupoMaximo;
	}
	public int getCupoMinimo() {
		return cupoMinimo;
	}
	public void setCupoMinimo(int cupoMinimo) {
		this.cupoMinimo = cupoMinimo;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public List<Usuario> getUsuariosInscriptos() {
		return usuarios;
	}
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}public void agregarUsuarioEspera(Usuario u) {
		this.espera.add(u);
	}
	public List<Usuario> getUsuariosEspera() {
		return espera;
	}
	
	
	

}
