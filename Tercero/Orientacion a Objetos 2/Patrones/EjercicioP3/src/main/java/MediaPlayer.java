import java.util.LinkedList;
import java.util.List;

public class MediaPlayer {
	
	private List<Media> medias;
	public MediaPlayer () {
		medias=new LinkedList<>();	
	}
	public void addMedia(Media m) {
		this.medias.add(m);
	}
	public void play () {
		this.medias.stream()
		           .forEach(m->m.play());
	}

}
