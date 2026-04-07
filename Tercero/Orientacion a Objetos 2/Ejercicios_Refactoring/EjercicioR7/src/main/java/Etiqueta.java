
public abstract class Etiqueta {
	   protected String nombreProducto;
	    protected double precio;

	    public Etiqueta(String nombre, double precio) {
	        this.nombreProducto = nombre;
	        this.precio = precio;
	    }
	    protected abstract void imprimirEncabezado();
	    protected abstract void imprimirPrecio();

	    public void generar() {
	        this.imprimirEncabezado();
	        this.imprimirProducto();
	        this.imprimirPrecio();
	        this.imprimirPie();
	    }
	    protected void imprimirProducto() {
	        System.out.println("Producto: " + nombreProducto);
	    }

	    protected void imprimirPie() {
	        System.out.println("-----------------------");
	    }
}
