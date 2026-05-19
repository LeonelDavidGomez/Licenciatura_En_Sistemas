
public class Dispositivo {

	private CrcCalculator calculator;
	private Ring ring;
	private Display display;
	private Connection connection;
	public Dispositivo(CrcCalculator calculator, Ring ri, Display display, Connection connection) {
		this.calculator = calculator;
		this.ring = ri;
		this.display = display;
		this.connection = connection;
	}
	
	public String send (String data) {
		int crc=this.calculator.crcFor(data);
		return this.connection.sendData(data, crc);
		
	}
	public void setCalculator (CrcCalculator c) {
		this.calculator=c;
		
	}
	
	public String setConnection(Connection c) {

	    this.connection = c;
	    return this.display.showBanner(c.pict())    + " "+ this.ring.ring();
	}

}
