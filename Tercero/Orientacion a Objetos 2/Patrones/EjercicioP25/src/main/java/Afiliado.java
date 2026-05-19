import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Afiliado {
	private String nombre;
	private int familiaresACargo;
	private double salario;
	private LocalDate fechaNacimiento;
	private Plan planActual;
	private List<Plan> previos;
	private Coseguro coseguro;
	public Afiliado(String nombre, int familiaresACargo, double salario, LocalDate fechaNacimiento, Plan planActual,
			List<Plan> previos) {
		this.nombre = nombre;
		this.familiaresACargo = familiaresACargo;
		this.salario = salario;
		this.fechaNacimiento = fechaNacimiento;
		this.planActual = planActual;
		this.previos = previos;
		this.coseguro=null;
	}
	public Afiliado(String nombre, int familiaresACargo, double salario, LocalDate fechaNacimiento, Plan planActual,
			List<Plan> previos,Coseguro c) {
		this.nombre = nombre;
		this.familiaresACargo = familiaresACargo;
		this.salario = salario;
		this.fechaNacimiento = fechaNacimiento;
		this.planActual = planActual;
		this.previos = previos;
		this.coseguro=c;
	}
	public Plan getPlanActual() {
		return planActual;
	}
	public void setPlanActual(Plan planActual) {
		this.planActual = planActual;
	}
	public Coseguro getCoseguro() {
		return coseguro;
	}
	public void setCoseguro(Coseguro coseguro) {
		this.coseguro = coseguro;
	}
	public String getNombre() {
		return nombre;
	}
	public int getFamiliaresACargo() {
		return familiaresACargo;
	}
	public double getSalario() {
		return salario;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public List<Plan> getPrevios() {
		return previos;
	}
	public double getCoseguroDescuento() {
		return this.coseguro.getDescuento();
		
	}
	
	
	public double getCoseguroCobertura() {
		return this.coseguro.getMontoCoberturaViajes();
		
	}
	public int aniosAntiguedad() {
		int antiguedad = (int) ChronoUnit.YEARS.between(coseguro.getFechaIngreso(), LocalDate.now());
	    return antiguedad;
	}
	
	
	
	
	

}
