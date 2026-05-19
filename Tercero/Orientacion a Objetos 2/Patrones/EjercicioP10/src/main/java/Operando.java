
public abstract class Operando implements StateCalculadora{
	public abstract void setValor (Calculadora c,double valor);
	
	

	
	public void mas (Calculadora c) {
	      c.setEstado(new Error());
	}
	public void menos (Calculadora c) {
		c.setEstado(new Error());
	}
	public void por (Calculadora c) {
	    c.setEstado(new Error());
	}
	public void dividido (Calculadora c) {
		c.setEstado(new Error());
	}
	public void borrar (Calculadora c) {
		c.setAcomulado(0);	
		c.setEstado(new Inicial());
	}
	public String resultado(Calculadora c) {
		c.setEstado(new Error());
		return "error";
	}
}
