
public class VideoStreamAdapter extends Media{
    private VideoStream videoStream;
    
    
	public VideoStreamAdapter(VideoStream video) {
		super();
		this.videoStream = video;
	}


	public void play () {
		this.videoStream.reproduce();
	}
}
