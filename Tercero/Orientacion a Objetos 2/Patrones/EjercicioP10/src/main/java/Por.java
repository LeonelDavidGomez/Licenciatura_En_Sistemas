
public class Por extends Operando{
	public void setValor (Calculadora c,double valor) {
		double por=c.getAcomulado()*valor;
		c.setAcomulado(por);
	}
}
