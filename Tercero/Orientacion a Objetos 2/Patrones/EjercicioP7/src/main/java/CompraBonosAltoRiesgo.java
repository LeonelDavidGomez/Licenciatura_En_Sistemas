import java.util.Random;

public class CompraBonosAltoRiesgo extends ProductoFinanciero{
private int parking;
private Random rand ;

public CompraBonosAltoRiesgo(int parking) {
	super();
	this.parking = parking;
	rand=new Random();
}

public double retornoInversion (double montoInicial ) {
	double variacion = rand.nextDouble() * 0.70;
	return montoInicial * (1 + variacion);
}
}
