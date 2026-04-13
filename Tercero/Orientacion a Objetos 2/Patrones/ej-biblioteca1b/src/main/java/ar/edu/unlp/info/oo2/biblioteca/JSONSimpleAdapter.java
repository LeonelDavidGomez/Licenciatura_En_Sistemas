package ar.edu.unlp.info.oo2.biblioteca;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.util.List;

public class JSONSimpleAdapter implements Exporter{

	public String exportar(List<Socio> socios) {
		JSONArray arregloJSON = new JSONArray();
		socios.stream().forEach(s->arregloJSON.add(this.crearSocio(s)));
	    return arregloJSON.toJSONString();	
	}
	public JSONObject crearSocio (Socio s) {
		JSONObject objetoJSON=new JSONObject ();
		objetoJSON.put("nombre", s.getNombre());
		objetoJSON.put("email", s.getEmail());
		objetoJSON.put("legajo", s.getLegajo());
		return objetoJSON;
		
	}
	
}
