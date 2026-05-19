
public class Adapter4GConnection  implements Connection{
	
	private _4GConnection _4G;
	public Adapter4GConnection(_4GConnection c) {
	    this._4G = c;
	}
	
	public String sendData (String data,int crc) {
		return _4G.transmit(data, crc);
	}
	public String pict() {
		return _4G.symb();
	}

}
