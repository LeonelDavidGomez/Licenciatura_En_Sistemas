import java.util.zip.CRC32;
public class Crc32_Calculator implements CrcCalculator {
	
public int crcFor (String data) {
    CRC32 crc = new CRC32();

    crc.update(data.getBytes());

    return (int)crc.getValue();

};

}
