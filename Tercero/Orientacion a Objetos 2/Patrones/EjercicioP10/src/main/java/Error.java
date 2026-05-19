
public class Error implements StateCalculadora{
	public void setValor (Calculadora c,double valor) {}
	public void mas (Calculadora c) {}
	public void menos (Calculadora c) {}
	public void por (Calculadora c) {}
	public void dividido (Calculadora c) {}
	public void borrar (Calculadora c) 
	{   c.setAcomulado(0);
		c.setEstado(new Inicial());
	}
	public String resultado (Calculadora c) {
		return "Error";
	}
}
