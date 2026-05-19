
public class _4GConnection {
private String symb;
public _4GConnection(String symb) {
    this.symb = symb;
}
public String transmit (String data,int crc) {
	return "Enviando datos " + data + " por wifi 4G con crc " + crc;
};
public String symb() {
	return symb;
};
}
