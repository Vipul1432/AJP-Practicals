import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.*;

public class FileClient {
	public static void main(String [] args)throws Exception {
		
		byte []b = new byte[20002];
		Socket sr = new Socket("localhost", 4333);
		InputStream is = sr.getInputStream();
		FileOutputStream fr= new FileOutputStream("G:\\marwadi.txt");
		is.read(b, 0, b.length);
		fr.write(b,0,b.length);
	}
}
