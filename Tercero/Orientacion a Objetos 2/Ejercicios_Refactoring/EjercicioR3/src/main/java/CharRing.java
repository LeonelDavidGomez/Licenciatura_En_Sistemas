
public class CharRing extends  Ring <Character>{

    public CharRing(String src) {
        this.source = new Character[src.length()];
        
        for (int i = 0; i < src.length(); i++) {
            this.source[i] = src.charAt(i);
        }

        this.idx = 0;
    }
	
}
