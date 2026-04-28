
public class Esperando implements StateCalculadora{
	public void setValor (Calculadora c,double valor) {
		if (c.getOperando().equals("+")) {
		     c.setAcomulado(c.getAcomulado()+valor);
		}else if (c.getOperando().equals("-")) {
			 c.setAcomulado(c.getAcomulado()-valor);
		}else if (c.getOperando().equals("*")) {
			 c.setAcomulado(c.getAcomulado()*valor);
		}else if (c.getOperando().equals("/")) {
			if(valor==0) {
				c.setEstado(new Error());
			    return;
			} else {
			 c.setAcomulado(c.getAcomulado()/valor);
			}	 
		}
		c.setEstado(new Inicial());
	}
	public void mas (Calculadora c ){
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
		return String.valueOf(c.getAcomulado());
	}
}
