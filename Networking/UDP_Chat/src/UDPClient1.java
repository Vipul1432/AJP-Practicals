                  //Experiment 6
import java.net.*;
import java.util.Scanner;

public class UDPClient1 {
	public static void main(String[] args) throws Exception 
	{
		DatagramSocket ds = new DatagramSocket();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any string :");
		String str = s.nextLine();
		
		InetAddress ip = InetAddress.getByName("localhost"); 
		DatagramPacket dp1 = new DatagramPacket(str.getBytes(), str.length(), ip, 3000); 
		ds.send(dp1); 
		ds.close();
	 }
}
