import java.sql.Date;
import java.time.LocalDate;

public class RealMamifero implements Mamifero{

	private String id;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	public RealMamifero () {
		padre=new NullMamifero();
		madre=new NullMamifero ();
		
	}
	public String getIdentificador() {
		return id;
	}	
	public String getEspecie() {
		return especie;
	}
	
	
	
	public void setPadre(Mamifero unMamifero) {
		 this.padre=unMamifero;
	}
   public void setMadre(Mamifero unMamifero) {
		this.madre=unMamifero;
   }

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public Mamifero getPadre() {
		return padre;
	}

	public Mamifero getMadre() {
		return madre;
	}
	public Mamifero getAbueloPaterno() {
		return this.padre.getPadre();
	};
	public Mamifero getAbuelaPaterno() {
		return this.padre.getMadre();
	};
	public Mamifero getAbueloMaterno() {
		return this.madre.getPadre();
	}
	public Mamifero getAbuelaMaterno() {
		return this.madre.getMadre();
	}
	public boolean padreEs(Mamifero unMamifero ) {
		return this.padre==unMamifero;
	};
	public boolean madreEs(Mamifero unMamifero ) {
		return this.madre==unMamifero;
	} ;
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		  return (this.padreEs(unMamifero) || this.padre.tieneComoAncestroA(unMamifero))||(this.madreEs(unMamifero)||this.madre.tieneComoAncestroA(unMamifero));	
		}
}
