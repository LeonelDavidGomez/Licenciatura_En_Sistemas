
// 1)
public class CharRing {
	
	
	
	
	private char [] source;
	private int idx;
	
	public CharRing(String srcString) {
		char result;
		source=new char [srcString.length()];
		srcString.getChars(0, srcString.length(), source,0);
		result=0;
		idx=result;
	}
	
	public char next () {
		int currentPosition;
		if (idx>=source.length)
			idx=0;
		    currentPosition=idx++;
			return source[currentPosition];
	    }
   }

// 2) Lo que podria llegar a ocurrir es que al existir multiples variables con el nombre result 
//    me puedo llegar a confundir y terminar renombrando la variable del metodo CharRing y no la del metodo next,o incluso podira llegar a renombrar las dos variables pensando que estan relacionadas.
