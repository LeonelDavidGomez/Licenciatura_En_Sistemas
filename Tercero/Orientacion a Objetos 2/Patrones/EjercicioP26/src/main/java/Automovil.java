import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Automovil extends Bien{
	
	private int modelo;
	private double kilometraje;
	private double costo0km;
	public Automovil(int modelo, double kilometraje, double costo0km) {
		super(0.7);
		this.modelo = modelo;
		this.kilometraje = kilometraje;
		this.costo0km = costo0km;
	}
	public double calcularValor () {
		int antiguedad=LocalDate.now().getYear()-modelo;
		double depreciacion=antiguedad*0.10;
		return this.costo0km*(1-depreciacion);
	}

	
}
