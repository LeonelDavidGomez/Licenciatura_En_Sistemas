
public class FactoryMago implements PersonajeFactory{
	public Personaje crearPersonaje(String nombre) {
		
	Personaje mago=new Personaje(nombre);
	          mago.setArmadura(new ArmaduraCuero());
	          mago.setArma(new Baston());
	          mago.agregarHabilidad("Magia");
	          mago.agregarHabilidad("Combate a distancia");
	          return mago;
	}
}
