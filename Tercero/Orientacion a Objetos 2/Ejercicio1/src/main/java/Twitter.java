import java.util.LinkedList;
import java.util.List;

public class Twitter {
	
	
	private List<Usuario> usuarios;
	public Twitter () {
		usuarios=new LinkedList<>();
		
	}
	
	public Usuario agregarUsuario(String s) {
		
		Usuario usuarioE=this.buscarUsuario(s);
		if(usuarioE!=null) {
			return null;
		}
		
		Usuario u=new Usuario(s);
		this.usuarios.add(u);
		return u;
		
	}
	public void eliminarUsuario(String s) {
		Usuario usuarioE = this.buscarUsuario(s);
	   if (usuarioE != null) {
	        this.usuarios.remove(usuarioE);
	    }
	}
	public Usuario buscarUsuario(String s) {
		Usuario usuarioB=this.usuarios.stream().filter(u->u.esUsuario(s)).findFirst().orElse(null);
		return usuarioB;
	}

}
