import java.time.LocalDate;

public class NullMamifero implements Mamifero{

	public NullMamifero() {
		super();
	}
	public String getIdentificador() {
		return " ";
		}
	public String getEspecie() {
		return " ";
	}
	public LocalDate getFechaNacimiento() {
		return null;
		}
	public Mamifero getPadre() {
		return new NullMamifero();
	}
	public Mamifero getMadre() {
		return new NullMamifero();
		}
	public Mamifero getAbueloPaterno() {
		return new NullMamifero();
		}
	public Mamifero getAbuelaPaterno() {
		return new NullMamifero();
		}
	public Mamifero getAbueloMaterno() {
		return new NullMamifero();
	}
	public Mamifero getAbuelaMaterno() {
		return new NullMamifero();
	}
	public boolean padreEs(Mamifero unMamifero ) {
		return false;
	};
	public boolean madreEs(Mamifero unMamifero ) {
		return false;
	} ;
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		return false;
	}

	
	
}
