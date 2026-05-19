import java.util.stream.Collectors;

public class Definitiva extends Estado{
	public  void agregarUsuario (Excursion e , Usuario u) {
		if(e.cantidadUsuariosInscriptos()<e.getCupoMaximo()) {
			e.getUsuariosInscriptos().add(u);
		}else {
			e.getUsuariosEspera().add(u);
		}
	}
	 public String obtenerInformacion (Excursion e) {
		  if(e.cantidadUsuariosInscriptos()<e.getCupoMaximo()) {
			  String mails = e.getUsuariosInscriptos().stream()
                      .map(u -> u.getMail())
                      .collect(Collectors.joining(", "));
			  return "Nombre " + e.getNombre() + "Costo " + e.getCosto() + "Fechas : "+ e.fechas() + "punto de encuentro: " + e.getPuntoEncuentro() + "mails " + mails + "cantidad de usuario faltantes para alcanzar el cupo maximo " 
					 + (e.getCupoMaximo() - e.cantidadUsuariosInscriptos());
		  }else {
			 return "Nombre " + e.getNombre() + "Costo " + e.getCosto() + "Fechas : "+  e.fechas() + "punto de encuentro: " + e.getPuntoEncuentro() ;
		  }
	   }
}
