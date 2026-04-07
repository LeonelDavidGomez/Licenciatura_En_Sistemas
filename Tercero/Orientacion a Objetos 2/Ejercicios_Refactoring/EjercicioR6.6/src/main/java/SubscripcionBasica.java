
public class SubscripcionBasica implements Subscripcion {
	public double calcularCostoPelicula(Pelicula pelicula) {
        return pelicula.getCosto()+pelicula.calcularCargoExtraPorEstreno();
    }
}
