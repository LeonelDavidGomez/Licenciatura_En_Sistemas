import java.util.LinkedList;
import java.util.List;

public class ProductoCombinado {
private List<ProductoFinanciero> productos;

public ProductoCombinado() {
	super();
	this.productos = new LinkedList<>();
}
public void agregarProducto(ProductoFinanciero p) {
	this.productos.add(p);	
}
}
