
public abstract class Bien implements Elemento{
	protected double liquidez;
	public Bien(double liquidez) {
		super();
		this.liquidez = liquidez;
	}

	public abstract double calcularValor();
	public  double valorPrendario() {
		 return calcularValor() * liquidez;
	}

	
}
