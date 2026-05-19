import java.util.LinkedList;
import java.util.List;

public class Catalogo {
private List<Componente> componentes;

public Catalogo() {
	
	this.componentes = new LinkedList<>();
}

public Componente getComponente(String descripcion) {
    return this.componentes.stream()
               .filter(c -> c.getNombre().equals(descripcion))
               .findFirst()
               .orElse(null);
}}
