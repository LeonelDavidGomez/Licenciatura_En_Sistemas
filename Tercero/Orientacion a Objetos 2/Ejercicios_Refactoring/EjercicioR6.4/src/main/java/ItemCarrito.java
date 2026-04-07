
public class ItemCarrito {
	private Producto producto;
    private int cantidad;
        
    public Producto getProducto() {
        return this.producto;
    }
    
    public int getCantidad() {
        return this.cantidad;
    }

    public double getPrecioTotal() {
        return producto.getPrecio()*getCantidad();
    }
}
