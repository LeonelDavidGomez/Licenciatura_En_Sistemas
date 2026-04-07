
public class Re_tweet extends Tweet{
    private Normal origen;
	public Re_tweet (Normal origen) {
		super();
		this.origen=origen;
	}
	  public  boolean esRetweet (Tweet t) {
		  
		return this.origen.equals(t);  
	  }
	 
}
