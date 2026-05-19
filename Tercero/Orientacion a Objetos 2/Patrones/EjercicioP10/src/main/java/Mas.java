
public class Mas extends Operando{
	public void setValor (Calculadora c,double valor) {
		double mas=c.getAcomulado()+valor;
		c.setAcomulado(mas);
	}
}
