import java.time.LocalDate;

public interface Mamifero {

	public String getIdentificador() ;
	public String getEspecie();
	public LocalDate getFechaNacimiento();
	public Mamifero getPadre();
	public Mamifero getMadre();
	public Mamifero getAbueloPaterno();
	public Mamifero getAbuelaPaterno();
	public Mamifero getAbueloMaterno();
	public Mamifero getAbuelaMaterno();
	public boolean padreEs(Mamifero unMamifero ) ;
	public boolean madreEs(Mamifero unMamifero ) ;
	public boolean tieneComoAncestroA(Mamifero unMamifero) ;
	
}
