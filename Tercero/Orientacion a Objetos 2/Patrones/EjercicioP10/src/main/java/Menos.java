
public class Menos extends Operando{
	public void setValor (Calculadora c,double valor) {
		double menos=c.getAcomulado()-valor;
		c.setAcomulado(menos);
	}
}
