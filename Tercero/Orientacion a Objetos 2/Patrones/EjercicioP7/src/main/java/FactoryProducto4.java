
public class FactoryProducto4 extends ProductoFactory{
	public ProductoCombinado crearProducto() {		
		  ProductoCombinado p=new ProductoCombinado();
		  p.agregarProducto(new CompraBonosAltoRiesgo(72));
		  p.agregarProducto(new CompraBonosAltoRiesgo(72));
		  p.agregarProducto(new CompraBonosAltoRiesgo(72));
		  return p;
	}
}
