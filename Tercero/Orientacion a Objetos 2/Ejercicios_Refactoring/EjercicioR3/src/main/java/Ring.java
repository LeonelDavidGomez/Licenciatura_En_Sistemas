
public abstract class Ring <T> {
																																							/*Se identificó duplicación de código entre las clases. Se creó una superclase genérica Ring<T> donde se movieron los atributos y el método común. Debido a diferencias de tipos primitivos, se utilizaron clases envolventes (Character, Integer). Luego, las clases originales heredaron de la superclase y se eliminó el código duplicado, verificando finalmente que los tests continúan funcionando.*/
	protected T [] source;
	protected int idx;	


	public T next () {
		  if (idx >= source.length) 
			  idx=0;
		  return source[idx++]; 
		  
	}

}
