
public class SubscripcionPremium implements Subscripcion{
	public double calcularCostoPelicula(Pelicula pelicula) {
        return pelicula.getCosto() * 0.75;
    }

}
