
public class EmpleadoPlanta extends Empleado{
	
	private boolean casado;
	private int cantidadHijos;
	private int antiguedad;
	public EmpleadoPlanta (boolean c,int ch,int a) {
		this.casado=c;
		this.cantidadHijos=ch;
		this.antiguedad=a;
		
	}
	public double basico () {
		return 50000;
	}
	public double adicional () {
		double costo=0;
		if(this.casado) {
			costo=5000;
		}
		costo=costo+this.cantidadHijos*2000 +this.antiguedad*2000;
		return costo;
	}

}
