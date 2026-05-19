
public class Provisorio extends Estado{
	public  void agregarUsuario (Excursion e , Usuario u) {
		e.getUsuariosInscriptos().add(u);
	    if (e.cantidadUsuariosInscriptos() >= e.getCupoMinimo()) {
	        e.setEstado(new Definitiva());
	    }
	}
	
	   public String obtenerInformacion  (Excursion e) {
		   return "Nombre " + e.getNombre() + "Costo " + e.getCosto() + "fechas " + e.fechas() + "punto de encuentro " + e.getPuntoEncuentro() + " cantidad de usuario faltantes para alcanzar el cupo minimo " + (e.getCupoMinimo() - e.cantidadUsuariosInscriptos());
	   }
}
