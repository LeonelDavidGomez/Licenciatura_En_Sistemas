import java.util.Random;

public class CompraBonosBajoRiesgo extends ProductoFinanciero{
private int parking;
private Random rand;
public CompraBonosBajoRiesgo(int parking) {
	super();
	this.parking = parking;
	rand=new Random();
}
public double retornoInversion (double montoInicial ) {
	  double variacion = rand.nextDouble() * 0.10; // entre 0 y 10%
      return montoInicial * (1 + variacion);
}
}
