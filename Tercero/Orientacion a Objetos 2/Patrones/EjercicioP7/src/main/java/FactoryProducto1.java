
public class FactoryProducto1 extends ProductoFactory {
	public ProductoCombinado crearProducto() {		
	  ProductoCombinado p=new ProductoCombinado();
	  p.agregarProducto(new CompraDolares(1.1));
	  p.agregarProducto(new PlazoFijo(15,0.05));
	  p.agregarProducto(new CompraPesos(1.0));
	  return p;
	}
}
