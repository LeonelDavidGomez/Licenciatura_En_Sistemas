import java.util.LinkedList;
import java.util.List;

public class Usuario {
private String nombre;          
private List<AutoEnAlquiler> alquileres;
public Usuario(String nombre) {  
	this.nombre = nombre;
	this.alquileres=new LinkedList<>();
	
}
public void agregarAlquiler(AutoEnAlquiler a ) {
	this.alquileres.add(a);
}

}
