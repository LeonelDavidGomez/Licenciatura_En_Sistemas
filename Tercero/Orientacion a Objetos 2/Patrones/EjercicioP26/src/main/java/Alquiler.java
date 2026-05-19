import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler extends Bien{
private LocalDate fechaComienzoContrato;
private LocalDate fechaFinContrato;
public double costoMensual;
public Alquiler(LocalDate fechaComienzoContrato, LocalDate fechaFinContrato, double costoMensual) {
	super(0.9);
	this.fechaComienzoContrato = fechaComienzoContrato;
	this.fechaFinContrato = fechaFinContrato;
	this.costoMensual = costoMensual;
}
public double calcularValor () {
     long cantMeses =  ChronoUnit.MONTHS.between(LocalDate.now(), fechaFinContrato);
	 return  (cantMeses*costoMensual);
}

}
