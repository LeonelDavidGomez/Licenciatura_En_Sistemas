import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Similaridad implements Configuracion{
public  List<Pelicula> reproducir (List <Pelicula> peliculasG,List <Pelicula> peliculasR) {
	
	
	List<Pelicula> similares=new LinkedList<>();
	peliculasR.stream().forEach(p->similares.addAll(p.getSimilares()));
	return similares.stream()
		    .filter(p -> !peliculasR.contains(p))
		    .distinct()
		    .sorted((p1, p2) -> Integer.compare(p2.getAnio(), p1.getAnio()))
		    .limit(3)
		    .collect(Collectors.toList());
}
}
