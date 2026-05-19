
public class Dividido extends Operando{

	public void setValor (Calculadora c,double valor) {
		if(valor==0) {
			c.setEstado(new Error());
		}else {
		c.setAcomulado(c.getAcomulado()/valor);
		c.setEstado(new Inicial());
		}
	}
}
