import java.util.LinkedList;
import java.util.List;

public class Union extends Elemento{

	private List <Elemento> elementos;
	public Union () {
		elementos=new LinkedList<>();
	}
	public void agregarElemento(Elemento e ) {
		elementos.add(e);
	}
	
	public String formula() {
	    String resultado = "";
	    for (int i = 0; i < elementos.size(); i++) {
	        resultado += elementos.get(i).formula(); 
	    }
	    return resultado;
	}
	public  double pesoMolecular() {
	   return this.elementos.stream().mapToDouble(p->p.pesoMolecular()).sum();
	}

	public int carga() {
		return this.elementos.stream().mapToInt(c->c.carga()).sum();
	};
	
}
