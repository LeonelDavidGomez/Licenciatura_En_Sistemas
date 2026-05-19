import java.util.LinkedList;
import java.util.List;

public class Compuesto implements Elemento{
    private List<Elemento> elementos;
	public Compuesto () {
		elementos=new LinkedList<>();
	}
	public double calcularValor() {
		return this.elementos.stream()
				             .mapToDouble(e->e.calcularValor())
				             .sum();
	}
	public double valorPrendario() {
		return this.calcularValor()*0.5;
	}
	public void agregarCompuesto(Elemento e ) {
		this.elementos.add(e);
	}

}
