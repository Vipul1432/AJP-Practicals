import java.io.*;
import java.net.*;

public class FileServer {
	public static void main(String [] args)throws Exception {
		
		ServerSocket s = new ServerSocket(6333);
		Socket sr = s.accept();
		FileInputStream f = new FileInputStream("C:\\Users\\ABHIRAJ\\Desktop\\Home_Abhi\\file.txt") ;
		byte b[] = new byte[20002];
		f.read(b,0,b.length); //means read file from 0 to last
		OutputStream os = sr.getOutputStream();
		os.write(b, 0, b.length);
		
	}
}
