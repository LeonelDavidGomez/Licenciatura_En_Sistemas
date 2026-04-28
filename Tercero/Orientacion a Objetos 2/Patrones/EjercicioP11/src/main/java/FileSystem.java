import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class FileSystem {
	private List<Elemento> elementos;

	public FileSystem () {
		this.elementos=new LinkedList<>();
	}
	public int tamanoTotalocupado() {
		return this.elementos.stream().mapToInt(Elemento::tamano).sum();
	}

	public Archivo archivoMasGrande () {
		return this.elementos.stream()
				             .map(Elemento::archivoMasGrande)
				             .filter(a->a!=null)
				             .max(Comparator.comparingInt(Archivo::tamano))
				             .orElse(null);
	}

	public Archivo archivoMasNuevo () {
		return this.elementos.stream()
				              .map(Elemento::archivoMasNuevo)
				              .filter(a->a!=null)
				              .max(Comparator.comparing(Archivo::getFechaC))
				              .orElse(null);
				              
	}

	public Elemento buscar (String nombre) {
		return this.elementos.stream() 
				             .map(e->e.buscar(nombre))
				             .filter(e->e!=null)
				             .findFirst()
				             .orElse(null);
		
	}
	public List<Elemento> buscarTodos (String nombre) {
		  List<Elemento> res=new LinkedList<>();
		  elementos.stream().forEach(e->e.buscarTodos(nombre, res));
		  return res;
	  	
	}
	public String listadoDeContenido () {
		String resultado="";

		for (Elemento e : elementos) {
		    resultado += e.listadoDeContenido("");
		}
		return resultado;
	}
	  
public List<Elemento> getElementos() {return this.elementos;}
	 
}
