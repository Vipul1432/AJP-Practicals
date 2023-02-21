import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UdpServer {
	public static void main(String [] args) throws Exception {
		DatagramSocket mysocket = new DatagramSocket(8800);
		byte myBuffer[];
		
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("please enter some text here");
			String msg = scanner.nextLine();
			myBuffer = msg.getBytes();
			DatagramPacket mypack = new DatagramPacket(myBuffer, myBuffer.length,
					InetAddress.getByName("192.168.137.253"),7778); //receiver port num
			mysocket.send(mypack);
			if(msg.equals("exit"))
				break;
		}
	}
}
