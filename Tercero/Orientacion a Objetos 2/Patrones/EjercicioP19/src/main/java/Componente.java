import java.time.LocalDate;

public interface Componente {
public String prettyPrint();
public String getExtension();
public int getTamanio();
public LocalDate getFechaCreacion();
public LocalDate getFechaModificacion();
public String getPermisos();

}
