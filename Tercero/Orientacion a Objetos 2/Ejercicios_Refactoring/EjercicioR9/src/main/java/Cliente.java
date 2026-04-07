import java.time.LocalDate;
import java.time.Period;

public class Cliente {
	 private LocalDate fechaAlta;
	     public LocalDate getFechaAlta() {
	      return this.fechaAlta;
	    }
	     public int getAnioDesdeFechaAlta() {
	     	return  Period.between(this.getFechaAlta(), LocalDate.now()).getYears();
	     }}

