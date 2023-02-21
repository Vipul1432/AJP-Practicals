import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpAddress {
	public static void main(String [] args)throws IOException {
		try
		{
			InetAddress i = InetAddress.getByName("www.Google.com");  //getLocalHost(); //getByName("216.58.203.4");
			System.out.println("this host address is :" + i.getHostAddress());
			System.out.println("this host Name is :" + i.getHostName());
		}
		catch(UnknownHostException e)
		{
			System.out.println("webste not found ");
		}
	}
}
