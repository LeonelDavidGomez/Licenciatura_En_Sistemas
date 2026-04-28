
public class PlazoFijo extends ProductoFinanciero{
private int cantidadDias;
private double interes;
public PlazoFijo(int cantidadDias, double interes) {
	super();
	this.cantidadDias = cantidadDias;
	this.interes = interes;
}
public  double retornoInversion (double montoInicial ) {
  return montoInicial * (1+this.interes*this.cantidadDias/365);
}
}
