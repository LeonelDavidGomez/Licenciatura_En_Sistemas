
public abstract class Ring <T> {
	
	protected T [] source;
	protected int idx;	


	public T next () {
		  if (idx >= source.length) 
			  idx=0;
		  return source[idx++]; 
		  
	}

}
