import java.io.InputStream;
import java.net.*;
import java.net.URLConnection;

public class URLConnectionDemo {
	public static void main(String [] args) throws Exception{
		URL obj = new URL("https://www.google.com");
		URLConnection con = obj.openConnection();
		
		int l = con.getContentLength();
		System.out.println("Length  of content: "+l);
		if(l==0) {
			System.out.println("content is not available");
			return;
		}
		else {
			int ch;
			InputStream in = con.getInputStream();
			//dispaly html
			while((ch=in.read())!=-1)
				System.out.print((char)ch);
		}
	}
}
