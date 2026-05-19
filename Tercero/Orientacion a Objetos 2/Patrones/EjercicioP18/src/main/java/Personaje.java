import java.util.LinkedList;
import java.util.List;
public class Personaje {
private String nombre;
private int puntosVida;
private List<String>habilidades;
private Arma arma;
private Armadura armadura;
public Personaje(String nombre) {
	this.nombre=nombre;
	this.puntosVida=100;
	this.habilidades=new LinkedList<String>();
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public void setPuntosVida(int puntosVida) {
	this.puntosVida = puntosVida;
}
public void setHabilidades(List<String> habilidades) {
	this.habilidades = habilidades;
}
public void setArma(Arma arma) {
	this.arma = arma;
}
public void setArmadura(Armadura armadura) {
	this.armadura = armadura;
}
public void agregarHabilidad(String a) {
	this.habilidades.add(a);
}
public int getPuntosVida() {
	return this.puntosVida;
}
public Armadura getArmadura() {
	return this.armadura;
}
public Arma getArma() {
	return this.arma;
}
public void decrementarPuntoVida(int puntos) {
	this.puntosVida=puntosVida-puntos;
	if(this.puntosVida<0)
		puntosVida=0;
}
public boolean estaVivo () {
	if(this.puntosVida>0)return true;
	else return false;
}
public void enfrentarse(Personaje enemigo) {
	 if(this.estaVivo()) {
	        int danio =this.arma.calcularDanio(enemigo.getArmadura());
	        enemigo.decrementarPuntoVida(danio);
	    }
	
}

}
