
public class Atomo extends Elemento{
private String nombre;
private String simbolo;
private double pesoAtomico;
private int cargaTipica;
private String clasificacion;

public Atomo(String nombre, char simbolo, double pesoAtomico, int cargaTipica, String clasificacion) {
	super();
	this.nombre = nombre;
	this.simbolo = simbolo;
	this.pesoAtomico = pesoAtomico;
	this.cargaTipica = cargaTipica;
	this.clasificacion = clasificacion;
}

public  String formula() {
return this.simbolo;
}
public abstract double pesoMolecular() {
	
	return pesoAtomico;
}

public  int carga() {
	return cargaTipica;
}
public boolean esValida() {
	return true;
}
}
