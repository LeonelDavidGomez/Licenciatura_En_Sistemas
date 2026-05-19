import java.time.LocalDate;

   
 
public class Inmueble extends Bien{

	    public static void main(String[] args) {
	 
	    Alquiler alquiler = new Alquiler(LocalDate.of(2023, 1, 1),
                LocalDate.of(2026, 12, 31),
                500.0);
	    Automovil autoMovil=new Automovil(2004,45000.3,2000.3);
	    Compuesto c=new Compuesto();
	    c.agregarCompuesto(alquiler);
	    c.agregarCompuesto(autoMovil);

        System.out.printf("Automovil  - valor: %.2f  |  prendario: %.2f%n",
                autoMovil.calcularValor(), autoMovil.valorPrendario());
        System.out.printf("Alquiler   - valor: %.2f  |  prendario: %.2f%n",
                alquiler.calcularValor(), alquiler.valorPrendario());
 
        // --- Prenda combinada ---
        
        c.agregarCompuesto(autoMovil);
        
        c.agregarCompuesto(alquiler);
 
        System.out.printf("%nPrendaCombinada - valor: %.2f  |  prendario: %.2f%n",
                c.calcularValor(), c.valorPrendario());
 
    }
	
	 
	private String direcccion;
	private double superficie;
	private double costom2;
	public Inmueble(String direcccion, double superfice, double costom2) {
		super(0.2);
		this.direcccion = direcccion;
		this.superficie = superfice;
		this.costom2 = costom2;
	}
	public double calcularValor() {
		return (superficie*costom2);
	}

	

}
