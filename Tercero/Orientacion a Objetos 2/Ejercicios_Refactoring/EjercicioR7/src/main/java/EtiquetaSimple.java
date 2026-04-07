
public class EtiquetaSimple extends Etiqueta {
	public EtiquetaSimple(String nombre, double precio) {
        super(nombre, precio);
    }

	   public void imprimirEncabezado() {
	        System.out.println("--- ETIQUETA BÁSICA ---");
	    }

	    public void imprimirPrecio() {
	        System.out.println("Precio: $" + precio);
	    }
}
