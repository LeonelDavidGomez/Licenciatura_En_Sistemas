import java.time.LocalDate;

public class Flexible implements Politica{
	public double montoAReembolsar (LocalDate fecha,LocalDate f,double m) {
		if(!f.isBefore(fecha)) {
			throw new RuntimeException("Cancelación inválida");
		}else {
			return m;
		}
	}
}
