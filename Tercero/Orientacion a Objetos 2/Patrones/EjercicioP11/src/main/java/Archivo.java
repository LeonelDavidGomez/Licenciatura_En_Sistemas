import java.time.LocalDate;
import java.util.List;

public class Archivo extends Elemento{
private int tamanoB;
public Archivo (String n,LocalDate f,int t) {
	super(n,f);
	this.tamanoB=t;
	
}
public int tamano () {
	return tamanoB;
}
public Archivo archivoMasGrande() {
	return this;
}
public  Archivo archivoMasNuevo() {
	return this;
};
public Elemento buscar (String nombre) {
	if(this.nombre.equals(nombre))
		return this;
	else 
		return null;
}
public void  buscarTodos(String n,List<Elemento> res) {
	if(this.nombre.equals(n))
		res.add(this);
	
   }

public String listadoDeContenido (String path) {
	return path + "/Archivo " +this.nombre + "\n";
}

}

