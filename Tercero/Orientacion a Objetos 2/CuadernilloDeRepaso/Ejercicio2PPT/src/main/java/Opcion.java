
public abstract class Opcion {
  protected String nombre;
  public Opcion (String n) {
	  this.nombre=n;
  }
  public abstract int jugar(Opcion o);
  public abstract int jugarContraPiedra();
  public abstract int jugarContraPapel();
  public abstract int jugarContraTijera();
  public abstract int jugarContraLagarto();
  public abstract int jugarContraSpock();
}
