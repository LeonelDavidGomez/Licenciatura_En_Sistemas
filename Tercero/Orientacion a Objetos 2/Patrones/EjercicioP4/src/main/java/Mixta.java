import java.util.LinkedList;
import java.util.List;

public class Mixta extends Topografia{
	private List<Topografia> topografias;
	
	public Mixta( ) {
		this.topografias=new LinkedList<>();
	}
	public void add(Topografia topo) {
		if(this.topografias.size() < 4) {
			this.topografias.add(topo);
		}
	}
	public double proporcion () {
		return topografias.stream().mapToDouble(t->t.proporcion()).sum()/topografias.size();
	}

	public boolean sonIguales(Topografia otro) {
		return otro.igualMixta(this);
	}
	public boolean igualAgua() {
		
	   return false;
	}
	public boolean igualTierra() {
		return false;
	}
	public boolean igualMixta(Mixta t) {
		
	    if (this.topografias.size() != t.topografias.size()) {
	        return false;
	    }
	    //como el tamaño de las listas son iguales entonces
	    
	    for (int i=0; i<this.topografias.size();i++) {
	    	if(!this.topografias.get(i).sonIguales(t.topografias.get(i))) {
	    		return false;
	    	}
	    }
	    return true;

	}
	
	public boolean igualPantano() {	
		return false;
	}
}
