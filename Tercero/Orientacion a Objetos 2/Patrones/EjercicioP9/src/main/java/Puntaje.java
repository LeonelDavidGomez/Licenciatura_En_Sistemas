import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Puntaje implements Configuracion{
public List<Pelicula> reproducir (List <Pelicula> peliculasG,List <Pelicula> peliculasR) {
	return peliculasG.stream()
		    .filter(p -> !peliculasR.contains(p))
		    .sorted(
		        Comparator.comparingDouble(Pelicula::getPuntaje).reversed()
		        .thenComparing(Comparator.comparingInt(Pelicula::getAnio).reversed())
		    )
		    .limit(3)
		    .collect(Collectors.toList());
}
	                        		  
	                        		  
} 

