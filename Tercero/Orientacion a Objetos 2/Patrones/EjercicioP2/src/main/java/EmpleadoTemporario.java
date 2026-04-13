
public class EmpleadoTemporario extends Empleado{

	private int cantHoras;
	private boolean casado;
	private int cantidadHijos;
	public EmpleadoTemporario (int c,boolean ca,int ch) {
		 super();
		 cantHoras=c;
		 casado=ca;
		 cantidadHijos=ch;
	}
	
	public double basico() {
	
		 return 20000+this.cantHoras*300;
		
	}
	public double adicional() {
		double costo=0;
		if(this.casado) 
			costo=5000;
		costo=costo+this.cantidadHijos*2000;
		return costo;
	}
}
