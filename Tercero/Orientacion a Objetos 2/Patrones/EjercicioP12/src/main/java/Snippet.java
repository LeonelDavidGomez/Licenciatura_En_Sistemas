import java.time.LocalDate;

public class Snippet {
	 public static void main(String[] args) {

	        // Crear auto con política FLEXIBLE
	        AutoEnAlquiler auto = new AutoEnAlquiler(
	                100, 
	                4, 
	                "Toyota", 
	                new Flexible()
	        );

	        // Crear reserva
	        Reserva reserva = new Reserva(
	                5,
	                new Usuario("Juan"),
	                LocalDate.of(2026, 5, 10),
	                auto
	        );

	        LocalDate cancelacion = LocalDate.of(2026, 5, 1);

	        // Reembolso con política flexible
	        System.out.println("Flexible: " +
	                auto.montoAReembolsar(
	                        LocalDate.of(2026, 5, 10),
	                        cancelacion,
	                        reserva.montoApagar()
	                )
	        );

	        // Cambiar política a MODERADA
	        auto.setPolitica(new Moderada());

	        // Reembolso con política moderada
	        System.out.println("Moderada: " +
	                auto.montoAReembolsar(
	                        LocalDate.of(2026, 5, 10),
	                        cancelacion,
	                        reserva.montoApagar()
	                )
	        );
	    }
}
