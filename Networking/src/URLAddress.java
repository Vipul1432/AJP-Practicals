import java.io.IOException;
import java.net.URL;

public class URLAddress {
	public static void main(String [] args) throws IOException
	{
		URL u = new URL("https://www.javatpoint.com/java-tutorial");
		System.out.println("host name "+u.getHost());
		System.out.println("host path "+u.getPath());
		System.out.println("host protocol no. "+u.getProtocol());
		System.out.println("host file "+u.getFile());
		System.out.println("host port "+u.getPort());
		System.out.println("");
		
		//System.out.println("Host Address "+u.getHost);
	}
}
