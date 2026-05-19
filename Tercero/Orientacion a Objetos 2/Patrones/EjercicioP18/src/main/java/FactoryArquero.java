
public class FactoryArquero implements PersonajeFactory{
	public Personaje crearPersonaje(String nombre) {
		Personaje arquero=new Personaje(nombre);
		arquero.setArmadura(new ArmaduraCuero());
		arquero.setArma(new Arco());
		arquero.agregarHabilidad("Combate a distancia");
		return arquero;
		
	}
}
