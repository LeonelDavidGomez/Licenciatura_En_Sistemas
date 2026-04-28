import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Moderada implements Politica{
	public double montoAReembolsar (LocalDate fecha,LocalDate f,double m) {
		if(!f.isBefore(fecha)) {
			throw new RuntimeException("Cancelación inválida");
		}else {
			long diasAntes=  ChronoUnit.DAYS.between(f, fecha);
			if(diasAntes>=7) {
				return m;
			}else if (diasAntes>=2){
				return m*0.50;
			}else {
				return 0;
			}
			
			
		}
	}
}
