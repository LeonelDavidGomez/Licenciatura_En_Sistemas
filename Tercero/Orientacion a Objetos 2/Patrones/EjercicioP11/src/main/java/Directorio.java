import java.time.LocalDate;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Directorio extends Elemento{
private List<Elemento> elementos;

public Directorio (String n,LocalDate f) {
	super(n,f);
	this.elementos=new LinkedList<>();
}
public int tamano () {
	return elementos.stream().mapToInt(Elemento::tamano).sum()+32*1024;
}
public Archivo archivoMasGrande () {
	return elementos.stream()
			         .map(Elemento::archivoMasGrande)
			         .filter(a->a!=null)
			         .max(Comparator.comparingInt(Archivo::tamano))
			         .orElse(null);
}
public Archivo archivoMasNuevo () {
	
	return elementos.stream()
			        .map(Elemento::archivoMasNuevo)
			        .filter(a->a!=null)
			        .max(Comparator.comparing(Archivo::getFechaC))
			        .orElse(null);
}
public Elemento buscar (String nombre) {
	if (this.nombre.equals(nombre)) {
		return this;
	}
	return elementos.stream()
	        .map(e -> e.buscar(nombre)) 
	        .filter(e -> e != null)
	        .findFirst()
	        .orElse(null);
	
}

public void buscarTodos(String n,List<Elemento> res) {

	if (this.nombre.equals(n)) 
		 res.add(this);
	this.elementos.stream().forEach(e->e.buscarTodos(n, res));
	
	
}

public String listadoDeContenido (String path) {
	
	String nombre= path + "/Directorio " + this.nombre;
	String result=nombre + "\n";

	for (Elemento e : elementos) {
	    result += e.listadoDeContenido(nombre);
	}
	return result;
}
	  
public List<Elemento> getElementos() {return this.elementos;}
	 
  	
}


