
public class FactoryThor implements PersonajeFactory{
	public Personaje crearPersonaje(String nombre) {
		
		Personaje thor=new Personaje(nombre);
		          thor.setArmadura(new ArmaduraHierro());
		          thor.setArma(new Martillo());
		          thor.agregarHabilidad("Lanzar rayos");
		          thor.agregarHabilidad("Combate a distancia");
		          return thor;
		}
}
