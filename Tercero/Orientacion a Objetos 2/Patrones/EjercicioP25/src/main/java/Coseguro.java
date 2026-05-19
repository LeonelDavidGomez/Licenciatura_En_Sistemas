import java.time.LocalDate;

public class Coseguro {
private String nombre;
private int descuento;
private LocalDate fechaIngreso;
private double montoCoberturaViajes;
public Coseguro(String nombre, int descuento, LocalDate fechaIngreso, double montoCoberturaViajes) {

	this.nombre = nombre;
	this.descuento = descuento;
	this.fechaIngreso = fechaIngreso;
	this.montoCoberturaViajes = montoCoberturaViajes;
}
public String getNombre() {
	return nombre;
}
public int getDescuento() {
	return descuento;
}
public LocalDate getFechaIngreso() {
	return fechaIngreso;
}
public double getMontoCoberturaViajes() {
	return montoCoberturaViajes;
}


}
