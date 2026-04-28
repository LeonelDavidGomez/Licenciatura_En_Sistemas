
public class FactoryProducto3 extends ProductoFactory{
	public ProductoCombinado crearProducto() {		
		  ProductoCombinado p=new ProductoCombinado();
		  p.agregarProducto(new CompraBonosAltoRiesgo(72));
		  p.agregarProducto(new CompraBonosBajoRiesgo(72));
		  p.agregarProducto(new PlazoFijo(30,0.06));
		  return p;
	}
	
}
