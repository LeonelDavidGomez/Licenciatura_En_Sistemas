import java.util.List;
import java.util.stream.Collectors;

public class Novedad implements Configuracion{

	public List<Pelicula> reproducir ( List <Pelicula> peliculasG,List <Pelicula> peliculasR) {
		return peliculasG.stream()
		          		 .filter(p->!peliculasR.contains(p))
		          		 .sorted((p1,p2) -> Integer.compare(p2.getAnio(), p1.getAnio()))
		          		 .limit(3)
		          		 .collect(Collectors.toList());
	} 
}
