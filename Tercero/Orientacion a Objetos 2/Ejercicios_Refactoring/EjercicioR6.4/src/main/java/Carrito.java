import java.util.List;

public class Carrito {
private List<ItemCarrito> items;
    
    public double getPrecioTotal() {
        return this.items.stream()
            .mapToDouble(item -> 
                item.getPrecioTotal())
            .sum();
    }
}
