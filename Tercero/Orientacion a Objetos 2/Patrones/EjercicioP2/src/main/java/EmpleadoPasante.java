
public class EmpleadoPasante extends Empleado{

	private int cantExamen;
	public EmpleadoPasante (int c ) {
		this.cantExamen=c;
	}
	
	public double basico() {
		return 20000;
	}
	public double adicional() {
		return this.cantExamen*2000;
	}
}
