
public class FactoryProducto2 extends ProductoFactory{
	public ProductoCombinado crearProducto() {		
		  ProductoCombinado p=new ProductoCombinado();
		  p.agregarProducto(new CompraBonosAltoRiesgo(72));
		  p.agregarProducto(new CompraDolares(1.1));
		  p.agregarProducto(new PlazoFijo(35,0.05));
		  p.agregarProducto(new CompraPesos(1.0));
		  return p;
		  
	}
}
