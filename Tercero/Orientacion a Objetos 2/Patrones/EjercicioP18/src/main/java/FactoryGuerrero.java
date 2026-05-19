
public class FactoryGuerrero implements PersonajeFactory{
	public Personaje crearPersonaje(String nombre) {
			Personaje guerrero=new Personaje(nombre);
			          guerrero.setArmadura(new ArmaduraAcero());
			          guerrero.setArma(new Espada());
			          guerrero.agregarHabilidad("Combate cuerpo a cuerpo");
			          return guerrero;
			}
	
}
