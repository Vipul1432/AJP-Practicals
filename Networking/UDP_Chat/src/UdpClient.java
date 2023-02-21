import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpClient {
	public static void main(String [] args)throws Exception {
		DatagramSocket mysocket = new DatagramSocket(9990);
		byte myBuffer[]=new byte[2000];
		
		while(true) {
			DatagramPacket datapac = new DatagramPacket(myBuffer,myBuffer.length);
			mysocket.receive(datapac);
			String msg = new String(datapac.getData(),0,datapac.getLength());
			System.out.println("Message received:-"+msg);
			
			if(msg.equals("exit"))
				break;
		}
	}
}
