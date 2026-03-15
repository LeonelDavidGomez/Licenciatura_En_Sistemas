
public class Usuario {
	
	private String nombre;
	private Opcion opcion;
	public Usuario (String n ,Opcion o) {
		this.nombre=n;
		this.opcion=o;
	}
	public String jugarContraUsuario (Usuario u) {
		int resultado=this.opcion.jugar(u.opcion);
        if(resultado==1) {
        	return u.nombre;
        }else if (resultado==0) {
        	return "Empate";
        }else {
        	return nombre;
        }

	}

}
