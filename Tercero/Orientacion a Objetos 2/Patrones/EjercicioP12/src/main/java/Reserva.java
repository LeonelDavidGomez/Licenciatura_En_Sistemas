import java.time.LocalDate;

public class Reserva {
	private int cantidadDias;
	private LocalDate fecha;
	private Usuario conductor;
	private AutoEnAlquiler auto;
	public Reserva(int cantidadDias,Usuario conductor, LocalDate fecha,AutoEnAlquiler a) {
		this.cantidadDias = cantidadDias;
		this.fecha = fecha;
		this.auto=a;
		this.conductor=conductor;
	}
	public double montoApagar () {
		return this.cantidadDias*this.auto.getPrecioPorDia();
	}
	private double montoAReembolsar(LocalDate f) {
		return auto.montoAReembolsar(fecha,f,this.montoApagar());
		
	}

}
