
public abstract class Empleado {
	public abstract double basico();
	public abstract double adicional();
	public double descuento() {
		return this.basico() * 0.13 + this.adicional() * 0.05;
	}
	public double sueldo () {
		
	   return this.basico()+this.adicional()-this.descuento();
		
	}
}
