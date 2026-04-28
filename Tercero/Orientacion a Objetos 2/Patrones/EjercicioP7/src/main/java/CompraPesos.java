
public class CompraPesos extends ProductoFinanciero{
private double valorCompra;

public CompraPesos(double valorCompra) {
	super();
	this.valorCompra = valorCompra;
}
public double retornoInversion (double montoInicial ) {
	return montoInicial*valorCompra;
}
}
