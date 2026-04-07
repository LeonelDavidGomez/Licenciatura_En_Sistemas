import java.time.LocalDate;
import java.time.Period;
import java.util.List;
public class Pedido {
    private Cliente cliente;
    private List<Producto> productos;
    private FormaPago formaPago;
    public Pedido(Cliente cliente, List<Producto> productos, FormaPago formaPago) {
        if (!"efectivo".equals(formaPago)
            && !"6 cuotas".equals(formaPago)
            && !"12 cuotas".equals(formaPago)) {
            throw new Error("Forma de pago incorrecta");
        }
        this.cliente = cliente;
        this.productos = productos;
        this.formaPago = formaPago;
    }
    public double getCostoTotal() {
      
        double costoProductos=this.productos.stream().mapToDouble(p->p.getPrecio()).sum();
        double extraFormaPago =formaPago.costoF(costoProductos);
        int añosDesdeFechaAlta =cliente.getAnioDesdeFechaAlta();         
        // Aplicar descuento del 10% si el cliente tiene más de 5 años de antigüedad
        if (tieneMasDe5Anios()) {
            return (costoProductos + extraFormaPago) * 0.9;
        }
           return costoProductos + extraFormaPago;
    }
    public boolean tieneMasDe5Anios() {
    	if(cliente.getAnioDesdeFechaAlta()>5) {
    		return true;
    	}else {
    		return false;
    	}
    	
    }
 
}
