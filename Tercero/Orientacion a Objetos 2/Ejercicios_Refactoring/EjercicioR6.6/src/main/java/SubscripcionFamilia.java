
public class SubscripcionFamilia implements Subscripcion {
	public double calcularCostoPelicula(Pelicula pelicula) {
        return pelicula.calcularCostoConCargoExtra() * 0.90;
    }
}
