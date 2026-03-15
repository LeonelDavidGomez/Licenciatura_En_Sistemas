import java.util.LinkedList;
import java.util.List;

public class Usuario {
	
	private String screenName ;
    private List<Tweet> tweets;
	public Usuario (String screenName) {
		this.screenName=screenName;
		this.tweets=new LinkedList<Tweet>();
	}
	
	public boolean esUsuario(String s) {
		return s != null && this.screenName.equals(s);
		
	}
	public Tweet postearTweet(String tex) {
		Tweet t=new Normal(tex);
		this.tweets.add(t);
		return t;
	}
	public Tweet reTweetear (Tweet tw) {
		Tweet t=new Re_tweet(tw);
        this.tweets.add(t);
        return t;
        
		
	}
	public List<Tweet> leerMensajes() {
		return this.tweets;
	}
}
