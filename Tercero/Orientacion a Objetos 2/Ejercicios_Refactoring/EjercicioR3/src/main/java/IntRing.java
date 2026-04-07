
public class IntRing extends Ring<Integer> {

	public IntRing (Integer[]src ) {
		this.source=src;
		this.idx=0;
		
	}
	public Integer next () {
		if (idx>= source.length)
			  idx=0;
		return source[idx++];
		
	}
	
}
