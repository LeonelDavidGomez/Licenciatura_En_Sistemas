
public class Normal extends Tweet{
	  private String texto;
	  public Normal (String t) {
		  super();
		  this.setTexto(t);
		  
	  }
	  private void setTexto(String t) {
		  
		  if(t!=null && t.length()>=1 && t.length()<=280) {
			  this.texto=t;
		  }
	  }
	public String getTexto() {
		return texto;
	}
	  
}
