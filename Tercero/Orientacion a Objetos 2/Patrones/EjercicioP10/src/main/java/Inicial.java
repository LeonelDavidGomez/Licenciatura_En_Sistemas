
public class Inicial implements StateCalculadora{
	public void setValor (Calculadora c,double valor) {
		c.setAcomulado(valor);
	}
	public void mas (Calculadora c) {
	      c.setEstado(new Mas());
	}
	public void menos (Calculadora c) {
		c.setEstado(new Menos());
	}
	public void por (Calculadora c) {
	    c.setEstado(new Por());
	}
	public void dividido (Calculadora c) {
		c.setEstado(new Dividido());
	}
	public void borrar (Calculadora c) {
		c.setAcomulado(0);	
	}
	public String resultado(Calculadora c) {
		return String.valueOf(c.getAcomulado());
	}
}
