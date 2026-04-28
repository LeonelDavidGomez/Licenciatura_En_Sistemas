
public class CompraDolares extends ProductoFinanciero{
private double valorCompra;

public CompraDolares(double valorCompra) {
	super();
	this.valorCompra = valorCompra;
}
public double retornoInversion (double montoInicial ) {
	return valorCompra*montoInicial;
}

}

