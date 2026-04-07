import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pelicula {
	private LocalDate fechaEstreno;
	private double costo;
    // ...

    public double getCosto() {
   	 return this.costo;
    }
    
    public double calcularCostoConCargoExtra() {
        return this.getCosto() + this.calcularCargoExtraPorEstreno();
    }

    public double calcularCargoExtraPorEstreno(){
   	    return (ChronoUnit.DAYS.between(this.fechaEstreno, LocalDate.now()) ) > 30 ? 0 : 300;
    }
}
