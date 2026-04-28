
public class Inicial implements StateCalculadora{
	public void setValor (Calculadora c,double valor) {
		c.setAcomulado(valor);
	}
	public void mas (Calculadora c) {
	      c.setOperando("+");
	      c.setEstado(new Esperando());
	}
	public void menos (Calculadora c) {
		c.setOperando("-");
		c.setEstado(new Esperando());
	}
	public void por (Calculadora c) {
	    c.setOperando("*");
	    c.setEstado(new Esperando());
	}
	public void dividido (Calculadora c) {
		c.setOperando("/");
		c.setEstado(new Esperando());
	}
	public void borrar (Calculadora c) {
		c.setAcomulado(0);	
	}
	public String resultado(Calculadora c) {
		return String.valueOf(c.getAcomulado());
	}
}
