
public class Normal extends Tweet{
	  private String texto;
	  public Normal (String t) {
		  super();
		  this.texto=t;
		  
	  }
	
	public String getTexto() {
		return texto;
	}
	  
  public  boolean esRetweet (Tweet t) {
		  return false;
		  
	  }
	 
}
