
public class WifiConn  implements Connection {
	private String pict;
	public WifiConn(String pict) {
	    this.pict = pict;
	}
public String sendData (String data,int crc) {
	return "Enviando data " + data +" por wifi con "  +crc; 
}
public String pict() {
	return pict;
} 


}
