import java.time.LocalDate;

public class AutoEnAlquiler {
private double precioPorDia;
private int cantidadPlazas;
private String marca;
private Politica politica;
public AutoEnAlquiler(double precioPorDia, int cantidadPlazas, String marca,Politica p) {
	this.precioPorDia = precioPorDia;
	this.cantidadPlazas = cantidadPlazas;
	this.marca = marca;
	this.politica=p;
}
public void setPolitica (Politica p) {
	this.politica=p;
}

public double getPrecioPorDia () {
	return this.precioPorDia;
}

public double montoAReembolsar (LocalDate fecha,LocalDate f,double m) {
	return politica.montoAReembolsar(fecha,f,m);
}
}
