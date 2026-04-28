import java.util.LinkedList;
import java.util.List;

public class Pelicula {
private String titulo;
private int añoE;
private double puntaje;
private List<Pelicula> peliculasSi;
public Pelicula(String titulo, int añoE, double puntaje) {
	this.titulo = titulo;
	this.añoE = añoE;
	this.puntaje = puntaje;
	this.peliculasSi=new LinkedList<>();
}


public int getAnio() {
	return this.añoE;
}


public double getPuntaje() {
	return puntaje;
}


public void agregarSimilar(Pelicula p) {
	this.peliculasSi.add(p);
}

public String getTitulo() {
	return titulo;
}

public List<Pelicula> getSimilares() {
	return peliculasSi;
}
}
