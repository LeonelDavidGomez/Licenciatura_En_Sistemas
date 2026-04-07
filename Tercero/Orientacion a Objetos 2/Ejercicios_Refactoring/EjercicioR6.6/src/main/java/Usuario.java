
public class Usuario {
	private Subscripcion tipoSubscripcion;

    public void setTipoSubscripcion(Subscripcion unTipo) {
        this.tipoSubscripcion = unTipo;
    }

    public double calcularCostoPelicula(Pelicula pelicula) {
        return tipoSubscripcion.calcularCostoPelicula(pelicula);
    }
}
