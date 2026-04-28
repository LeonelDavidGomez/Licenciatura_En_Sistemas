
public class Calculadora {
	private double acomulado;
	private StateCalculadora estado;
	private String operando;
	public Calculadora () {
		estado=new Inicial();
	}
	public String getResultado () {
		return estado.resultado(this);
	}
	public void borrar () {
		this.acomulado=0;
		estado=new Inicial();
	}
	public void setValor (double unValor) {
		estado.setValor(this,unValor);
	}
	public void mas () {
		estado.mas(this);
	}
	public void menos() {
		estado.menos(this);
	}
	public void por () {
		estado.por(this);
	}
	public void dividido () {
		estado.dividido(this);
	}
	public void setAcomulado (double s) {
		this.acomulado=s;
	}
	public void setEstado (StateCalculadora e) {
		this.estado=e;
	}
	public void setOperando (String operando) {
		this.operando=operando;
	}
	public String getOperando () {
		return operando;
	}
	public double getAcomulado () {
		return acomulado;
	}

}
