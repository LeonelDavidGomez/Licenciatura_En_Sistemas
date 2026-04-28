import java.util.List;

public class Decodificador {
private List<Pelicula> peliculasG;
private List<Pelicula> peliculasR;
private Configuracion configuracion;
public Decodificador(List<Pelicula> peliculasG, List<Pelicula> pelicuasR) {
	super();
	this.peliculasG = peliculasG;
	this.peliculasR = pelicuasR;
}
public void setConfiguracion (Configuracion c) {
	this.configuracion=c;
}
public List<Pelicula> sugerir () {
	return configuracion.reproducir(peliculasG, peliculasR);
}

}
